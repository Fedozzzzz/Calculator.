package calculator;


import calculator.Operations.Context;
import calculator.Operations.IOperation;
import calculator.Operations.OperationsImpl.Factory;
import containers.Stack;

import java.util.Scanner;
public class Engine {
    public static void main(String args[])
    {
        Context c = new Context();
       // Stack st=new Stack(20);
        Scanner sc=new Scanner(System.in);
        assert c!= null;
        while(true)
        {
            String s=String.valueOf(sc.next());
            Factory f=new Factory();
            IOperation o=f.create(s);
            o.run(c);
        }

        /*double a=Double.valueOf(sc.next());
        Push p = new Push(a);
        p.run(st);
        a=Double.valueOf(sc.next());
        p=new Push(a);
        p.run(st);
        Plus s=new Plus();
        s.run(st);
        Print p1=new Print();
        p1.run(st);*/
    }
}
/*
       try(Scanner in = new Scanner(System.in)
       {
            while(true)
            {
                    String line=in.next();
                    IOperation op;
                    if(line.startWith("PRINT"))
                    {
                        op=new Print;
                    }
                    else
                        {
                           if(line.startWith("*"))
                             op = new Multiply;                      }
            }
       }
 */

/*
    E(IFactory factory()}
        facroty.create();
 */