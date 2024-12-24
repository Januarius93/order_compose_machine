package org.restaurant.order_compose_machine.model.order;

import jakarta.persistence.*;
import org.restaurant.order_compose_machine.enums.order.OrderItemType;
import org.restaurant.order_compose_machine.model.product.Product;
import org.restaurant.order_compose_machine.model.money.Price;

@Entity
@Table(name = "order_item")
public class OrderItem {

  @Column(name = "order_item_name")
  private String itemName;

  @Enumerated(EnumType.STRING)
  @Column(name = "order_item_type")
  private OrderItemType orderItemType;

  @ManyToOne(targetEntity = Product.class, fetch = FetchType.LAZY)
  private Product product;

  @Column(name = "quantity")
  private Integer quantity;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "price_id")
  private Price price;

  private String specialNote;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public OrderItemType getOrderItemType() {
    return orderItemType;
  }

  public void setOrderItemType(OrderItemType orderItemType) {
    this.orderItemType = orderItemType;
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }

  public String getSpecialNote() {
    return specialNote;
  }

  public void setSpecialNote(String specialNote) {
    this.specialNote = specialNote;
  }

}
