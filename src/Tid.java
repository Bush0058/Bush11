public class Tid {
 public static void main(String[] args) {
    int sekunder = 0;
    int timer= 17;
    int minutter= 37;


     System.out.println("Timer: " + timer);
     System.out.println("Minutter: " + minutter);
     System.out.println("sekunder: " +sekunder);

     int sekunderSidemMidnat= (timer *60 *60) + (minutter *60)+(sekunder);

     System.out.println("“Siden midnat er der gået" + sekunderSidemMidnat+"sekunde");

     int sekunderTilbageAfDagen=(63420-sekunderSidemMidnat);
     System.out.println("sekunder tilbage  af dagen" +sekunderTilbageAfDagen + "Sekunder");

     int sekunderNu = 16;
     int timerNu = 18;
     int Minutter= 19;





}
 }
