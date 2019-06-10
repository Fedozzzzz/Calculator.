package calculator.Operations;
import containers.IStack;
import containers.Stack;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private final IStack<Double> stack = new Stack<>();
    private final Map<String, Double> variables = new HashMap<>();
    public IStack<Double> stack(){
        return stack;
    }
    public Map<String, Double> poolVariables(){
        return variables;
    }
}
