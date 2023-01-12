package OneD;


public class Student {
    int id;
    String name;
    int st_code;
    int marks;

      Student[] std = new Student[10];

    Student(int id, String name, int st_code, int marks) {
        this.id = id;
        this.name=name;
        this.st_code=st_code;
        this.marks=marks;
    }

    public Student() {

    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", st_code=" + st_code +
                ", marks=" + marks +
                '}';
    }


    void install(){


        std[0] = new Student(1, "pavan", 11, 55);

        std[1] = new Student(2, "pavan", 4, 85);

        std[2] = new Student(3, "pavan", 17, 75);

        std[3] = new Student(4, "pavan", 12, 55);

        std[4] = new Student(5, "pavan", 1, 85);

        std[5] = new Student(6, "pavan", 15, 95);

        std[6] = new Student(7, "pavan", 22, 35);

        std[7] = new Student(8, "pavan", 110, 22);

        std[8] = new Student(9, "pavan", 18, 10);

        std[9] = new Student(10, "pavan", 36, 45);


    }


}
