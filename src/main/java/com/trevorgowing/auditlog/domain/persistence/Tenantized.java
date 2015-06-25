package com.trevorgowing.auditlog.domain.persistence;

/**
 * Defines a {@link SimpleLog} which is in addition tenantized;
 */
public interface Tenantized {

    String getTenantIdentifier();

    void setTenantIdentifier(String tenantIdentifier);
}
