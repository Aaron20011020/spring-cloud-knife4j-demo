package cn.aaron.order.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Aaron(谢胜瑜)
 */
@RestController
@RequestMapping("order")
@Api(value = "订单", tags = "订单")
public class OrderController {

    @GetMapping
    @ApiOperation(value = "查询")
    public String get(@RequestParam String a){
        return a;
    }
}
