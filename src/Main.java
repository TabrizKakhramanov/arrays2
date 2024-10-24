import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //task1
        int[] arr1 = new int[]{12000, 3500, 6700, 9900, 1200};
        int summaryWaste = 0;
        for (int i:arr1){
            summaryWaste+=i;
        }
        System.out.println("Сумма трат за месяц составила "+summaryWaste+" рублей");

        //task2
        int[] arr2 = new int[]{7500, 6600, 3400, 8900 ,500};
        int minWaste = Integer.MAX_VALUE;
        int maxWaste = Integer.MIN_VALUE;

        for (int i:arr2) {
            if (i<minWaste) { minWaste=i; }
            if (i>maxWaste) { maxWaste=i; }
        }
        System.out.println("Минимальная сумма трат за неделю составила "+minWaste+" рублей. Максимальная сумма трат за неделю составила "+maxWaste+" рублей");

        //task3
        int[] arr3 = new int[]{3400, 16600, 4400, 7850, 780};
        double averageWaste = 0.0;
        summaryWaste = 0;
        for (int i:arr3){
            summaryWaste+=i;
        }
        averageWaste = summaryWaste/arr3.length;
        System.out.println("Средняя сумма трат за месяц составила "+averageWaste+" рублей");

        //task4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length/2; i++) {
            char element = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length-i-1];
            reverseFullName[reverseFullName.length-i-1]=element;
        }
        System.out.println(Arrays.toString(reverseFullName));







    }
}