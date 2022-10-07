package com.xiao.shardingjdbcplan.entity;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * @author aloneMan
 * @projectName sharding-jdbc-plan
 * @createTime 2022-10-07 09:19:10
 * @description 学习sharding-jdbc用的实体类
 */
@Data
public class User implements Serializable {

    private Long id;

    private String username;

    private boolean sex;

    private Integer age;

    private Date createTime;

}
