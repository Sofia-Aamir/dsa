/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package node;
import java.util.*;
public class test {

    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input =new Scanner(System.in);
        linkedlist l=new linkedlist();
       l.insertAtStart(7);
        l.insertAtEnd(3);
        l.insertAtEnd(6);
        l.insertAtEnd(2);
        l.insertAtEnd(1);
       
        l.display();
        
         System.out.println("\n\nSELECT ANY OPTION \n1.Insert at start\n2.insert after\n3.insert at end");
        int ch=input.nextInt();
        int key,node_data;
        switch(ch){
            case 1:
                System.out.println("Enter Value : ");
                key=input.nextInt();
                l.insertAtStart(key);
                break;
            case 2:
                System.out.println("Enter Value : ");
                key=input.nextInt();
                System.out.println("Enter data where You want to Insert after: ");
                node_data=input.nextInt();
                
                l.insertAfter(node_data,key);
                break;
            case 3:
                System.out.println("Enter value");
                 key=input.nextInt();
                l.insertAtEnd(key);
                break;
        }
        l.display();
    }
    
}
