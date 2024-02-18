class Answer {
    public void printPrimeNums(){
        for(int i = 1; i < 1000; ++i){
            int count = 0;
            for(int j = 2; j <=i && count < 2;++j){
                if(i%j==0){
                    ++count;
                }
            }
            if(count<2)
                System.out.println(i);
        }
        }
        // Напишите свое решение ниже

    }

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Task02 {
    public static void main(String[] args) {

        Answer ans = new Answer();
        ans.printPrimeNums();
    }
}