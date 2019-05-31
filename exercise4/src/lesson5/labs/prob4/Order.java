package lesson5.labs.prob4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Order {
	private LocalDate orderDate;
	private List<Item> items;
	private Customer customer;
	
	//package visibility
	Order(Customer cust, LocalDate orderDate) {
		this.orderDate = orderDate;
		items = new ArrayList<Item>();	
		this.customer = cust;
	}
	
	public void addItem(String name){
		items.add(new Item(name));
	}
	
	@Override
	public String toString() {
		return String.format("\n(%s, %s): %s\n", customer.getName(), orderDate, items.toString());
	}
}
