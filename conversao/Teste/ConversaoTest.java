import com.company.Main;
import org.junit.Test;
import static org.junit.Assert.*;


public class ConversaoTest {

    //Celsius para Kelvin
        @Test
        public void testTemperatura() {
            int valor1 = 10;
            int resultado = Main.temperatura(valor1);
            assertEquals(283, resultado, 0.01);
        }

    //velocidade em km/h dividida por 3,6 corresponde a mesma em m/s
        @Test
        public void testVelocidade(){
            double valor1 = 50;
            double resultado = Main.velocidade(valor1);
            assertEquals(13.88,resultado,0.01);
        }

        //Centímetros para Polegadas
        @Test
        public void testDistancia(){
           double valor1 = 30;
           double resultado = Main.distancia(valor1);
           assertEquals(11.811,resultado, 0.01);

        }

        //conversão de Segundos para Hora
        @Test
        public void testTempo(){
            double valor1 = 270;
            double resultado = Main.tempo(valor1);
            assertEquals(0.075,resultado,0.01);
        }
}






