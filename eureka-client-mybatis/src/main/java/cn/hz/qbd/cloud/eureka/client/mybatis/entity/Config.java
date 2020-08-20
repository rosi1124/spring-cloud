package cn.hz.qbd.cloud.eureka.client.mybatis.entity;

import javax.persistence.Column;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
@Table(name = "t_config")
public class Config extends BaseEntity {

    /**
	 * 
	 */
	private static final long serialVersionUID = 2376571628991244766L;

    /**
     * 属性名
     */
    @Column(name = "`key`")
    private String key;

    /**
     * 描述值
     */
    @Column(name = "`value`")
    private String value;

    /**
     * 应用
     */
    @Column(name = "application")
    private String application;

    /**
     * 环境变量
     */
    @Column(name = "profile")
    private String profile;

    /**
     * 微服务
     */
    @Column(name = "label")
    private String label;

}