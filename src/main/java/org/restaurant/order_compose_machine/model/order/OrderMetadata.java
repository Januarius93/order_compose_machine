package org.restaurant.order_compose_machine.model.order;

import lombok.Data;
import org.restaurant.order_compose_machine.model.money.Discount;
import org.restaurant.order_compose_machine.model.money.Tax;

@Data
public class OrderMetadata {
  private Tax taxation;
  private String additionalNotes;
  private Discount discount;
}
