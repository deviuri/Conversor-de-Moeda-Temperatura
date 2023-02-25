public class Moeda {
        public static final double realParaDolar = 0.19;
        public static final double realParaEuro = 0.18;
        public static final double realParaLibraEsterlina = 0.16;
        public static final double realParaPesoArgentino = 38.22;
        public static final double realParaPesoChileno = 156.7;

        public static final double dolarParaReal = 5.14;
        public static final double euroParaReal = 5.51;
        public static final double libraEsterlinaParaReal = 6.21;
        public static final double pesoArgentinoParaReal = 0.027;
        public static final double pesoChilenoParaReal = 0.0063;



        public double converterRealEmDolar(double valor) {
            return valor * realParaDolar;
        }
        public double converterRealEmEuro(double valor) {
            return valor * realParaEuro;
        }
        public double converterRealEmLibraEsterlina(double valor) {
            return valor * realParaLibraEsterlina;
        }
        public double converterRealEmPesoArgentino(double valor) {
            return valor * realParaPesoArgentino;
        }
        public double converterRealEmPesoChileno(double valor) {
            return valor * realParaPesoChileno;
        }

        public double converterDolarEmReal(double valor) {
            return valor * dolarParaReal;
        }
        public double converterEuroEmReal(double valor) {
            return valor * euroParaReal;
        }
        public double converterLibraEsterlinaEmReal(double valor) {
            return valor * libraEsterlinaParaReal;
        }
        public double converterPesoArgentinoEmReal(double valor) {
            return valor * pesoArgentinoParaReal;
        }
        public double converterPesoChilenoEmReal(double valor) {
            return valor * pesoChilenoParaReal;
        }

}

