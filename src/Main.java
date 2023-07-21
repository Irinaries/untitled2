public class Main {
    public static void main(String[] args) {

       int deposit = 2000;
       int bonusLimit = 100;
       int onAccount = 300;
       int bonus = deposit / bonusLimit;
       if (deposit < 1000) {
          bonus = 0;
       }
       int balance = deposit + bonus + onAccount;
       System.out.println("Вы внесли " + deposit + "р. Вам начисленно " + bonus + " бонусных рублей. Ваш балланс " + balance + "р.");


    }
}