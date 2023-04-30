package com.yn.mybatisplus.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yn.mybatisplus.domain.User;
import com.yn.mybatisplus.mapper.UserMapper;
import lombok.Data;

@Data
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{
}
