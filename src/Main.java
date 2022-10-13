import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Department d1 = new Department("CS","Bashir", 3);

        System.out.println("Department Name: "+d1.getDname()+" "+"HOD-Name: "+d1.getHOD());


        while(true) {

            System.out.println("Enter Option\n1-Create-Lab\n2-List-Labs\n3-Exit");
            Scanner input = new Scanner(System.in);
            int userOption = input.nextInt();

            switch (userOption) {

                case 1:
                    d1.labsCreator();
                    break;
                case 2:
                    d1.labPrinter();
                    break;

                case 3:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Value");
            }
        }

    }

}