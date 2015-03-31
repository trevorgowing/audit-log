package za.co.bsg.bigbrother.domain.persistence;

/**
 * Defines a {@link BasicLog} in which the source application is modularized.
 */
public interface Modularized {

    String getModule();

    void setModule(String module);
}
