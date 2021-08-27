public class StringCalculator {

    public int add(String numbers)
    {
        if(numbers.equals("")){
            return 0;
        }
        if(numbers.length()>0) {
            int result=0;
            String var;
            if (numbers.startsWith("//"))
            {
                var=numbers.substring(4);

            }
            else
            {
                var=numbers;
            }
            String[] array=var.split("[,\n;#*%]");
            for(String num:array) {
                result+=Integer.parseInt(num);
            }
            return result;
        }
        return Integer.parseInt(numbers);
    }
}