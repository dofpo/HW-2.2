public class Main {
    public static void main(String[] args) {
        int balance = 100;//начальная сумма на счету клиента
        int refill = 100;//сумма пополнения счета
        if (refill >= 1000) {
            int bonus = (refill / 100) + refill;
            System.out.println("Количество начисленных баллов =" + " " + (bonus - refill) + " " + "рублей");
            System.out.println("Итоговая сумма=" + " " + (bonus + balance) + " " + "рублей");
        } else {
            System.out.println("Количество начисленных баллов =" + " " + 0 + " " + "рублей");
            System.out.println("Итоговая сумма=" + " " + (balance + refill) + " " + "рублей");
        }
    }
}
