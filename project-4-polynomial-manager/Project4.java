import java.util.Scanner;

public class Project4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PolyList polyList = new PolyList();

        while (true) {
            String command = sc.next();

            if (command.equals("INSERT")) {
                String name = sc.next();
                Polynomial p = new Polynomial(name);

                String line = sc.nextLine().trim();
                String[] terms = line.split(" ");

                for (int i = 0; i < terms.length; i++) {
                    String[] parts = terms[i].split(",");
                    int c = Integer.parseInt(parts[0]);
                    int x = Integer.parseInt(parts[1]);
                    int y = Integer.parseInt(parts[2]);
                    int z = Integer.parseInt(parts[3]);

                    p.addTerm(new Term(c, x, y, z));
                }

                polyList.insert(p);
            }

            else if (command.equals("DELETE")) {
                String name = sc.next();
                polyList.delete(name);
            }

            else if (command.equals("SEARCH")) {
                String name = sc.next();
                polyList.search(name);
            }

            else if (command.equals("QUIT")) {
                break;
            }
        }

        sc.close();
    }
}