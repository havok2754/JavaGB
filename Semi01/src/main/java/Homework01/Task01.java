package Homework01;

class Answer {
    public int countNTriangle(int n){
        // Введите свое решение ниже
        int faktor = 0;
        for (int i = 1; i <= n ; i++) {
            faktor = faktor + i;
        }
        return faktor;

    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Task01{
    public static void main(String[] args) {
        int n = 0;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            n = 5;
        }
        else{
            n = Integer.parseInt(args[0]);
        }

        // Вывод результата на экран
        Answer ans = new Answer();
        int itresume_res = ans.countNTriangle(n);
        System.out.println(itresume_res);
    }
}