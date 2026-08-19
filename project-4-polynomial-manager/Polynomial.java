public class Polynomial {
    private String name;
    private DLList<Term> terms;

    public Polynomial(String name) {
        this.name = name;
        terms = new DLList<>();
    }

    public String getName() {
        return name;
    }

    public void addTerm(Term t) {
        terms.insertLast(t); 
    }

    public String toString() {
        String result = name + " = ";
        boolean first = true;

        if (!terms.first()) return result;

        do {
            Term t = terms.dataRead();
            int coef = t.getCoefficient();

            if (coef == 0) continue;

            if (first) {
                result += t.toString();
                first = false;
            } else {
                if (coef > 0) {
                    result += " + " + t.toString();
                } else {
                    String temp = t.toString();
                    if (temp.startsWith("-")) {
                        temp = temp.substring(1);
                    }
                    result += " - " + temp;
                }
            }

        } while (terms.next());

        return result;
    }
}