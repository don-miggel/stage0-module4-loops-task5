package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){

        for(int i =0; i < sideLength; i++){

            if (i == 0 || i == sideLength-1){
                for(int j = 0; j < sideLength; j++){
                    System.out.print('8');
                }
                System.out.print('\n');
            }
            else {
                String spaces = " ".repeat(sideLength-2);
                System.out.print("8"+spaces+"8"+"\n");

            }

        }

    }
}
