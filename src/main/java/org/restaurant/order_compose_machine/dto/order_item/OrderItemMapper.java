package org.restaurant.order_compose_machine.dto.order_item;

import org.restaurant.order_compose_machine.model.money.Price;
import org.restaurant.order_compose_machine.model.order.OrderItem;
import org.springframework.stereotype.Component;

@Component
public class OrderItemMapper {

  public OrderItemDto toDTO(OrderItem orderItem) {
    return OrderItemDto.builder()
        .itemName(orderItem.getItemName())
        .quantity(orderItem.getQuantity())
        .price(orderItem.getPrice().getTotalAmount())
        .specialNote(orderItem.getSpecialNote())
        .build();
  }

  public OrderItem toEntity(OrderItemDto orderItemDto) {
    OrderItem orderItem = new OrderItem();
    orderItem.setItemName(orderItemDto.getItemName());
    orderItem.setQuantity(orderItemDto.getQuantity());
    Price price = new Price();
    price.setTotalAmount(orderItemDto.getPrice());
    orderItem.setPrice(price);
    orderItem.setSpecialNote(orderItemDto.getSpecialNote());
    return orderItem;
  }
}
