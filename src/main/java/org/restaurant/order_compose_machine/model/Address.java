package org.restaurant.order_compose_machine.model;

import lombok.Data;

@Data
public class Address {
  private String city;
  private String streetName;
  private Integer streetNumber;
  private String postalCode;
}
