package com.sumaojin.service.impl;

import com.sumaojin.entity.User;
import com.sumaojin.mapper.UserMapper;
import com.sumaojin.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
