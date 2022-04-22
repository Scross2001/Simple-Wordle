import java.util.*;


public class Wordle{

  //Fixed array list of words((Use import function to get a files 5 letter words))
  public String[] possWords = new String[]{"TESTY","JIFFS","WORDS","JEFFS","WHIZZ","JOCKO","KOPJE","FEZZY"};
  public String word;
  public Boolean correct;
  public int guesses = 6;
  public Wordle(){
    word = "";
    correct = false;
    //this.newGame();
  }
  public void newGame(){
    Random rand = new Random();
    int number = rand.nextInt(possWords.length);
    this.word = possWords[number];
    guesses = 6;
  }

  public void guess(String gues){
    String correctness = "";
    String guessedWord = "";
    for(int i = 0;i < 5;i++){
      String guessLetter = gues.substring(i,i+1);
      String correctWord = this.word.substring(i,i+1);
      if(this.word.equals(gues)){
        System.out.println("YOU GOT IT!!");
        this.correct = true;
        break;
      }
      else if(correctWord.equals(guessLetter)){
        correctness+="[O]";
        guessedWord+= "["+guessLetter+"]";
      }
      else if(this.word.contains(guessLetter)){
        correctness+="[!]";
        guessedWord+= "["+guessLetter+"]";
      }
      else{
        correctness+="[X]";
        guessedWord+= "["+guessLetter+"]";
      }
    }
    System.out.println(guessedWord);
    System.out.println(correctness);
  }
  public void play(){
    Scanner sc = new Scanner(System.in);
    this.newGame();
    while(this.correct != true){
      System.out.print("What is your Guess?(Type END to give up) : ");
      String guessing = sc.nextLine();
      if(guessing.equals("END")){
        System.out.println("The word was: " + this.word);
        break;
      }
      else if(guessing.length()!=5){
        continue;
      }
      this.guess(guessing.toUpperCase());
    }
  }

  public static void main(String args[]){
    Wordle test = new Wordle();
    test.play();
  }
}
