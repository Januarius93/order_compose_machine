package org.restaurant.order_compose_machine.model.person;

import lombok.Data;
import org.restaurant.order_compose_machine.enums.PersonType;

@Data
public class Person {
    private PersonType personType;
    private StringBuffer name;
    private StringBuffer surname;
}
