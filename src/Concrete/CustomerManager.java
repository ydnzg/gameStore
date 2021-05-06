package Concrete;

import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entities.Customer;

public class CustomerManager implements CustomerService{

	private CustomerCheckService customerCheckService;
	
	public CustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService=customerCheckService;	
	}
	@Override
	public void add(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println(customer.getFirstName()+ " isimli müsteri kaydi eklendi");
		}else {
			System.out.println("Kisi bulunamadigi icin kayit yapilamadi");
		}
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName()+ " isimli müsteri kaydi silindi");
		
	}

}
