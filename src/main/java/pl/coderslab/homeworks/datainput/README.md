![Coders-Lab-1920px-no-background](https://user-images.githubusercontent.com/152855/73064373-5ed69780-3ea1-11ea-8a71-3d370a5e7dd8.png)


## Zadanie 1

W pakiecie `pl.coderslab.homeworks.datainput`, w pliku `Main01.java` napisz program, który:

1. Pobierze z konsoli dane w postaci:
```
Nazwisko Imie RokUrodzenia Płeć:
```
2. Dane będą pobierane do momentu wpisania na konsoli **quit**. Dane zapisuj do tablicy typu **String**.

3. Po wpisaniu **quit** wykorzystaj te dane do utworzenia drugiej tablicy zawierającej tylko osoby, które mogą przejść na emeryturę.
Dla kobiet będzie to 60 lat, dla mężczyzn 65.
Dane umieszczaj w postaci `imię + nazwisko`.

3. Kod powinien być zawarty w metodzie o sygnaturze
 `public static String[] retirement()`.

Przykładowe linie z wprowadzanymi danymi:

```
Kowalski Marek 1955 M
Krzak Marianna 1966 K
Kamil Kowalski 2020 M
```

## Zadanie 2

W pakiecie w pliku `pl.coderslab.homeworks.datainput`, w pliku `Main02.java` stwórz metodę o sygnaturze `public static int[] sortedArray()`.

1. Uzupełnij ciało metody tak, aby wczytała z konsoli ile liczb należy wylosować.
2. Stworzy tablicę oraz umieść w niej losowe wartości z zakresu [0,100].
3. Posortuje elementy tablicy a następnie ją zwróci.

## Zadanie 3

W pakiecie `pl.coderslab.homeworks.datainput`, w pliku `Main03.java` stwórz metodę o sygnaturze `public static void printTriangle()`.

1. Uzupełnij ciało metody tak, aby wczytała z konsoli wartość typu int.
2. Wypisze na konsoli trójkąt zbudowany ze znaku `x`, w którym obie przyprostokątne będą równe wczytanej wartości
Przykład dla wczytanej wartości równej 5.

````
x
x x
x x x
x x x x 
x x x x x
````
## Zadanie 1

W pakiecie `pl.coderslab.homeworks.files`, w pliku `Main01.java` stwórz metodę o sygnaturze `public static int count(String fileName)`.

1. Uzupełnij ciało metody tak, aby zliczała i zwracała ilość znaków z pliku.

## Zadanie 2

W pakiecie `pl.coderslab.homeworks.files`, pliku `Main02.java` stwórz metodę o sygnaturze `public static int count(String fileName)`.

1. Uzupełnij ciało metody tak, aby zliczyła i zwracała ilość słów z pliku.

## Zadanie 3

W pakiecie `pl.coderslab.homeworks.files`, w pliku `Main03.java` stwórz metodę o sygnaturze `public static boolean checkFileExist()`.

1. Uzupełnij ciało metody tak, aby wczytała z konsoli nazwę pliku.
2. Sprawdzi czy plik istnieje a następnie wypisze `true` lub `false`.

## Zadanie 4

W pakiecie `pl.coderslab.homeworks.files`, w pliku `Main04.java` stwórz metodę o sygnaturze `public static boolean rewrite()`.
1. Uzupełnij ciało metody tak, aby wczytała z konsoli  nazwę pliku.
2. Sprawdzi czy plik istnieje i jeżeli istnieje stworzy drugi plik z sufiksem "_2",
 do którego 2-krotnie zostanie zapisana zawartość pliku wzorcowego.

Przykład: 
wczytana nazwa pliku `text1.txt`, z zawartością abc, zostanie utworzony plik o nazwie `text1_2.txt` o zawartości:
````
abc
abc
````
