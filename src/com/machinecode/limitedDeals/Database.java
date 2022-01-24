package com.machinecode.limitedDeals;

import java.net.Inet4Address;
import java.util.Map;

public class Database {
    Map<Integer , Deal> dealMap;
    Map<Integer, User> userMap;
    Map<Integer , Items> itemsMap;

    static Database dbInstance=null;
    public static Database getInstance()
    {
        if(dbInstance==null)
        {
            dbInstance=new Database();
        }
        return dbInstance;
    }

    public void addUserToDB(User user)
    {
        this.userMap.put(user.getId(),user);
    }
    public User getUser(Integer userId) throws Exception {
        if(this.userMap.containsKey(userId))
        return this.userMap.get(userId);
        else
            throw  new Exception("user not found");
    }

    public void addDealToDB(Deal deal)
    {
        this.dealMap.put(deal.getId(),deal);
    }
    public Deal getDeal(Integer dealId) throws Exception {
        if(this.dealMap.containsKey(dealId))
            return this.dealMap.get(dealId);
        else
            throw  new Exception("Deal not found");
    }
    public void addItemsToDB(Items items)
    {
        this.itemsMap.put(items.getId(),items);
    }

    public Items getItem(Integer itemId) throws Exception {
        if(this.itemsMap.containsKey(itemId))
            return this.itemsMap.get(itemId);
        else
            throw  new Exception("Deal not found");
    }
}
