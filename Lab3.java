public class Lab3
{
    public static void testLightCandles1()
    {
        Robot.load("candles1.txt");
        Robot.setDelay(0.05);
        lightCandles();
    }

    public static void testLightCandles2()
    {
        Robot.load("candles2.txt");
        Robot.setDelay(0.05);
        lightCandles();
    }

    public static void lightCandles()
    {
        light1Candle();
        light1Candle();
        light1Candle();
        light1Candle();
        light1Candle();
        light1Candle();
        light1Candle();
        light1Candle();
        light1Candle();
        light1Candle();
    }
    //pre robot is on first column, candles are not lit
    //post robot is on last column of tiles, candles are lit
        public static void turnRight()
        {
            Robot.turnLeft();
            Robot.turnLeft();
            Robot.turnLeft();

        }
        //pre Robot is facing random direction, not the direstion wanted
        //post Robot has turned right by turning left three times, is facing correct direction
        public static void light1Candle()
        {
           Robot.turnLeft();
            Robot.move();
            turnRight();
            if (!Robot.frontIsClear())
            { Robot.turnLeft();
              Robot.move();
              turnRight();
            }
            Robot.move();
            Robot.makeDark();
            Robot.move();
            turnRight();
            Robot.move();
            if (Robot.frontIsClear())
            { Robot.move();
              
            }
            Robot.turnLeft();
        }
        //pre robot is in front of candle, facing forawrd, it is not lit
        //post robot is behind cnalge, facin forward, it is lit

        //Run this method to test completeRoom on map room1.txt
        public static void testCompleteRoom1()
        {
            Robot.load("room1.txt");
            Robot.setDelay(0.05);
            completeRoom();
        }

        //Run this method to test completeRoom on map room2.txt
        public static void testCompleteRoom2()
        {
            Robot.load("room2.txt");
            Robot.setDelay(0.05);
            completeRoom();
        }

        //Complete this method.  You will need to write additional helper methods.
        public static void completeRoom()
        {
            Robot.setDelay(.5);
            roomRow();
            turnRight();
            roomRow();
            turnRight();
            roomRow();
            turnRight();
            roomRow();

  
        }
        //pre robot is facing forward in a room with walls full of holes
        //post robot is in the same location as beginning with all the walls filled with dark spots instead
            public static void turnAround()
            { Robot.turnLeft();
              Robot.turnLeft();
            }
            //pre robot is facing opposite direction of wanted movement
            //post robot is facing the correct direction and can now be moved correctly
            public static void oneBrick()
            { Robot.turnLeft();
              if (Robot.frontIsClear())
              { 
                  Robot.move();
                  if (!Robot.onDark())
                  { Robot.makeDark();
                    }
                turnAround();
                Robot.move();
                turnAround();
                }
              turnRight();
            }
            //pre robot is next to a tile with an unknown value, brick, dark or light
            //post robot is still next to tile but now no matter what it began as the wall is now not empty
            public static void roomRow()
            { oneBrick();
              Robot.move();
              oneBrick();
              Robot.move();
              oneBrick();
              Robot.move();
              oneBrick();
              Robot.move();
              oneBrick();
             
            }
            //pre robot is at the begnning of a row that may have several gaps in it
            //post robot is at the end of a row that is now completely filled in

        //Run this method to test swapAll on map swap1.txt
        public static void testSwapAll1()
        {
            Robot.load("swap1.txt");
            Robot.setDelay(0.05);
            swapAll();
        }

        //Run this method to test swapAll on map swap2.txt
        public static void testSwapAll2()
        {
            Robot.load("swap2.txt");
            Robot.setDelay(0.05);
            swapAll();
        }

        //Complete this method.  You will need to write additional helper methods.
        public static void swapAll()
        {
            oneSwap();
            Robot.move();
            oneSwap();
            Robot.move();
            oneSwap();
            Robot.move();
            oneSwap();
            Robot.move();
            oneSwap();
            Robot.move();
            oneSwap();
            Robot.move();
            oneSwap();
            Robot.move();
            oneSwap();
            Robot.move();
            oneSwap();
            Robot.move();
            oneSwap();
            
            

  
        }
            //pre robot in at begining of hall way with all dark spots at orgianlly position
            //post robot is at end of hall way with all dark spots flipped position
        
            public static void oneSwap()
            {   turnRight();
                Robot.move();
                if (!Robot.onDark())
                  { turnAround();
                    Robot.move();
                    Robot.move();
                    if (!Robot.onDark())
                    {turnAround();
                     Robot.move();
                     Robot.turnLeft();
                    }
                    else
                    { Robot.makeLight();
                      turnAround();
                      Robot.move();
                      Robot.move();
                      Robot.makeDark();
                      turnAround();
                      Robot.move();
                      turnRight();
                    }
                    }
                else
                { turnAround();
                  Robot.move();
                  Robot.move();
                  if(Robot.onDark())
                  { turnAround();
                    Robot.move();
                    Robot.turnLeft();
                    }
                  else
                  {Robot.makeDark();
                    turnAround();
                    Robot.move();
                    Robot.move();
                    Robot.makeLight();
                    turnAround();
                    Robot.move();
                    turnRight();
                    }
                  
                }
                
                
            }
            //pre robot is on a row of tiles that need to be flipped positions
            //post robot is on same row of tiles but the colors are flipped

        //Don't run these. I will!
        public static void testLightCandles3()
        {
            Robot.load("candles3.txt");
            Robot.setDelay(0.05);
            lightCandles();
        }

        public static void testLightCandles4()
        {
            Robot.load("candles4.txt");
            Robot.setDelay(0.05);
            lightCandles();
        }
        public static void testCompleteRoom3()
        {
            Robot.load("room3.txt");
            Robot.setDelay(0.05);
            completeRoom();
        }

        public static void testCompleteRoom4()
  {
    Robot.load("room4.txt");
    Robot.setDelay(0.05);
    completeRoom();
  }

  public static void testSwapAll3()
  {
    Robot.load("swap3.txt");
    Robot.setDelay(0.05);
    swapAll();
  }

  //Run this method to test swapAll on map swap2.txt
  public static void testSwapAll4()
  {
    Robot.load("swap4.txt");
    Robot.setDelay(0.05);
    swapAll();
  }
}
