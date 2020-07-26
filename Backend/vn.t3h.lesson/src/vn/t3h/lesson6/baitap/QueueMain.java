
package vn.t3h.lesson6.baitap;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Iterator;


public class QueueMain { 
	
	private static final String MUSIC_NAME_CONT = "msc";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Customer> listQueues = createCustomer();
		System.out.println("Size_in_Queue: " + listQueues.size());
		Iterator<Customer> iterator = listQueues.iterator();
		List<Customer> listByNameFix = new ArrayList<Customer>();
		while (iterator.hasNext()) {
			Customer customer = iterator.next();
			if (customer.getMusicName().equals(MUSIC_NAME_CONT)) {
				listByNameFix.add(customer);
			}
		}
		System.out.println("Customer co musicName la: " + listByNameFix.size());
		for(Customer cus : listByNameFix) {
			System.out.println("customer info : " + cus.toString());
		}
		
	}
	
	public static Queue<Customer> createCustomer() {
		Queue<Customer> Customer = new LinkedList<Customer>();
		var cus01 = new Customer("1", "Cs1", "2020-07-08 10:20", "Ms1");
		var cus02 = new Customer("2", "Cs2", "2020-07-08 10:22", "Ms2");
		var cus03 = new Customer("3", "Cs3", "2020-07-08 10:23", MUSIC_NAME_CONT);
		var cus04 = new Customer("4", "Cs4", "2020-07-08 10:24", "Ms4");
		var cus05 = new Customer("5", "Cs5", "2020-07-08 10:25", "Ms5");
		var cus06 = new Customer("6", "Cs6", "2020-07-08 10:26", MUSIC_NAME_CONT);

		//addtoqueue
		Customer.add(cus01);
		Customer.add(cus02);
		Customer.add(cus03);
		Customer.add(cus04);
		Customer.add(cus05);
		Customer.add(cus06);

		return Customer;
	}
}
