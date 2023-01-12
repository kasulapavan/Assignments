package OneD;

public class Between {
    void between() {
        Student std1 = new Student();
        std1.install();
        Student min = new Student();

        int length = std1.std.length -1;


        System.out.println("st_code between 4 to 18 students list");

        for (int i = 0; i < std1.std.length; i++) {
            if (std1.std[i].st_code >= 4 && std1.std[i].st_code <= 18) {

                System.out.println("id:  " + std1.std[i].id + " name: " + std1.std[i].name + " st_code: " + std1.std[i].st_code + " marks:" + std1.std[i].marks);


            }
        }
  }


    public static void main(String[] args) {
        Between between = new Between();
        between.between();
    }
}
