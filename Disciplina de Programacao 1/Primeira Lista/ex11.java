public clas ex11{
  public static void main(Strin[] args){
    double saldoFinal;
    double salarioB = Input.readDouble("Informe o valor do salário: ");
    double adiantamento = Input.readDouble("Informe o valor do adiantamento: ");

    saldoFinal = (salario bruto - (salarioB/100)*20) + adiantamento;

    System.out.print("Valor a ser entregue: " + saldoFinal);
  }
}
