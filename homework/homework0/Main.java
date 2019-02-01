// Объявляем публичный класс Main, который будет содержать метод main()
public class Main {

  /* Метод main(), с помощью которого мы запускаем программу
     В качестве аргумента метод main() принимает массив объектов класса String
     Метод обязательно должен возвращать void (т.е. ничего).
     Кроме того, он является публичным (public) и статическим (static).
     Это означает, что мы можем использовать данный метод из других классов,
     а также, для того, чтобы его использовать, не нужен объект класса Main
   */
  public static void main(String[] args) {
    // Объявляю переменную myMultiplier класса Multiplier
    // и сразу же присваиваем ей значение new Multiplier()
    Multiplier myMultiplier = new Multiplier();

    // Объявляем переменную result типа int
    // В этой переменной мы будем хранить результат работы нашего умножителя
    int result;

    myMultiplier.setFirstNumber(2); // Устанавливаем значение ПЕРВОГО множителя равным 2
    myMultiplier.setSecondNumber(2); // Устанавливаем значение ВТОРОГО множителя равным 2
    result = myMultiplier.multiply(); // Присваиваем переменной result значение, возвращаемое методом multiply()
    System.out.println("2 * 2 = " + result); // Выводим результат работы метода multiply() в консоль. 2 * 2 = 4

    myMultiplier.setFirstNumber(1);
    myMultiplier.setSecondNumber(-1);
    result = myMultiplier.multiply();
    System.out.println("1 * (-1) = " + result); // 1 * (-1) = -1

    myMultiplier.setFirstNumber(3);
    myMultiplier.setSecondNumber(3);
    result = myMultiplier.multiply();
    System.out.println("3 * 3 = 9" + result); // 3 * 3 = 9

    /* Устанавливаем значение ПЕРВОГО множителя равным 2.000.000.000
       Заметьте, что для читаемости мы использовали '_' в написании числа
       Для читаемости в Java в числах можно ставить знак '_'.
       Например можно написать 1000000, а можно 1_000_000
       По написанию числа разные, но их значение одинаковы
    */
    myMultiplier.setFirstNumber(2_000_000_000);
    myMultiplier.setSecondNumber(2);
    result = myMultiplier.multiply();
    System.out.println("2.000.000.000 * 2 = " + result); // 2_000_000_000 * 2 = ? :)
  }
}