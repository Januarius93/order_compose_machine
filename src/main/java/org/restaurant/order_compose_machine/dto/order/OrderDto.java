package org.restaurant.order_compose_machine.dto.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.restaurant.order_compose_machine.dto.order_item.OrderItemDto;

import java.util.List;

@Data
/** to investigate -> lombok annotation does not work :( * */

public class OrderDto {
  @JsonProperty("orderId")
  private Long id;

  @JsonProperty("orderItems")
  private List<OrderItemDto> listOfOrderItems;

  public List<OrderItemDto> getListOfOrderItems() {
    return listOfOrderItems;
  }

  public void setListOfOrderItems(List<OrderItemDto> listOfOrderItems) {
    this.listOfOrderItems = listOfOrderItems;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
