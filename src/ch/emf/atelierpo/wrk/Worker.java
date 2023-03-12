package ch.emf.atelierpo.wrk;


/**
 *
 * @author Mario Ramalho(EMF - Fribourg)
 */
public class Worker {


    public boolean controleNumeroTelMobile(String prefix, String numero) {
        boolean isCorrect = false;
        if (prefix != null && numero != null) {
            isCorrect = true;
        }
        return isCorrect;
    }

}
