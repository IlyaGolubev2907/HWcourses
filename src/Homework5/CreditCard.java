package Homework5;

public class CreditCard {

    String cardNumber;
    double balance;

    public CreditCard(String cardNumber, double currentAmount) {
        this.cardNumber = cardNumber;
        this.balance = currentAmount;
    }

    public void deposit(double depositAmount) {
        balance += depositAmount;
        System.out.println("Зачислено: " + depositAmount + " на счет " + cardNumber);
    }

    public void withdrawal(double withdrawalAmount) {
        balance -= withdrawalAmount;
        System.out.println("Снятие: " + withdrawalAmount + " со счета " + cardNumber);
        System.out.println();
    }

    public void currentBalance() {
        System.out.println("Текущий баланс счета: " + cardNumber + " - " + balance);
    }
}
