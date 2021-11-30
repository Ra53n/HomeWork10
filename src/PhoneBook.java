import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PhoneBook {
    private static HashMap<String, Set<Integer>> phoneBook= new HashMap<>();
    static {
        phoneBook.put("Иванов", Set.of(1234567,7567565,7578987));
        phoneBook.put("Петров", Set.of(4567894,9159575,7565775,9159578));
        phoneBook.put("Соболев", Set.of(7895456,9519576));
        phoneBook.put("Розенбаум", Set.of(9515975));
    }

    public void add(String name, Integer number){
        try{
            Set<Integer> tempSet = null;
            if(phoneBook.get(name)!=null){
                tempSet = new HashSet<>(phoneBook.get(name));
            }else {
                tempSet = new HashSet<>();
            }
            tempSet.add(number);
            phoneBook.put(name,tempSet);
        }catch (NullPointerException e){
            System.out.println("Данный номер уже существует!");
        }

    }

    public void getPhone(String name){
        try{
            Set<Integer> tempSet = phoneBook.get(name);
            System.out.print("Номера телефонов по фамилии " + name + ": ");
            for(Integer number : tempSet){
                System.out.print(number + " ");
            }
            System.out.println();
        }catch (NullPointerException e){
            System.out.println(" В телефонной книге нет номеров по данной фамилии!");
        }

    }

}
