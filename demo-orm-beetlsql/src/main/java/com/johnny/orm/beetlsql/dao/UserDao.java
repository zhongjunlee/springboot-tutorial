package com.johnny.orm.beetlsql.dao;

import com.johnny.orm.beetlsql.entity.User;
import org.beetl.sql.core.mapper.BaseMapper;
import org.springframework.stereotype.Component;

/**
 * <p>
 * UserDao
 * </p>
 *
 * @author Johnny Lee
 * @date Created in 2018-11-14 16:18
 */
@Component
public interface UserDao extends BaseMapper<User> {

}
