package com.trevorgowing.auditlog.domain.persistence;

import java.time.Instant;
import java.util.Objects;

public class TenantizedLog extends SimpleLog implements Tenantized {

    private String tenantIdentifier;

    public TenantizedLog(String action, Instant actionInstant, String actionedByUserIdentifier, String tenantIdentifier) {
        super(action, actionInstant, actionedByUserIdentifier);
        this.tenantIdentifier = tenantIdentifier;
    }

    @Override
    public String getTenantIdentifier() {
        return tenantIdentifier;
    }

    @Override
    public void setTenantIdentifier(String tenantIdentifier) {
        this.tenantIdentifier = tenantIdentifier;
    }

    @Override
    public boolean equals(Object objectToCompareTo) {
        if (this == objectToCompareTo) return true;
        if (objectToCompareTo == null || getClass() != objectToCompareTo.getClass()) return false;
        if (!super.equals(objectToCompareTo)) return false;
        TenantizedLog tenantizedLogToCompareTo = (TenantizedLog) objectToCompareTo;
        return Objects.equals(getTenantIdentifier(), tenantizedLogToCompareTo.getTenantIdentifier());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTenantIdentifier());
    }

    @Override
    public String toString() {
        final StringBuilder toStringBuilder = new StringBuilder(super.toString());
        toStringBuilder.append("tenantIdentifier='").append(getTenantIdentifier()).append('\'');
        return toStringBuilder.toString();
    }
}
