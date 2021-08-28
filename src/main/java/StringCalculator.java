public class StringCalculator {

    public int add(String numbers)
    {
        if(numbers.equals("")){
            return 0;
        }

        if (numbers.length() > 0) {
            int result = 0;
            String var;
            if (numbers.startsWith("//")) {
                var = numbers.substring(4);

            } else {
                var = numbers;
            }
            String[] array = var.split("[,\n;#*%]");

            for (String num : array) {
                int no = Integer.parseInt(num.trim());
                try {
                    if(no<0)
                    {
                        throw new MyException(array);
                    }
                }
                catch(MyException m) {
                    return 0;
                }
                result += Integer.parseInt(num);
            }
            return result;
        }

        return Integer.parseInt(numbers);

    }
}
class MyException extends Exception
{
    public MyException(String[] s)
    {
        System.out.println("Negatives not allowed");
        for (String num:s) {
            if (Integer.parseInt(num)<0) {
                System.out.println(num);
            }
        }

    }
}