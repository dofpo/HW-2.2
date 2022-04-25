public class Main
{
    public static void main(String[] args)
    {
     int a=100;//начальная сумма на счету клиента
     int b=100;//сумма пополнения счета
     if (b>=1000)
     {
         int c=(b/100)+b;
         System.out.println("Количество начисленных баллов ="+" "+(c-b)+" "+"рублей");
         System.out.println("Итоговая сумма="+" "+(c+a)+" "+"рублей");
     }
     else
     {
         System.out.println("Количество начисленных баллов =" + " "+0+" "+"рублей");
         System.out.println("Итоговая сумма=" + " " +(a + b)+" "+"рублей");
     }
    }
}
