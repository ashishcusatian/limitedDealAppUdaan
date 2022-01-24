package com.machinecode.limitedDeals;

import java.util.Map;

public class Inventory {
    Map<Integer , Integer > inventory;

    static Inventory inventroryInstance=null;
    public static Inventory getInstance()
    {
        if(inventroryInstance==null)
        {
            inventroryInstance=new Inventory();
        }
        return inventroryInstance;
    }
    public void addItems(int itemId,int noOfItems)
    {
        int currentCount=0;
        if(this.inventory.containsKey(itemId))
        {
           currentCount=this.inventory.get(itemId);
            currentCount+=noOfItems;

        }
        this.inventory.put(itemId,currentCount);
    }

    public int getItemCount(Integer itemId)
    {
        if(this.inventory.containsKey(itemId))
        {
            return this.inventory.get(itemId);
        }
        return 0;
    }

    public void reduceItem(int itemId, int noOfItems) {
        int currentCount=0;

            currentCount=this.inventory.get(itemId);
            currentCount-=noOfItems;

        this.inventory.put(itemId,currentCount);
    }
}
