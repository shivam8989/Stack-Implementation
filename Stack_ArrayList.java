package Stack;

import java.util.ArrayList;

public class Stack_ArrayList {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        //Check Stack is Empty or not
        public static boolean  isEmpty(){
            return list.size()==0;
        }
        //Insert operation
        public static void Push(int data){
            list.add(data);

        }
        // Delete Operation
        public static int Pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        // Print Top elemen t of the Stack
        public static int Peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);

        }
    }
    public static void main(String args[]){
        Stack stack = new Stack();
        stack.Push(1);
        stack.Push(2);
        stack.Push(3);
        while(!stack.isEmpty()){
            System.out.println(stack.Peek());
            stack.Pop();
        }


    }
}
