package mx.com.gm.test;

import java.util.List;
import mx.com.gm.dao.AlumnoDAO;
import mx.com.gm.dao.DomicilioDAO;

public class testDAOs {
    public static void main(String[] args) {
        AlumnoDAO alumnoDao = new AlumnoDAO();
        System.out.println("Alumnos:");
        imprimir(alumnoDao.listar());
        
        System.out.println("domicilios:");
        DomicilioDAO domicilioDao = new DomicilioDAO();
        imprimir(domicilioDao.listar());
    }
    
    private static void imprimir(List coleccion){
        for(Object o: coleccion){
            System.out.println("o = " + o);
        }
    }
}
