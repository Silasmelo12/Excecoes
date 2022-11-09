public class ImpossivelAberturaDeArquivoException extends Exception {
    private String nomeArquivo;
    private String diretorioArquvo;

    public ImpossivelAberturaDeArquivoException(String nomeArquivo, String diretorioArquvo) {
        super("O arquivo " + nomeArquivo + " não foi encontrado no diretorio " + diretorioArquvo);
        this.nomeArquivo = nomeArquivo;
        this.diretorioArquvo = diretorioArquvo;
    }

    @Override
    public String toString() {
        return "ImpossivelAberturaDeArquivoException{" +
                "nomeArquivo='" + nomeArquivo + '\'' +
                ", diretorioArquvo='" + diretorioArquvo + '\'' +
                '}';
    }
}
