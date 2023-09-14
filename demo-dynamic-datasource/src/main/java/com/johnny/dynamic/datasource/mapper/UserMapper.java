package com.johnny.dynamic.datasource.mapper;

import com.johnny.dynamic.datasource.config.MyMapper;
import com.johnny.dynamic.datasource.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户 Mapper
 * </p>
 *
 * @author Johnny Lee
 * @date Created in 2019-09-04 16:49
 */
@Mapper
public interface UserMapper extends MyMapper<User> {
}
