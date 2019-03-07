package Question.question7;

import java.util.Stack;

public class StackDemo {
    Stack<Integer> stack;
    int minimumElement;
    public StackDemo(){
        stack=new Stack<Integer>();
    }

    void push(int value){
        if(stack.isEmpty()){
            minimumElement=value;
            stack.push(value);
            System.out.println("Value Inserted : "+value);
            return;
        }
        if(value<minimumElement){
            stack.push(2*value - minimumElement);
            minimumElement=value;
        }else{
            stack.push(value);

        }
        System.out.println("value inserted is : "+value);
    }

    void pop(){
        if(stack.isEmpty()){
            System.out.println("stack is empty");
            return;
        }
        System.out.println("\nTop Element popped : ");
        int removedvalue=stack.pop();
        if(removedvalue < minimumElement){
            System.out.println(minimumElement);
            minimumElement=2*minimumElement-removedvalue;
        }else{
            System.out.println(removedvalue);
        }
    }
    void peek(){
        if(stack.isEmpty()){
            System.out.println("stack is empty");
            return;
        }
        int topelement=stack.peek();
        System.out.println("Top Element is :");
        if(topelement<minimumElement){
            System.out.println(minimumElement);
        }else
            System.out.println(topelement);
    }

    void getMin(){
        if(stack.isEmpty()){
            System.out.println("stack is empty");
        }else{
            System.out.println(minimumElement);
        }
    }
}

class Main{
    public static void main(String[] args) {
        StackDemo stackDemo = new StackDemo();
        stackDemo.push(34);
        stackDemo.push(323);
        stackDemo.push(141);
        stackDemo.push(54);
        stackDemo.push(4);
        System.out.println("\nFetching minimum Element");
        stackDemo.getMin();
        stackDemo.pop();
        stackDemo.pop();
        System.out.println("\nFetching minimum Element");
        stackDemo.getMin();
    }
}
