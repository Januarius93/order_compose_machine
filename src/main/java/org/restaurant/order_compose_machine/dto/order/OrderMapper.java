package org.restaurant.order_compose_machine.dto.order;

import org.restaurant.order_compose_machine.dto.order_item.OrderItemMapper;

import org.restaurant.order_compose_machine.model.order.Order;
import org.springframework.stereotype.Component;


import java.util.stream.Collectors;

@Component
public class OrderMapper {

    private final OrderItemMapper orderItemMapper;

    public OrderMapper(OrderItemMapper orderItemMapper) {
        this.orderItemMapper = orderItemMapper;
    }

    public OrderDto toDTO(Order order) {
        OrderDto orderDto = new OrderDto();
        orderDto.setId(order.getId());
        orderDto.setListOfOrderItems(order.getListOfOrderItems().stream()
                .map(orderItemMapper::toDTO)
                .collect(Collectors.toList()));
        return orderDto;
    }

    public Order toEntity(OrderDto orderDto) {
        Order order = new Order();
        order.setId(orderDto.getId());
        order.setListOfOrderItems(orderDto.getListOfOrderItems().stream()
                .map(orderItemMapper::toEntity)
                .collect(Collectors.toList()));
        return order;
    }
}
