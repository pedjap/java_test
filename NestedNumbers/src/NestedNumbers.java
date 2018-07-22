public class NestedNumbers {
    public static void main(String[] args){
        int count = 0;

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 10; j++){
                count = 0;
                while(count < 3) {

                    System.out.print(j);
                    count++;
                }
            }

            System.out.println();
        }
    }
}
