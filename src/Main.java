//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.}
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        {
            //Задача 1

            System.out.println("Ответ 1, собака" + dog);
            System.out.println("Ответ 2, кошка" + cat);
            System.out.println("Ответ 3, бумага" + paper);

        }

        {
            //Задача 2

            dog=dog + 4;
            cat=cat + 4;
            paper=paper + 4;
            System.out.println("Ответ 2, собака" + dog);
            System.out.println("Ответ 2, кошка" + cat);
            System.out.println("Ответ 2, бумага" + paper);
        }

        {

            //Задача 3

            dog=dog - 3.5;
            cat=cat - 1.6;
            paper=paper - 7639;
            System.out.println("Ответ 3, собака" + dog);
            System.out.println("Ответ 3, кошка" + cat);
            System.out.println("Ответ 3, бумага" + paper);
        }

        {

            //Задача 4

            var friend= 19;
            System.out.println("Задача 4" + friend);
            friend=friend + 2;
            System.out.println("Задача 4, прибавление" + friend);
            friend=friend / 7;
            System.out.println("Задача 4, деление" + friend);

        }

        {
            //Задача 5

            var frog= 3.5;
            System.out.println("Задача 5" + frog);
            frog=frog * 10;
            System.out.println("Задача 5, умножение" + frog);
            frog=frog / 3.5;
            System.out.println("Задача 5,деление" + frog);
            frog=frog + 4;
            System.out.println("Задача 5, сложение" + frog);
        }

        {

            //Задача 6

            var weightBoxer1=78.2;
            var weightBoxer2=82.7;
            System.out.println("Сумма массы обоих боксеров" + (weightBoxer1+weightBoxer2));



            //Задача 7
            var weightDif= weightBoxer2 % weightBoxer1;
            System.out.println("Разница в весе" + weightDif);

        }

        {

            //Задача 8

            var hours=640;
            var peopleHours=8;
            var staff=hours / peopleHours;
            System.out.println("Всего работает" + staff + "человек в компании");
            var staffIncrease=staff + 94;
            var staffIncreaseHours=hours / staffIncrease;
            System.out.println("Если в компании работает" + staffIncrease + "человек, то всего" + staffIncreaseHours + "часов работы может быть поделено между сотрудниками");

        }
    }
}