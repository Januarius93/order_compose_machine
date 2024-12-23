package org.restaurant.order_compose_machine.model.product;

import org.restaurant.order_compose_machine.enums.product.DishType;

public abstract class Product {
  private Long productId;
  private String productName;
  private DishType productType;
  private String description;
  private Boolean isCustomizable;
}
