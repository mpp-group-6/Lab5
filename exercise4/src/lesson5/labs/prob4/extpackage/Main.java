package lesson5.labs.prob4.extpackage;

import java.time.LocalDate;

import lesson5.labs.prob4.Customer;
import lesson5.labs.prob4.CustomerOrderFactory;
import lesson5.labs.prob4.Order;

public class Main {
	public static void main(String[] args) {
		Customer cust = CustomerOrderFactory.createCustomer("Bob");
		Order order = CustomerOrderFactory.createOrder(cust, LocalDate.now());
		order.addItem("Shirt");
		order.addItem("Laptop");

		order = CustomerOrderFactory.createOrder(cust, LocalDate.now());
		order.addItem("Pants");
		order.addItem("Knife set");

		System.out.println(cust.getOrders());
	}
}

		
