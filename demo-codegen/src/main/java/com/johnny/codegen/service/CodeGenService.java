package com.johnny.codegen.service;

import cn.hutool.db.Entity;
import com.johnny.codegen.common.PageResult;
import com.johnny.codegen.entity.GenConfig;
import com.johnny.codegen.entity.TableRequest;

/**
 * <p>
 * 代码生成器
 * </p>
 *
 * @author Johnny Lee
 * @date Created in 2019-03-22 10:15
 */
public interface CodeGenService {
    /**
     * 生成代码
     *
     * @param genConfig 生成配置
     * @return 代码压缩文件
     */
    byte[] generatorCode(GenConfig genConfig);

    /**
     * 分页查询表信息
     *
     * @param request 请求参数
     * @return 表名分页信息
     */
    PageResult<Entity> listTables(TableRequest request);
}
