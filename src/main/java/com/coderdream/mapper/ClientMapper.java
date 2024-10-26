package com.coderdream.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coderdream.entity.ClientEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ClientMapper extends BaseMapper<ClientEntity> {

    // 这里的BaseMapper是一个MyBatisPlus中提供的超类
    // 这个类里面附带了增删改查等一系列的常用方法
    // TbClientMapper中一些常见的操作就可以直接继承过来进行使用
    // 这里可以添加自定义的查询方法，例如按状态查询
    Page<ClientEntity> selectByName(Page<ClientEntity> page, @Param("name") String name);
}
