package ScientificCalculatorOOP.Calculators;

import java.util.*;

public class test {

    static Scanner scanner = new Scanner(System.in);
    static List<HashMap<String, Object>> listOfSchools = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Menu for commands");
            System.out.println("1.Press 1 to enter schools, students, subjects, marks");
            System.out.println("2.Press 2 to retrieve marks for student's specific subject");
            System.out.println("3.Press 3 to calculate student's average for all subjects");
            System.out.println("Enter 0 to exit");
            System.out.print("Choose an option: ");
            Integer option = scanner.nextInt();
            if (option == 1) {
                System.out.println(getSchools());
            } else if (option == 2) {
                retrieveMarks(listOfSchools);
            } else if (option == 3) {
                calculateAverage(listOfSchools);
            } else {
                break;
            }
        }
        scanner.close();
    }

    public static List<HashMap<String, Object>> getSchools() {
        while (true) {
            scanner.nextLine();
            HashMap<String, Object> school = new HashMap<>();
            System.out.println("Enter school name (type exit to quit): ");
            String nameOfSchool = scanner.nextLine();
            if (nameOfSchool.equals("exit")) {
                break;
            }
            System.out.println("Enter address: ");
            String address = scanner.nextLine();
            school.put("school name", nameOfSchool);
            school.put("address", address);


            school.put("Students", getStudents());
            listOfSchools.add(school);
        }
        return listOfSchools;
    }

    public static List<HashMap<String, Object>> getStudents() {
        List<HashMap<String, Object>> studentsForThisSchool = new ArrayList<>();
        while (true) {
            System.out.println("Enter student name (type exit to stop): ");
            String studentName = scanner.nextLine();
            if (studentName.equals("exit")) {
                break;
            }
            System.out.println("Enter student id: ");
            String id = scanner.nextLine();
            System.out.println("Enter student grade: ");
            String grade = scanner.nextLine();
            System.out.println("Enter student age");
            Short age = scanner.nextShort();
            scanner.nextLine();
            HashMap<String, Object> studentMap = new HashMap<>();
            studentMap.put("student name", studentName);
            studentMap.put("student id", id);
            studentMap.put("grade", grade);
            studentMap.put("Age ", age);

            studentMap.put("Subjects", getSubject());
            studentsForThisSchool.add(studentMap);
        }
        return studentsForThisSchool;
    }

    public static List<HashMap<String, Object>> getSubject() {
        List<HashMap<String, Object>> subjectsForThisStudent = new ArrayList<>();
        while (true) {
            System.out.println("Enter subject name (type exit to stop): ");
            String subjectName = scanner.nextLine();
            if (subjectName.equals("exit")) {
                break;
            }
            System.out.println("Enter teacher name: ");
            String teacherName = scanner.nextLine();
            System.out.println("Enter credit: ");
            Short creditHours = scanner.nextShort();
            scanner.nextLine(); // to avoid skipping the next scanner
            HashMap<String, Object> subjectMap = new HashMap<>();
            subjectMap.put("Subject Name: ", subjectName);
            subjectMap.put("Teacher's Name", teacherName);
            subjectMap.put("Credit Hours: ", creditHours);


            subjectMap.put("Marks", getMarks()); // adding a list as a value for this map
            subjectsForThisStudent.add(subjectMap);
        }
        return subjectsForThisStudent;
    }

    public static List<HashMap<String, Object>> getMarks() {
        List<HashMap<String, Object>> marksForThisSubject = new ArrayList<>();
        while (true) {
            System.out.print("Enter the test name (type exit to finish): ");
            String testName = scanner.nextLine();
            if (testName.equals("exit")) {
                break;
            }
            System.out.print("Enter the marks: ");
            Double marks = Double.parseDouble(scanner.nextLine());
            HashMap<String, Object> marksHashmaps = new HashMap<>();
            marksHashmaps.put("Test Name", testName);
            marksHashmaps.put("Marks", marks);

            marksForThisSubject.add(marksHashmaps);
        }
        return marksForThisSubject;
    }

    public static void retrieveMarks(List<HashMap<String, Object>> listOfSchools) {
        System.out.print("Enter school name: ");
        String schoolName = scanner.nextLine();
        scanner.nextLine();
        for (HashMap<String, Object> school : listOfSchools) {
            if (school.containsValue(schoolName)) {
                List<HashMap<String, Object>> students = (List<HashMap<String, Object>>) school.get("Students");   // manual/narrowing casting
                for (HashMap<String, Object> student : students) {
                    System.out.print("Enter student ID: ");
                    String studentID = scanner.nextLine();
                    //System.out.println("Student " + studentID + " grade is: " + student.get("grade"));
                    if (student.containsValue(studentID)) {
                        List<HashMap<String, Object>> subjects = (List<HashMap<String, Object>>) student.get("Subjects");
                        for (HashMap<String, Object> subject : subjects) {
                            System.out.print("Enter subject name: ");
                            String subjectName = scanner.nextLine();
                            if (subject.containsValue(subjectName)) {
                                List<HashMap<String, Object>> marks = (List<HashMap<String, Object>>) subject.get("Marks");
                                System.out.println("Student " + studentID + " marks for this subject as follows: " + marks);
                                break;
                            } else {
                                System.out.println("Subject does not exist");
                            }
                        }
                    } else {
                        System.out.println("Student does not exist");
                    }
                }
            } else {
                System.out.println("School does not exist");
            }
        }
    }

    public static void calculateAverage(List<HashMap<String, Object>> schoolList) {
        System.out.print("Enter school name: ");
        scanner.nextLine();
        String schoolName = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter student ID: ");
        String studentID = scanner.nextLine();

        for (HashMap<String, Object> school : schoolList) {
            double totalMarksForAllSubjects = 0;
            Integer totalCount = 0;
            if (school.containsValue(schoolName)) {
                List<HashMap<String, Object>> students = (List<HashMap<String, Object>>) school.get("Students");   // manual/narrowing casting
                for (HashMap<String, Object> student : students) {
                    if (student.containsValue(studentID)) {
                        List<HashMap<String, Object>> subjects = (List<HashMap<String, Object>>) student.get("Subjects");
                        for (HashMap<String, Object> subject : subjects) {
                            Double totalMarksForThisSubject = 0.0;
                            Integer count = 0;
                            List<HashMap<String, Object>> marks = (List<HashMap<String, Object>>) subject.get("Marks");
                            for (HashMap<String, Object> mark : marks) {
                                totalMarksForThisSubject += (Double) mark.get("Marks");
                                count++;
                            }
                            totalMarksForAllSubjects += totalMarksForThisSubject;
                            totalCount += count;
                        }
                        if (totalCount > 0) {
                            System.out.println("Student's average: " + totalMarksForAllSubjects / totalCount);
                        } else {
                            System.out.println("No marks found");
                        }
                        break;
                    }
                }
            }
        }
    }
}
