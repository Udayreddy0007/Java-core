
// int age = 15;
// int result = age / 0;
// System.out.println(result);

// if (age < 18) {

// throw new IllegalArgumentException("Age should be more than 18 then only
// he/she can eligible to vote");
// }
// System.out.println("eligible");

// Bank realted what happen if we dont throw an exception

// int balance = 2000;
// int withdraw = 2500;
// if (withdraw > balance) {
// throw new RuntimeException("Insufficient balance");
// }

// System.out.println("transcation completed");
// }

// static void withdraw(int balance, int amount)

// throws Exception {

// if (amount > balance) {
// throw new Exception("insufficient balance");
// }
// System.out.println("withdrawal successfull");

// }

// public static void main(String[] args) throws Exception {

// withdraw(2000, 2500);

// }

// class bank
// checkBalance(int)
// object
// object.checkBalance();

// Custom exception

// class InsufficientBalanceException extends Exception {

// InsufficientBalanceException(String msg) {
// super(msg);
// }

// }

// public class ThrowandThrows {

// static void withdraw(int balance, int amount) throws
// InsufficientBalanceException {

// if (amount > balance) {
// throw new InsufficientBalanceException("insufficient balance");
// }

// }

// public static void main(String[] args) throws InsufficientBalanceException {
// withdraw(2000, 2500);

// }
// }

// Catched exception

// class InsufficientBalanceException extends Exception {

// InsufficientBalanceException(String msg) {
// super(msg);
// }
// }

// public class ThrowandThrows {

// public static void main(String[] args) {

// int amount = 2000;
// int balance = 1500;

// try {
// if (amount > balance) {

// throw new InsufficientBalanceException("insufficient exception");

// }
// System.out.println("Transaction completed");

// } catch (InsufficientBalanceException e) {
// System.out.println(e.getMessage());

// }

// }

// }

/// unchecked 

// doesn't need to be caught or declared

class InvalidAmountException extends RuntimeException {

    InvalidAmountException(String msg) {
        super(msg);
    }

}

public class ThrowandThrows {

    public static void main(String[] args) {

        int amount = -100;

        if (amount < 0) {
            throw new InvalidAmountException("Amount cannot be negative");
        }

        System.out.println("Valid withdrawl amount");
    }

}