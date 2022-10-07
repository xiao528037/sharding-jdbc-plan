package com.xiao.shardingjdbcplan.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiao.shardingjdbcplan.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author aloneMan
 * @projectName sharding-jdbc-plan
 * @createTime 2022-10-07 09:22:09
 * @description 使用mybatis-plus的baseMapper
 */

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
