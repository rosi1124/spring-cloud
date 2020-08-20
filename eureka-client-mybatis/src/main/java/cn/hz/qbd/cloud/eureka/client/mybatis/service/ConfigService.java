package cn.hz.qbd.cloud.eureka.client.mybatis.service;

import java.util.List;

import com.github.pagehelper.PageInfo;

import cn.hz.qbd.cloud.eureka.client.mybatis.entity.Config;

public interface ConfigService {

	List<Config> selectAll();
	
	PageInfo<Config> findAll();
}
