public class SingleInheritance extends Object {


    void m1(){
        System.out.println("Inside m1");

    }
    public static void main(String[] args) {
        // Create an instance of our SingleInheritance class
        // s is equal to new SingleInheritance

        SingleInheritance s = newSingleInheritance();
        s.m1();
        s.hashCode();
        s.getClass();
       
    }
    
}
