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
public class Main {
  

  public static void main(String[] args) {
    Stack sc=new Stack(06);
    sc.push(2);
    sc.push(3);
    // System.out.println(sc.peek());
    sc.push(5);
    sc.push(6);
    sc.push(7);
    sc.push(9);
    sc.display();

    System.out.println();
    System.out.println(sc.peek());


    
  }
}
