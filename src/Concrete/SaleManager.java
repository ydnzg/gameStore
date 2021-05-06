package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class SaleManager implements SaleService{

	@Override
	public void sell(Customer customer, Campaign campaign, Game game) {
		
		System.out.println(game.getName() + " oyunu " + " % " + campaign.getDiscount() + " indirimle " + 
                            customer.getFirstName() + " isimli musteriye satilmistir ");
		
	}

}
