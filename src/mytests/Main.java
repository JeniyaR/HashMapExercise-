package mytests;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 * Отчет продаж магазина (вставте данный текст себе IDEA) над методом<p>
 * 1. Создайте HashMap<String, Integer> и добавьте туда список товаров и сумму продаж<p>
 * 2. Вбейте в idea - iter выберите что предложит idea (итерацию по созданному выше HashMap в методе где вы вбили iter). Вывести в консоль результат по каждому товару в терминал<p>
 * 3. Добавье по названию из map новую позицию<p>
 * 4. Модифицируйте по названию из map существующую позицию (прибавление вычитание)<p>
 * 5. Удалите по названию из map позицию<p>
 * 6. Изучите метод Map containsKey("тут ваше значение") почитайте что он возвращает, подумайте где может понадобиться и добавьте<p>
 * *7. Задача на рефакторинг кода. Вынесите всё взаимодействие с этим map в класс SalesReport <p>
 *    Создайте методы в классе SalesReport, которые будут модифицировать Map:<p>
 *        - добавления продажи (находит название товара и прибавляет к имеющемуся либо создает новую позицию)<p>
 *        - вычитание продажи (сделали возврат товара надо вычесть из отчета сумму на которую было продано товаров по данной позиции)<p>
 *        - удаление позиции (например её ошибочно внесли и необходиму удалить эту позицию)<p>
 *        - отчет по продажам (переопределить метод toString которвый выведет позицию и числовое значение)<p>
 *        *- опционально добавье возможность хранения удаленных и вовзратов по позициям товаров в отчет toString <p>
 */

public class Main {
  public static void main(String[] args) {

  }

  public static void test(){};

  public static void printSalesReport () {

    HashMap<String, Integer> hashMap = new HashMap<>();
    hashMap.put("Хлеб", 150);
    hashMap.put("Молоко", 320);
    hashMap.put("Яйца", 210);
    hashMap.put("Сыр", 480);
    hashMap.put("Масло", 190);

    //Добавил позицию
    hashMap.put("Тыква", 367);

    //модифицировал
    hashMap.put("Тыква", hashMap.get("Тыква") + 50);
    hashMap.put("Тыква", hashMap.get("Тыква") - 1);

    //Удалил позицию
    hashMap.remove("Тыква");


    for (Entry<String, Integer> entry : hashMap.entrySet()) {
      System.out.println("Товар: " + entry.getKey()
          + ", Сумма продаж: " + entry.getValue());
    }

    // Проверка containsKey
    boolean hasPumpkin = hashMap.containsKey("Тыква");
    System.out.println("Содержится ли Тыква? " + hasPumpkin);
  }

}