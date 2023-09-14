package com.johnny.orm.mybatis.MapperAndPage.mapper;

import com.johnny.orm.mybatis.MapperAndPage.entity.User;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * <p>
 * UserMapper
 * </p>
 *
 * @author Johnny Lee
 * @date Created in 2018-11-08 14:15
 */
@Component
public interface UserMapper extends Mapper<User>, MySqlMapper<User> {
}
