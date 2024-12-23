package org.restaurant.order_compose_machine.model.order;

import lombok.Data;

import java.util.List;

@Data
public class Order {
    private List<OrderItem> listOfOrderItems;
}
