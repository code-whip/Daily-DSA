public class SumProductBasic{
    public static void main(String[] args){
        // Ques: Sum and Product of maximum and minimum
        // link: https://course.acciojob.com/idle?question=0766c1ac-431b-43d2-88d7-8d74b16376a5
         Scanner scn = new Scanner(System.in);           
                byte tC = scn.nextByte();

                for(byte t=0; t<tC; t++){
                       short N = scn.nextShort();
                        int max = 0;
                        int min = 1000001;
                        for(short i=0; i<N; i++){
                                int input = scn.nextInt();
                                if(input>max)
                                        max = input;
                                if(input<min)
                                        min = input;
                        }
                        System.out.println((max+min) + " "+((long)max * min));
                }           
    }
}