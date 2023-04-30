package com.yn.mybatisplus.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class User implements Serializable {
    @TableId(type = IdType.ASSIGN_UUID)
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
