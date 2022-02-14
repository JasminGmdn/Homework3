package Task1;

public class ClassRoom {
     private Pupil[] classRoom;

     public  ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4) {
         this.classRoom = new Pupil[]{pupil1, pupil2, pupil3, pupil4 };
     }

     public static void main(String[] args) {

        ClassRoom classRoom = new ClassRoom(
                new  ExcellentPupil(),
                new Pupil(),
                new GoodPupil(),
                new BadPupil()
        );

        classRoom.showClass();
         System.out.println();

     }


    public void showClass() {
         for(Pupil pupil: classRoom) {
             pupil.study();
             pupil.read();
             pupil.write();
             pupil.relax();
         }
    }

    static class Pupil {

         void study() {
            System.out.println("Pupil:" + "\n" + "Я учусь.");
        }

        void read() {
            System.out.println("Я читаю.");
        }

        void write() {
            System.out.println("У меня понятный почерк.");
        }

        void relax() {
            System.out.println("Я часто отдыхаю.");
        }
    }


     static class ExcellentPupil extends Pupil {

        @Override
        void study() {
            System.out.println("ExcellentPupil:" + "\n" + "Я хорошо учусь!");
        }
        void read() {
            System.out.println("Я быстро читаю.");
        }
        void write() {
            System.out.println("У меня красивый почерк.");
        }
        void relax() {

            System.out.println("Я много учусь,и мало отдыхаю.");
        }
    }

    static class GoodPupil extends Pupil {

        @Override
        void study() {
            System.out.println("GoodPupil:" + "\n" + "Я стараюсь хорошо учиться!");
        }

        void read() {

            System.out.println("Я хорошо читаю.");
        }

        void write() {
            System.out.println("У меня красивый почерк.");
        }

        void relax() {

            System.out.println("Я учусь и отдыхаю в меру.");
        }
    }

    static class BadPupil extends Pupil {

        @Override
        void study() {

            System.out.println("BadPupil:" + "\n" + "Я плохо учусь.");
        }
        void read() {

            System.out.println("Я плохо читаю.");
        }

        void write(){

            System.out.println("У меня плохой почерк.");
        }

        void relax() {

            System.out.println("Я предпочитаю отдыхать, а не учиться!");
        }
    }
}
