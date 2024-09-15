package Tugas;

public class EncapTest {
    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        EncapDemo encap1 = new EncapDemo(); 
        encap.setName("James");
        encap.setAge(35);
        encap1.setName("John");
        encap1.setAge(10);
        
        System.out.println("Name : " + encap.getName());
        System.out.println("Age : " + encap.getAge());
        System.out.println("Name : " + encap1.getName());
        System.out.println("Age : " + encap1.getAge());
    }
    
}
