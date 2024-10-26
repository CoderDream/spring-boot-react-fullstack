package com.coderdream.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coderdream.entity.ClientEntity;
import com.coderdream.mapper.ClientMapper;
import com.coderdream.service.ClientService;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl extends ServiceImpl<ClientMapper, ClientEntity> implements ClientService {

    @Resource
    private ClientMapper userMapper;

    @Override
    public ClientEntity selectById(int id) {
        return userMapper.selectById(id);
    }

    @Override
    public Page<ClientEntity> getClientListByName(String name, int current, int size) {
        Page<ClientEntity> page = this.page(new Page<>(current, size), null);
        if (StrUtil.isNotEmpty(name)) {
            return this.baseMapper.selectByName(page, name);
        }
        return page;
    }

    @Override
    public IPage<ClientEntity> getClientsWithPagination(int currentPage, int pageSize) {
        Page<ClientEntity> page = new Page<>(currentPage, pageSize);
        QueryWrapper<ClientEntity> queryWrapper = new QueryWrapper<>();
        return page(page, queryWrapper);
    }
}
