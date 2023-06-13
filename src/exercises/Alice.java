package exercises;


import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        //created 1st instance
        Alice myFirstAlice = new Alice();
        String searchTerm = myFirstAlice.getUserSearchTerm();

       Boolean myReturn = myFirstAlice.searchAliceQuote(searchTerm);
        System.out.println("The result is: " + myReturn.toString()); //why not boolean & !.toString?

        //myFirstAlice.myFirstMethod();
    }
    /*
    // class variables (property)
    private String myFirstClassVariable = "This is a string";
    // build constructor
    public Alice(){
    }
    // build method
    public void myFirstMethod() {
        System.out.println("Hello World");
    }*/
    public String getUserSearchTerm(){
        Scanner scanner = new Scanner(System.in);
        String searchTerm1 = scanner.nextLine();
        //scanner.close();
        return searchTerm1;

    }

    public boolean searchAliceQuote(String theSearchTerm){
        //variables
        String theQuote ="Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?";
        //String theSearchTerm ="";

        boolean result = theQuote.toLowerCase().contains(theSearchTerm.toLowerCase()); //why return boolean result doesn't work?;
        return result;

    }


}
