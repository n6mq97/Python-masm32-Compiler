package ast;

public class UnaryExpression implements Expression {
    private final Expression expr;
    private final char operation;

    public UnaryExpression(char operation, Expression expr) {
        this.operation = operation;
        this.expr = expr;
    }

    public char getOperation() {
        return operation;
    }

    public Expression getExpr() {
        return expr;
    }
}
