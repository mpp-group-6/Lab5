package lesson5.labs.prob4;

import java.time.LocalDate;
import java.util.Objects;

public final class CustomerOrderFactory
{
    private CustomerOrderFactory() {
        // do no thing.
    }
    
    public static Customer createCustomer(String name) {
        return new Customer(name);
    }
    
    public static Order createOrder(Customer customer, LocalDate date) {
        Objects.requireNonNull(customer, "Customer cannot be null");
        Order order = new Order(customer, date);
        customer.addOrder(order);
        return order;
    }
}
