package Services;

import data.Nif;
import data.SmallCode;
import Exception.*;
import java.util.Date;

public interface CertificationAuthority {// External service that represents the different trusted certification entities
    boolean sendPIN (Nif nif, Date date) throws NifNotRegisteredException,
            IncorrectValDateException, AnyMobileRegisteredException,
            ConnectException;
    boolean checkPIN (Nif nif, SmallCode pin) throws NotValidPINException,ConnectException;
}
