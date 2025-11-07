package List24;

public class Vendedor extends Funcionario {
    private double comissao = 500;

    @Override
    public double calcularSalario() {
        return getSalarioBase() + comissao;
    }

    public void vender() {
        System.out.println("O vendedor realizou uma venda!");
    }
}
