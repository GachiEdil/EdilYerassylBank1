package com.company;
/*Case class is class which has setter and getter of money, deposit, credit by which we can have access to this variables*/
public class Case {
    private Double money;
    private Double deposit;
    private Double credit;
    public Case(Double money, Double deposit, Double credit){
        setMoney(money);
        setDeposit(deposit);
        setCredit(credit);
    }
    public Case(){
        setMoney(1000.0);
        setDeposit(1000.0);
        setCredit(1000.0);
    }
    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public Double getCredit() {
        return credit;
    }

    public void setCredit(Double credit) {
        this.credit = credit;
    }
    @Override
    public String toString(){
        return "MONEY: " + getMoney() +"\n"+"DEPOSIT: " + getDeposit() +"\n"+"CREDIT: " + getCredit() ;
    }
}
