import java.util.*;

public class Main {
    public static void main(String[] args) {
        //1 Задание
        String[] stringArray = new String[]{
                "Hello", "world", "I",
                "need","some","random",
                "words","to","fill",
                "this","array","Hello",
                "world","Hello","array"};
        for(String word : stringArray){
            System.out.print(word + " ");
        }
        System.out.println();
        uniqueWords(stringArray);
        //2 Задание
        System.out.println();
        PhoneBook pb = new PhoneBook();
        pb.getPhone("Петров");
        pb.getPhone("Иванов");
        pb.add("Иванов", 8912457);
        pb.getPhone("Иванов");
        pb.add("Горшков", 9848184);
        pb.getPhone("Горшков");
        pb.add("Иванов", 8912457);
        pb.getPhone("Курочкин");

    }
    public static void uniqueWords(String[] array){
        Set<String> set = new HashSet<String>(List.of(array));
        for(String word : set){
            System.out.print(word + " ");
        }
        System.out.println();
        ArrayList<String> list = new ArrayList<String>(List.of(array));
        HashMap<String,Integer> map = new HashMap<>();
        for (String word : list) {
            map.putIfAbsent(word,Collections.frequency(list,word));
        }
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.println("Word: " + entry.getKey() + " Frequency of word: " + entry.getValue());
        }
    }
}
