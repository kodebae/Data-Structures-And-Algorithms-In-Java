import java.util.HashMap;
import java.util.Map;

// This program is an English to German dictionary created in Java utilizing the abstract Class "Dictionary" using a HashMap

public class dictionary {
    public static void main(String[] args) {
        // English to German Dictionary
        Map<String,String> englishToGermanDictionary = new HashMap<String,String>(); // creating a dictionary and setting both keys and values to String, could use any data type here.
        englishToGermanDictionary.put("I'd like to practice German.", "Ich mochte Deutsch uben."); // adding English to German Strings to the dictioonary
        englishToGermanDictionary.put("Could you repeat that?", "Konnten Sie das bitte wiederholen?");
        englishToGermanDictionary.put("Do you speak English?", "Sprechen Sie English?");
        englishToGermanDictionary.put("Where is the bus stop?", "Wo ist die Bushaltestelle?");
        englishToGermanDictionary.put("How much is this?", "Wie viel kostet das?");
        englishToGermanDictionary.put("Can I try this on?", "Kann ich es anprobieren?");
        englishToGermanDictionary.put("Could you take a photo of me?", "Konnten Sie ein Foto von mir machen?");
        englishToGermanDictionary.put("My name is ...", "Mine Name ist...");
        englishToGermanDictionary.put("Nice to meet you.", "Angenehm.");
    }
}