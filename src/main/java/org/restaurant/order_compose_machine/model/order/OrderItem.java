package org.restaurant.order_compose_machine.model.order;

import lombok.Data;
import org.restaurant.order_compose_machine.enums.OrderItemType;
import org.restaurant.order_compose_machine.model.money.Price;

@Data
public class OrderItem {
  private Long id;
  private OrderItemType orderItemType;
  private Integer quantity;
  private Price price;
  private StringBuffer specialNote;
}
