package week1Stack;

 class Stack {


  int top;
  int a[];
  public Stack(int capacity){
    a=new int[capacity];
    top=-1;
    
  }
  public void push(int value){
    if(top==a.length-1){
      System.out.println("Stack is full can't add the value");
      return ;
    }
    top=top+1;
    a[top]=value;

  }
  public void pop(){
    if(top==-1){
      System.out.println("stack is empty cant proceed with the pop function");
      return ;

    }
    top=top-1;
  }
  public int peek(){
    return top;
  }
  public boolean isEmpty(){
    if(top==-1){
      return true;

    }
    return false;
  }
  public boolean isFull(){
    if(top==a.length-1){
      return true;
    }
    return false;

  }
  public void display(){
    
    for(int i=top;i>-1;i--){
      System.out.print(a[i]+" ");
    }
  }

  
}

class Node {
  int data;
  Node next;
  Node(int data){
    this.data=data;
    this.next=null;
  }
}
class StackLinkedList{
  Node head;
  StackLinkedList(){this.head=null;}
  boolean isEmpty(){
    return head==null;
  }
  void push(int data){
    Node newNode=new Node(data);
    if(newNode==null){
      System.out.println("stack overflow");
      return;
    }
    newNode.next=head;
    head=newNode;
  }
  void pop(){
    if(head==null){
      System.out.println("stack underflow");
      return;
    }
    head=head.next;
  }
  void peek(){
    if(isEmpty()){
      System.out.println("No Elements in the stack");
      return;
    }
    System.out.println(head.data);
  }
  void display(){
     if(isEmpty()){
      System.out.println("No Elements in the stack");
      return;
    }
    Node temp=head;
    while(temp!=null){
      System.out.print(temp.data+" ");
      temp=temp.next;
    }
    System.out.println();
  }
}





public class Main {
  

  public static void main(String[] args) {
    // Stack sc=new Stack(06);
    // sc.push(2);
    // sc.push(3);
    // // System.out.println(sc.peek());
    // sc.push(5);
    // sc.push(6);
    // sc.push(7);
    // sc.push(9);
    // sc.display();
    // System.out.println();
    // System.out.println(sc.peek());
    // sc.pop();
    // sc.display();
    // System.out.println(sc.isEmpty());
    // System.out.println(sc.isFull());
    // sc.push(10);
    // sc.display();
    // System.out.println(sc.isFull());


    StackLinkedList sc= new StackLinkedList();
    sc.push(23);
    sc.push(34);
    sc.push(55);
    sc.push(88);
    sc.push(78);
    sc.push(90);
    sc.display();
    sc.peek();
    sc.pop();
    sc.display();
    System.out.println(sc.isEmpty());   
  }
}
