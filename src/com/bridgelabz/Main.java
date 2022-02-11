package com.bridgelabz;

import java.util.LinkedList;
import  java.util.Scanner;

/* UC1- Ability to create a Stack of 56->30->70
        - Use LinkedList to do the Stack Operations
        - Here push will internally call add method on LinkedList.
        - So 70 will be added first then 30 and then 56 to make 56 on top of the Stack */

public class StackAndQueue {
    public static void main(String[] args) {
        System.out.println("Welcome to Stacks and Queues Program using Linked List");
        Scanner sc = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();

        int choice;

        do {
            System.out.println("STACK & QUEUE User Choices");
            System.out.println("1.push in Stack \n2. pop from Stack \n3. Display Stack \n4. Enqueue and Queue \n5. Dequeue in Queue \n6. Display Queue \n7. Exit \nEnter the Choices : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Data to Push in the Stack : ");
                    int dataFirst = sc.nextInt();
                    linkedList.insertFirst(dataFirst);
                    break;
                case 2:
                    break;
                case 3:
                    linkedList.showLinkedList();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
            }
        }
        while(choice != 6);
    }
}
