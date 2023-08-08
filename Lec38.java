APPROACH 1

void removeLoop(Node listNode, Node loopNode)
{
    Node temp = loopNode;
    while()
    {
        while(loopNode.next!=listnode.next && loopNode!=temp)
        {
            loopNode=loopNode.next;
        }
        if(listNode.next==loopNode.next)
        {
            loopNode.next = null;
            return;
        }
        listNode=listNode.next;
    }
}

APPROACH 2

void removeLoop(Node listNode)
{
    Node temp = loopNode;
    int count = 0;
    while()
    {
        while(loopNode!=temp)
        {
            loopNode=loopNode.next;
            count++;
        }
        Node slow = head;
        Node fast = head;
        for(int i=0;i<size;i++)
        {
            fast = fast.next;
        }
        while(slow.next!=fast.next)
        {
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
    }
}

APPROACH 3

void detectAndRemoveLoop(Node head)
{
    if(head == null) return;
    Node slow = head;
    Node fast = head;
    while(fast!=null && fast.next!=null)
    {
        slow = slow.next;
        fast = fast.next.next;
        if(slow==fast)
        {
            break;
        }
    }
    if(slow == fast)
    {
        slow = head;
        while(slow.next!=fast.next)
        {
            slow=slow.next;
            fast=fast.next;
        }
        fast.next=null;
    }
}
