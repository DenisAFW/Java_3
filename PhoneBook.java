import java.util.*;

// 3.* Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
//  В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер телефона по фамилии.
//  Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
// Желательно как можно меньше добавлять своего, чего нет в задании (т.е. не надо в телефонную запись добавлять еще дополнительные поля (имя, отчество, адрес), 
// делать взаимодействие с пользователем через консоль и т.д.). Консоль желательно не использовать (в том числе Scanner),
//  тестировать просто из метода main() прописывая add() и get().

// public class PhoneBook {

// public void add(String number, String name) {
// TODO: 21.11.2022 Реализовать
// }

// public List<String> get(String name) {
// TODO: 21.11.2022 Реализовать получение всех номеров по фамилии
// return null;
// }

// }

//   public static void main(String[] args) {
// PhoneBook phoneBook = new PhoneBook();
// phoneBook.add("John", "33344");
// phoneBook.add("Peter", "344");
// phoneBook.add("Philipp", "344");
// phoneBook.add("Philipp", "122");

// List<String> strings = phoneBook.get("Philipp");
// System.out.println(strings);
// }


public class PhoneBook {
  
    private Map<String, List<String>> map = new HashMap<>();
  
    public void add(String name, String number) {
      List<String> numbers;
      if (map.containsKey(name)) {
        numbers = map.get(name);
      } else {
        numbers = new ArrayList<>();
      }
      numbers.add(number);
      map.put(name, numbers);
    }
  
    public List<String> get(String name) {
      return map.get(name);
    }
  
  }
  