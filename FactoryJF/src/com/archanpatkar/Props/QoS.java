package com.archanpatkar.Props;

import com.archanpatkar.Props.PropLoader;

public interface QoS
{
    public final static int Default_Stack_QoS =  Integer.parseInt(PropLoader.getPFile("C:\\Users\\RPISE PC3\\Desktop\\tj\\FactoryJF\\src\\com\\archanpatkar\\Props\\QoSDefault.properties").getProperty("QoS"));
    public final static int Stack_QoS = Integer.parseInt(PropLoader.getPFile("C:\\Users\\RPISE PC3\\Desktop\\tj\\FactoryJF\\src\\com\\archanpatkar\\Props\\QoSService.properties").getProperty("QoS"));
}
