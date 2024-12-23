package org.restaurant.order_compose_machine.model.order;

import lombok.Data;
import org.restaurant.order_compose_machine.enums.order.OrderStatus;

import java.time.LocalDate;

@Data
public class OrderDetails {
  private Long orderId;
  private LocalDate orderDate;
  private OrderStatus orderStatus;
}
