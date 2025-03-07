public class FindGrade{

    public static void main(String[] args){
    if(args.length == 1) {
        int score = Integer.parseInt(args[0]);

        if (score < 60) {
            System.out.println("f");
        } else if (score < 70) {
            System.out.println("d");
        } else if (score < 80) {
            System.out.println("c");
        } else if (score < 90) {
            System.out.println("b");
        } else if (score <= 100) {
            System.out.println("a");
        } else {
            System.out.println("invalid grade!!");
        }
    }
    else{System.out.println("not work!!");}
        //Get the score from the user as a file parameter
        //Calculate the grade based on the score
        //Print the grade to the console
        // 90 - 100 -> A
        // 80 - 89 -> B
        // 70 - 79 -> C
        // 60 - 69 -> D
        // 0 - 59 -> F





    }



}