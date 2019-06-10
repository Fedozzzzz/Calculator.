package calculator.Operations.OperationsImpl;

import calculator.Operations.Context;
import calculator.Operations.IOperation;
import containers.IStack;
import containers.Stack;

import java.util.Map;

public class Push implements IOperation {
    String n;
    Push(String num)
    {
        n=num;
    }

    public void run(Context context)
    {
        IStack<Double> stack=context.stack();
        Map<String, Double> m = context.poolVariables();
        if(m.containsKey(n) ) {
            stack.put(m.get(n));
        }
        else
        {
            try {
                stack.put(Double.valueOf(n));
            }
            catch(NumberFormatException e)
            {
                throw new IllegalArgumentException("No definition", e);
            }
        }


    }
}
