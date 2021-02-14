import java.io.IOException;

public class Principal {

        public static void main(String[] args) throws IOException {
            ManipularArquivo mf = new ManipularArquivo();
            String path = "/file.txt";

            mf.escritor(path);
            mf.leitor(path);
        }
}
