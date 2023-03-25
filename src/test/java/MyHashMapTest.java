import org.hashMap.MyHashMap;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MyHashMapTest {
    @Test
    public void give_ASentence_When_Words_Are_Added_ToList_ShouldReturn_WordFrequency(){
        String sentence="To be or not to be";
        MyHashMap<String,Integer> myHashMap=new MyHashMap<>();
        String[] words=sentence.toLowerCase().split(" ");
        for (String word:words){
            Integer value= myHashMap.get(word);
            value=(value==null)?1:value+1;
            myHashMap.add(word,value);
        }
        int freq=myHashMap.get("to");
        System.out.println(myHashMap);
        Assert.assertEquals(2,freq);
    }
}
