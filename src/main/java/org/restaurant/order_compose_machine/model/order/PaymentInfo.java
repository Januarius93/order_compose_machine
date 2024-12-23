package org.restaurant.order_compose_machine.model.order;

import lombok.Data;
import org.restaurant.order_compose_machine.enums.payment.PaymentMethod;
import org.restaurant.order_compose_machine.enums.payment.PaymentStatus;
import org.restaurant.order_compose_machine.model.money.Price;

@Data
public class PaymentInfo {
  private PaymentStatus paymentStatus;
  private PaymentMethod paymentMethod;
  private Price totalAmount;
}