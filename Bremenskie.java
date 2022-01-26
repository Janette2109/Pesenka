public class Bremenskie {
    public static void main(String[] args) {
        String[] array = new String[12];
        array[0] = "Ничего на свете лучше нету";
        array[1] = "Чем бродить друзьям по белу свету";
        array[2] = "Тем, кто дружен, не страшны тревоги";
        array[3] = "Нам любые дороги дороги";
        array[4] = "Наш ковер — цветочная поляна";
        array[5] = "Наши стены — сосны великаны";
        array[6] = "Наша крыша — небо голубое";
        array[7] = "Наше счастье — жить такой судьбою";
        array[8] = "Мы свое призванье не забудем";
        array[9] = "Смех и радость мы приносим людям";
        array[10] = "Нам дворцов заманчивые своды";
        array[11] = "Не заменят никогда свободы";
        System.out.println("Привет! Давай споем вместе детскую песню из известного мультфильма. Я начну, а ты продолжай");
        System.out.println("Начнем? (Да - для того, чтобы продолжить. Нет - чтобы не начинать.");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String s = sc.nextLine();
        String Otvet = "Да"; // образец ответа на запуск игры
        int i=0; // счетчик строк
        int k=0; // счетчик количества ошибок
        if (Otvet.equals(s)) {
            while (i < array.length && k < 3) {
                System.out.println(array[i]);
                System.out.println("Введите следующую строку из песни:");
                String s1 = sc.nextLine();
                if (array[i+1].equals(s1)) {
                    i+=2;
                } else {
                    System.out.println("Неверно.");
                    k+=1;
                }
            }
            if(k==3){
                System.out.println("Попытки исчерпаны.");
            }
            else {
                System.out.println("Наша песенка спета!");
            }
        } else {
            System.out.println("Ок, в другой раз. Всего хорошего.");
        }
    }
}

