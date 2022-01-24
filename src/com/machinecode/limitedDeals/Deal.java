package com.machinecode.limitedDeals;

import java.util.Date;

public class Deal {
    int id;
    Date startDate;
    Date endDate;
    String name;
    int dealCout;


    public Deal(Date startDate, Date endDate, String name, int itemId, int numberOfItems) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.name = name;
        Inventory.getInstance().addItems(itemId,numberOfItems);
        this.id=IdGenerator.generatorId();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean claimDeal(int userId,int itemId)
    {

        if(this.endDate.after(new Date()))
        {
            if(Inventory.getInstance().getItemCount(itemId)>0 && db)
            {
                Inventory.getInstance().reduceItem(itemId,1);
                return true;
            }
            else
            {
                System.out.println("Out of stock");
            }
        }
        else
        {
            System.out.println("Deal expired");
        }

        return false;
    }

    public void updateDeal(int itemId, Date endDate, int addCount) {
        if(addCount>0)
        {
            Inventory.getInstance().addItems(itemId,addCount);
        }
        this.setEndDate(endDate);
    }

    public void endDeal()
    {
        this.setEndDate(new Date());
    }
}
