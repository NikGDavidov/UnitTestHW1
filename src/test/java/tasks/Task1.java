package tasks;

/***
 * Задание: Используйте ключевое слово assert для проверки
 *         вашего предположения в коде. Если утверждение не выполняется,
 *         программа сгенерирует AssertionError. Сможете ли вы исправить
 *         утверждение в этом коде, чтобы оно стало верным?
 */
public class Task1 {
    public static void main(String[] args) {
        assertConditionA();
    }
public static void assertConditionA() {

    String[] weekends = {"Суббота", "Воскресенье"};
    String msg =  String.format("В неделе должно быть %d дня выходных",weekends.length);
    assert weekends.length == 2 : msg;
    System.out.println("В неделе " + weekends.length + " дня выходных");
}

}