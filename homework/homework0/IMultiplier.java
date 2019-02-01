
public interface IMultiplier {

  /**
   * Установить значение первого множителя
   *
   * @param number первый множитель
   */
  void setFirstNumber(int number);

  /**
   * Установить значение второго множителя
   *
   * @param number второй множитель
   */
  void setSecondNumber(int number);

  /**
   * Получить результат умножения
   *
   * @return результат умножения
   */
  int multiply();
}
