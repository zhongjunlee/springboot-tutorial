package com.johnny.orm.mybatis.plus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.johnny.orm.mybatis.plus.entity.User;
import org.springframework.stereotype.Component;

/**
 * <p>
 * UserMapper
 * </p>
 *
 * @author Johnny Lee
 * @date Created in 2018-11-08 16:57
 */
@Component
public interface UserMapper extends BaseMapper<User> {
}
