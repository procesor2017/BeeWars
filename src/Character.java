import java.util.Arrays;

public class Character {
    public int hp = 100, mana = 0, gold = 0, soldier = 0, createMana = 1, createSoldier = 1, createGold = 1;

    public int getResource(String[] s){
        // get string from CardDeck.useCardFromFinalDeck();
        // in format {id,name,hp,mana,gold,soldier,createMana,createSoldier,createGold}

        int[] intResource = Arrays.stream(s).mapToInt(Integer::parseInt).toArray();
        hp += intResource[2];
        mana += intResource[3];
        gold += intResource[4];
        soldier += intResource[5];
        createMana += intResource[6];
        createSoldier += intResource[7];
        createGold += intResource[8];

        return 1;
    }


    public int characterDef(int damage){
        hp = hp - damage;
        return hp;
    }
}
