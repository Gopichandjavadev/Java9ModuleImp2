package easytextimp2;

import java.util.List;

import easytextapi.Analyzer;

public class Imp2 implements Analyzer {
    
    public String getName() {
        return "algorithm name";
    }

    public double analyze(List<List<String>> text) {
       System.out.println(text);
       return 0; 
    }

}
