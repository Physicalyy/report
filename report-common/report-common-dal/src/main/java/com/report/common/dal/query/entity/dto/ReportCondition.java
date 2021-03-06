package com.report.common.dal.query.entity.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 查询过滤条件
 * @author lishun
 * @since 2017年4月26日 下午4:32:47
 */
@Data
public class ReportCondition implements Serializable {
    
	private static final long serialVersionUID = -1408519196396021992L;
	/** 主键 */
	private Long id;
	/** 报表标志 */
    private String toolFlag;
    /** conWhere 查询表达式中的过滤条件 */
    private String conWhere;
    /** 控件渲染类型 */
    private String conType;
    /** 控件名称 */
    private String conName;
    /** 控件类型 */
    private String conOption;
    /** 控件填充值(可以为sql) */
    private String conMuti;
    /** 控件排序 */
    private Integer orderNum;
    /** 控件默认值 */
    private String conDefaultValue;
    /** 控件所在行 */
    private Integer rowNum;
    /** 控件值如果从数据库查询,对应数据源名称 */
    private String dataBaseSource;
    /** 创建时间 */
    private Date createTime;
    /** 更新时间 */
    private Date updateTime;
}