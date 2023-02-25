public class Temperaturas {
    public static final double Fah = 32;
    public static final double Kelvin = 273.15;

    public double converterCelsiusParaFah(double valor) {
        return (valor * 9/5) + Fah;
    }
    public double converterCelsiusParaKelvin(double valor) {
        return valor + Kelvin;
    }
    public double converterKelvinParaFah(double valor) {
        return (valor - Kelvin) * 9/5 + 32;
    }
    public double converterKelvinParaCelsius(double valor) {
        return valor - Kelvin ;
    }
    public double converterFahParaKelvin(double valor) {
        return (valor - Fah) * 5/9 + Kelvin;
    }
    public double converterFahParaCelsius(double valor) {
        return (valor - Fah) * 5/9;
    }
}
