package SingletonDesignPattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Example {

    public static void main(String[] args) throws Exception,CloneNotSupportedException{

        Samosa samosa1= Samosa.getSamosa();
        System.out.println(samosa1.hashCode());

        Samosa samosa2= Samosa.getSamosa();
        System.out.println(samosa2.hashCode());

        System.out.println(Jalebi.getJalebi().hashCode());
        System.out.println(Jalebi.getJalebi().hashCode());


        //to break singleton pattern using reflection API using throw exception
//        Samosa s1= Samosa.getSamosa();
//        System.out.println(s1.hashCode());

        //to break singleton pattern using reflection API using enum
//        Samosa s1= Samosa.INSTANCE;
//        System.out.println(s1.hashCode());
//        s1.test();

//        Constructor<Samosa> constructor=Samosa.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Samosa s2= constructor.newInstance();
//        System.out.println(s2.hashCode());

        //to break singleton pattern using deserialization
//        Samosa samosa=Samosa.getSamosa();
//        System.out.println(samosa.hashCode());
//        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("abc.ob"));
//        oos.writeObject(samosa);
//
//        System.out.println("serialization done.....");
//
//        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("abc.ob"));
//        Samosa s2=(Samosa) ois.readObject();
//        System.out.println(s2.hashCode());

        //to break singleton pattern using cloning
        Samosa samosa=Samosa.getSamosa();
        System.out.println(samosa.hashCode());
        Samosa s2=(Samosa) samosa.clone();
        System.out.println(s2.hashCode());
    }
}
