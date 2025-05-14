import java.time.LocalDate;
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

public class main{
    public static void main(String[] args) {
        Transactionhistory t1 = new Transactionhistory(0210,"Ram","Laxman","Success");
        t1.display();

        LocalDate date = LocalDate.now();
        System.out.println(" Date: "+date);
}
}