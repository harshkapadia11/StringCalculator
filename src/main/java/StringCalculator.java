public class StringCalculator {

    public int add(String numbers)
    {
        if(numbers.equals("")){
            return 0;
        }
        if(numbers.contains(",")) {
            int result=0;
            String[] array=numbers.split("[,\n;]");
            for(String num:array) {
                result+=Integer.parseInt(num);
            }
            return result;
        }
        return Integer.parseInt(numbers);
    }
}