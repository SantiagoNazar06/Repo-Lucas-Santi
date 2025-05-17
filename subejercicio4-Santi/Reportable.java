import java.util.ArrayList;
import java.util.List;

public interface Reportable {
    String generarReporte();

    public static List<String> generarReportes(List<Reportable> objetos) {
        List<String> reportes = new ArrayList<>();

        for(Reportable rep : objetos){
            if(rep instanceof Cliente){
                reportes.add(((Cliente) rep).generarReporte());
            }
        }

        return reportes;
    }
}