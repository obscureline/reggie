package com.obscureline.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.obscureline.reggie.entity.OrderDetail;
import com.obscureline.reggie.mapper.OrderDetailMapper;
import com.obscureline.reggie.service.OrderDetailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper , OrderDetail> implements OrderDetailService {
}
