public class DortIslem {

    public int topla(int number1, int number2){
        return  number1 + number2;
    }

    public int topla(int... numbers){
        int sum = 0 ;

        for (int number : numbers ){
            sum += number;
        }

        return  sum;
    }

}
