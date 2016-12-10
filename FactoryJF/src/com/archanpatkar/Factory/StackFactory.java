package com.archanpatkar.Factory;

import com.archanpatkar.Props.PropLoader;
import com.archanpatkar.Props.QoS;
import com.archanpatkar.Stack.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StackFactory 
{
    
    public static Stack getStack()
    {
         try {
           return (Stack) Class.forName(getConfig(QoS.Default_Stack_QoS)).newInstance();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StackFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(StackFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(StackFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static Stack getStack(int QoS){
        try {
           return (Stack) Class.forName(getConfig(QoS)).newInstance();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StackFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(StackFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(StackFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }   
    
    private static String getConfig(int QoS){
        return PropLoader.getPFile("C:\\Users\\RPISE PC3\\Desktop\\tj\\FactoryJF\\src\\com\\archanpatkar\\Props\\QoSMapper.properties").getProperty(Integer.toString(QoS));
    }
    
}
