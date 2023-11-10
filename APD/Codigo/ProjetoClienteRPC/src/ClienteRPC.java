import java.net.URL;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

public class ClienteRPC {

    private XmlRpcClient cliente;
	
    public ClienteRPC(String urlServidor) {
		try {
			//configura o cliente para que ele possa se conectar ao servidor
			XmlRpcClientConfigImpl configuracaoCliente = new XmlRpcClientConfigImpl();
            configuracaoCliente.setServerURL(new URL(urlServidor));
			//seta a configuração no cliente
            cliente = new XmlRpcClient();
            cliente.setConfig(configuracaoCliente);
        } catch (Exception exception) {
            System.err.println("JavaServer: " + exception);
        }
    }
    // os programas a seguir recebem os dados de cada calculo desejado e os repassam para o servidor calcular
    // 2D
    public double AreaQuadrado(int lado) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(lado)};
        double resultado = (double) cliente.execute("Calc.AreaQuadrado", parametros);
        return resultado;
    }

    public int AreaTrianguloRetangulo(int base, int altura) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(base), Integer.valueOf(altura)};
        Integer resultado = (Integer) cliente.execute("Calc.AreaTrianguloRetangulo", parametros);
        return resultado;
    }

    public double AreaCircunferencia(int raio) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(raio)};
        double resultado = (double) cliente.execute("Calc.AreaCircunferencia", parametros);
        return resultado;
    }

    // 3D
    // Cilindro
    public double AreaCilindro(int raio,int altura) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(raio), Integer.valueOf(altura)};
        double resultado = (double) cliente.execute("Calc.AreaCilindro", parametros);
        return resultado;
    }

    public double VolumeCilindro(int raio, int altura) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(raio), Integer.valueOf(altura)};
        double resultado = (double) cliente.execute("Calc.VolumeCilindro", parametros);
        return resultado;
    }

    // Cubo
    public double AreaCubo(int lado) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(lado)};
        double resultado = (double) cliente.execute("Calc.AreaCubo", parametros);
        return resultado;
    }

    public double VolumeCubo(int lado) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(lado)};
        double resultado = (double) cliente.execute("Calc.VolumeCubo", parametros);
        return resultado;
    }

    // Esfera
    public double AreaEsfera(int raio) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(raio)};
        double resultado = (double) cliente.execute("Calc.AreaEsfera", parametros);
        return resultado;
    }

    public double VolumeEsfera(int raio) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(raio)};
        double resultado = (double) cliente.execute("Calc.VolumeEsfera", parametros);
        return resultado;
    }
}







