package com.company;
//Fund is class to make setter and getter for clients
public class Fund {
    private Client[] clients;
    public Fund(Client[] clients){
        setClients(clients);
    }
    public Fund(){
    }
    public void setClients(Client[] clients){
        this.clients = clients;
    }
    public Client[] getClients(){
        return clients;
    }
}
