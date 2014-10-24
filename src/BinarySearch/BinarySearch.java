package BinarySearch;

public class BinarySearch {

    public static void main(String[] args) {

        BinarySearch.search(new int[]{2, 5, 6, 11, 14, 15, 17, 23, 24, 70, 80}, 23);

    }
    public static void search(int[]args, int element){

        if(element > args[args.length-1]){
            System.out.println("No such element! Out of bounds!");
            return;
        }

        if(element < args[0]){
            System.out.println("No such element! Out of bounds!");
            return;
        }

        int minLim = 0;
        int maxLim = args.length-1;
        int midOfArray = (args.length-1)/2;

        if(element == args[minLim]){
            System.out.println("index: " + minLim);
            return;
        }
        if(element == args[maxLim]){
            System.out.println("index: " + maxLim);
            return;
        }

        while((element != args[midOfArray]) && (minLim != midOfArray) && (maxLim != midOfArray)){

            if(element < args[midOfArray]){
                maxLim = midOfArray;
                midOfArray = (minLim + maxLim)/2;
            }

            if(element > args[midOfArray]){
                minLim = midOfArray;
                midOfArray = (minLim + maxLim)/2;
            }

        }

        if((minLim == midOfArray) || (maxLim == midOfArray)){
            System.out.println("No such element!");
            return;
        }

        System.out.println("index: " + midOfArray);
        return;
    }
}

