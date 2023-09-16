package tasks;

/***
 Нужно исправить пример, так чтобы метод не выбрасывал ошибку

 */
public class Task2 {
    public static void assertConditionB() {
        int x = -1;
        assert x <= 0 : "Число должно быть отрицательным";
    }

    public static void main(String[] args) {
assertConditionB();
    }
}
