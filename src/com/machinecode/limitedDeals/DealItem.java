package com.machinecode.limitedDeals;

public class DealItem {
    int dealId;
    int itemsId;

    public DealItem(int dealId, int itemsId) {
        this.dealId = dealId;
        this.itemsId = itemsId;
    }

    public int getDealId() {
        return dealId;
    }

    public void setDealId(int dealId) {
        this.dealId = dealId;
    }

    public int getItemsId() {
        return itemsId;
    }

    public void setItemsId(int itemsId) {
        this.itemsId = itemsId;
    }
}
