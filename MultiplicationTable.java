public class MultiplicationTable {

    public static void main (String[] args){
        int[][] table = new int[10][10];
        calculateMultiplicationTable(table);
        printTable(table);
    }

    public static void calculateMultiplicationTable (int[][] table) {
        for (int i = 0; i < table.length; i++){
            for (int j = 0; j < table[i].length; j++){
                table[i][j] = (i+1)*(j+1);
            }
        }
    }

    public static void printTable (int[][] table){
        for (int[] row : table){
            for (int x : row){
                System.out.print(x + " ");
            }
            System.out.println("\n");
        }
    }
}
