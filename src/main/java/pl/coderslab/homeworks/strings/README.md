![Coders-Lab-1920px-no-background](https://user-images.githubusercontent.com/152855/73064373-5ed69780-3ea1-11ea-8a71-3d370a5e7dd8.png)


## Zadanie 1

Szyfr Cezara jest to szyfr za pomocą, którego Juliusz Cezar szyfrował swoje listy do Cycerona.

W pakiecie `pl.coderslab.homeworks.strings`, w pliku `Main01.java` umieść metodę o sygnaturze `public static String encode(String str)`.
 
1. Uzupełnij ciało metody tak, by zwracała napis zaszyfrowany szyfrem Cezara  


## Zadanie 2

W pakiecie `pl.coderslab.homeworks.strings`, w pliku `Main02.java` umieść zmodyfikowaną metodę z zadania domowego 1 o sygnaturze `public static String encode(String str, int shift)`.
 
1. `shift` - oznacza przesunięcie znaków
2. Dodaj metodę deszyfrującą `public static String decode(String str, int shift)` .

## Zadanie 3

W pakiecie `pl.coderslab.homeworks.strings`, w pliku `Main03.java` umieść  metodę  o sygnaturze `public static String upperCase(String str, int index)` .

1. Metoda zwraca napis `str`, w którym znaki zostały zamienione na duże z pozycji podzielnych przez `index`.

## Zadanie 4

W pakiecie `pl.coderslab.homeworks.strings`, w pliku `Main04.java` umieść  metodę  o sygnaturze `public static int tripple(String str)` 
1. Metoda zwraca ilość potrójnych wystąpień znaków w napisie

Przykład dla qazbbbwsx -> 1, dla aaawsxbbb ->2

## Zadanie 5

W pakiecie `pl.coderslab.homeworks.strings`, w pliku `Main05.java` umieść metodę o sygnaturze `public static String replaceChar(String str, char forReplace, char replacement)`.

1. Uzupełnij ciało metody tak, aby zwracała napis powstały z zamiany w napisie `str`
 wszystkich znaków `forReplace` przez znaki `replacement`.

## Zadanie 6

W pakiecie `pl.coderslab.homeworks.strings`, w pliku `Main06.java` umieść metodę o sygnaturze `public static String replaceStr(String str, String forReplace, String replacement)`.

1. Uzupełnij ciało metody tak, aby zwracała napis powstały z zamiany w napisie `str`
 wszystkich wystąpień napisu `forReplace` przez napis `replacement`.

## Zadanie 7

W pakiecie `pl.coderslab.homeworks.strings`, w pliku `Main07.java` umieść metodę o sygnaturze `public static String censor(String str, String[] words)`.

1. Metoda:

* rozbije łańcuch tekstowy na tablicę wyrazów,
* sprawdzi, czy nie znajdują się w nim słowa niedozwolone zawarte w tablicy `words`,
* jeśli tak -- zamieni je na cztery gwiazdki (****)
* ponownie połączy tablicę w string i zwróci wartość.
