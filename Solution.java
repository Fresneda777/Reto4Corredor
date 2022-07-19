//LA IMPORTACIÓN SIGUIENTE ES
//NECESARIA PARA MANIPULAR EL
//PARÁMETRO DE ENTRADA DE SU
//PROPUESTA DE SOLUCIÓN. NO LA
//DESCARTE
import java.util.ArrayList;

public class Solution {

    public static Object[] reporte(ArrayList<Corredor> carrera) {
        double suma = 0.0;
        double maximo = 0.00;
        double minimo = 99999.00;
        String corredorLento = "";
        String corredorRapido = "";
        for (int i = 0; i < carrera.size(); i++) {
            if (carrera.get(i).getTiempoMeta() < minimo) {
                minimo = carrera.get(i).getTiempoMeta();
                corredorLento = carrera.get(i).getNombreCompleto();
            }
        }

        for (int i = 0; i < carrera.size(); i++) {
            suma += carrera.get(i).getTiempoMeta();
        }

        for (int i = 0; i < carrera.size(); i++) {
            if (carrera.get(i).getTiempoMeta() > maximo) {
                maximo = carrera.get(i).getTiempoMeta();
                corredorRapido = carrera.get(i).getNombreCompleto();
            }
        }
        double promedio = suma / carrera.size();
        Object[] retorno = {promedio, corredorLento, minimo, corredorRapido, maximo};

        return retorno;
    }

}
