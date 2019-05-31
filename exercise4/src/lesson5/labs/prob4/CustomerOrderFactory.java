package lesson5.labs.prob4;

import java.time.LocalDate;

public final class CustomerOrderFactory
{
    private CustomerOrderFactory() {
        // do no thing.
    }
    
    public static Customer createCustomer(String name) {
        return new Customer(name);
    }
    
    public static Order createOrder(Customer customer, LocalDate date) {
        Order order = new Order(customer, date);
        customer.addOrder(order);
        return order;
    }
}
