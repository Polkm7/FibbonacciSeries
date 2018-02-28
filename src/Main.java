public class Main {
    private int prev1 = 0;
    private int prev2 = 0;
    private int currentNum = 1;

    public static void main(String[] args) {
        Main program = new Main();
        program.fibSeries(40);

    }
    public void fibSeries(int length){

        for(int i =0; i < length; i++){
            System.out.println(currentNum);
            prev2 = prev1;
            prev1 = currentNum;
            currentNum = prev1 + prev2;

        }

    }
}
