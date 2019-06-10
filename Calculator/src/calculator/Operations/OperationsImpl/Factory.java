package calculator.Operations.OperationsImpl;

import calculator.Operations.IFactory;
import calculator.Operations.IOperation;
import java.util.Scanner;

public class Factory implements IFactory {
    @Override
    public IOperation create(String operationDef) {
        IOperation op;
        if (operationDef.startsWith("PRINT")) {
            op = new Print();
        } else {
            if (operationDef.startsWith("*"))
                op = new Multiply();
            else {
                if (operationDef.startsWith("+"))
                    op = new Plus();
                else {
                    if (operationDef.startsWith("/"))
                        op = new Divide();
                    else {
                        if (operationDef.startsWith("-"))
                            op = new Minus();
                        else {
                            if (operationDef.startsWith("SQRT"))
                                op = new SQRT();
                            else {
                                if(operationDef.startsWith("POP"))
                                    op=new Pop();
                                else
                                {
                                    if(operationDef.startsWith("PUSH")) {
                                        Scanner sc = new Scanner(System.in);
                                        String a = String.valueOf(sc.next());
                                        op = new Push(a);
                                    }
                                    else
                                    {
                                        if(operationDef.startsWith("EXP"))
                                        {
                                            Scanner sc=new Scanner(System.in);
                                            String a=String.valueOf(sc.next());
                                            op = new EXP(a);
                                        }
                                        else {
                                            Scanner sc = new Scanner(System.in);
                                            String a = String.valueOf(sc.next());
                                            Double d = Double.valueOf(sc.next());
                                            op = new Define(a, d);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

            }
        }
        return op;
    }
}
