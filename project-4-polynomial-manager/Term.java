public class Term {
    private int coefficient;
    private int xExp;
    private int yExp;
    private int zExp;

    public Term(int c, int x, int y, int z) {
        this.coefficient = c;
        this.xExp = x;
        this.yExp = y;
        this.zExp = z;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public int getXExp() {
        return xExp;
    }

    public int getYExp() {
        return yExp;
    }

    public int getZExp() {
        return zExp;
    }

    public String toString() {
        String result = "";

        // coefficient
        if (coefficient == -1 && (xExp != 0 || yExp != 0 || zExp != 0)) {
            result += "-";
        } else if (coefficient != 1 || (xExp == 0 && yExp == 0 && zExp == 0)) {
            result += coefficient;
        }

        // x
        if (xExp != 0) {
            if (xExp == 1) {
                result += "(x)";
            } else {
                result += "(x^" + xExp + ")";
            }
        }

        // y
        if (yExp != 0) {
            if (yExp == 1) {
                result += "(y)";
            } else {
                result += "(y^" + yExp + ")";
            }
        }

        // z
        if (zExp != 0) {
            if (zExp == 1) {
                result += "(z)";
            } else {
                result += "(z^" + zExp + ")";
            }
        }

        return result;
    }
}