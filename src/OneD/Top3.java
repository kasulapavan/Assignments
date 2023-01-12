package OneD;

public class Top3 {

    void top3() {
        Student std1 = new Student();
        std1.install();
        Student min = new Student();

        int length = std1.std.length - 1;

        for (int i = 0; i < length; i++) {


            if (std1.std[i].marks > std1.std[i+1].marks) {
                min = std1.std[i];
                std1.std[i] = std1.std[i+1];
                std1.std[i+1] = min;
                i =-1;
            }
        }


        System.out.println();

        System.out.println("Top 3 least scored: ");

        for (int i = 0; i <=2; i++) {
            System.out.println("id:  " + std1.std[i].id + " name: " + std1.std[i].name + " st_code: " + std1.std[i].st_code + " marks:" + std1.std[i].marks);


        }
        System.out.println();


    }

    public static void main(String[] args) {


        Top3 top3 = new Top3();
        top3.top3();
    }
}
