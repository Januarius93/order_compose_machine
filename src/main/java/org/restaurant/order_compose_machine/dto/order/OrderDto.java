package org.restaurant.order_compose_machine.dto.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import org.restaurant.order_compose_machine.dto.order_item.OrderItemDto;

import java.util.List;

@Data
@Builder
public class OrderDto {
  @JsonProperty("orderId")
  private Long id;

  @JsonProperty("orderItems")
  private List<OrderItemDto> listOfOrderItems;

  @JsonProperty("orderSpecialNote")
  private String specialNote;
}
