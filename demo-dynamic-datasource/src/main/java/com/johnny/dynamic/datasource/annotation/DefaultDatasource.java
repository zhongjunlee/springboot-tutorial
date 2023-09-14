package com.johnny.dynamic.datasource.annotation;

import java.lang.annotation.*;

/**
 * <p>
 * 用户标识仅可以使用默认数据源
 * </p>
 *
 * @author Johnny Lee
 * @date Created in 2019-09-04 17:37
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DefaultDatasource {
}
