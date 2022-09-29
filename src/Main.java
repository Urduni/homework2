public class Main {
    public static void main(String[] args) {

        int age = 60;
        int temperature = 50;

        if (age>20 && age< 45 && temperature > -20 && temperature < 30){
            System.out.println(" Можно идти гулять");
        }else if ( age<20 && temperature >= 0 && temperature < 28){
            System.out.println("Можно идти гулять");
        }else if ( age >45 && temperature > -10 && temperature < 25){
            System.out.println("Можно идти гулять");
        }else
            System.out.println("Оставайтесь дома");


    }
    }
