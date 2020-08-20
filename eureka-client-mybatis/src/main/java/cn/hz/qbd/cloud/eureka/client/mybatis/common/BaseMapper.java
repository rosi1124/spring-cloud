package cn.hz.qbd.cloud.eureka.client.mybatis.common;

import java.util.List;

import tk.mybatis.mapper.common.Mapper;

public interface BaseMapper<T> extends Mapper<T> {
	
	/**
	 * 批量添加
	 * @param list
	 * @return
	 */
	default int insert(List<T> list) {
		if (list == null || list.isEmpty()) {
			return 0;
		}
		for (T t : list) {
			insert(t);
		}
		return list.size();
	}
	
	/**
	 * 批量添加
	 * @param list
	 * @return
	 */
	default int insertSelective(List<T> list) {
		if (list == null || list.isEmpty()) {
			return 0;
		}
		for (T t : list) {
			insertSelective(t);
		}
		return list.size();
	}
}