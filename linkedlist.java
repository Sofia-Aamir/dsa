
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
           head.next=head;
          head.previous=head;
        
        }
        
        else{
             newnode.previous=head.previous;
              newnode.next=head;
              head.previous=newnode;
              head=newnode;
        }
       }
       
       public void insertAtEnd(int data){
           node newnode=new node (data);
           
           if(head==null){
               head=newnode;
                head.next=head;
          head.previous=head;
           }
           
           else{
             head.previous=newnode;
             newnode.next=head;
             newnode.previous=tail;
             tail=newnode;
             tail.next=newnode;
           }
     }
       
       
}
