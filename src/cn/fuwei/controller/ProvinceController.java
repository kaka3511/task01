package cn.fuwei.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import cn.fuwei.po.Province;
import cn.fuwei.po.ProvinceEx;
import cn.fuwei.po.Rs00Rsbase;
import cn.fuwei.service.ProvinceService;
import cn.fuwei.service.Rs00RsbaseService;
import cn.fuwei.util.Page;
import cn.fuwei.util.ReadExcelUtils;


/**
 * @author fuwei
 * 水库基本信息
 *
 */
@Controller
@RequestMapping("/Province")
public class ProvinceController {
	@Autowired
	private Rs00RsbaseService rs00RsbaseService;
	
	@Autowired
	private ProvinceService provinceService;

	/**
	 * 查询省份的水库信息
	 * @param  province
	 * @return ModelAndView
	 * @throws Exception
	 */
	@RequestMapping("/queryProvince")
	public ModelAndView queryProvince(String province,Integer pageStart) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		Rs00Rsbase rsbase = new Rs00Rsbase();
		List<Province> listP = new ArrayList<>();
		//默认查看所有省份的数据
		listP = provinceService.getProvinceById(null);
		if(province != "" && province != null)
			listP = provinceService.getProvinceBypName(province);
		//分页,默认每页5条数据、从0开始
		Page page = new Page();
		page.setTotal(listP.size());
		page.setStart(1);
		if(pageStart != null)
			page.setStart(pageStart);
		page.setOffset(5);
		double pageNum = ((double)page.getTotal())/((double)page.getOffset());
		pageNum = Math.ceil(pageNum);
		List<Integer> pageNumList = new ArrayList<>();
		for(double i=1;i<=pageNum;i++)
			pageNumList.add((int)i);
		modelAndView.addObject("pageNumList", pageNumList);
		modelAndView.addObject("page", page.getStart());
		listP = listP.subList(page.getOffset()*(page.getStart()-1), 
				page.getOffset()*(page.getStart()-1) + page.getOffset() <= page.getTotal() ?
						page.getOffset()*(page.getStart()-1) + page.getOffset() : page.getTotal());
		List<ProvinceEx> list = new ArrayList<>();
		for(Province p:listP){
			ProvinceEx pEx = new ProvinceEx();
			BeanUtils.copyProperties(p, pEx);
			String idProvince = p.getId();
			//将省份的水库信息填充进去
			pEx.setTotalCap(rs00RsbaseService.getTotalCapByIdProvince(idProvince,null).toString());
			pEx.setTotalNum(rs00RsbaseService.getTotalRs00ByIdProvince(idProvince, null).toString());
			
			pEx.setTotalCapBig(rs00RsbaseService.getTotalCapByIdProvince(idProvince,"1").toString());
			pEx.setTotalNumBig(rs00RsbaseService.getTotalRs00ByIdProvince(idProvince, "1").toString());
			
			pEx.setTotalCapMed(rs00RsbaseService.getTotalCapByIdProvince(idProvince,"2").toString());
			pEx.setTotalNumMed(rs00RsbaseService.getTotalRs00ByIdProvince(idProvince, "2").toString());
			
			pEx.setTotalCapSma(rs00RsbaseService.getTotalCapByIdProvince(idProvince,"3").toString());
			pEx.setTotalNumSma(rs00RsbaseService.getTotalRs00ByIdProvince(idProvince, "3").toString());
			
			list.add(pEx);
		}
			
		modelAndView.addObject("list", list);
		modelAndView.setViewName("Rs00/list");
		return modelAndView;
	}
	
	/**
	 * 添加水库信息
	 * @return String
	 * @throws Exception
	 */
	@RequestMapping("/addRs00Rsbase")
	public String addRs00Rsbase() throws Exception {
		return "Rs00/add";
	}
	
	/**
	 * 提交添加的水库信息
	 * @param items_file
	 * @return String
	 * @throws Exception
	 */
	@RequestMapping("/addRs00RsbaseSubmit")
	public String addItemsSubmit(MultipartFile items_file) throws Exception {
		String path = "D:/workSpace/task01/WebContent/WEB-INF/file/";
		String pathName = path + UUID.randomUUID().toString()+".xlsx";
		File file = new File(pathName);
		items_file.transferTo(file);
		//保存excel中数据到数据库中
		List<Rs00Rsbase> list = ReadExcelUtils.readFromExcel(pathName);
		//匹配省份，绑定省份id
		List<Province> listP = provinceService.getProvinceById(null);
		for(Rs00Rsbase rs00Rsbase:list){
			for(Province p:listP){
				String pname = p.getPname();
				if(rs00Rsbase.getLocalprovince().equals(pname)){
					rs00Rsbase.setIdprovince(p.getId());
				}
			}
		}
		rs00RsbaseService.addRs00Rsbase(list);
		return "redirect:queryProvince.do";
	}
}
