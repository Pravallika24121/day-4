class Rbi{
    void name(){
        System.out.println("this is Rbi");

    }
}
class Sbi extends Rbi{
    Sbi(){
        System.out.println("this is Sbi");
    }
}
class Hdfc extends Rbi{
    Hdfc(){
        System.out.println("this is Hdfc");
    }
}
class Inheri2{
    public static void main(String []args){
        Sbi ch1=new Sbi();
        ch1.name();
        Hdfc ch2=new Hdfc();
        ch2.name();
    }
}