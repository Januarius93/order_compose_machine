package org.restaurant.order_compose_machine.dto.order_item;

import org.restaurant.order_compose_machine.model.money.Price;
import org.restaurant.order_compose_machine.model.order.OrderItem;
import org.springframework.stereotype.Component;

@Component
public class OrderItemMapper {

  public OrderItemDto toDTO(OrderItem orderItem) {
    OrderItemDto orderItemDto = new OrderItemDto();
    orderItemDto.setItemName(orderItem.getItemName());
    orderItemDto.setQuantity(orderItem.getQuantity());
    orderItemDto.setPrice(orderItem.getPrice().getTotalAmount());
    return orderItemDto;
  }

  public OrderItem toEntity(OrderItemDto OrderItemDto) {
    OrderItem orderItem = new OrderItem();
    orderItem.setItemName(OrderItemDto.getItemName());
    orderItem.setQuantity(OrderItemDto.getQuantity());
    Price price = new Price();
    price.setTotalAmount(OrderItemDto.getPrice());
    orderItem.setPrice(price);
    return orderItem;
  }
}
