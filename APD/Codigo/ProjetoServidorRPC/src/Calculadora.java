public class Calculadora {
    // 2D
    //calculo de área do quadrado
    public double AreaQuadrado(int lado) {
        return Math.pow(lado, 2);
    }

    //calculo de área do triângulo
    public int AreaTrianguloRetangulo(int base, int altura) {
        return (base * altura) / 2;
    }

    //calculo da área da circunferência
    public double AreaCircunferencia(int raio) {
        return 3.14 * Math.pow(raio, 2);
    }

    // 3D
    //calculo da área do cilindro
    public double AreaCilindro(int raio, int altura) {
        return 2 * 3.14 * raio * (raio + altura);
    }
    //calculo do volume do cilindro
    public double VolumeCilindro(int raio, int altura) {
        return 3.14 * Math.pow(raio, 3) * altura;
    }

    //calculo da área do cubo
    public double AreaCubo(int lado) {
        return 6 * Math.pow(lado, 2);
    }
    //calculo do volume do cubo
    public double VolumeCubo(int lado) {
        return Math.pow(lado, 3);
    }

    //calculo da área da esfera
	public double AreaEsfera(int raio) {
        return 4 * 3.14 * Math.pow(raio, 2);
    }
    //calculo do volume da esfera
    public double VolumeEsfera(int raio) {
        return (4.0 / 3.0) * 3.14 * Math.pow(raio, 3);
    }
}