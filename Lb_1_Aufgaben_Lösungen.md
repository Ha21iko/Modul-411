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
// Array A2 Lösung
    private static boolean search(int[] A, int w){
        for (int number: A) {
            if (number == w){
                return true;
            }
        }
        return false;
    }
    
# Selection Sort
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
    
- 9,7,8,1,2,3
- *1*,7,8,9,2,3
- *1*,*2*,8,9,7,3
- *1*,*2,*3*,9,7,8
- *1*,*2*,*3*,*7*,9,8
- *1*,*2*,*3*,*7*,*8*,9
- fertig

