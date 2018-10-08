public class AccountClass {

}

class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 7.0 / 100.0;
    private float dateCreated;

    public Account() {

    }

    public Account(int id, double balance) {
        // Code below here
        this.id = id;
        this.balance = balance;
    }

    public Account(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Account(float dateCreated) {
        this.dateCreated = dateCreated;
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public float getDateCreated() {
        return this.dateCreated;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setDateCreated(float dateCreated) {
        this.dateCreated = dateCreated;
    }

    public double getMonthlyInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
        double monthlyInterestRate = annualInterestRate / 12;
        return monthlyInterestRate;
    }

    public double getMonthlyInterestRate() {
        return this.annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return this.balance * this.getMonthlyInterestRate();
    }
}
