package com.coderdream.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.coderdream.entity.ClientEntity;

public interface ClientService extends IService<ClientEntity> {

    ClientEntity selectById(int id);

    Page<ClientEntity> getClientListByName(String name, int current, int size);

    IPage<ClientEntity> getClientsWithPagination(int currentPage, int pageSize);
}
