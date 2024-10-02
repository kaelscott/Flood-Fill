import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class FluidFill {
    private BufferedImage image;
    private int largura;
    private int altura;
    private int corOriginal;

    public FluidFill(String imagePath) throws IOException{
        this.image = ImageIO.read(new File(imagePath));
        this.largura = image.getWidth();
        this.altura = image.getHeight();
    }

    public void fill(int x, int y, int newColor) throws IOException {
        this.corOriginal = image.getRGB(x, y);

        if (corOriginal == newColor) return;

        Queue queue = new Queue(largura * altura);

        queue.enqueue(x);
        queue.enqueue(y);

        while (!queue.isEmpty()){
            int atualX = queue.dequeue();
            int atualY = queue.dequeue();
            if (atualX < 0 || atualX >= largura || atualY < 0 || atualY >= altura) {
                continue; // Pula este pixel se estiver fora dos limites
            }

            if (image.getRGB(atualX, atualY) != corOriginal) {
                continue; // Pula se não for da cor original
            }

            // Pinta o pixel atual
            image.setRGB(atualX, atualY, newColor);



            // Enfileira os pixels vizinhos
            queue.enqueue(atualX + 1); queue.enqueue(atualY); // Direita
            queue.enqueue(atualX - 1); queue.enqueue(atualY); // Esquerda
            queue.enqueue(atualX); queue.enqueue(atualY + 1); // Abaixo
            queue.enqueue(atualX); queue.enqueue(atualY - 1); // Acima
        }
    }

    public void saveImage(String outputPath) throws IOException {
        // Salvar a imagem modificada
        File outputFile = new File(outputPath);
        ImageIO.write(image, "png", outputFile);
    }



}
