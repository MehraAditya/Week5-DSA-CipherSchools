class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();

    Queue<Integer> q2 = new LinkedList<Integer>();


    void push(int a)
    {
        q2.add(a);
        while(q1.isEmpty()) q2.add(q1.poll());
    }


    int pop()
    {
        if(q1.isEmpty()) return -1;
        return q1.poll();
    }
}
