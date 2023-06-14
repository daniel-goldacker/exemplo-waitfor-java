import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class WaitForExemplo {
    public static void main(String[] args) {
        try {
            // Executa um comando externo
            Process process = Runtime.getRuntime().exec("ping google.com -t 1");

            // Aguarda a conclusão do processo
             boolean exitCode = process.waitFor(4, TimeUnit.SECONDS);

            // Verifica o código de saída do processo
            if (exitCode == true) {
                System.out.println("O processo foi concluído com sucesso.");
            } else {
                System.out.println("O processo falhou com o código de saída: " + exitCode);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
