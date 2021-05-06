package Abstract;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public interface SaleService {
	
	void sell(Customer customer,Campaign campaign, Game game);

}
