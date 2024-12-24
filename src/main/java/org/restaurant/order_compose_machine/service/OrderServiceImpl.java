package org.restaurant.order_compose_machine.service;

import jakarta.transaction.Transactional;
import org.restaurant.order_compose_machine.controller.OrderController;

import org.restaurant.order_compose_machine.dto.order.OrderDto;
import org.restaurant.order_compose_machine.dto.order.OrderMapper;
import org.restaurant.order_compose_machine.model.order.Order;
import org.restaurant.order_compose_machine.repository.OrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class OrderServiceImpl implements OrderService {
  private static final Logger log = LoggerFactory.getLogger(OrderController.class);

  @Autowired private OrderRepository orderRepository;

  @Autowired private OrderMapper orderMapper;

  @Override
  public OrderDto proceedWithOrder(OrderDto orderDto) {
    Order order = orderMapper.toEntity(orderDto);
    Order savedOrder = orderRepository.save(order);
    return orderMapper.toDTO(savedOrder);
  }
}
