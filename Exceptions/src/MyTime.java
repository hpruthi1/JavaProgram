public class MyTime {
   
   private int second;  // [0, 59]
   private int minute;  // [0, 59]
   private int hour;    // [0, 23]

   public void setSecond(int second) {
      if (second >=0 && second <= 59) {
         this.second = second;
      } else {
         throw new IllegalArgumentException("Invalid second!");
      }
   }
   public void setMinute(int minute) {
      if (minute >=0 && minute <= 59) {
         this.minute = minute;
      } else {
         throw new IllegalArgumentException("Invalid minute!");
      }
   }
   public void setHour(int hour) throws IllegalArgumentException{
      if (hour >=0 && hour <= 23) {
         this.hour = hour;
      } else {
         throw new IllegalArgumentException("Invalid hour!");
      }
   }}