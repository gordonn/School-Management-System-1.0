import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class School
{
    Scanner scanner = new Scanner(System.in);
    public ArrayList<Student> studentList = new ArrayList<>();
    public ArrayList<Teacher> teacherList = new ArrayList<>();
    public ArrayList<Staff> staffList = new ArrayList<>();


    public void schoolMenu()
    {
        System.out.println("Welcome to the school management system menu!");
        System.out.println("What would you like to do?");
        System.out.println("1. Add a new person to the school");
        System.out.println("2. View all students in the school");
        System.out.println("3. View all teachers in the school");
        System.out.println("4. View all other staff of the school");
        System.out.println("5. View everyone in the school");
        System.out.println("6. Quit");

        while(true)
        {
            int choice = scanner.nextInt();

            // break will exit the program
            if (choice == 6) break;

            // this switch statement will match the corresponding user input with the method
            if (choice <= 5 && choice >= 1)
            {
                switch (choice)
                {
                    case 1:
                        addPersonMenu();
                        break;
                    case 2:
                        System.out.println(displayStudents());
                        break;
                    case 3:
                        System.out.println(displayTeachers());
                        break;
                    case 4:
                        System.out.println(displayStaff());
                        break;
                    case 5:
                        System.out.println("Students: \n" + displayStudents());
                        System.out.println("Teachers: \n" + displayTeachers());
                        System.out.println("Other Staff: \n" + displayStaff());
                        break;
                }
            }

            else
            {
                System.out.println("Please choose a valid input (1-5)!");
                schoolMenu();
            }
        }
    }

    // This is a sub-procdure in the schoolMenu();

    public void addPersonMenu()
    {
        System.out.println("What type of school person would you like to add to the school?");
        System.out.println("1. Student");
        System.out.println("2. Teacher");
        System.out.println("3. Staff Member");
        int choice = scanner.nextInt();
        if(choice <= 3 && choice >= 1 )
        {
            switch(choice)
            {
                case 1:
                    createNewStudent();
                    break;
                case 2:
                    createNewTeacher();
                    break;
                case 3:
                    createNewStaff();
                    break;
            }
        }
        else
        {
            System.out.println("Please choose a valid input (1-3)!");
            addPersonMenu();
        }
    }

    // This is a sub-procedure in the addPersonMenu();

    private void createNewStudent()
    {
        System.out.println("What is their name?");
        String name = scanner.next();

        System.out.println("How Old Are They?");
        int age = scanner.nextInt();

        System.out.println("Where do they live?");
        String address = scanner.next();

        System.out.println("What is their student ID?");
        int ID = scanner.nextInt();

        System.out.println("What are the classes the student is enrolled in?");
        System.out.println("(Type \"quit\" to stop adding subjects)");
        ArrayList<String> studentClasses = new ArrayList<>();
        while(true)
        {
            String aSubjectTheStudentIsLearning = scanner.next();
            if(Objects.equals(aSubjectTheStudentIsLearning, "quit"))
            {
                break;
            }
            else studentClasses.add(aSubjectTheStudentIsLearning);
        }

        ArrayList<Integer> grades = new ArrayList<>();
        for (String studentClass : studentClasses)
        {
            System.out.println("Grade for " + studentClass);
            int gradeForThisClass = scanner.nextInt();
            grades.add(gradeForThisClass);
        }
        studentList.add(new Student(name, age, address, ID, grades, studentClasses));
    }

    private void createNewStaff()
    {
        System.out.println("What is their name?");
        String name = scanner.next();

        System.out.println("How Old Are They?");
        int age = scanner.nextInt();

        System.out.println("Where do they live?");
        String address = scanner.next();

        System.out.println("What department are they in?");
        String department = scanner.next();

        System.out.println("What is their employee ID?");
        int ID = scanner.nextInt();

        staffList.add(new Staff(name, age, address, ID, department));
    }

    private void createNewTeacher()
    {
        System.out.println("What is their name?");
        String name = scanner.nextLine();

        System.out.println("How Old Are They?");
        int age = scanner.nextInt();

        System.out.println("Where do they live?");
        String address = scanner.next();

        System.out.println("What is their employee id?");
        int employeeId = scanner.nextInt();

        System.out.println("What are the subjects they teach?");
        System.out.println("(Type \"quit\" to stop adding classes)");
        ArrayList<String> taughtClasses = new ArrayList<>();
        while(true)
        {
            String aClassTheTeacherTeaches = scanner.next();
            if(Objects.equals(aClassTheTeacherTeaches, "quit"))
            {
                break;
            }
            else taughtClasses.add(aClassTheTeacherTeaches);
        }
        
        scanner.close();

        teacherList.add(new Teacher(name, age, address, employeeId, taughtClasses));
    }

    public String displayStudents()
    {
        return studentList.toString();
    }

    public String displayStaff()
    {
        return staffList.toString();
    }

    public String displayTeachers()
    {
        return teacherList.toString();
    }
}