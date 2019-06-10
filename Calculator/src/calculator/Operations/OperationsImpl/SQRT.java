package calculator.Operations.OperationsImpl;

import calculator.Operations.Context;
import calculator.Operations.IOperation;
import containers.IStack;
import containers.Stack;

import static java.lang.Math.sqrt;

public class SQRT implements IOperation {
    public void run(Context context)
    {
        IStack<Double> stack = context.stack();
        Double n=stack.get();
        assert n>=0;
        stack.put(sqrt(n));
    }
}
