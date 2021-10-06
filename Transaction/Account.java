import java.text.DecimalFormat;
import java.util.ArrayList;

public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList = new ArrayList<Transaction>();

    /**
     * nap tien zo.
     * @param amount this is the money deposit.
     */
    private void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("So tien ban nap vao khong hop le!");
        }
    }

    /**
     * rut tien ra.
     * @param amount thisis the money withdraw
     */
    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
        } else {
            if (amount < balance) {
                balance = balance - amount;
            } else {
                System.out.println("So tien ban rut vuot qua so du!");
            }
        }
    }

    /**
     * them phuong thuc nap rut.
     * @param amount money trade.
     * @param operation phuong thuc.
     */
    public void addTransaction(double amount, String operation) {
        if (operation.equals(Transaction.DEPOSIT)) {
            deposit(amount);
            transitionList.add(new Transaction("Nap tien", amount, balance));
        } else {
            if (operation.equals(Transaction.WITHDRAW)) {
                withdraw(amount);
                transitionList.add(new Transaction("Rut tien", amount, balance));
            } else {
                System.out.println("Yeu cau khong hop le!");
            }
        }
    }

    /**
     * print Transaction.
     */
    public void printTransaction() {
        DecimalFormat format = new DecimalFormat("##.00");
        for (int i = 0; i < transitionList.size(); i++) {
            String line = "";
            line += "Giao dich ";
            line += String.valueOf(i + 1);
            line += ": ";
            line += transitionList.get(i).getOperation();
            line += " $";
            line += format.format(transitionList.get(i).getAmount());
            line += ". So du luc nay: $";
            line += format.format(transitionList.get(i).getBalance());
            line += ".";
            System.out.println(line);
        }
    }
}
