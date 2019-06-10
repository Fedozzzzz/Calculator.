package calculator.Operations.OperationsImpl;

import calculator.Operations.Context;
import calculator.Operations.IOperation;

import java.util.Map;

public class Define implements IOperation {
    String s;
    Double d;
    Define(String str, Double dbl)
    {
        s=str;
        d=dbl;
    }
    @Override
    public void run(Context context) {
        Map<String, Double> m = context.poolVariables();
        m.put(s,d);
    }
}
