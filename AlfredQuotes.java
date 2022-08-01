import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return String.format ("Hello how are you, " + name);
    }
    
    public String dateAnnouncement() {
        Date todaysDate= new Date ();
        return String.format("Todays date is currently %s", new Date());
    }
    
    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alfred") > 0){
        return "Alexis is listening to us";
    }
        if (conversation.indexOf("GoogleHome") > 0){
        return "I prefer Alfred over Alexis";
        }
        return "I'm not a fan of if statements in Java";
    }
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}
