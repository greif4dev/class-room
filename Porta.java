public class Porta{
    private int cor;
    private boolean aberta;
    
    public Porta(int cor){
        this.cor = cor;
        if (cor>5){
            this.cor = 5;
        }
        if(cor<1){
            this.cor = 5;
        }
        aberta = false;
    }
    
    public void setCor(int umaCor){
        cor = umaCor;
        if(umaCor>5){
            cor = 5;
        }
        if(umaCor<1){
            cor = 5;
        }
    }
    
    public boolean isAberta(){
        return aberta;
    }
    
    public int getCor(){
        return cor;
    }
    
    public String getDescricaoCor(){
        if(cor==1){
            return "Verde";
        }
        if(cor==2){
            return "Azul";
        }
        if(cor==3){
            return "Amarelo";
        }
        if(cor==4){
            return "Vermelho";
        }
        if(cor==5){
            return "Branco";
        }else{
            return "erro";
        }
    }
    
    public void pinta(int novaCor) {
        if (novaCor >= 1 && novaCor <= 5) {
            if (cor != novaCor) {
                cor = novaCor;
            } else {
                cor = (cor % 5) + 1;
            }
        } else {
            cor = 5; // Valor padrão quando as condições não são atendidas
        }
    }
    
    public void pinta(){
        if(cor==cor){
            cor = (cor % 5) + 1;
        }
    }
    
    public void abre(){
        aberta = true;
    }
    
    public void fecha(){
        aberta = false;   
    }
}
