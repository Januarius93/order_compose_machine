package org.restaurant.order_compose_machine.model.person;

import lombok.Data;

@Data
public class Customer extends Person {
  private Long customerId;
  private StringBuffer email;
  private Long phone;
}
