package org.restaurant.order_compose_machine.model.order;

import lombok.Data;
import org.restaurant.order_compose_machine.enums.order.OrderItemType;
import org.restaurant.order_compose_machine.model.product.Dish;
import org.restaurant.order_compose_machine.model.money.Price;

@Data
public class OrderItem {
  private Long id;
  private OrderItemType orderItemType;
  private Dish dish;
  private Integer quantity;
  private Price price;
  private StringBuffer specialNote;
}
