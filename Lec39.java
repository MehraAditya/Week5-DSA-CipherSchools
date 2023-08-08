class MyStack
{
    final int size = 10;
    int arr[] = new int[size];
    int top = -1;

    int peek()
    {
        return arr[top];
    }
    boolean isEmpty()
    {
        return top == -1;
    }
    void push(int data)
    {
        top = top + 1;
        arr[top]=data;
    }
    int pop()
    {
        int temp = arr[top];
        top--;
        return temp;
    }
}
public class ArrayImp{
    public static void main(String[] args)
    {
        MyStack stack = new MyStack();
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        System.out.println(stack.pop());

    }
}
