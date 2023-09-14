package com.johnny.dynamic.datasource.mapper;

import com.johnny.dynamic.datasource.config.MyMapper;
import com.johnny.dynamic.datasource.model.DatasourceConfig;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 数据源配置 Mapper
 * </p>
 *
 * @author Johnny Lee
 * @date Created in 2019-09-04 16:20
 */
@Mapper
public interface DatasourceConfigMapper extends MyMapper<DatasourceConfig> {
}
