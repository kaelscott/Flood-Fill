import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FluidFill fluidFill = new FluidFill("labirinto.png");

        fluidFill.fill(100, 300, 0xFF1E90FF);
        fluidFill.saveImage("imageOUT/imagem_modificada.png");


    }

}
