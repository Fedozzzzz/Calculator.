package calculator.Operations.OperationsImpl;

import calculator.Operations.OperationsImpl.ExpressionOperations.Transform;
import calculator.Operations.OperationsImpl.ExpressionOperations.isBracketCorrect;
import calculator.Operations.Context;
import calculator.Operations.IOperation;

import java.util.IllegalFormatException;
import java.util.Map;

public class EXP implements IOperation{
    String str_="";
    EXP(String a) {
        isBracketCorrect br=new isBracketCorrect(a);
        try {
            if (br.check()) {
                Transform t=new Transform(a);
                str_ = t.s();
            } else {
                 throw new IllegalStateException("Wrong String!");
            }
        }
        catch(IllegalStateException e)
        {
            throw new IllegalStateException();
        }
    }
    @Override
    public void run(Context context) {
        for(int i=0;i<str_.length();i++)
        {
            IOperation op;
            if(str_.charAt(i)=='+')
            {
                op= new Plus();
            }
            else
            {
                if(str_.charAt(i)=='-')
                {
                    op= new Minus();
                }
                else
                {
                    if(str_.charAt(i)=='*')
                    {
                        op= new Multiply();
                    }
                    else
                    {
                        if(str_.charAt(i)=='/')
                        {
                            op= new Divide();
                        }
                        else
                        {
                            op = new Push(String.valueOf(str_.charAt(i)));
                        }
                    }
                }
            }
            op.run(context);
        }
    }
}
