
package node;
import java.util.*;
public class linkedlist {
    node head;
    node tail;
  //  node current=null;
    
    linkedlist(){
        head=null;
        tail=null;
    }
    
     public void display() {
        node p = head;
        while (p != null) {
            System.out.print(" " + p.data);
            p = p.next;
        }
    }
     
    public void insertAtStart(int data){
        node newnode=new node(data);
        
        if(head==null){
            head=newnode;
        }
        else{
            newnode.next=head;
            head.previous=newnode;
            head=newnode;
        }
        
    }
    
    
    
    public void insertAtEnd(int data){
       // node current;
        node newnode=new node(data);
        
        if(head==null){
            head=newnode;
        }
        
        else{
        node current=head;
            while(current.next != null) {
                current = current.next;
            }
           newnode.previous=tail;
           tail.next=newnode;
           tail=newnode;
        }
    }
   
    public void insertAfter(int data,int key){
        node newnode=new node(data);
        if(head==null)
            head=newnode;
       else
        {
            node current=head;
            while(current.next!=null && current.data!=key)
            {
                current=current.next;
            }
            
            if(current==null)
                return;
            
            newnode.next=current.next;
            newnode.previous=current;
            current.next=newnode;
            
            if(newnode.next!=null){
                newnode.next.previous=newnode;
            }
        }
            }
        }
    
    

