public class Sala{
    private String nome;
    private int maximo;
    private int quantos;
    private Porta portaEntrada;
    private Porta portaSaida;
    
        public Sala(int maximo, int quantos, String nome, Porta portaEntrada, Porta portaSaida){
            this.nome = nome;
            this.maximo = maximo;
            this.quantos = quantos;
            this.portaEntrada = portaEntrada;
            this.portaSaida = portaSaida;
        }
        
        public String getNome(){
            return nome;
        }
        
        public int getMaximo(){
            return maximo;
        }
        
        public int quantos(){
            return quantos;
        }
        
        public boolean estaCheia(){
            if(quantos == maximo){
                 return true;
            }else{
                 return false;           
            }
        }
        
        public boolean entra(){
            if(quantos != maximo){
                if(quantos == 0){
                    portaEntrada.abre();
                    quantos = quantos + 1;
                    return true;
                }
                if(quantos == (maximo - 1)){
                    portaEntrada.fecha();
                    quantos = quantos + 1;
                    return true;
                }else{
                    quantos = quantos + 1;
                    return true;
                }
            }else{
                return false;
            }
        }
        
        public boolean sai(){
            if(quantos != 0){
                if(quantos == maximo){
                    portaSaida.abre();
                    quantos = quantos - 1;
                    return true;
                }
                if(quantos == 1){
                    portaEntrada.pinta();
                    portaSaida.pinta();
                    portaSaida.fecha();
                    quantos = quantos - 1;
                    return true;
                }else{
                    quantos = quantos - 1;
                    return true;
                }
            }else{
                return false;
            }
        }
        
        public void exibeSala(){
            System.out.println("Nome: " + nome);
            System.out.println("Lotação Permitida: " + maximo);
            System.out.println("Pessoas no momento: " + quantos);
            System.out.println("Porta de Entrada: " + portaEntrada.getDescricaoCor());
            System.out.println("Porta de Saida: " + portaSaida.getDescricaoCor());
        }
}