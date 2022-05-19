# Day_1

## java static methods
You can create a static method by using the keyword static. Static methods can access only static fields, methods. To access static methods there is no need to instantiate the class,

## Static Fields 
Static Fields − You can create a static field by using the keyword static. The static fields have the same value in all the instances of the class. These are created and initialized when the class is loaded for the first time

## Static Blocks 
These are a block of codes with a static keyword. In general, these are used to initialize the static members. JVM executes static blocks before the main method at the time of class loading.

~~~java
public class MyClass {
   public static int data = 20; // Static Field
   static{
      System.out.println("Hello this is a static block");
   }
   public static void sample(){
      System.out.println("Hello");
   }
   public static void main(String args[]){
      System.out.println(MyClass.data);
      MyClass.sample();
   }
}
~~~