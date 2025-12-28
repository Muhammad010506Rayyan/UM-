import java.util.*; // import library util
public class case1{
static String [][] data = new String [20][3];// 2D array to store all applicant data
static double[] gpa = new double [20];//for GPA
static int []income= new int[20];//for Parent income
static int total =0;

//showMenu
static void showMenu(){
    System.out.println("==== Scholarship Registration System ====");
    System.out.println("1. Add Scholarship Applicant Data");
    System.out.println("2. Display All Applicants");
    System.out.println("3. Search Applicants by Scholarship Type");
    System.out.println("4. Calculate Average GPA by Scholarship Type");
    System.out.println("5. Exit");
    System.out.print("Choose menu (1-5): ");
}
//addApplicant
static void addApplicant(){
    Scanner sc= new Scanner (System.in);
    System.out.print("Student Name: ");
    data[total][0]= sc.nextLine();

    System.out.print("NIM: ");
    data[total][1]= sc.nextLine();

    System.out.print("Scholarship Type (reguler/research/outstanding): ");
    data[total][2]= sc.nextLine();

    System.out.print("GPA: ");
    gpa[total]= sc.nextDouble();

    System.out.print("Parent income ");
    income[total]= sc.nextInt();

    // Validate income
    if (income[total] > 2000000) {
    System.out.println("Application rejected because parent's income exceeds the maximum limit.");
    total--;
    return;
    }

    total++;
    System.out.println("Applicant data added successfully.");
}
//displayApplicants
static void displayApplicants(){
    if(total ==0){
        System.out.println("No applicants to display.");
    }
    System.out.println("\n==== List of Scholarship Applicants ====");
    for(int i=0;i<total;i++){
        System.out.println("Applicant " + (i+1) + ":");
        System.out.println("Name: " + data[i][0]);
        System.out.println("NIM: " + data[i][1]);
        System.out.println("Scholarship Type: " + data[i][2]);
        System.out.println("GPA: " + gpa[i]);
        System.out.println("parent income: " + income[i]);
        System.out.println("---------------------------");
    }
}
//searchByType
static void searchByType(){
    Scanner sc= new Scanner (System.in);
    System.out.print("Enter Scholarship Type to Search (reguler/research/outstanding): ");
    String type = sc.nextLine();
    System.out.println("\n==== Search Results for " + type + " Scholarship ====");
    for(int i=0;i<total;i++){
        if(data[i][2].equalsIgnoreCase(type)){
            System.out.println("Applicant " + (i+1) + ":");
            System.out.println("Name: " + data[i][0]);
            System.out.println("NIM: " + data[i][1]);
            System.out.println("GPA: " + gpa[i]);
            System.out.println("parent income " + income[i]);
            System.out.println("---------------------------");
        }
    }
}
//calculateAverageGPA
static double calculateAverageGPA(){
    Scanner sc= new Scanner (System.in);
    System.out.print("scholarship type to calculate average GPA(regular/outstanding/research)");
    String type = sc.nextLine();
    double sumGPA=0;
    int count=0;
    for(int i=0;i<total;i++){
        if(data[i][2].equalsIgnoreCase(type)){
        sumGPA+= gpa[i];
        count++;
    }
}
    return (sumGPA/count);
    
 
}



   /* Scanner sc= new Scanner (System.in);
    System.out.print("Enter Scholarship Type to Calculate Average GPA (reguler/research/outstanding): ");
    String type = sc.nextLine();
    double sumGPA = 0;
    int count = 0;
    for(int i=0;i<total;i++){
        if(data[i][2].equalsIgnoreCase(type)){
            sumGPA += gpa[i];
            count++;
        }
    }
    if(count > 0){
        double averageGPA = sumGPA / count;
        System.out.print("Average GPA for " + type + " Scholarship: " + averageGPA);
    } else {
        System.out.println("No applicants found for the specified scholarship type.");
    }
}*/

//main method
public static void main (String[]args){
Scanner sc= new Scanner (System.in);
int menu;
do{
showMenu();
menu= sc.nextInt();
switch(menu){
    case 1:
        addApplicant();
        break;
    case 2:
        displayApplicants();
        break;
    case 3:
         searchByType();
        break;
    case 4:
        double avg = calculateAverageGPA();
        System.out.println("average "+avg);
        break;
    case 5:
        System.out.println("Program terminated.");
        break;
    default:
        System.out.println("Invalid menu choice.");
        break;
        }
    } while(menu !=5) ;
    }

}