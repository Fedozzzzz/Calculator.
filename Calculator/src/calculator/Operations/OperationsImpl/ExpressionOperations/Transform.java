package calculator.Operations.OperationsImpl.ExpressionOperations;

import containers.Stack;

import java.util.HashMap;
import java.util.Map;

public class Transform {
    String str_="";
    int priority(Character c)
    {
        if((c=='*')||(c=='/'))
        {
            return 2;
        }
        if((c=='+')||(c=='-'))
        {
            return 1;
        }
        return 0;
    }
    public Transform(String a)
    {
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<a.length();i++)
        {
            char c=a.charAt(i);
            if(c=='(')
            {
                st.put(c);
            }
            else
            {
                if(c==')')
                {
                    char temp = st.get();
                    while(temp!='(')
                    {
                        str_=str_+temp;
                        temp=st.get();
                    }
                }
                else
                {
                    if((c=='+')||(c=='-')||(c=='*')||(c=='/'))
                    {
                        char temp;
                        while((!st.isEmpty())&&(st.see()!='(')&&(priority(st.see())>=priority(c)))
                        {
                            temp=st.get();
                            str_=str_ + temp;
                        }
                        st.put(c);
                    }
                    else
                    {
                        str_=str_+c;
                    }
                }
            }
        }
        while(!st.isEmpty())
        {
            str_=str_+st.get();
        }
    }
    public String s()
    {
        return str_;
    }
}
