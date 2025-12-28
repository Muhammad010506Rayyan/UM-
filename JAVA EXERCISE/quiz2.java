import java.util.*;
import javax.sound.sampled.SourceDataLine;
public class quiz2 {
public static void main(String[] args) {
Scanner sc= new Scanner (System.in);

//declare array, lets say it was 2 participant and the city who vote is 2
int[][] KPU= new int[2][2];
 int sum=0;

//make the for loop, THSI ONE FOR COLLECTING 2 CANDIDATE VOTE DATA FROM 2 CITY 
for(int i=0;i<KPU.length;i++){
    System.out.println("candidate"+(i+1)+": ");
    for(int j=0;j<KPU[i].length;j++){
        System.out.print("city "+(j+1)+": ");
        KPU[i][j]=sc.nextInt();  
        sum += KPU[i][j];    
    }
}
//displaying the output or the result
for (int i = 0; i < KPU.length; i++) {
    System.out.println("result for city "+(i+1)+" is: ");
    for(int j=0;j<KPU[i].length;j++){
        System.out.println("candidate "+(j+1)+":"+KPU[i][j]);
    }

//total of all vote from 2 city
} System.out.println("total vote from all candidates is "+sum);

//make the selection for the biggest vote each cnadidate in city 1 and 2
if(KPU[0][0]>KPU[0][1]){
    System.out.println("city 1 biggest vote was on candidate 1");
}else{
    System.out.println("city 1 biggest vote was on candidate 2");

}
if(KPU[1][0]>KPU[1][1]){
    System.out.println("city 2 biggest vote was on candidate 1");
}else{
    System.out.println("city 2 biggest vote was on candidate 2");
}

//make the selection to choose city with the biggest vote
if((KPU[0][0]+KPU[0][1])>(KPU[1][0]+KPU[1][1])){
    System.out.println("the first city is the biggest");
} 
if((KPU[0][0]+KPU[0][1])<(KPU[1][0]+KPU[1][1])){
    System.out.println("the second city is the biggest ");
}else if((KPU[0][0]+KPU[0][1])==(KPU[1][0]+KPU[1][1])){
    System.out.println("draw");}
//percentage
System.out.println("the percentage for candidate 1 is: "+(((KPU[0][0]+KPU[0][1])/sum)*100));
System.out.println("the percentage for candidate 2 is: "+(((KPU[1][0]+KPU[1][1])/sum)*100));

//make the sum for each candidate and which candidate will win
System.out.println("candidate 1: "+(KPU[0][0]+KPU[0][1]));
System.out.println("candidate 2: "+(KPU[1][0]+KPU[1][1]));
if((KPU[0][0]+KPU[0][1])>(KPU[1][0]+KPU[1][1])){
    System.out.println("candidate 1 win");
}if((KPU[0][0]+KPU[0][1])<(KPU[1][0]+KPU[1][1])){
    System.out.println("candidate 2 win");

}










        

    }
}
