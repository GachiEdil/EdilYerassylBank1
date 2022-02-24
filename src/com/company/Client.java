package com.company;
/*Client class is working like database and we made getter and setter for surname, name, contact number, password,
cases for using this variables in any class, also for comfortable and effective way to sout our values*/
public class Client {
    private String surname;
    private String name;
    private String number;
    private String password;
    private Case cases;
    public Client(String  surname, String name, String number, String password, Case cases){
        setSurname(surname);
        setName(name);
        setNumber(number);
        setPassword(password);
        setCase(cases);
    }
    public Client(String  surname, String name, String number, String password) {
        setSurname(surname);
        setName(name);
        setNumber(number);
        setPassword(password);
        Case cases = new Case();
        setCase(cases);
    }
    public Client(){
        setSurname("b");
        setName("b");
        setNumber("1111111");
        setPassword("ghghghghghg");
        Case cases = new Case();
        setCase(cases);
    }

    public Case getCase() {
        return cases;
    }

    public void setCase(Case cases) {
        this.cases = cases;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString(){
        return "SURNAME: " + getSurname() +"\n"+"NAME: "
                + getName() +"\n"+"NUMBER: " + getNumber() +"\n" + "PASSWORD: " + getPassword();
    }
}
