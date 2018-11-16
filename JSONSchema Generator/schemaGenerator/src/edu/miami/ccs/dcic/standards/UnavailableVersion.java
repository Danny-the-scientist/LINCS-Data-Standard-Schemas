

package edu.miami.ccs.dcic.standards;

public class UnavailableVersion extends Exception {

    /**
     * @author akoleti
     */
    private static final long serialVersionUID = 7146537640173260075L;

    public UnavailableVersion() {
    }

    public UnavailableVersion(String msg) {
        super(msg);
    }
}
