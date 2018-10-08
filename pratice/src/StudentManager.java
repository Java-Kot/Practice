public class StudentManager {
    public static void main(String[] args) {
        _StudentManager studentManager = new _StudentManager();
        studentManager.displayAll();

        Student andy = new Student("Andy", 23);
        studentManager.add(andy);
        System.out.println("added " + andy.getInformation());
        studentManager.displayAll();

        Student booby = new Student("Booby", 25);
        studentManager.add(booby);
        System.out.println("added " + booby.getInformation());
        studentManager.displayAll();

        Student samy = new Student("Samy", 22);
        studentManager.add(samy);
        System.out.println("added " + samy.getInformation());
        studentManager.displayAll();
    }
}

class Student {
    private String name;
    private int age;

    public Student(){

    }

    public Student (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getInformation() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class _StudentManager {
    private Student[] _students = new Student[20];
    private int size;
    public _StudentManager() {
    }
    public void add(Student student) {
        _students[size] = student;
        size++;
    }

    public void displayAll() {
        if (size == 0) {
            System.out.println("There is no any student in list");
        } else if (size == 1) {
            System.out.println("There is 1 student in list");
            System.out.print(_students[0].getInformation() + "");
            System.out.println();
        } else {
            System.out.println("There are " + size + " students list: ");
            for (int i = 0; i < size; i++) {
                System.out.print(_students[i].getInformation() + ", ");
            }
            System.out.println();
        }
    }

    public void find(String name) {
        int found = 0;
        for (int i = 0; i < size; i++) {
            boolean match = _students[i].getName().equals(name);
            if (match) {
                System.out.println("The position of student \""
                        + name
                        + "\" in the list is "
                        + (i + 1));
                found++;
                break;
            }
        }
        boolean notFound = found == 0;
        if (notFound) {
            System.out.println("There is no student with name " + name + " in the list");
        }
    }
}
