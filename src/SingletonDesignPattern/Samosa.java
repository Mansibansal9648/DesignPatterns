package SingletonDesignPattern;

public class Samosa {

    private static Samosa samosa;
    //constructor
    private Samosa(){

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
}
