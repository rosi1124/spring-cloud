package cn.hz.qbd.cloud.eureka.client.mybatis.entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
public class BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	/** 记录标识 */
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
}
