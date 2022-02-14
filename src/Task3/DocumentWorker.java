package Task3;

import java.util.Scanner;

public class DocumentWorker {
    static int y;

    static void openDocument(){
        System.out.println("Документ открыт. ");
    }

    static void editDocument(){
        System.out.println("Редактирование документа доступно в версии Про. ");
    }

    static void saveDocument(){
        System.out.println("Сохранение документа доступно в версии Про. ");
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер ключа доступа Pro и Exp: ");
        y = in.nextInt();

        if (y == 0){
            System.out.println("Вам доступна только бесплатная версия. ");
            DocumentWorker.openDocument();
            DocumentWorker.editDocument();
            DocumentWorker.saveDocument();

        } else {
            DocumentWorker.ProDocumentWorker documents = new ProDocumentWorker();
            ProDocumentWorker.ExpertDocumentWorker documents1 = new ProDocumentWorker.ExpertDocumentWorker();

            documents.editDocument();
            documents1.saveDocument();

        }

    }


    static class ProDocumentWorker extends DocumentWorker {

        static void editDocument(){
            System.out.println("Документ отредактирован. ");
        }

        static void saveDocument(){
            System.out.println("Документ сохранен в старом формате, " +
                    "сохранение в остальных форматах доступно в версии Эксперт. ");
        }


        static class ExpertDocumentWorker extends ProDocumentWorker {

            static void saveDocument(){
                System.out.println("Документ сохранен в новом формате. ");
            }
        }



    }

}
