package sistema_expedição_poo;

public class Expedição {
    private int codExpedicao, qtdeParticipante;
    private String dataExpedição;
    private String nomeGuia;
    private boolean situacao;
        
    Trilha trilha = new Trilha();

    public Expedição() {
    }

    public Expedição(int codExpedicao, int qtdeParticipante, String dateExpedição, String nomeGuia, boolean situacao, Trilha nomeTrilha) {
        this.codExpedicao = codExpedicao;
        this.qtdeParticipante = qtdeParticipante;
        this.dataExpedição = dataExpedição;
        this.nomeGuia = nomeGuia;
        this.situacao = situacao;
    }

    public int getCodExpedicao() {
        return codExpedicao;
    }

    public void setCodExpedicao(int codExpedicao) {
        this.codExpedicao = codExpedicao;
    }

    public int getQtdeParticipante() {
        return qtdeParticipante;
    }

    public void setQtdeParticipante(int qtdeParticipante) {
        this.qtdeParticipante = qtdeParticipante;
    }

    public String getDateExpedição() {
        return dataExpedição;
    }

    public void setDateExpedição(String dateExpedição) {
        this.dataExpedição = dateExpedição;
    }

    public String getNomeGuia() {
        return nomeGuia;
    }

    public void setNomeGuia(String nomeGuia) {
        this.nomeGuia = nomeGuia;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }
    
    public String verificarSituacao() {
        String situ;
        if (situacao) {
            situ = "Confirmada";
        }
        else {
            situ = "Cancelada";
        }
        
        return situ;
    }
    
    
    public String cancelarExpedicao() {
        if (situacao) {
            situacao = false;
        }
        else{
            return "\nExpedição já foi cancelada";
        }
        
        return "\nExpedição cancelada";
    }
    
    public String confirmarExpedicao() {
        if (!situacao) {
            situacao = true;
        }
        else {
            return "\nExpedição já confirmada";
        }
        
        return "\nExpedição confirmada com sucesso";
    }
    
    
    public double calcularTotal() {
        double taxa = trilha.getTaxaParticipante();
        
        double total = taxa * qtdeParticipante;
        
        return total;
    }
    
    public String retornarInfo(){
        return "Expedição: n° " + codExpedicao + " - " + dataExpedição
                + "\nGuia: " + nomeGuia + " | Participantes: " + qtdeParticipante + "Situação: " + situacao
                + "\nTrilha: " + trilha.getNomeTrilha() + " | Dificuldade: " + trilha.getNivelDificuldade() + " | Taxa: R$ " + trilha.getTaxaParticipante()
                + "\nValor total: R$ " + calcularTotal();
    }
    
    
    
}
