package calculator.Operations.OperationsImpl;

import calculator.Operations.Context;
import calculator.Operations.IOperation;
import containers.IStack;
import containers.Stack;

public class Print implements IOperation {
    @Override
    public void run(Context context) {
        IStack<Double> stack = context.stack();
            Double n=stack.get();
            stack.put(n);
            System.out.print(n);
    }
}
