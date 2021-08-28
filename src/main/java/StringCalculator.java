public class StringCalculator {
    static int count = 0;

    public int add(String numbers) {
        count++;

        if (numbers.equals("")) {
            return 0;
        }

        if (numbers.length() > 0) {
            int result = 0;
            String var;
            if (numbers.startsWith("//")) {
                var = numbers.substring(4);
                if (numbers.contains("[")) {

                    int first = numbers.indexOf("[");
                    int last = numbers.lastIndexOf("]");
                    String dim=numbers.substring(first+1,last);
                    String value=numbers.substring(last+2);
                    value=value.replace(dim,",");
                    String[] array=value.split(",");
                    for(String num:array)
                    {
                        int no = Integer.parseInt(num.trim());
                        result +=no;
                    }
                    return result;
                }
            } else {

                var = numbers;
            }
            String[] array = var.split("[,\n;#*%]");

            for (String num : array) {
                int no = Integer.parseInt(num.trim());
                try {
                    if (no < 0) {
                        throw new MyException(array);
                    }
                } catch (MyException m) {
                    return 0;
                }
                if (no <= 1000) {
                    result += no;
                }
            }
            return result;
        }
        return Integer.parseInt(numbers);
    }
    public int getCalledCount() {

        return count;
    }
}

class MyException extends Exception {
    public MyException(String[] s) {
        System.out.println("Negatives not allowed");
        for (String num : s) {

            if (Integer.parseInt(num) < 0) {
                System.out.println(num);
            }
        }
    }
}