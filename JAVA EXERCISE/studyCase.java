import java.util.*;

public class studyCase {

static Scanner sc = new Scanner(System.in);

// 2D array to store all applicant data
static String[][] applicants = new String[20][5];
static int total = 0;

public static void main(String[] args) {
int menu;
do {
showMenu();
menu = sc.nextInt();
sc.nextLine(); // clear buffer

switch (menu) {
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
    calculateAverageGPA();
    break;
case 5:
    System.out.println("Program terminated.");
    break;
default:
    System.out.println("Invalid menu choice.");
    break;
}
} 
while (menu != 5);
}
// Display menu
static void showMenu() {
System.out.println("\n==== Scholarship Registration System ====");
System.out.println("1. Add Scholarship Applicant Data");
System.out.println("2. Display All Applicants");
System.out.println("3. Search Applicants by Scholarship Type");
System.out.println("4. Calculate Average GPA by Scholarship Type");
System.out.println("5. Exit");
System.out.print("Choose menu (1-5): ");
}

// Add applicant data with validation
static void addApplicant() {

System.out.print("Student Name: ");
applicants[total][0] = sc.nextLine();

System.out.print("NIM: ");
applicants[total][1] = sc.nextLine();

System.out.print("Latest GPA: ");
double gpa = sc.nextDouble();
sc.nextLine();
applicants[total][2] = String.valueOf(gpa);

System.out.print("Scholarship Type (Regular/Outstanding/Research): ");
applicants[total][3] = sc.nextLine();

// Validate scholarship type
if (!applicants[total][3].equalsIgnoreCase("Regular")
&& !applicants[total][3].equalsIgnoreCase("Outstanding")
&& !applicants[total][3].equalsIgnoreCase("Research")) {
System.out.println("Invalid scholarship type.");
return;
}

System.out.print("Parent's Income (maximum 2000000): ");
int income = sc.nextInt();
sc.nextLine();

// Validate income
if (income > 2000000) {
System.out.println("Application rejected because parent's income exceeds the maximum limit.");
return;
}

applicants[total][4] = String.valueOf(income);

total++;
System.out.println("Applicant successfully saved. Total applicants: " + total);
}

// Display all applicant data
static void displayApplicants() {
    if (total == 0) {
        System.out.println("There is no applicant data yet.");
        return;
    }

    for (int i = 0; i < total; i++) {
        System.out.println("\nApplicant " + (i + 1));
        System.out.println("Name            : " + applicants[i][0]);
        System.out.println("NIM             : " + applicants[i][1]);
        System.out.println("GPA             : " + applicants[i][2]);
        System.out.println("Scholarship Type: " + applicants[i][3]);
        System.out.println("Parent Income   : " + applicants[i][4]);
    }
}

// Search applicants by scholarship type
static void searchByType() {
    System.out.print("Enter Scholarship Type: ");
    String searchType = sc.nextLine();
    boolean found = false;

    for (int i = 0; i < total; i++) {
        if (applicants[i][3].equalsIgnoreCase(searchType)) {
            System.out.println("\nApplicant Found:");
            System.out.println("Name : " + applicants[i][0]);
            System.out.println("NIM  : " + applicants[i][1]);
            System.out.println("GPA  : " + applicants[i][2]);
            found = true;
        }
    }

    if (!found) {
        System.out.println("No applicants found for this scholarship type.");
    }
}


// Calculate average GPA for each scholarship type
static void calculateAverageGPA() {
calculateByType("Regular");
calculateByType("Outstanding");
calculateByType("Research");
}

// Helper function for GPA calculation
static void calculateByType(String type) {
double totalGPA = 0;
int countType = 0;

for (int i = 0; i < total; i++) {
if (applicants[i][3].equalsIgnoreCase(type)) {
totalGPA += Double.parseDouble(applicants[i][2]);
countType++;
}
}

if (countType == 0) {
System.out.println(type + " : no applicants.");
} else {
System.out.println(type + " : Average GPA = " + (totalGPA / countType));
}
    }
}
