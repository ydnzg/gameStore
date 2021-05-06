import java.util.Date;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.CustomerManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class Main {

	public static void main(String[] args) {
		
		
		Customer customer = new Customer();
		customer.setFirstName("Ezgi");
		customer.setLastName("AYDIN CORA");
		customer.setDateOfBirth(new Date(1993,4,10));
		customer.setNationalityId("35901425864");
		
		Campaign campaign = new Campaign();
		campaign.setId(10);
		campaign.setDiscount((byte)20);
		campaign.setName("Oynamayan kalmasin");
		campaign.setStatus(true);
		
		Game game =new Game();
		game.setId(1);
		game.setName("Farki Bul");
		game.setPrice(320);
					
		CustomerManager customerManager = new CustomerManager(new MernisServiceAdapter());
		
		customerManager.add(customer);
		customerManager.delete(customer);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.update(campaign);
		campaignManager.delete(campaign);
		
		
		SaleManager saleManager = new SaleManager();
		saleManager.sell(customer, campaign, game);

	}

}
