public class StringCalculator {
    int add(String number){
        if(number.equals("")){
            return 0;
        }
        if(number.contains(",")){
            String[] array = number.split(",");
            int no1 = Integer.parseInt(array[0]);
            int no2 = Integer.parseInt(array[1]);
            return no1+no2;
        }
        return Integer.parseInt(number);

    }
}
