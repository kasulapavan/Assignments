package OneD;

public class Highest {


 void hello() {

            Student std1 = new Student();
            std1.install();
            Student max = new Student();

      int length = std1.std.length-1;

            for (int i = 0; i < length; i++) {


                    if (std1.std[i].marks < std1.std[i+1].marks) {
                        max = std1.std[i];
                        std1.std[i] = std1.std[i+1];
                        std1.std[i+1] = max;
                        i =-1;
                    }
                }

            System.out.println();

            for (int i = 0; i <= 0; i++) {
                System.out.println("highest scored: ");
                System.out.println("id:  " + std1.std[i].id + " name: " + std1.std[i].name + " st_code: " + std1.std[i].st_code + " marks:" + std1.std[i].marks);

            }
        }

        void displayAscOrder(){

            for (int i = 0; i < length; i++) {

                if()
            }

        }

        public static void main(String[] args) {
     Highest highest = new Highest();
     highest.hello();
        }




}


