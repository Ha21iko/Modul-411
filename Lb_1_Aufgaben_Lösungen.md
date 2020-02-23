# Struktogramm 1
![](struktogramm/Euklidischen_Algorithmus1.svg)
# Struktogramm 2
![](struktogramm/Euklidischen_Algorithmus1.svg)
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
# Bubble Sort
```java
private static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++){
            for (int k = 1; k < arr.length-i; k++){
                if (arr[k-1] > arr[k]){
                    int t = arr[k-1];
                    arr[k-1] = arr[k];
                    arr[k] = t;
                }
            }
        }
        for (int number: arr) {
            System.out.print(number+";");
        }
    }
```

# Selection Sort
Gegeben ist folgende Sequenz 9,7,8,1,2,3

```java
private static void selectionSort(int[] arr){
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        for (int number: arr) {
            System.out.print(number+",");
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
- Messung misst auch noch die Ausgabe auf der Konsole, das will man nicht

### Korrektur Zeitmessung-Code
```java
    // Zuerst Wert zuweisen, dann ausgeben!
    double elapsedTime = timer1.elapsedTime; 
    System.out.println("Elapsed time: “ + elapsedTime + " milliseconds");
```
# Komplexität

n = Anzahl Elememte zu sortieren
lb = Zeit für ein Besuch

| n    | O(1) | O(n) | O(n^2) | O(n log(n)) |
|------|------|------|--------|-------------|
| 1000 | 5ms  | 5ms  | 5ms    | 5ms         |
| 2000 | 5ms  |      |        |             |
| 3000 | 5ms  |      |        |             |
| 4000 | 5ms  |      |        |             |


# Spalte O(n)
O(n) = T(n) = **n * tb**
O(n) = n * tb = 5ms   

## Example n = 1000
Example n = 1000;
tb = 5ms/n => Example tb = 5ms/1ooo = **0.005ms**

## Lösung n = 2000
**Lösung** n = 2000;
tb = 0.005ms
O(n) = n * 0.005ms
T(n) = 2000 * 0.005ms = **10ms**

# Spalte O(n^2)
O(n) = T(n) = **n^2 * tb** = 5ms
n = 1000
tb = 5ms/n^2 = 0.000'005ms

## Lösung n = 2000
tb = 0.000'005ms
T(n) = (2000)^2 * 0.000'005ms = **20ms**

# Spalte O(n log(n))
T(n) = n * log(n) * tb = 5ms
tb = 5ms/(n * log(n)) = **0.001667ms**

## Lösung n = 2000
tb =  **0.001667ms**
T(n) = n * log(n) * tb 
T(2000) = 2000 * log(2000) * 0.001667 = **11ms** 

# Tabelle Lösung 

| n    | O(1) | O(n) | O(n^2) | O(n log(n)) |
|------|------|------|--------|-------------|
| 1000 | 5ms  | 5ms  | 5ms    | 5ms         |
| 2000 | 5ms  | 10ms | 20ms   | 11ms        |
| 3000 | 5ms  | 15ms | 45ms   | 17.31ms     |
| 4000 | 5ms  | 20ms | 80ms   | 24ms        |

# Unterschied zwischen Sortieren und Suchen
## Sortieren
Beim sortieren ändert sich die Reihenfolge.
## Suchen 
Beim suchen werden die Datensätze nach der Suche gefiltert. 
## Unterschied
Sortieren => Verändert die Reihenfolge der Datnsätzte
Suche => Filtert die Datensätz

# Warum sollten Daten, in denen oft gesucht wird, sortiert werden?
Die Suche kann effizienter und einfacher umgesetzt werden.

### Angenommen, die zu sortierenden Elemente werden verzehnfacht, um wieviel länger dauert das Sortieren mit dem Insertion Sort Algorihmus?
### Lösung 100-mal länger
O(n^2) |  n = 1000 = 5ms ; n = 10'000 = 5ooms F = 500/5 = **100**

