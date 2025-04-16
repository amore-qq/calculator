package calculator;

public enum Operation {
    ADD("+"), SUBTRACT("-"), MULTIPLY("*"), DIVIDE("/"), POW("^");

    private final String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }
    public String getSymbol() {
        return symbol;
    }
    public static Operation fromSymbol(String opSymbol) {
        switch (opSymbol) {
            case "+": return ADD;
            case "-": return SUBTRACT;
            case "*": return MULTIPLY;
            case "/": return DIVIDE;
            case "^": return POW;
            default: throw new IllegalArgumentException("Неизвестная операция");
        }
    }
}
