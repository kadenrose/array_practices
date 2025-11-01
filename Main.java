// public class ArrayTest {
//     public static void main(String[] args) {
//         int[] numbers = {1, 2, 3, 4, 5};
//         for (int n : numbers) {
//             System.out.println(n);
//         }

//     }
// }


public class Main {
    public static void main(String[] args) {
        DVD[] dvdCollection = new DVD[15];
    }
}

class DVD {
    public String name;
    public int releaseYear;
    public String director;

    public DVD(String name, int releaseYear, String director) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.director = director;
    }

    public String toString() {
        return this.name + ", directed by " + this.director + ", released in " + this.releaseYear;
    }
}
