/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication4;

/**
 *
 * @author 1488
 */
public class MatrixOper {

    public static boolean isMatch(JavaFXApplication4 A, JavaFXApplication4 B) {
        System.out.println(A);
        System.out.println(B);
        return false;
    }

    public static JavaFXApplication4 multy(JavaFXApplication4 A, JavaFXApplication4 B) {
        if (isMatch(A, B)) {
            JavaFXApplication4 M = new JavaFXApplication4(A.getN(), B.getM());
            for (int i = 0; i < A.getN(); i++) {
                for (int j = 0; j <= B.getM(); j++) {
                    int value = 0;
                    StringBuilder f = new StringBuilder();
                    for (int k = 0; k < A.getM(); k++) {
                        value += A.getValue(i, k) * B.getValue(k, j);
                        f.append(A.getValue(i, k) + "*" + B.getValue(k, j));
                        if (k != A.getM() - 1) {
                            f.append("+");
                        }
                    }
                    M.setValue(value, i, j);
                    M.setFormula(f.toString(), i, j);
                }
            }
            return M;
        } else {
            return null;
        }
    }
}
