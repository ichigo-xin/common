package com.xin.chapter5_jdbc.controller;

import com.xin.chapter5_jdbc.common.Result;
import com.xin.chapter5_jdbc.common.ResultCode;
import com.xin.chapter5_jdbc.pojo.Order;
import com.xin.chapter5_jdbc.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("{id}")
    public Result getOrder(@PathVariable("id") Integer id) {
        if (id == null) {
            return Result.failure(ResultCode.PARAM_IS_INVALID);
        }
        Order order = orderService.getOrderById(id);
        return Result.success(order);
    }


}
