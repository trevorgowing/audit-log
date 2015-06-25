package com.trevorgowing.auditlog.domain.persistence;

public class TenantizedLog implements Tenantized {

    private String tenantIdentifier;

    @Override
    public String getTenantIdentifier() {
        return tenantIdentifier;
    }

    @Override
    public void setTenantIdentifier(String tenantIdentifier) {
        this.tenantIdentifier = tenantIdentifier;
    }
}
