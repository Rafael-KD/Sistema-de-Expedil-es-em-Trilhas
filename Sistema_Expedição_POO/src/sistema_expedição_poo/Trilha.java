package sistema_expedição_poo;

import javax.swing.JOptionPane;

public class Trilha {
    private int codTrilha, extensaoTrilha;
    private int  nivelDificuldade = 0;
    private String nomeTrilha;
    private double taxaParticipante;
    private boolean situacao = true;

    public Trilha() {
    }

    public Trilha(int codTrilha, int nivelDificuldade, int extensaoTrilha, String nomeTrilha, double taxaParticipante) {
        this.codTrilha = codTrilha;
        this.nivelDificuldade = nivelDificuldade;
        this.extensaoTrilha = extensaoTrilha;
        this.nomeTrilha = nomeTrilha;
        this.taxaParticipante = taxaParticipante;
    }
    
    

    public int getCodTrilha() {
        return codTrilha;
    }

    public void setCodTrilha(int codTrilha) {
        this.codTrilha = codTrilha;
    }

    public int getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void setNivelDificuldade(int nivelDificuldade) {
        if (nivelDificuldade == 0) {
            this.nivelDificuldade = nivelDificuldade;
        }
        else {
            JOptionPane.showMessageDialog(null, "Nível Inválido!");
        }
    }

    public int getExtensaoTrilha() {
        return extensaoTrilha;
    }

    public void setExtensaoTrilha(int extensaoTrilha) {
        if (extensaoTrilha > 0) {
            this.extensaoTrilha = extensaoTrilha;
        }
        else {
            JOptionPane.showMessageDialog(null, "Extensão Inválida!");
        }
        
    }

    public String getNomeTrilha() {
        return nomeTrilha;
    }

    public void setNomeTrilha(String nomeTrilha) {
        if (nomeTrilha.isBlank()) {
            this.nomeTrilha = nomeTrilha;
        }
        else {
            JOptionPane.showMessageDialog(null, "Nome Inválido!");
        }
    }

    public double getTaxaParticipante() {
        return taxaParticipante;
    }

    public void setTaxaParticipante(double taxaParticipante) {
        if (taxaParticipante > 0) {
            this.taxaParticipante = taxaParticipante;
        }
        else {
            JOptionPane.showMessageDialog(null, "Taxa Inválida!");
        }        
            
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }
    
    
    
}
