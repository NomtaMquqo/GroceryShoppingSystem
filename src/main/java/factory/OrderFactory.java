package factory;

import domain.Customer;
import domain.Order;

public class OrderFactory {
    public static Order create(int id, String orderNumber, String type, String description,Customer customer){

        Order order =  new Order.Builder()
                .orderId(id)
                .typeOfOrder(type)
                .descriptionOfOrder(description)
                .customer(customer)
                .build();

        return order;
    }
}
