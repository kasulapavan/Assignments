//package oneD;
//
//public class HighestMarks {
//
//    Student student = new Student();
//    static Student[] std;
//    static Student max = new Student();
//
//    //highest scored
//    public static void main(String[] args) {
//
//
//        for (int i = 0; i < std.length - 1; i++) {
//            for (int j = i + 1; j < std.length; j++) {
//
//                if (std[i].marks < std[j].marks) {
//                    max = std[i];
//                    std[i] = std[j];
//                    std[j] = max;
//                }
//            }
//        }
//        System.out.println();
//
//        for (int i = 0; i <= 0; i++) {
//            System.out.println("highest scored: ");
//            System.out.println("id:  " + std[i].id + " name: " + std[i].name + " st_code: " + std[i].st_code + " marks:" + std[i].marks);
//
//        }
//    }
//}