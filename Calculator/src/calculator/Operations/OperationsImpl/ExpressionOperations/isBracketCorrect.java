package calculator.Operations.OperationsImpl.ExpressionOperations;

import containers.Stack;

public class isBracketCorrect {
    String str_;
    public isBracketCorrect(String a)
    {
        str_=a;
    }
    public boolean check()
    {
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<str_.length();i++)
        {
            if(str_.charAt(i)=='(')
            {
                st.put('(');
            }
            if(str_.charAt(i)==')')
            {
                if(st.isEmpty())
                {
                    return false;
                }
                if(st.get()!='(')
                {
                    return false;
                }
            }
        }
        if(!st.isEmpty())
        {
            return false;
        }
        return true;
    }
}
