import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    List<List<String>> cardFinalDeck = new ArrayList<>();

    public void addCard(String s){
        try {
            BufferedReader csvReader = new BufferedReader(new FileReader("./src/card.csv"));
            String row;
            while ((row = csvReader.readLine()) != null){
                String[] data = row.split(",");
                if (data[0].equals(s)){
                    List<String> list = new ArrayList<>();

                    for (int i = 0; data.length > i; i++){
                        list.add(data[i]);
                    }
                    cardFinalDeck.add(list);
                }
            }
            csvReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String[] useCardFromFinalDeck(String s) {
        for (int i = 0; i < cardFinalDeck.size(); i++) {
            String[] cardId = cardFinalDeck.get(i).toArray(new String[0]);
            if (cardId[0].equals(s)){
                cardFinalDeck.remove(i);
                return cardId;
            }
        }
        String[] f = {"false"};
        return f;
    }
}
