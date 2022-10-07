package com.xiao.shardingjdbcplan;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xiao.shardingjdbcplan.entity.User;
import com.xiao.shardingjdbcplan.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ShardingJdbcPlanApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        for (int i = 0; i < 4; i++) {
            User user = new User();
            user.setAge(i);
            user.setSex(i % 2 == 0);
            user.setUsername("name" + i);
            userMapper.insert(user);
        }
    }

    @Test
    void selectOne() {
        QueryWrapper<User> userWrapper = new QueryWrapper<>();
        userWrapper.eq("id", 1578245241104773122L);
        User user = userMapper.selectOne(userWrapper);
        System.out.println(user);


    }

}
