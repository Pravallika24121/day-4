class Rbi{
    void loan(){
        System.out.println("this is  rbi");
    }

}
class Sbi extends Rbi{
    Sbi(){
        System.out.println("this is sbi");
    }
}
class Hdfc extends Sbi{
    Hdfc(){
        System.out.println("this is rbi");
    }
}
class   User extends Sbi{
    User(){
        System.out.println("this is user");
    }
}
class Hybrid2{
    public static void main(String[]args){
        User us=new User();
        us.loan();
    }
}