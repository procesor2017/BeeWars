import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Character {
    public int hp = 100, mana = 100, gold = 100, soldier = 50, createMana = 1, createSoldier = 1, createGold = 1;

    public void getResource(String[] s){
        // get string from CardDeck.useCardFromFinalDeck();
        // in format {id,name,hp,mana,gold,soldier,createMana,createSoldier,createGold}
        String[] a = Arrays.copyOfRange(s, 2,9);
        int[] intResource = Arrays.stream(a).mapToInt(Integer::parseInt).toArray();
        hp += intResource[0];
        mana += intResource[1];
        gold += intResource[2];
        soldier += intResource[3];
        createMana += intResource[4];
        createSoldier += intResource[5];
        createGold += intResource[6];
    }

    public void lostResource(String[] s){
        // get string from CardDeck.useCardFromFinalDeck();
        // in format {id,name,hp,mana,gold,soldier,createMana,createSoldier,createGold}
        // but u want from 9 to 12 {takeHealth,takeMana,takeGold,takeSoldier}
        String[] a = Arrays.copyOfRange(s, 9,13);
        int[] intTakeResource = Arrays.stream(a).mapToInt(Integer::parseInt).toArray();
        hp -= intTakeResource[0];
        mana -= intTakeResource[1];
        gold -= intTakeResource[2];
        soldier -= intTakeResource[3];
    }
}
