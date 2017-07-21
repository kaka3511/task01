package cn.fuwei.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.fuwei.po.Rs00Rsbase;

/**
 * 读取Excel
 */
public class ReadExcelUtils {
	private Logger logger = LoggerFactory.getLogger(ReadExcelUtils.class);
	private Workbook wb;
	private Sheet sheet;
	private Row row;
	private static DecimalFormat df = new DecimalFormat("######0"); 
	
	public ReadExcelUtils(String filepath) {
		if (filepath == null) {
			return;
		}
		String ext = filepath.substring(filepath.lastIndexOf("."));
		try {
			InputStream is = new FileInputStream(filepath);
			if (".xls".equals(ext)) {
				wb = new HSSFWorkbook(is);
			} else if (".xlsx".equals(ext)) {
				wb = new XSSFWorkbook(is);
			} else {
				wb = null;
			}
		} catch (FileNotFoundException e) {
			logger.error("FileNotFoundException", e);
		} catch (IOException e) {
			logger.error("IOException", e);
		}
	}

	/**
	 * 读取Excel表格表头的内容
	 * 
	 * @param InputStream
	 * @return String 表头内容的数组
	 */
	public String[] readExcelTitle() throws Exception {
		if (wb == null) {
			throw new Exception("Workbook对象为空！");
		}
		sheet = wb.getSheetAt(0);
		row = sheet.getRow(0);
		// 标题总列数
		int colNum = row.getPhysicalNumberOfCells();
		System.out.println("colNum:" + colNum);
		String[] title = new String[colNum];
		for (int i = 0; i < colNum; i++) {
			// title[i] = getStringCellValue(row.getCell((short) i));
			title[i] = row.getCell(i).getCellFormula();
		}
		return title;
	}
	
	/**
	 * 读取Excel数据内容
	 * 
	 * @param InputStream
	 * @return Map 包含单元格数据内容的Map对象
	 */
	public Map<Integer, Map<Integer, Object>> readExcelContent() throws Exception {
		if (wb == null) {
			throw new Exception("Workbook对象为空！");
		}
		Map<Integer, Map<Integer, Object>> content = new TreeMap<Integer, Map<Integer, Object>>();

		sheet = wb.getSheetAt(0);
		// 得到总行数
		int rowNum = sheet.getLastRowNum();
		row = sheet.getRow(0);
		int colNum = row.getPhysicalNumberOfCells();
		// 正文内容应该从第二行开始,第一行为表头的标题
		for (int i = 1; i <= rowNum; i++) {
			row = sheet.getRow(i);
			int j = 0;
			Map<Integer, Object> cellValue = new TreeMap<Integer, Object>();
			while (j < colNum) {
				Object obj = getCellFormatValue(row.getCell(j));
				cellValue.put(j, obj);
				j++;
			}
			content.put(i, cellValue);
		}
		return content;
	}

	/**
	 * 
	 * 根据Cell类型设置数据
	 * 
	 * @param cell
	 * @return
	 */
	private Object getCellFormatValue(Cell cell) {
		Object cellvalue = "";
		if (cell != null) {
			// 判断当前Cell的Type
			switch (cell.getCellType()) {
			case Cell.CELL_TYPE_NUMERIC:// 如果当前Cell的Type为NUMERIC
			case Cell.CELL_TYPE_FORMULA: {
				// 判断当前的cell是否为Date
				if (DateUtil.isCellDateFormatted(cell)) {
					// 如果是Date类型则，转化为Data格式
					// data格式是带时分秒的：2013-7-10 0:00:00
					// cellvalue = cell.getDateCellValue().toLocaleString();
					// data格式是不带带时分秒的：2013-7-10
					Date date = cell.getDateCellValue();
					cellvalue = date;
				} else {// 如果是纯数字

					// 取得当前Cell的数值
					cellvalue = String.valueOf(cell.getNumericCellValue());
				}
				break;
			}
			case Cell.CELL_TYPE_STRING:// 如果当前Cell的Type为STRING
				// 取得当前的Cell字符串
				cellvalue = cell.getRichStringCellValue().getString();
				break;
			default:// 默认的Cell值
				cellvalue = "";
			}
		} else {
			cellvalue = "";
		}
		return cellvalue;
	}
	
	/**
	 * 去掉.0结尾的
	 * @param cellValue
	 * @return
	 */
	public static String removeZeroCellConvert(String cellValue){
		if(cellValue != null){
			if(cellValue.endsWith(".0")){
				cellValue = cellValue.substring(0, cellValue.length()-2);
			}
		}
		return cellValue;
	}
	
	/**
	 * 去掉.0结尾的.首位增加0
	 * @param cellValue
	 * @return
	 */
	public static String prefixAddZeroCellConvert(String monthCellValue){
		monthCellValue = removeZeroCellConvert(monthCellValue);
		if(monthCellValue != null && monthCellValue.length() == 1){
			monthCellValue = "0"+monthCellValue;
		}
		return monthCellValue;
	}
	
	/**
	 * 字符串类型的double数据转int，四舍五入
	 * @param consumption
	 * @return
	 */
	public static int doubleToIntCellConvert(String consumption){
		int consumptionIntValue = 0;
		if(consumption != null){
			consumptionIntValue = Integer.parseInt(df.format(Double.parseDouble(consumption)));
		}
		return consumptionIntValue; 
	}

	public static void main(String[] args) {
		try {
			String filepath = "D:/workSpace/task01/WebContent/WEB-INF/file/e64b2575-732d-4ab0-b154-98ed5c831d71.xlsx";
			ReadExcelUtils excelReader = new ReadExcelUtils(filepath);
			Map<Integer, Map<Integer, Object>> map = excelReader.readExcelContent();
			System.out.println("获得Excel表格的内容:");
			for (int i = 1; i <= map.size(); i++) {
				Object o = map.get(i);
				String oo = o.toString().replace(".0", "");
				System.out.println(oo);
			}
		} catch (FileNotFoundException e) {
			System.out.println("未找到指定路径的文件!");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static List<Rs00Rsbase> readFromExcel(String path){
		List<Rs00Rsbase> result = new ArrayList<>();
		try {
			String filepath = null;
			if(path != null && path !="")
				filepath = path;
			ReadExcelUtils excelReader = new ReadExcelUtils(filepath);
			Map<Integer, Map<Integer, Object>> map = excelReader.readExcelContent();
			System.out.println("获得Excel表格的内容:");
			for (int i = 1; i <= map.size(); i++) {
				Map<Integer,Object> ele = map.get(i);
				Rs00Rsbase object = new Rs00Rsbase();
				object.setId(UUID.randomUUID().toString());
				object.setRenamee(ele.get(0).toString());
				object.setRenamecode(ele.get(1).toString());
				object.setRstype(ele.get(2).toString().replace(".0", ""));
				object.setTotalStrgCpct(Integer.parseInt(ele.get(3).toString().replace(".0", "")));
				object.setLocalprovince(ele.get(4).toString());
				object.setLocalcity(ele.get(5).toString());
				object.setLocalcounty(ele.get(6).toString());
				object.setLocaltown(ele.get(7).toString());
				object.setLocalvillage(ele.get(8).toString());
				object.setLocalcode(ele.get(9).toString().replace(".0", ""));
				result.add(object);
			}
		} catch (FileNotFoundException e) {
			System.out.println("未找到指定路径的文件!");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
		
	}
	
	
}