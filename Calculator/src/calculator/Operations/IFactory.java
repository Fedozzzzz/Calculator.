package calculator.Operations;

public interface IFactory {
    IOperation create(String operationDef);
}
