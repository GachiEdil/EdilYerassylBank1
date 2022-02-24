package com.company;
/*Controller is boolean class which responsible for checking clients input information like password,
 name, surname and contact number*/
    public class Controller {
        public boolean controller(Client client, Client[] clients){
            for (Client value : clients) {
                if (client.getName().equals(value.getName()) &&
                        client.getSurname().equals(value.getSurname()) &&
                        client.getNumber().equals(value.getNumber()) &&
                        client.getPassword().equals(value.getPassword())
                ) {
                    return true;
                }
            }
            return false;
        }
    }


