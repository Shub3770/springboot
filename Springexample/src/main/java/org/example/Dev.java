package org.example;

public class Dev {
    private Laptop laptop;
    public Dev(Laptop laptop){
        this.laptop=laptop;
    }
//    public  Dev(Laptop laptop){
//        this.laptop = laptop;
//        System.out.println("hello i am in the Dev");
//    }


//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    //    private int age ;
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public int getAge(){
//        return age;
//    }
    public void build(){
        laptop.cmpile();
        System.out.println("hello this is dev");
    }
}
