package game.competition.strategy.qualifiedStrategy;

import game.competition.*;
import game.competition.strategy.generatesGroupStrategy.MinGroupStrategy;
import game.competitor.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;
import static org.junit.Assert.*;

public abstract class QualifiedByGroupStrategyTest {

    private static final String[] listOfNames = {"Nawfel","Romain","bin","ome","a","b","c","d","e","f","g","h","i","j","k","l"};
    protected Master master;
    protected List<Competitor> competitors;

    @Before
    public void init(){
        competitors = new ArrayList<>();
        for (int i = 0; i < listOfNames.length; i++) {
            competitors.add(new Competitor(listOfNames[i]));
        }

        master = new Master(competitors);
    }

    @Test
    public abstract void getTest();
    
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(game.competition.strategy.qualifiedStrategy.QualifiedByGroupStrategyTest.class);
    }
}