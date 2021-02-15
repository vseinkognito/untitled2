import java.util.Scanner;

class Sotrudnik {
    String fam, im, otch, doljnost;
    int oklad;
}

public class Firma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp1251");
        System.out.println("Введите кол-во сотрудников:");
        int count = sc.nextInt();
        sc.nextLine();
        Sotrudnik[] sotr = new Sotrudnik[count];
        System.out.println("Введите информацию о каждом сотруднике: ");
        for (int i = 0; i < count; i++){
            sotr[i] = new Sotrudnik();
            System.out.println("Введите фамилию " + (i + 1) + " сотрудника");
            sotr[i].fam = sc.nextLine();
            System.out.println("Введите имя");
            sotr[i].im = sc.nextLine();
            System.out.println("Введите отчество");
            sotr[i].otch = sc.nextLine();
            System.out.println("Введите должность");
            sotr[i].doljnost = sc.nextLine();
            System.out.println("Введите его оклад");
            sotr[i].oklad = sc.nextInt();
            sc.nextLine();
            }
        System.out.println( "\n Сотрудники фирмы: \n фам \t имя \t отч \t должность \t оклад");
        for(Sotrudnik s : sotr){
            System.out.print(s.fam+ "\t"+s.im + "\t"+s.otch + "\t\t"+s.doljnost + "\t"+s.oklad + "\n");
        }
    }
    }