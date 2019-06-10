package containers;


import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Stack<T> implements IStack <T>, Iterable<T> {
    private T[] storage;
    private int top=-1;

    public Stack()
    {
        storage=(T[])new Object[10];
    }
    public Stack(int number)
    {
        storage=(T[])new Object[number];
    }

    @Override
    public  T get()
    {
        if(this.isEmpty())
            throw new IllegalStateException("Stack is empty");
        Logger logger=java.util.logging.Logger.getLogger("logger");
        logger.log(Level.INFO, "test");
        top--;
        return storage[top+1];
    }
    @Override
    public  void put(T value)
    {
        if(isEmpty())
        {
            expand();
        }
        top++;
        storage[top]=value;
    }

    public T see()
    {
        if(this.isEmpty())
            throw new IllegalStateException("Stack is empty");
        return storage[top];
    }

    @Override
    public void expand() {
        T[] newStorage = (T[])new Object[storage.length*2];
        for(int i=0;i<storage.length;i++)
        {
            newStorage[i]=storage[i];
        }
        storage=newStorage;
    }

    @Override
    public  boolean isEmpty()
    {
        return (top==-1);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(1000);
        builder.append("stack size =");
        builder.append((top+1));
        builder.append(" , max size = ");
        builder.append(storage.length);
        builder.append("\n");
        return builder.toString();
        // return "stack size =" + (top+1) + " , max size = " + storage.length+ "\n";
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>()
        {

            @Override
            public boolean hasNext() {
                return top != -1;
            }

            @Override
            public T next() {
                top--;
                return storage[top+1];
            }
        };
    }


}
