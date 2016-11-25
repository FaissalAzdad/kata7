package moneycalculator.model;

public class Currency {
    private final String code;
    private final String name;
    private final String Symbol;

    public Currency(String code, String name, String Symbol) {
        this.code = code;
        this.name = name;
        this.Symbol = Symbol;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return Symbol;
    }

    @Override
    public String toString() {
        return code;
    }
    
    
}
