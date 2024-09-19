public class Main {
    public static void main(String[] args) {
        // Criar uma nova fila com capacidade 2
        Queue fila = new Queue(2);

        System.out.println("Testando a fila:");

        // Enfileirar elementos manualmente
        System.out.println("\nEnfileirando elementos:");
        try {
            fila.enqueue(10);
            System.out.println("Enfileirado: 10");

            fila.enqueue(20);
            System.out.println("Enfileirado: 20");

            // Tentar enfileirar um terceiro elemento (excedendo a capacidade da fila)
            fila.enqueue(30);
            System.out.println("Enfileirado: 30");
        } catch (IllegalStateException e) {
            System.out.println("Não foi possível enfileirar: " + e.getMessage());
        }

        // Desenfileirar um elemento
        System.out.println("\nDesenfileirando um elemento:");
        try {
            int removed = fila.dequeue();
            System.out.println("Desenfileirado: " + removed);
        } catch (IllegalStateException e) {
            System.out.println("Não foi possível desenfileirar: " + e.getMessage());
        }

        // Enfileirar outro elemento após desenfileirar
        try {
            fila.enqueue(30);
            System.out.println("Enfileirado: 30");
        } catch (IllegalStateException e) {
            System.out.println("Não foi possível enfileirar: " + e.getMessage());
        }

        // Estado final da fila
        System.out.println("\nEstado final da fila:");
        System.out.println(fila);
    }
}
