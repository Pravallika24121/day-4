class Parent{
    void name(){
        System.out.println("this is parent");

    }
}
class Child extends Parent{
    Child(){
        System.out.println("this is child");
    }
}
class Singleinheritence{
    public static void main(String []args){
        Child ch=new Child();
        ch.name();
    }
}