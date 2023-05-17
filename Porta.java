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
            return "verde";
        }
        if(cor==2){
            return "azul";
        }
        if(cor==3){
            return "amarelo";
        }
        if(cor==4){
            return "vermelho";
        }
        if(cor==5){
            return "branco";
        }else{
            return "erro";
        }
    }
    
    public void pinta(int novaCor){
        cor = novaCor;
        if(novaCor>5){
            cor = 5;
        }
        if(novaCor<1){
            cor = 5;
        }
    }
    
    public void pinta(){
        if(cor==cor){
            cor ++;
        }
    }
    
    public void abre(){
        aberta = true;
    }
    
    public void fecha(){
        aberta = false;   
    }
}
