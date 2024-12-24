package org.restaurant.order_compose_machine.dto.order_item;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderItemDto {

  @JsonProperty("itemName")
  private String itemName;

  @JsonProperty("quantity")
  private Integer quantity;

  @JsonProperty("price")
  private Double price;

  @JsonProperty("specialNoteOrderItem")
  private String specialNote;

}
