package content;
public class Worker {

   private int number;
   private int hours;
   private double rate;
   private double pay;
   
   public Worker(int number){
       this.number = number;
   }
   
   public int getNumber(){
       return this.number;
   }
   public double getPay(){
       calculatePay();
       return this.pay;
   }
   public void setHours(int hours){
       this.hours = hours;
   }
   public void setRate(double rate){
       this.rate = rate;
   }
   private void calculatePay(){
       this.pay = this.hours * this.rate;
   }
   
}

//1.	Create a project called DemoWorker that
//a.	Has its main method in a class called Main
//b.	Has a content folder that contains a Worker class
//2.	To Worker class, add a private
//a.	Integer number that is set by a constructor and has a get method
//b.	Integer hours with a set method
//c.	Double rate with a set method
//d.	Double pay with a get method
//e.	calculatePay method that
//i.	does not return anything
//ii.	does not take any para
//iii.	sets pay = hours *rate
//iv.	is called in the getPay method
