import Exceptions.InvalidsParametersException;

import java.util.Scanner;

public class ContadorJava {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-= CONTADOR JAVA -=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        int number1, number2;

        int[] numbers = readNumbers(scanner);
        number1 = numbers[0];
        number2 = numbers[1];

        try {
            count(number1, number2);
        } catch (InvalidsParametersException e){
            System.out.println(" Erro: "+ e.getMessage());
        }
        System.out.println();
        System.out.println();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("-                 developed by AMARILDO CHAGAS JUNIOR                  -");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

    }

    static int[] readNumbers(Scanner scanner) {
        System.out.print(" Digite o primeiro número:\n >> ");
        var num1 = scanner.nextInt();
        System.out.print(" Digite o segundo número:\n >> ");
        var num2 = scanner.nextInt();
        System.out.println();
        return new int[]{num1, num2};
    }

    static void count(int parameter1, int parameter2) throws InvalidsParametersException {
        if (parameter1 >= parameter2) {
            throw new InvalidsParametersException("O segundo parâmetro (número) deve ser maior que o primeiro.");
        } else {
            int contagem = parameter2 - parameter1;

            for (int i = 1; i <= contagem; i++) {
                System.out.println(" imprimindo número " + i);
            }

        }
    }
}