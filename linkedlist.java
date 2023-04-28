
public class linkedlist {
     node head;
    node tail;
    node temp;
    
     linkedlist(){
        head=null;
        tail=null;
        temp=null;
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
          // tail=newnode;
          // temp=newnode;
          head.next=head;
          head.previous=head;
        }
        
        else{
            temp=tail.next;
            newnode.next=temp;
            newnode.previous=tail;
            temp.previous=newnode;
            tail.next=newnode;
        }
       }
}
