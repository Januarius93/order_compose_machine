package org.restaurant.order_compose_machine.dto.order_item;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class OrderItemDto {

  @JsonProperty("itemName")
  private String itemName;

  @JsonProperty("quantity")
  private Integer quantity;

  @JsonProperty("price")
  private Double price;

  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }
}
