package calculator.Operations.OperationsImpl;

import calculator.Operations.Context;
import calculator.Operations.IOperation;
import containers.IStack;
import containers.Stack;

public class Minus  implements IOperation {
    @Override
    public void run(Context context) {
        IStack<Double> stack = context.stack();
        Double n1=stack.get();
        Double n2=stack.get();
        stack.put(n2-n1);
    }
}
