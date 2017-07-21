package cn.fuwei.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.fuwei.mapper.Rs00RsbaseMapper;
import cn.fuwei.po.Rs00Rsbase;
import cn.fuwei.po.Rs00RsbaseExample;
import cn.fuwei.po.Rs00RsbaseExample.Criteria;


public class Rs00RsbaseService {
	@Autowired
	private Rs00RsbaseMapper mapper;
	
	/**
	 * @param idProvince  省份id
	 * @param rsType      水库类型
	 * @return			      水库数量
	 */
	public Integer getTotalRs00ByIdProvince(String idProvince,String rsType){
		Rs00RsbaseExample example = new Rs00RsbaseExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdprovinceEqualTo(idProvince);
		if(rsType != null)
			criteria.andRstypeEqualTo(rsType);
		if(mapper.selectByExample(example) == null)
			return 0;
		return mapper.selectByExample(example).size();
	}
	
	/**
	 * @param idProvince  省份id
	 * @param rsType      水库类型
	 * @return            库容量
	 */
	public Integer getTotalCapByIdProvince(String idProvince,String rsType){
		Rs00RsbaseExample example = new Rs00RsbaseExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdprovinceEqualTo(idProvince);
		if(rsType != null)
			criteria.andRstypeEqualTo(rsType);
		List<Rs00Rsbase> list = mapper.selectByExample(example);
		int number = 0 ;
		for(Rs00Rsbase o:list){
			number = number + o.getTotalStrgCpct();
		}
		return number;
	}
	
	/**
	 * 添加水库信息
	 * @param rs00Rsbase
	 */
	public void addRs00Rsbase(List<Rs00Rsbase> list){
		if(list != null){
			for(Rs00Rsbase rs00Rsbase:list)
				mapper.insert(rs00Rsbase);
		}
	}
}
