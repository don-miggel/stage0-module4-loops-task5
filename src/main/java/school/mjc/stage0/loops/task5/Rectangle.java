package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){

        for(int i =0; i < height; i++){

            if (i == 0 || i == height-1){
                for(int j = 0; j < length; j++){
                    System.out.print('8');
                }
                System.out.print('\n');
            }
            else {
                String spaces = " ".repeat(length-2);
                System.out.print("8"+spaces+"8"+"\n");

            }

        }

    }
}
