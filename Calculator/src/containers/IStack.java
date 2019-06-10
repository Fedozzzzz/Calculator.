package containers;


public interface IStack <T>{
    T get();
    void put (T value);
    void expand();
    boolean isEmpty();
    default void test(){

    };
    static void test2() {

    }
}

