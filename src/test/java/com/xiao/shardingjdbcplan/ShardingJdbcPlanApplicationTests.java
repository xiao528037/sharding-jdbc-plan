package com.xiao.shardingjdbcplan;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xiao.shardingjdbcplan.entity.TCommon;
import com.xiao.shardingjdbcplan.entity.TUser;
import com.xiao.shardingjdbcplan.entity.User;
import com.xiao.shardingjdbcplan.entity.UserLearn;
import com.xiao.shardingjdbcplan.mapper.TCommonMapper;
import com.xiao.shardingjdbcplan.mapper.TUserMapper;
import com.xiao.shardingjdbcplan.mapper.UserLearnMapper;
import com.xiao.shardingjdbcplan.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ShardingJdbcPlanApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Resource
    private UserLearnMapper userLearnMapper;

    /**
     * 单数据库水平分表
     */
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

    @Test
    void testMultipleDB() {
        UserLearn userLearn = new UserLearn();
        userLearn.setSex(true);
        userLearn.setAge(12);
        userLearn.setCardId(11L);
        userLearnMapper.insert(userLearn);
    }

    @Test
    void testSelectOne() {
        QueryWrapper<UserLearn> userLearnQueryWrapper = new QueryWrapper<>();
        userLearnQueryWrapper.eq("id", 1578311145905844225L);
        UserLearn userLearn = userLearnMapper.selectOne(userLearnQueryWrapper);
        System.out.println(userLearn);
    }

    @Resource
    private TUserMapper tUserMapper;

    @Test
    void insertTUser() {
        TUser tUser = new TUser();
        tUser.setUsername("legal high");
        tUser.setSex(true);
        tUserMapper.insert(tUser);
    }


    @Resource
    private TCommonMapper tCommonMapper;

    @Test
    void TCommon() {
        TCommon tCommon = new TCommon();
        tCommon.setUserStatus(true);
        tCommon.setUserId(11L);
        tCommonMapper.insert(tCommon);
    }
}
