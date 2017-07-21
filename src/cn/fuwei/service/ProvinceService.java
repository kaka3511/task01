package cn.fuwei.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.fuwei.mapper.ProvinceMapper;
import cn.fuwei.po.Province;
import cn.fuwei.po.ProvinceExample;
import cn.fuwei.po.ProvinceExample.Criteria;

public class ProvinceService {
	@Autowired
	private ProvinceMapper mapper;

	/**
	 * 通过id查找省份
	 * @param ids
	 * @return List<Province>
	 */
	public List<Province> getProvinceById(String[] ids) {

		List<Province> list = new ArrayList<>();
		ProvinceExample example = new ProvinceExample();
		Criteria criteria = example.createCriteria();
		if (ids != null) {
			for (String str : ids) {
				criteria.andIdIn(Arrays.asList(ids));
			}
		}
		list = mapper.selectByExample(example);
		return list;
	}

	/**
	 * 通过名称查找省份
	 * @param pname
	 * @return List<Province>
	 */
	public List<Province> getProvinceBypName(String pname) {

		List<Province> list = new ArrayList<>();
		ProvinceExample example = new ProvinceExample();
		Criteria criteria = example.createCriteria();
		if (pname != null) {
			criteria.andPnameLike("%"+pname+"%");
		}
		list = mapper.selectByExample(example);
		return list;
	}

	

}
