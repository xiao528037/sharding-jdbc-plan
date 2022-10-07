package com.xiao.shardingjdbcplan.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiao.shardingjdbcplan.entity.UserLearn;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

/**
 * @author aloneMan
 * @projectName sharding-jdbc-plan
 * @createTime 2022-10-07 16:56:33
 * @description
 */
@Mapper
public interface UserLearnMapper extends BaseMapper<UserLearn> {
}
