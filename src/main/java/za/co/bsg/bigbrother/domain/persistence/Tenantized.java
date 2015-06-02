package za.co.bsg.bigbrother.domain.persistence;

/**
 * Defines a {@link BasicLog} which is in addition tenantized;
 */
public interface Tenantized {

    String getTenantIdentifier();

    void setTenantIdentifier(String tenantIdentifier);
}
