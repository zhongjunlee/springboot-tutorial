package com.johnny.orm.mybatis.plus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.johnny.orm.mybatis.plus.entity.User;
import com.johnny.orm.mybatis.plus.mapper.UserMapper;
import com.johnny.orm.mybatis.plus.service.UserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * User Service
 * </p>
 *
 * @author Johnny Lee
 * @date Created in 2018-11-08 18:10
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
