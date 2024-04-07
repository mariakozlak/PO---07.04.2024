import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    }

    public class Student {
        private String fName, lName, email, address;
        private int indexNumber;
        private ArrayList<double> grades = new ArrayList<double>();
        public StudentGroup studentGroup;

        public Student(String fName, String lName, int indexNumber, String email, String adress, int Grades, StudentGroup studentGroup){
            this.fName =fName;
            this.lName =lName;
            this.indexNumber =indexNumber;
            this.email = email;
            this.address = address;
            this.grades = new ArrayList<double>();
            this.studentGroup = studentGroup;
        }
        public void addGrade(double grade){
            if(grades.size() < 20){
                grades.add(grade);
            }else {
                System.out.println("maksymalnie mozna dodac 20 ocen");
            }
        }
        public double avgGrade() {
            if (grades.isEmpty()) {
                throw new IllegalArgumentException("student nie ma zadnych ocen");
            }
            double sum = 0;
            for (int i = 0; i < grades.size(); i++) {
                sum += grades.get(i);
            }
            double avg = sum / grades.size();
            return (avg);
        }
        public double round( double avg) {
            if (avg >= 2 && avg < 2.5) {
                return 2;
            } else if (avg >= 2.5 && avg < 3.5) {
                return 3;
            } else {
                return 4;
            }
        }

    }

    public class StudentGroup{
        private String groupName;
        private ArrayList<Student> students;

        public StudentGroup(String groupName){
            this.groupName = groupName;
            this.students = new ArrayList<Student>();
        }

        public void addStudent(Student student){
            if (students.size() >= 15){
                throw new IllegalStateException("grupa za duza");
            }
            if (students.contains(student)){
                throw new IllegalStateException("ten student jest juz w grupie");
            }

            students.add(student);
            student.studentGroup = this;
        }


    }
