import java.util.Scanner;

public class DisplayGeometry {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Menu");
            System.out.println("1. Vẽ hình chữ nhật");
            System.out.println("2. Vẽ hình tam giác vuông, có cạnh góc vuông ở bottom-left");
            System.out.println("3. Vẽ hình tam giác vuông, có cạnh góc vuông ở top-left");
            System.out.println("4. Vẽ hình tam giác vuông, có cạnh góc vuông ở bottom-right");
            System.out.println("5. Vẽ hình tam giác vuông, có cạnh góc vuông ở top-right");
            System.out.println("6. Vẽ hình tam giác cân");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn: ");
            choice = input.nextInt();

            int i, j;

            switch (choice){
                case 1:
                    for (i = 0; i < 4; i++){
                        for (j = 0; j < 5; j++) {
                            System.out.printf("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (i = 0; i < 7; i++){
                        for (j = 0; j < i; j++){
                            System.out.printf("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (i = 8; i >= 1; i--){
                        for (j = 0; j < i; j++){
                            System.out.printf("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    for (i = 0; i < 7; i++){
                        for (j = 7; j > i; j--){
                            System.out.printf("*");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    for (i = 0; i < 8 ; i++){
                        for (j = 0; j < 8; j++){
                            if (j >= i)
                                System.out.printf("*");
                            else
                                System.out.printf(" ");
                        }
                        System.out.println();
                    }
                    break;
                case 6:
                    for (i = 0; i < 5; i++){
                        for (j = 0; j < i; j++){
                            System.out.printf("*");
                        }
                        for (int k = 1; k < j; k++){
                            System.out.printf("*");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }

        }while (choice != 0);
    }
}
