package com.machinecode.limitedDeals;

import java.util.Map;

public class User {
    int id;
    String name;
    Map<Integer,Integer> items;

    public User(String name) {
        this.id=IdGenerator.generatorId();
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getItemCount(Integer itemId){
        if(this.items.containsKey(itemId))
        {
            return this.items.get(itemId);
        }
        return 0;
    }
    public void addItems(Integer itemId,int count){
        if(this.items.containsKey(itemId))
        {
           this.items.put(itemId,count);
        }

    }
}
