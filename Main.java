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
        // Create an array to hold 15 DVDs
        DVD[] dvdCollection = new DVD[15];

        // Create DVD objects
        DVD avengersDVD = new DVD("The Avengers", 2012, "Joss Whedon");
        DVD incrediblesDVD = new DVD("The Incredibles", 2004, "Brad Bird");
        DVD findingDoryDVD = new DVD("Finding Dory", 2016, "Andrew Stanton");
        DVD lionKingDVD = new DVD("The Lion King", 2019, "Jon Favreau");
        DVD starWarsDVD = new DVD("Star Wars", 1977, "George Lucas");

        // Put DVDs into the array
        dvdCollection[7] = avengersDVD;   
        dvdCollection[3] = incrediblesDVD;  
        dvdCollection[9] = findingDoryDVD;  
        dvdCollection[2] = lionKingDVD;     
        dvdCollection[0] = starWarsDVD;

        // Print out the DVDs that were added
        // for (int i = 0; i < dvdCollection.length; i++) {
        //     if (dvdCollection[i] != null) {
        //         System.out.println("Slot " + i + ": " + dvdCollection[i]);
        //     }
        // }
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

