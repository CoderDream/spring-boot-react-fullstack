package com.coderdream.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.coderdream.entity.ClientEntity;
import com.coderdream.service.ClientService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.net.URI;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制器，用于处理用户相关的HTTP请求。
 */
@Api(value = "用户管理接口", tags = {"用户管理"})
@RestController
@RequestMapping("/api/clients")
public class ClientController {

    @Resource
    private ClientService clientService;

    /**
     * 获取所有用户的列表。
     *
     * @return 用户列表
     */
    @ApiOperation(value = "获取所有用户", notes = "返回所有用户的列表")
    @GetMapping
    public ResponseEntity<List<ClientEntity>> getAllClients() {
        List<ClientEntity> clients = clientService.list();
        return ResponseEntity.ok(clients);
    }

    /**
     * 根据ID获取单个用户信息。
     *
     * @param id 用户ID
     * @return 用户信息或404状态码
     */
    @ApiOperation(value = "根据ID获取用户", notes = "返回单个用户的信息")
    @GetMapping("/{id}")
    public ResponseEntity<ClientEntity> getClientById(@ApiParam(value = "用户ID", required = true) @PathVariable Long id) {
        ClientEntity client = clientService.getById(id);
        if (client != null) {
            return ResponseEntity.ok(client);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    /**
     * 创建新用户。
     *
     * @param client 用户实体
     * @return 创建成功的响应和位置头
     */
    @ApiOperation(value = "创建新用户", notes = "根据JSON字符串创建新用户")
    @PostMapping
    public ResponseEntity<ClientEntity> createClient(@RequestBody @ApiParam(value = "用户实体", required = true) ClientEntity client) {
        clientService.save(client);
        return ResponseEntity.created(URI.create("/api/clients/" + client.getId())).body(client);
    }

    /**
     * 更新现有用户。
     *
     * @param id   用户ID
     * @param client 用户实体
     * @return 更新后的用户信息
     */
    @ApiOperation(value = "更新用户", notes = "根据ID更新用户信息")
    @PutMapping("/{id}")
    public ResponseEntity<ClientEntity> updateClient(@ApiParam(value = "用户ID", required = true) @PathVariable Long id,
        @RequestBody @ApiParam(value = "用户实体", required = true) ClientEntity client) {
        client.setId(id);
        clientService.updateById(client);
        return ResponseEntity.ok(client);
    }

    /**
     * 删除指定用户。
     *
     * @param id 用户ID
     * @return 无内容响应
     */
    @ApiOperation(value = "删除用户", notes = "根据ID删除用户")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClient(@ApiParam(value = "用户ID", required = true) @PathVariable Long id) {
        clientService.removeById(id);
        return ResponseEntity.noContent().build();
    }

    /**
     * 分页查询用户。
     *
     * @param currentPage 当前页码
     * @param pageSize    每页记录数
     * @return 分页结果
     */
    @ApiOperation(value = "分页查询用户", notes = "按页码和每页数量查询用户")
    @GetMapping("/page")
    public ResponseEntity<IPage<ClientEntity>> getClientsWithPagination(
        @ApiParam(value = "当前页码", defaultValue = "1") @RequestParam(name = "current", defaultValue = "1") int currentPage,
        @ApiParam(value = "每页数量", defaultValue = "10") @RequestParam(name = "size", defaultValue = "10") int pageSize) {
        IPage<ClientEntity> pageResult = clientService.getClientsWithPagination(currentPage, pageSize);
        return ResponseEntity.ok(pageResult);
    }
}
