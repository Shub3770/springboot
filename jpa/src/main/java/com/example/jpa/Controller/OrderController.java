package com.example.jpa.Controller;

import com.example.jpa.Dto.OrderDto;
import com.example.jpa.Services.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
@AllArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/order")
    public ResponseEntity<OrderDto> createOrder(
            @RequestBody OrderDto orderDto) {

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(orderService.CreateOrder(orderDto));
    }
}