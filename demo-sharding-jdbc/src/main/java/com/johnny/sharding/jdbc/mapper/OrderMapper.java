package com.johnny.sharding.jdbc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.johnny.sharding.jdbc.model.Order;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 订单表 Mapper
 * </p>
 *
 * @author Johnny Lee
 * @date Created in 2019-03-26 13:38
 */
@Component
public interface OrderMapper extends BaseMapper<Order> {
}
