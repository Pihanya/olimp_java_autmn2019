/**
 * Данный класс занимается умножением двух чисел
 */
public class Multiplier implements IMultiplier{

  // Свойства умножителя
  private int firstNumber; // Первый множитель
  private int secondNumber; // Второй множитель

  // Пустой конструктор
  public Multiplier() {
  }

  // === Методы класса ===

  // Сеттер для первого множителя
  public void setFirstNumber(int number) {
    firstNumber = number;
  }


  // Сеттер для второго множителя
  public void setSecondNumber(int number) {
    secondNumber = number;
  }

  // Метод возвращающий результат умножения
  public int multiply() {
    return firstNumber * secondNumber;
  }
}