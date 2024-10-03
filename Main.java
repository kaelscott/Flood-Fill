import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FloodFill floodFill = new FloodFill("labirinto.png");

        floodFill.fill(100, 300, 0xFF1E90FF);
        floodFill.saveImage("imageOUT/imagem_modificada.png");


    }

}
