import java.util.*;


public class GameMaker{

  public static void Games(int games){
    int i = games;
    while(i != 0){
      System.out.println("------------Starting New Game----------");
      Wordle game1 = new Wordle();
      game1.play();
      i--;
    }
  }

  public static void main(String args[]){
    GameMaker test = new GameMaker();
    Scanner sc = new Scanner(System.in);
    System.out.print("How Many Games?: ");
    Integer amountOfGames = Integer.parseInt(sc.nextLine());
    //Integer trials = Integer.parseInt(amountOfGames);
    Games(amountOfGames);
  }
}
