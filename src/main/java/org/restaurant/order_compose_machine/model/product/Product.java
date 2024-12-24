package org.restaurant.order_compose_machine.model.product;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.restaurant.order_compose_machine.enums.product.DishType;

@Entity
@Getter
@Setter
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long productId;

  @Column(name = "product_name")
  private String productName;

  @Enumerated(EnumType.STRING)
  @Column(name = "product_type")
  private DishType productType;

  private String description;
  private Boolean isCustomizable;
}