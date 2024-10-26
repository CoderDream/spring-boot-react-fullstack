package com.coderdream.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "client")
public class ClientEntity {

    @TableId(type = IdType.AUTO)
    private Long id;

    @TableField("name") // 字段名和属性名相同是不用写的
    private String name;
    private String email;

}
