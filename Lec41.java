public class InfixProfix
{
    public static void main(String[] args)
    {
        String infix = "3+4*5";
        String infix2 = "3*4+5";
        System.out.println(infixToPost(infix));
        System.out.println(infixToPost(infix2));
    }
    static String infixToPostfix(String infix)
    {
        String res = "";
        Stack<Character> stack = new Stack();
        for(int i=0;i<infix.length();i++)
        {
            char c = infix.charAt(i);
            if(Character.isDigit(c))
            {
                res = res+c;
            }
            else
            {
                stack.push();
            }
        }
    }
}
