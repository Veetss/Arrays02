import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] aliceToDos = {"Coding", "Reading", "Learning"};
        String[] bobToDos = {"Reading", "Coding", "Learning", "Sleeping"};
        String[] timToDos = {"Reading", "Learning", "Coding"};

        System.out.println("Is Alice's array equal to Bob array? " + Arrays.equals(aliceToDos, bobToDos));
        System.out.println("Is Alice's array equal to Tim array? " + Arrays.equals(aliceToDos, timToDos));

        boolean temp = aliceToDos.length == bobToDos.length;
        System.out.println("Is Alice's array having the same length of Bob's array? " + temp);
        temp = aliceToDos.length == timToDos.length;
        System.out.println("Is Alice's array having the same length of Tim's array? " + temp);

        Arrays.sort(aliceToDos); //arrays.sort sistema l'array in ordine alfabetico (in questo caso)
        Arrays.sort(bobToDos);
        Arrays.sort(timToDos);

        System.out.println("Is Alice having the same tasks of Bob? " + Arrays.equals(aliceToDos, bobToDos));
        System.out.println("Is Alice having the same tasks of Bob? " + Arrays.equals(aliceToDos, timToDos));

    }
}
