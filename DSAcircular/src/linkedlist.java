
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
        while (p != head.previous) {
            System.out.print(" " + p.data);
            p = p.next;
        }System.out.print(" " + p.data);
    }
       
      
       public void insertAtStart(int data){
            node newnode=new node(data);
        
        if(head==null){
           head=newnode;
          // tail=newnode;
          // temp=newnode;
          head.next=newnode;
          head.previous=newnode;
        }
        
        else{
//            temp=head.next;
//            newnode.next=temp;
//            newnode.previous=tail;
//            temp.previous=newnode;
//            tail.next=newnode;

              newnode.previous=head.previous;
              newnode.next=head;
              head.previous=newnode;
              head=newnode;
        }
       }
}
