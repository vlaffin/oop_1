package oop_1.hw3;

public class RuGame extends AbstractGame{

    @Override
    List<String> generateCharList() {
        List<String> result = new ArrayList<>();
        for (char i = 'а'; i <= 'я' ; i++){
            result.add(String.valueOf(i));
        }
        return result;
    }
}