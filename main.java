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

class Transactionhistory{
    int trans_id;
    String S_name;
    String R_name;
    String Status;

    Transactionhistory(int trans_id,String S_name,String R_name,String Status){
        this.trans_id = trans_id;
        this.S_name = S_name;
        this.R_name = R_name;
        this.Status = Status;
    }

    public void display(){
        System.out.println("Transaction History");
        System.out.println("Transaction ID: "+trans_id);
        System.out.println("Sender Name: "+S_name);
        System.out.println("Receiver Name: "+R_name);
        System.out.println("Status: "+Status);
        }
        
}


public class main {
    public static void main(String[] args) {
        BankCustomer b1 = new BankCustomer("Ram", "IDFC2022000111", 28);
        b1.displayDetails();

        System.out.println("");

        Transactionhistory t1 = new Transactionhistory(0210,"Ram","Laxman","Success");
        t1.display();

        LocalDate date = LocalDate.now();
        System.out.println(" Date: "+date);
        }
}
 