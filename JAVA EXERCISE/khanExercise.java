import java.util.*;
public class khanExercise{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

//declare array 2 dimension
Double[][]student=new Double[3][2];
String[] name= new String[student.length];
//make another array for grades
String[]grades={"A","B","C"};
//makethe for loop
for(int i=0;i<student.length;i++){
    System.out.print("input name for student "+(i+1));
    name[i]=sc.nextLine();
    for(int j=0;j<student[i].length;j++){
        System.out.print("score "+(j+1));
        student[i][j]=sc.nextDouble();
        sc.nextLine();
    }
}
//if statement
for(int i=0; i<student.length; i++){
    for( int j=0; j<student[i].length; j++){
        if(student[i][j]>=90 && student[i][j]<=100){
            System.out.println(name[i]+" subject"+(j+1)+"grade is "+ grades[0]);
        }else if(student[i][j]>=80 && student[i][j]<90){
            System.out.println(name[i]+" subject"+(j+1)+", your grade is "+ grades[1]);
        }else{System.out.println(name[i]+" subject"+(j+1)+", your grades is "+ grades[2]);

        }
    }
}
//display output
    }
}
