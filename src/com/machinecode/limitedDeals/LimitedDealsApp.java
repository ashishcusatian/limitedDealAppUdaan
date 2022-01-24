package com.machinecode.limitedDeals;

import java.util.Date;

public class LimitedDealsApp {

    Database dbInstance;

    public LimitedDealsApp() {
        dbInstance =Database.getInstance();
    }

    public int  adduser(String name)
    {
        User user= new User(name);
        dbInstance.addUserToDB(user);
        return  user.getId();
    }
    public int addItem(String name,double price)
    {
        Items items= new Items(name, price);
        dbInstance.addItemsToDB(items);
        return  items.getId();
    }

    public DealItem addDeals(Date startDate, Date endDate, String name, double price, Integer numberOfItems)
    {
        int itemId = this.addItem(name,price);
        Deal deal = new Deal(startDate,endDate,name,itemId,numberOfItems);
        dbInstance.addDealToDB(deal);
        return new DealItem(deal.getId(),itemId);
    }

    public void claimDeal(int userId,int dealId,int itemId) throws Exception {
        Deal deal= dbInstance.getDeal(dealId);
        dbInstance.getUser(userId).addItems(itemId,1);
        deal.claimDeal(itemId);
    }

    public void updateDeal(int dealId,int itemId , Date endDate,int addCount) throws Exception {
        Deal deal= dbInstance.getDeal(dealId);
        deal.updateDeal(itemId,endDate,addCount);
    }

    public void  endDeal(int dealId) throws Exception {
        Deal deal= dbInstance.getDeal(dealId);
        deal.endDeal();
    }
}
