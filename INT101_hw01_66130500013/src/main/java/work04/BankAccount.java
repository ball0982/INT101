
package work04;
import work04.Person;
 public class BankAccount {

private int number;
private Person owner;
private double balance;


public BankAccount(int number,Person owner){
 this.number=number;
 this.owner =owner;

}

  public Person getOwner() {
   return owner;
  }


  public double getBalance() {
   return balance;
  }

     public int getNumber() {
         return number;
     }

     public double deposit(double amount){
        return this.balance += amount;
     }

  public double withdraw(double amount){
   return this.balance -= amount;
  }

  public void transfer(double amount,BankAccount account){
     this.balance -= amount;
     account.deposit(amount);
  }


  @Override
  public String toString() {
   return "BankAccount id { " + number +
           " owner = " + getOwner() + " balance " + getBalance() +
           '}';
  }
 }





