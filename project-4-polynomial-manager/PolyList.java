public class PolyList {
    private DLList<Polynomial> list;

    public PolyList() {
        list = new DLList<>();
    }

    public void insert(Polynomial p) {
        if (exists(p.getName())) {
            System.out.println("POLYNOMIAL " + p.getName() + " ALREADY INSERTED");
            return;
        }

        list.insertLast(p);
        System.out.println(p.toString());
    }

    public void delete(String name) {
        if (!list.first()) {
            System.out.println("POLYNOMIAL " + name + " DOES NOT EXIST");
            return;
        }

        do {
            Polynomial p = list.dataRead();
            if (p.getName().equals(name)) {
                list.deleteAtCurrent();
                System.out.println("POLYNOMIAL " + name + " SUCCESSFULLY DELETED");
                return;
            }
        } while (list.next());

        System.out.println("POLYNOMIAL " + name + " DOES NOT EXIST");
    }

    public void search(String name) {
        if (!list.first()) {
            System.out.println("POLYNOMIAL " + name + " DOES NOT EXIST");
            return;
        }

        do {
            Polynomial p = list.dataRead();
            if (p.getName().equals(name)) {
                System.out.println(p.toString());
                return;
            }
        } while (list.next());

        System.out.println("POLYNOMIAL " + name + " DOES NOT EXIST");
    }

    private boolean exists(String name) {
        if (!list.first()) return false;

        do {
            Polynomial p = list.dataRead();
            if (p.getName().equals(name)) return true;
        } while (list.next());

        return false;
    }
}