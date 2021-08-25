package EXERCISES;

import com.sun.source.tree.Tree;

import java.util.Scanner;
import java.util.TreeMap;

public class Phonebook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String addCont = sc.nextLine();
        TreeMap<String,String> contacts = new TreeMap<>();

        while (!addCont.equals("search")){
            String[] contact = addCont.split("-");
            String name = contact[0];
            String number = contact[1];
            contacts.put(name, number);
            addCont = sc.nextLine();
        }

        String searchCont = sc.nextLine();
        while (!searchCont.equals("Stop")){
            if(contacts.containsKey(searchCont)){
                System.out.println(searchCont +" -> "+ contacts.get(searchCont));
            } else {
                System.out.println("Contact " + searchCont + " does not exist.");
            }
            searchCont = sc.nextLine();
        }

    }
}
