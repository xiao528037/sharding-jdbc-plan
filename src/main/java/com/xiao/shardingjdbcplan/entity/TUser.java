package com.xiao.shardingjdbcplan.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author aloneMan
 * @projectName sharding-jdbc-plan
 * @createTime 2022-10-07 17:32:20
 * @description
 */
@Data
@TableName("t_user")
public class TUser {
    private Long id;
    private String username;
    private Boolean sex;
}
