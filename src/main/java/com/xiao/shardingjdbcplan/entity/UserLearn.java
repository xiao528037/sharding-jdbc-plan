package com.xiao.shardingjdbcplan.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author aloneMan
 * @projectName sharding-jdbc-plan
 * @createTime 2022-10-07 16:53:23
 * @description
 */
@Data
@TableName("user")
public class UserLearn {
    private Long id;
    private Boolean sex;
    private Integer age;
    private Long cardId;
}
