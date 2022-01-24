package com.machinecode.limitedDeals;

import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here

        LimitedDealsApp limitedDealsApp= new LimitedDealsApp();
        DealItem dealItem=limitedDealsApp.addDeals(new Date(), new Date(System.currentTimeMillis() + 3600 * 1000),"ABXC",
                100.0,3);
        int userId1=limitedDealsApp.adduser("A");
        limitedDealsApp.claimDeal(userId1, dealItem.getDealId(),dealItem.getItemsId());
        int userId2=limitedDealsApp.adduser("B");
        limitedDealsApp.claimDeal(userId2, dealItem.getDealId(),dealItem.getItemsId());

        limitedDealsApp.endDeal(dealItem.getDealId());
        int userId3= limitedDealsApp.adduser("C");
        limitedDealsApp.claimDeal(userId3, dealItem.getDealId(),dealItem.getItemsId());


    }
}
