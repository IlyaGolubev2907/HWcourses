package Homework5;

public class Cards {
    public static void main(String[] args) {
        CreditCard card = new CreditCard("1234", 100);
        CreditCard card2 = new CreditCard("5678", 100);
        CreditCard card3 = new CreditCard("9990", 100);
        card.deposit(400);
        card2.deposit(900);
        card3.withdrawal(50);
        card.currentBalance();
        card2.currentBalance();
        card3.currentBalance();
    }
}
