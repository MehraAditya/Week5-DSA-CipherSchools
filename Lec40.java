class Solution
{
    static boolean ispar(String x)
    {
        int len = x.length();
        if(len%2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        
        for(int i=0;i<len;i++)
        {
            if(arr[i]=='{' || arr[i]=='{' || arr[i]=='{')
            {
                stack.push(arr[i]);
            }
            else
            {
                if(stack.isEmpty()) return false;
                if(isPair(stack.peek(), arr[i]))
                {
                    stack.pop();
                }
                else
                {
                    return false;
                }
            }
        }
    }
}
