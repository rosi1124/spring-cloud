package cn.hz.qbd.cloud.eureka.client.mybatis.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;

import cn.hz.qbd.cloud.eureka.client.mybatis.entity.Config;
import cn.hz.qbd.cloud.eureka.client.mybatis.mapper.ConfigMapper;
import cn.hz.qbd.cloud.eureka.client.mybatis.service.ConfigService;

@Service
public class ConfigServiceImpl implements ConfigService {

	@Resource
	private ConfigMapper configMapper;
	
	@Override
	public List<Config> selectAll() {
		return configMapper.selectAll();
	}

	@Override
	public PageInfo<Config> findAll() {
		return new PageInfo<Config>(configMapper.selectAll());
	}

}
