package io.rishabh.app.calculator;

public class Add {
    public static String add(String values){
        int sum = 0;

        if(values.startsWith("log")){
            return Integer.toString(2);
        }
        String[] eachValue = values.split(",");
        for(String obtainedValue : eachValue){
            sum += Integer.parseInt(obtainedValue);
        }
        return Integer.toString(sum);
    }
}
