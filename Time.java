public class Time
{
  // TODO: Part A - put your attributes here
  private int hours; // remember all attributes are private
  private int minutes;
  private int seconds;


  // TODO: Part B - create your non-default constructor
  /**
  * Precondition: The number of hours is between 0 and 23 inclusive.
  * The number of minutes and seconds is between 0 and 59 inclusive.
  */
  public Time(int iHours, int iMinutes, int iSeconds)
  {
    this.hours = iHours;
    this.minutes = iMinutes;
    this.seconds - iSeconds;
  }


  // TODO: Part C - create your default constructor
  public Time()
  {
    this(0,0,0);
  }


  // TODO: Part D - complete the documentation for the pad method
  /**
  * Description: Returns the input value as a 2-digit format
  * Precondition: The value is greater than 0.
  */
  private String pad(int value)
  {
    String output = "";
    if (value < 10)
    {
      return output + "0" + value;
    }
    return output + value;
  }

  // TODO: Part E - complete the toString method; use the pad method as part of your solution
  public String toString()
  { 
    //return Time (pad(2),pad(3),pad(4));
    return pad(hours) + ":" + pad(minutes) + ":" + pad(seconds);
  }

  // TODO: Part F - write the tick method
  public void tick()
  {
    if (seconds == 60)
    {
      seconds = 0;
      minutes ++;
    }
    
    if (minutes == 60)
    {
      minutes = 0; 
      hours ++;
    }

    if (hours == 24)
    {
      hours = 0;
    }

  }

  // TODO: Part G - write the add method
  /**
  * Precondition: The variable offset is non-null
  */
  public void add(Time offset)
  {
    seconds = seconds + offset.seconds;
    minutes = minutes + offset.minutes + seconds/60;
    hours = hours + offset.hours + minutes/60;

    seconds = seconds % 60;
    minutes = minutes % 60;
    hours = hours % 24;

  }
}
