public class App {
    public static void main(String[] args) throws Exception {

        Carro basico = new Carro("Basico", TipoCombustivel.GASOLINA, 10, 55, TipoCombustivel.GASOLINA);
        Carro esportivo = new Carro("Esportivo", TipoCombustivel.GASOLINA, 6, 45, TipoCombustivel.GASOLINA);
        Carro utilitario = new Carro("Utilitario", TipoCombustivel.DIESEL, 5, 70, TipoCombustivel.DIESEL);
        Carro SUV = new Carro("SUV", TipoCombustivel.GASOLINA, 8, 55, TipoCombustivel.FLEX);
        Carro SUVFlex = new Carro("SUVFlex", TipoCombustivel.FLEX, 0, 65, TipoCombustivel.FLEX);
        System.out.println("Tipos de veiculos:");
        System.out.println(basico);
        System.out.println(esportivo);
        System.out.println(utilitario);
        System.out.println(SUV);
        System.out.println(SUVFlex);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro basico com gasolina");
        basico.abastece(TipoCombustivel.GASOLINA, 55);
        System.out.println(basico);
        System.out.println("\nViajando com o carro basico");
        basico.viaja(250);
        basico.viaja(150);
        System.out.println(basico);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro esportivo com gasolina");
        esportivo.abastece(TipoCombustivel.GASOLINA, 55);
        System.out.println(esportivo);
        System.out.println("\nViajando com o carro esportivo");
        esportivo.viaja(250);
        esportivo.viaja(150);
        System.out.println(esportivo);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro utilitario com gasolina");
        utilitario.abastece(TipoCombustivel.DIESEL, 55);
        System.out.println(utilitario);
        System.out.println("\nViajando com o carro utilitario");
        utilitario.viaja(250);
        utilitario.viaja(150);
        System.out.println(utilitario);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro SUV com gasolina");
        SUV.abastece(TipoCombustivel.GASOLINA, 55);
        System.out.println(SUV);
        System.out.println("\nViajando com o carro SUV");
        SUV.viaja(250);
        SUV.viaja(150);
        System.out.println(SUV);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro SUVFlex com gasolina");
        SUVFlex.abastece(TipoCombustivel.GASOLINA, 55);
        System.out.println(SUVFlex);
        System.out.println("\nViajando com o carro SUVFlex");
        SUVFlex.viaja(250);
        SUVFlex.viaja(150);
        System.out.println(SUVFlex);
    }
}
