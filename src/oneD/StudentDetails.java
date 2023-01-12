package oneD;

public class StudentDetails {
   public static void main(String[] args) {


        Student[] std;
        Student max = new Student();
        Student min = new Student();


        std = new Student[10];

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



            System.out.println("Student details: ");
            //student details
            for (int i = 0; i < std.length; i++) {
                System.out.println("id:  " + std[i].id + " name: " + std[i].name + " st_code: " + std[i].st_code + " marks:" + std[i].marks);
            }

        //highest scored

        for (int i = 0; i < std.length - 1; i++) {
            for (int j = i + 1; j < std.length; j++) {

                if (std[i].marks < std[j].marks) {
                    max = std[i];
                    std[i] = std[j];
                    std[j] = max;
                }
            }
        }
        System.out.println();

        for (int i = 0; i <= 0; i++) {
            System.out.println("highest scored: ");
            System.out.println("id:  " + std[i].id + " name: " + std[i].name + " st_code: " + std[i].st_code + " marks:" + std[i].marks);

        }



           //least scored
        for (int i = 0; i < std.length - 1; i++) {
            for (int j = i + 1; j < std.length; j++) {

                if (std[i].marks > std[j].marks) {
                    min = std[i];
                    std[i] = std[j];
                    std[j] = min;


                }

            }
        }


        System.out.println();
        for (int i = 0; i <=0; i++) {
            System.out.println("least scored: ");
            System.out.println("id:  " + std[i].id + " name: " + std[i].name + " st_code: " + std[i].st_code + " marks:" + std[i].marks);


        }
        System.out.println();


        System.out.println("Top 3 least scored: ");

        for (int i = 0; i <=2; i++) {
            System.out.println("id:  " + std[i].id + " name: " + std[i].name + " st_code: " + std[i].st_code + " marks:" + std[i].marks);


        }
        System.out.println();


        System.out.println("st_code between 4 to 18 students list");

        for(int i =0; i< std.length; i++) {
            if (std[i].st_code >= 4 && std[i].st_code <= 18) {

                System.out.println("id:  " + std[i].id + " name: " + std[i].name + " st_code: " + std[i].st_code + " marks:" + std[i].marks);


            }

  }
    }
}