package org.restaurant.order_compose_machine.model.order;

import lombok.Data;
import org.restaurant.order_compose_machine.model.Restaurant;
import org.restaurant.order_compose_machine.model.person.Person;

@Data
public class RestaurantSpecificDetails {
  private Integer tableNumber;
  private Person staffMember;
  private Restaurant restaurant;
}
