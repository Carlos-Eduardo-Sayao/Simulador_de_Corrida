# Java Racing Simulator

This is a Java project that simulates a race between two cars directly in the console.  
In each round, the cars move forward by a random distance until one of them (or both) reach the finish line.

---

## Description:

The program uses the `Random` class to generate random advances (between 1 and 3 units) for each car.  
The race is displayed in the console, with each car represented by the `#` symbol, moving forward at each iteration.

At the end, the program announces the winner or if there was a tie.

---

## How it works:

1. Two cars (`carro1` and `carro2`) are created with an initial distance equal to 0.  
2. A finish line limit (`distanciaMaxima`) is defined — in this case, **28 units**.  
3. In each loop:
   - Each car moves forward by a random distance between **1 and 3 units**.
   - The progress is printed in the console.
4. When one of the cars exceeds the maximum distance, the race ends.  
5. The program displays the result:
   - **"Carro 1 won"**
   - **"Carro 2 won"**
   - or **"Carro 1 and Carro 2 tied"**
