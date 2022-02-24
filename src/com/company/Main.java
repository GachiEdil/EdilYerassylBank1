package com.company;
/*Main is the class where all process happens,
        First of all, it asks for name, surname, contact number and password of client,
        if all information is correct client will have the access, else it will sout: Access denied*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Zauyshov", "Edil", "87761438890", "87654321"); //1000 Tenge!
        Client client2 = new Client("Stepanenko", "Messi", "87770141548", "67867867");
        Client client3 = new Client("Sardarbekov", "Yerassyl", "87775554493", "98798798");
        Client[] clients = new Client[3];
        clients[0] = client1;
        clients[1] = client2;
        clients[2] = client3;
        Fund bank1 = new Fund(clients);
        Controller controller1 = new Controller();
        Scanner input = new Scanner(System.in);
        boolean a = false;
        Client clientcheck = new Client();
        while(!a) {
            System.out.println("Please, enter your name");
            String name = input.next();
            System.out.println("Please, enter your surname");
            String surname = input.next();
            System.out.println("Please, enter your contact number");
            String number = input.next();
            System.out.println("Please, enter your password");
            String password = input.next();
            clientcheck.setSurname(surname);
            clientcheck.setName(name);
            clientcheck.setNumber(number);
            clientcheck.setPassword(password);
            if(controller1.controller(clientcheck, bank1.getClients())){
                a = true;
                System.out.println("You have access to your account!");
            }else{
                System.out.println("Access denied!");
                break;
            }
        }
        /*Now client will have 3 choices: to see personal information(cash, credit, deposit),
        to output cash(also there some exception like insufficient fund), to input cash*/
        System.out.println("Please, respected person, enter the letter between a,b and c, which one you prefer to work with!");
        System.out.println("a - Personal cash, b - Deposit, c - Credit");
        String number1 = input.next();
        System.out.println("Please, respected person, enter the letter between a,b and c, which one you prefer to do!");
        System.out.println("a - Show the amount of cash, b - Output money, b - Input money");
        String number2 = input.next();
        if(number2.equals("a")){
            if(number1.equals("a")){
                System.out.println("You have: " + clientcheck.getCase().getMoney());
            }
            if(number1.equals("b")){
                System.out.println("Your deposit: " + clientcheck.getCase().getDeposit());
            }
            if(number1.equals("c")){
                System.out.println("Your credit: " + clientcheck.getCase().getCredit());
            }
        }
        if(number2.equals("b")){
            System.out.println("How many?");
            Double cost = input.nextDouble();
            if(number1.equals("a")){
                if(cost > clientcheck.getCase().getMoney()){
                    System.out.println("Insufficient fund!");
                }else{
                    clientcheck.getCase().setMoney(clientcheck.getCase().getMoney()-cost);
                    System.out.println("You have: " + clientcheck.getCase().getMoney());
                }
            }
            if(number1.equals("b")){
                if(cost > clientcheck.getCase().getDeposit()){
                    System.out.println("Insufficient fund!");
                }else{
                    clientcheck.getCase().setDeposit(clientcheck.getCase().getDeposit()-cost);
                    System.out.println("You have: " + clientcheck.getCase().getDeposit());
                }
            }
            if(number1.equals("c")){
                clientcheck.getCase().setCredit(clientcheck.getCase().getCredit()+cost);
                System.out.println("You have: " + clientcheck.getCase().getCredit());
            }
        }
        if(number2.equals("c")){
            System.out.println("How many?");
            Double cost = input.nextDouble();
            if(number1.equals("a")){
                clientcheck.getCase().setMoney(clientcheck.getCase().getMoney()+cost);
                System.out.println("You have: " + clientcheck.getCase().getMoney());
            }
            if(number1.equals("b")){
                clientcheck.getCase().setDeposit(clientcheck.getCase().getDeposit()+cost);
                System.out.println("You have: " + clientcheck.getCase().getDeposit());
            }
            if(number1.equals("c")){
                clientcheck.getCase().setCredit(clientcheck.getCase().getCredit()-cost);
                System.out.println("You have: " + clientcheck.getCase().getCredit());
            }
        }
    }
}
