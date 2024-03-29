package Services;
import data.*;
import publicadministratioon.*;
import Exception.*;

import java.math.BigDecimal;
import java.util.Date;

public interface CAS {// External service that represents the Credit Authorization Service
    boolean askForApproval(String nTrans, CreditCard cardData,
                           Date date, BigDecimal imp) throws NotValidPaymentDataException,
            InsufficientBalanceException, ConnectException;
}
