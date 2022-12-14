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

        String operadorRespuesta;

        if (result.m_getIntPart() < 0) {
            operadorRespuesta = "";

        } else {
            operadorRespuesta = "+";
        }

        if (result.a_numReal % 1 == 0) {
            int v_numReal = (int) Math.round(result.a_numReal);
            if (result.m_getIntPart() % 1 == 0) {
                int v_numImaginario = 0;
                v_numImaginario = (int) Math.round(result.m_getIntPart());
                System.out.println(v_numReal + " " + operadorRespuesta + v_numImaginario + "i");
                System.exit(0);
            } else {
                System.out.println(v_numReal + " " + operadorRespuesta + result.a_numImaginario);
                System.exit(0);
            }

        } else if (result.m_getIntPart() % 1 == 0) {
            int v_numImaginario = (int) Math.round(result.m_getIntPart());
            if (result.a_numReal % 1 == 0) {
                int v_numReal = 0;
                v_numReal = (int) Math.round(result.a_numReal);
                System.out.println(v_numReal + " " + operadorRespuesta + v_numImaginario + "i");
                System.exit(0);
            } else {
                System.out.println(result.a_numReal + " " + operadorRespuesta + v_numImaginario + "i");
                System.exit(0);
            }
        }
        else{
            System.out.println(result.a_numReal + " " + operadorRespuesta + result.a_numImaginario); 
        }
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
                v_resultado.a_numImaginario = Double.toString(Math.round((a_intPart + p_intPart) * 10) / 10d) + "i";
                break;
            case "-":
                v_resultado.a_numReal = a_numReal - p_numeroComplejo.a_numReal;
                v_resultado.a_numImaginario = Double.toString(Math.round((a_intPart - p_intPart) * 10) / 10d) + "i";
                break;
            case "*":
                v_resultado.a_numReal = (double) Math.round(a_numReal * p_numeroComplejo.a_numReal);
                v_resultado.a_numImaginario = Double.toString(Math.round((a_intPart * p_intPart) * 10) / 10d) + "i";
                break;
            case "/":
                v_resultado.a_numReal = a_numReal / p_numeroComplejo.a_numReal;
                v_resultado.a_numImaginario = Double.toString(Math.round((a_intPart / p_intPart) * 10) / 10d) + "i";

                break;
        }
        v_resultado.a_numReal = Math.round((v_resultado.a_numReal) * 10) / 10d;
        return v_resultado;
    }

    public double m_getIntPart() {
        double v_intPart = Double.parseDouble(a_numImaginario.replace("i", ""));
        return v_intPart;
    }
}