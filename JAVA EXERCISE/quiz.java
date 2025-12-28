import java.util.*;
public class quiz {
public static void main(String[]args){
Scanner sc= new Scanner (System.in);

//declare array, lets say candidate is P and the city who vote is C
System.out.println(" How many participant?");
int P= sc.nextInt();
System.out.println("========");

System.out.println(" How many city that was goin to voting?");
int C=sc.nextInt();
System.out.println("========");

int[][] KPU= new int[P][C];
int sum=0;

//make the for loop, THIS ONE FOR COLLECTING P CANDIDATE VOTE DATA FROM C CITY 
for(int i = 0 ; i < KPU.length; i++){
    System.out.println("candidate" + (i+1) + ": ");
     for(int j = 0 ; j < KPU[i].length; j++){
        System.out.print("city " + (j+1) + ": ");
        KPU [i][j] = sc.nextInt();  
        sum = sum + KPU[i][j];    
    }
}
System.out.println("========");
//displaying the output or the result
for (int i = 0; i < KPU.length ; i++) {  
    System.out.println("result for city "+ (i+1) + " is:");
     for(int j = 0 ; j < KPU[i].length ; j++){
         System.out.println("candidate " + (j+1) + ":" + KPU[i][j]);
    }
System.out.println("========");

//total of all vote from 2 city
} System.out.println("total vote from all candidates is "+sum);
System.out.println("========");

//make the selection for the biggest vote each candidate
for(int i=0;i<KPU.length;i++){
    int total=0;
    for(int j=0;j<KPU[i].length;j++){
        total += KPU[i][j];
    }
    System.out.println("vote total untuk kandidat "+(i+1)+" adalah  "+(total));
}
System.out.println("========");

//make the selection to choose the city with the biggest participant or vote
for(int j=0;j<C;j++){
    int total=0;
    for(int i=0;i<P;i++){
        total += KPU[i][j];
    }
    System.out.println("the total vote for city " + (j+1) + " is:  " + total);
}
System.out.println("========");

//make the selection to choose city with the biggest vote
for( int j=0;j<C;j++){
    int total=0;
    for(int i=0;i<P;i++){
        total += KPU[i][j];
    }
    if(total>sum/C){
        System.out.println("city " + (j+1) + " has the biggest vote");
    }
}
System.out.println("========");

//percentage
for(int i = 0 ; i < KPU.length; i++){
    int total=0;
    for(int j = 0 ; j < KPU[i].length; j++){
        total = total + KPU[i][j];
    }
    double percentage = ((double)total / sum) * 100;
    System.out.println("the percentage for candidate " + (i+1) + " is: " + percentage + "%");
}
System.out.println("========");


//make the sum for each candidate and which candidate will win
for(int i = 0 ; i< KPU.length; i++){
    int total=0;
    for(int j = 0 ; j < KPU[i].length; j++){
        total = total + KPU[i][j];
    }if(total > sum / P){
        System.out.println("candidate " + (i+1) + " is the winner with total vote of " + total);
    }
}
System.out.println("========");
sc.close();









        

    }

}