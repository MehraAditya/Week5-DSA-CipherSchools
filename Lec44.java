class StackQueue
{
    Queue<Integer> s1 = new LinkedList<Integer>();

    Queue<Integer> s2 = new LinkedList<Integer>();


    void push(int x)
    {
        s1.push(x);
        
    }


    int pop()
    {
        if(s1.isEmpty() && s2.isEmpty()) 
        {
            return -1;
        }
        if(s2.isEmpty())
        {
            while(!s1.isEmpty())
            {
                s2.oush(s1.pop());
            }
        }

        return s2.pop();
    }
}
