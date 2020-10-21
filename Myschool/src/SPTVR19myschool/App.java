/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SPTVR19myschool;

import tools.manager.PersonManager;
import entity.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
class App {
    private Scanner scanner = new Scanner(System.in);
    private List<Person> listPersons = new ArrayList<>();
    void run() {
        
        System.out.println("---- m y  s c h o o l----");
        boolean repeat = false;
    do {
        
        System.out.println("\033[0;31mmake a choise");
        System.out.println("\033[0;32m 0 - quit app");
        System.out.println("\033[0;32m 1 - add student");
        System.out.println("\033[0;32m 2 - show student");
        System.out.println("\033[0;32m 3 - add teacher");
        System.out.println("\033[0;32m 4 - show teacher");
        System.out.println("\033[0;32m 5 - add subjects");
        System.out.println("\033[0;32m 6 - subjects list");
        System.out.println("\033[0;32m 7 - add marks");
        System.out.println("\033[0;32m 8 - students marks");
        System.out.println("\033[0;32m 9 - subjects marks");
        System.out.println("\033[0;32m 10 - change marks");
        System.out.println("\033[0;34mchoose number ...");
        String task = scanner.nextLine();
        switch (task) {
            case "0":
                System.out.println("выход из программы");
                repeat = false;
                break;
            case "1":
                PersonManager personManager = new PersonManager(); 
//                Person student = new Person("ilja","astasev","123456","admin");
                Person student = personManager.createPerson();
                personManager.addPersonToList(student, listPersons);
                break;
            case "2":
                System.out.println("Все студенты");
                break;   
            case "3":
                break;
            case "4":
                break;    
            case "5":
                break;    
                
                
            default: 
                System.out.println("wrong task");
               continue;
        } 
        
    }while(repeat);
    }
}
