# Frage SWAP-Methode
Warum wird in der swap Methode eine temp Variable benötigt? Was
würde passieren, wenn wir einfach A[i] an A[j] und A[j] an A[i] zuweisen
würden?
# Antwort
Versucht man ohne temporäre Varbiable Werte zu vertauschen, werden beide den gleichen wert haben,
weil bei der erster Zuweisung der alte Wert verloren geht.

# Aufgaben Array 1
Initialisieren Sie ein 2-Dimensionales Integer Array
mit nebenstehender Generation 0 für das Game Of
Life. Die grünen Zellen sollen mit 1 initialisiert
werden, die leeren Zellen mit 0.

Schreiben Sie die Initialisierung mit korrektem Java
Code hin, ohne den new Operator. Die Array-Variable
soll generation heissen. Das oberste grüne Feld
soll mit generation[1][2] angesprochen
werden können.

# Lösung Array 1
int generation[][] = {{0,0,0,0,0}.{0,0,1,0,0},{0,0,1,0,0},{0,0,1,0,0}},{0,0,0,0,0}};

# Aufgaben Array 2
Schreiben Sie eine Methode search, welche in einem unsortierten IntegerArray A nach einem bestimmten Wert w sucht und true zurückgibt, 

wenn der
Wert mindestens 1x vorkommt, sonst false.
Ergänzen Sie dazu folgende Methode mit dem nötigen Java Code. Sorgen Sie
dafür, dass die Suche abgebrochen wird, sobald der Wert gefunden wurde.
boolean search(int[] A, int w)
{
// Ihr Code
}

# Lösung Array 2
```java
// Array A2 Lösung
    private static boolean search(int[] A, int w){
        for (int number: A) {
            if (number == w){
                return true;
            }
        }
        return false;
    }
```    
# Selection Sort
Gegeben ist folgende Sequenz 9,7,8,1,2,3

```java
 private static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++){
            for (int k = i; k < arr.length-1; k++){
                if (arr[i] > arr[k+1]){
                    int t = arr[i];
                    arr[i] = arr[k+1];
                    arr[k+1] = t;
                }
            }
        }
        // Ausgabe
        for (int n: arr ) {
            System.out.print(n);
        }
    }
```    
    
- 9,7,8,1,2,3
- **1**,7,8,9,2,3
- **1**,**2**,8,9,7,3
- **1**,**2**,**3**,9,7,8
- **1**,**2**,**3**,**7**,9,8
- **1**,**2**,**3**,**7**,**8**,9
- fertig

# Insertion Sort
Gegeben ist folgende Sequenz 1,1,2,2,3,3
```java
int behindValue;
        int currentValue;
        for (int i = 0; i < list.length;i++) {
            currentValue = list[i];
            behindValue = i-1;
            // gross..klein
            while (behindValue >= 0 && list[behindValue] < currentValue)
            {
                list[behindValue+1] = list[behindValue];
                behindValue = behindValue - 1;
            }
            list[behindValue + 1] = currentValue;

        }
```
- **1**,1,2,2,3,3
- **1**,**1**,2,2,3,3
- **2**,**1**,**1**,2,3,3
- **2**,**2**,**1**,**1**,3,3
- **3**,**2**,**2**,**1**,**1**,3
- **3**,**3**,**2**,**2**,**1**,**1**
- fertig

# Aufgabe Array-suche für SlectionSort
Gesucht ist ein beliebiges Array mit fünf Int-Werten, wo der Selection
Sort Algorithmus nur genau eine swap Operation ausführen muss, um das
Array aufsteigend zu sortieren.

Bem: Es gibt nicht nur eine Lösung.
Geben Sie analoge eine Sequenz an, wo die ersten zwei Vergleiche ein
swap zur Folge haben, dann aber nicht mehr.

# Lösung Aufgabe Array-suche
```java
// Ein swap
int[] array = {2,1,3,4,5};
```

```java
// Zwei swap
int[] array = {3,2,1,4,5};
```

# Zeitmessung Aufgabe

## Zeitmessung-Code korrigiren
```java
import java.util.Scanner;

 /**
 This program measures how long it takes to sort an
 array of a user-specified size with the insertion
 sort algorithm.
 */
 public class InsertionSortTimer
{
 public static void main(String[] args)
{
 Scanner in = new Scanner(System.in);
 System.out.print("Enter array size: ");
 int n = in.nextInt();
 // Construct random array
int[] a = ArrayUtil.randomIntArray(n, 100);
 // Use stopwatch to time selection sort
 Stopwatch timer1 = new Stopwatch();
 sorter.sort();
 System.out.println("Elapsed time: " + timer1.elapsedTime + " milliseconds");
 }
}
```
## Lösung Zeitmessung Code
- Messung misst auch noch die Ausgabe auf die Konsole, das will man nicht

### Korrektur Zeitmessung-Code
```java
    // Zuerst Wert zuweisen, dann ausgeben!
    double elapsedTime = timer1.elapsedTime; 
    System.out.println("Elapsed time: “ + elapsedTime + " milliseconds");
```




