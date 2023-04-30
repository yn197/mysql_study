package com.yn.mybatisplus;

import com.yn.mybatisplus.domain.User;
import com.yn.mybatisplus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class MybatisPlusApplicationTests2 {
    @Resource
    private UserMapper userMapper;

    @Test
    void testInsert() {
        User sample = new User();
        userMapper.insert(sample);
        assertThat(sample.getId()).isNotNull();
    }
}
