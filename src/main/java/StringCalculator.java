public class StringCalculator {

    public int add(String numbers)
    {
        if(numbers.equals("")){
            return 0;
        }
        if(numbers.contains(",")) {
            String[] array = numbers.split(",");
            return Integer.parseInt(array[0]) + Integer.parseInt(array[1]);
        }
        return Integer.parseInt(numbers);


    }
}