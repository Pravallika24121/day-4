class Parent{
    void name(){
        System.out.println("this is parent");

    }
}
class Child1 extends Parent{
    Child1(){
        System.out.println("this is child1");
    }
}
class Child2 extends Parent{
    Child2(){
        System.out.println("this is child2");
    }
}
class Hirarch{
    public static void main(String []args){
        Child1 ch1=new Child1();
        ch1.name();
        Child2 ch2=new Child2();
        ch2.name();
    }
}