import org.restaurant.order_compose_machine.model.order.Order;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

public class AbstractUnitTest{
    @Autowired
    private WebApplicationContext webApplicationContext;
    protected MockMvc mockMvc;


}
