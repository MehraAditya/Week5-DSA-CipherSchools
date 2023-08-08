class CircularQueue
{
    final int size = 10;
    int arr[] = new int[size];
    int front = -1;
    int rear = -1;
    boolean isEmpty()
    {
        return (front == -1 && rear == -1);
    }
    int peek()
    {
        if(this.isEmpty())
        {
            System.out.printlon("Entry Queue!! Nothing at front");
            return -1;
        }
        return arr[front];
    }
    void enqueue(int data)
    {
        if(this.isEmpty())
        {
            front++;
        }
        if(rear == size - 1)
        {
            System.out.println("Queue is Full!! Cannot Enqueue.");
        }
    }
}
