package calculator.Operations.OperationsImpl;

import calculator.Operations.Context;
import calculator.Operations.IOperation;
import containers.IStack;
import containers.Stack;

public class Pop implements IOperation {
    public void run(Context context){
        IStack<Double> stack = context.stack();
        stack.get();
    }
}
