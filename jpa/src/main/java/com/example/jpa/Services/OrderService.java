package com.example.jpa.Services;

import com.example.jpa.Dto.OrderDto;
import com.example.jpa.Repository.OrderRepo;
import com.example.jpa.Repository.UserRepository;
import com.example.jpa.entities.order;
import com.example.jpa.entities.user;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrderService {

    private final OrderRepo orderRepo;
    private final UserRepository userRepository;

    public OrderDto CreateOrder(OrderDto orderDto) {

        // Find the user
        user existingUser = userRepository
                .findById(orderDto.getUserId())
                .orElseThrow();

        // Create a new order
        order newOrder = new order();

        // Set product
        newOrder.setProduct_name(orderDto.getProductname());

        // Connect order with user
        newOrder.setUsr(existingUser);

        // Save order
        order savedOrder = orderRepo.save(newOrder);

        // Convert Entity -> DTO
        return new OrderDto(
                savedOrder.getId(),
                savedOrder.getProduct_name(),
                savedOrder.getUsr().getId()
        );
    }
}