package List24;

public class Gerente extends Funcionario {
    private String departamento;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * 1.20;
    }

    public void gerenciar() {
        System.out.println("Gerenciando o departamento: " + departamento);
    }
}
