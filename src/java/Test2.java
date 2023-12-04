
import java.util.Date;
import ma.projet.beans.Employe;
import ma.projet.beans.Service;
import ma.projet.service.EmployeService;
import ma.projet.service.ServiceService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class Test2 {
    
     public static void main(String[] args) {
        ServiceService ss = new ServiceService();
        
        ss.create(new Service("Sevice1"));
        ss.create(new Service("Sevice2"));
        ss.create(new Service("Sevice3"));
        EmployeService es = new EmployeService();
        es.create(new Employe("nom1", "prenom1", new Date(), null, ss.getById(1L), null, null));
        es.create(new Employe("nom2", "prenom2", new Date(), null, ss.getById(1L), es.getById(1L), null));

    }
    
}
