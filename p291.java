import java.util.Scanner;

public class p291 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double numReal_1 = sc.nextDouble();
        String numImaginario_1 = sc.next();
        String operador = sc.next();

    }
}

class numeroComplejo {
    Double a_numReal;
    String a_numImaginario;

    numeroComplejo(Double p_numReal, String p_numImaginario) {
        a_numReal = p_numReal;
        a_numImaginario = p_numImaginario;
    }

    public void m_operation(numeroComplejo p_numeroComplejo, String operador) {
        numeroComplejo v_resultado;

        switch (operador) {
            case "+":

                break;
            case "-":

                break;
            case "*":

                break;
            case "/":

                break;

            default:
                break;
        }
    }
}