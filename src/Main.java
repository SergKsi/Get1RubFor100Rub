import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int sumRubStart = 100; //  остаток на счете клиента
        int sumRubAdd = 1200; // сумма пополнения счета клиента
        int sum1RubBonus = 100; // бонус = 1 руб за 100 руб пополнения
        int sumBonus = 0; // кол-во бонусов
        int countBonus = 1000; // сумма остатка после которой начисляются бонусы
        int sumRubFinish = sumRubStart; //  остаток c учетом пополнения счета клиента

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        sumRubFinish = sumRubStart + sumRubAdd; // новый остаток с учетом суммы пополнений

        if (sumRubAdd > countBonus) {
            sumBonus = sumRubAdd / sum1RubBonus;
        }
        sumRubFinish += sumBonus;
        System.out.println("Итоговый счет: " + sumRubFinish);
        System.out.println("Количество бонусных рублей: " + sumBonus);
    }

}
