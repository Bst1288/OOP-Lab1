public class Pro1_64010842 {
    public static void main(String[] args) 
    {
       double birthRate = 7.0;
       double deathRate = 13.0;
       double immigrantRate = 45.0;
       double population = 312032486;
       int allTime = 60*60*24*365;

       double numOfBirth = allTime/birthRate;
       double numOfDeath = allTime/deathRate;
       double numOfImmigran = allTime/immigrantRate;

       for (int i=1;i<=5;i++)
       {
           population = population + numOfBirth - numOfDeath + numOfImmigran;
           System.out.println("Year  "+i+"  :  "+(int)population);
       }
    }  
}
