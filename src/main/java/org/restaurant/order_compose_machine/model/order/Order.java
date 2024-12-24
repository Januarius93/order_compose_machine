package org.restaurant.order_compose_machine.model.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "order_table")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "order_id")
    private List<OrderItem> listOfOrderItems;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<OrderItem> getListOfOrderItems() {
        return listOfOrderItems;
    }

    public void setListOfOrderItems(List<OrderItem> listOfOrderItems) {
        this.listOfOrderItems = listOfOrderItems;
    }

}
