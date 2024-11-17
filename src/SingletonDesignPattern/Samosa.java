package SingletonDesignPattern;

import java.io.Serial;
import java.io.Serializable;
import java.lang.Override;

//public class Samosa {
//using serialization
public class Samosa implements Serializable, Cloneable {
    private static Samosa samosa;
    //constructor
    private Samosa(){
        // fix singleton pattern using throw exception when breaking using reflection API
//        if(samosa!=null){
//            throw new RuntimeException("You are trying to break singleton pattern");
//        }
    }

    // lazy initialization(object will only create when client need it)
    //lazy way of creating singleton object
//    public static Samosa getSamosa(){
//        //object of this class
//        if(samosa==null){
//            samosa=new Samosa();
//        }
//        return samosa;
//    }

    // synchronized for thread safety
    // it will synchronized entired method i.e. Method synchronization but we want only object creation
    // should be synchronized so we go with block synchronization.
//    public synchronized static Samosa getSamosa(){
//        //object of this class
//        if(samosa==null){
//            samosa=new Samosa();
//        }
//        return samosa;
//    }

    //block synchronization
    public synchronized static Samosa getSamosa(){
        //object of this class
        if(samosa==null){
           synchronized(Samosa.class){ // only synchronized block code will execute by one thread at a time
               if(samosa==null){
                   samosa=new Samosa();
               }
           }
        }
        return samosa;
    }

    // fix singleton pattern using enum when breaking using readResolve method

//    @Serial
    public Object readResolve(){
        return samosa;
    }

    //override clone method to break singleton pattern using cloning
//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    // fix singleton pattern using enum when breaking using override clone method
    @Override
    public Object clone() throws CloneNotSupportedException {
        return samosa;
    }

}

// fix singleton pattern using enum when breaking using reflection API
//public enum Samosa {
//    INSTANCE;
//    public void test(){
//        System.out.println("test method");
//    }
//}