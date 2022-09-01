import java.util.Scanner;

public class p291 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double numReal_1 = sc.nextDouble();
        String numImaginario_1 = sc.next();

        numeroComplejo v_numComplejo1 = new numeroComplejo(numReal_1, numImaginario_1);

        Double numReal_2 = sc.nextDouble();
        String numImaginario_2 = sc.next();

        numeroComplejo v_numComplejo2 = new numeroComplejo(numReal_2, numImaginario_2);

        String operador = sc.next();

        numeroComplejo result = v_numComplejo1.m_operation(v_numComplejo2, operador);
        System.out.println(result.a_numReal + " +" + result.a_numImaginario);
    }
}

class numeroComplejo {
    Double a_numReal;
    String a_numImaginario;

    numeroComplejo(Double p_numReal, String p_numImaginario) {
        a_numReal = p_numReal;
        a_numImaginario = p_numImaginario;
    }

    public numeroComplejo m_operation(numeroComplejo p_numeroComplejo, String operador) {
        numeroComplejo v_resultado = new numeroComplejo(0.0, "");

        Double a_intPart = m_getIntPart();
        Double p_intPart = p_numeroComplejo.m_getIntPart();

        switch (operador) {
            case "+":
                v_resultado.a_numReal = a_numReal + p_numeroComplejo.a_numReal;
                v_resultado.a_numImaginario = Double.toString(a_intPart + p_intPart) + "i";
                break;
            case "-":

                break;
            case "*":

                break;
            case "/":

                break;

        }
        return v_resultado;
    }

    public double m_getIntPart() {
        double v_intPart = Double.parseDouble(a_numImaginario.replace("i", ""));
        return v_intPart;
    }
}