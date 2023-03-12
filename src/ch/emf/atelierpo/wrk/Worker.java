package ch.emf.atelierpo.wrk;


/**
 *
 * @author Mario Ramalho(EMF - Fribourg)
 */
public class Worker {


    public boolean controleNumeroTelMobile(String prefix, String numero) {
        boolean isNumeroValide = false;
        if (prefix != null && numero != null) {
            if (numero.matches("[0-9]{3} [0-9]{2} [0-9]{2}") && prefix.matches("[+]417[6789]")) {
                isNumeroValide = true;
            }
        }
        return isNumeroValide;
    }

}
