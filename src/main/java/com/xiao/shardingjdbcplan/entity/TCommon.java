package com.xiao.shardingjdbcplan.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author aloneMan
 * @projectName sharding-jdbc-plan
 * @createTime 2022-10-07 17:55:46
 * @description
 */
@Data
@TableName("t_common")
public class TCommon {
    private Long id;
    private Boolean userStatus;
    private Long userId;
}
