package com.machinecode.limitedDeals;

public class IdGenerator {
    static int id=0;
    public static int  generatorId()
    {
        id++;
        return id;
    }
}
