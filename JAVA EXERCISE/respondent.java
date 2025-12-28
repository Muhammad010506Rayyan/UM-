import java.util.*;
public class respondent{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
//declare array
int[][]respAndScore=new int[2][6];

//declare for loop
for(int i=0;i<respAndScore.length;i++){
    System.out.println("repsondent "+(i+1));// outer loop
    for(int j=0;j<respAndScore[i].length;j++){//inner loop
        System.out.print("question "+(j+1)+": ");
        respAndScore[i][j]=sc.nextInt();
        
    if(respAndScore[i][j]>=1 && respAndScore[i][j]>5){//if statement
        System.out.println("error,please retry again ");
        j--;
    }
    
    }
}
//display output
for(int i=0;i<respAndScore.length;i++){
    System.out.println("question "+(i+1));
    for(int j=0;j<respAndScore[i].length;j++){
         System.out.println("question "+(j+1)+": "+ respAndScore[i][j]);
    }
   



    
}
//another for loop
for(int i=0;i<respAndScore.length;i++){
  double sum=0;
  for(int j=0;j<respAndScore[i].length;j++){
    sum+=respAndScore[i][j];
  
}


//display sum
System.out.println("total"+(i+1)+ "is: "+sum);
System.out.println("average is:"+ (sum/6));
    }
//make loop fo column
for(int j=0;j<6;j++){
    double sumCourse=0;
    for(int i=0;i<2;i++){
    sumCourse += respAndScore[i][j];
    }
//output
System.out.println("sum for each question is "+ sumCourse);
System.out.println("average: "+ (sumCourse/2));
    }
}
}   

        
       
