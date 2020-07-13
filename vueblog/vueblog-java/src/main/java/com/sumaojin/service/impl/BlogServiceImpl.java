package com.sumaojin.service.impl;

import com.sumaojin.entity.Blog;
import com.sumaojin.mapper.BlogMapper;
import com.sumaojin.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
