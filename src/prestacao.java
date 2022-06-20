public class prestacao {
    int qntd;
    double atual, total;

    public String getConsorcio(){
        String consorcio = "número total de prestações: " + total + " || quantidade de prestações pagas: " + qntd + " || valor  atual  da  prestação: " + atual;
        return consorcio;
    }


    public double getCalc(){
        saldo = 4;
        saldo = saldo * atual;
        return saldo;
    }

    double saldo;

    public double getSaldo(){
        total = total - qntd;
        total = total * atual;
        return total;
    }
}
