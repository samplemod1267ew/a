package publicadministratioon;

import data.*;

import java.io.File;
import java.util.Date;

public class CriminalRecordCertf extends PDFDocument { // Represents the Criminal Record Certificate
    private Nif nif;
    private String name;
    private Goal goal;
    private DigitalSignature digSign;
    private CrimConvictionsColl crimConvs;

    public CriminalRecordCertf (Nif nif, String name, Goal g, DigitalSignature ds, CrimConvictionsColl crmC,DocPath path, Date CreateDate) {
        super(CreateDate,path);
        this.nif=nif;
        this.name=name;
        this.goal=g;
        this.digSign=ds;
        this.crimConvs=crmC;


    } // Initializes attributes

    public Nif getNif() {
        return nif;
    }

    public String getName() {
        return name;
    }

    public Goal getGoal() {
        return goal;
    }

    public DigitalSignature getDigSign() {
        return digSign;
    }

    public CrimConvictionsColl getCrimConvs() {
        return crimConvs;
    }

    // the getters
}

