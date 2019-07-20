

public class RepeatedIntegers {
    public static void main (String [] args){

        int [] b = {1,3,4,2,5,9,6,7,8,4,5,1,9,6};

        int[] x = repeatedNumbers(b);

        System.out.println("Your repeated numbers are: ");
        for(int i:x){
            System.out.println(i);
        }
    }

    public static int[] repeatedNumbers(int[] b){
        int n = b.length;
        int j = 0;

        int[] temp = new int[n-5];
        int[] answers = new int[5];

        for(int i: b){
            if(i!=temp[i-1]){
                temp[i-1]=i;
            }else{
                answers[j]=i;
                j++;
            }
        }

        return answers;
    }
}
