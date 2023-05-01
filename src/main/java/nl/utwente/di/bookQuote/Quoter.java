package nl.utwente.di.bookQuote;

import java.util.HashMap;

public class Quoter {
    private HashMap<String, Double> values = new HashMap<>();

    public Quoter(){
        values.put("1", 10.0);
        values.put("2", 45.0);
        values.put("3", 20.0);
        values.put("4", 35.0);
        values.put("5", 50.0);

    }
    public double getBookPrice(String isbn){
        if(values.containsKey(isbn)){
            return values.get(isbn);
        }
        return 0.0;
    }
    public double getFfromC(String celcius){
        double c = Integer.parseInt(celcius);
        return (c *(9.0/5.0)) + 32.0;
    }
}
