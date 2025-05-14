import java.time.LocalDate;

class BankCustomer{
    String cust_name;
    String acc_num;
    int age;

    BankCustomer(String cname,String acc_num,int age){
        this.cust_name = cname;
        this.acc_num = acc_num;
        this.age=age;
    }


    public void displayDetails(){
        System.out.println("Customer Name: "+cust_name);
        System.out.println("Account Number: "+acc_num);
        System.out.println("Age: "+age);
    }
}

public class main {
    public static void main(String[] args) {
        BankCustomer b1 = new BankCustomer("Ram", "IDFC2022000111", 28);
        b1.displayDetails();
        }
}
 