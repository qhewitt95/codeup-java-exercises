import java.util.Random;

public class ServerNameGenerator {


        public static String[] adjectives ={"happy","hot", "sad", "silly","yell","big","emotional", "whimsical", "wet","stinky"};
        public static String[] nouns = {"ikea kitchen set","ikea table","ikea marble counter top","20 piece ballset","42inch television"," 400lb bear","20lb monkey","dry tongue","dryscalp","black smoke"};

    public static void main(String[] args) {
        System.out.println("here is your server name");
        System.out.println(getWord(adjectives) + "-" + getWord(nouns));
    }
        public static String getWord(String[] choices) {
            Random random = new Random();
            int randomNumber = random.nextInt(choices.length);
            return choices[randomNumber];
        }

    }

