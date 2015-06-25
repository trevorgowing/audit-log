package com.trevorgowing.auditlog.domain.persistence;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TenantizedParameterizedLog extends SimpleLog implements Tenantized, Parameterized {

    private String tenantIdentifier;
    private Map<String, Object> parameters = new HashMap<>();

    public TenantizedParameterizedLog(String action, Instant actionInstant, String actionedByUserIdentifier,
                                      String tenantIdentifier, Map<String, Object> parameters) {
        super(action, actionInstant, actionedByUserIdentifier);
        this.tenantIdentifier = tenantIdentifier;
        this.parameters = parameters;
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
    public Object getParameter(String key) {
        return parameters.get(key);
    }

    @Override
    public void putParameter(String key, Object value) {
        parameters.put(key, value);
    }

    @Override
    public Map<String, Object> getParameters() {
        return parameters;
    }

    @Override
    public void setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
    }

    @Override
    public boolean equals(Object objectToCompareTo) {
        if (this == objectToCompareTo) return true;
        if (objectToCompareTo == null || getClass() != objectToCompareTo.getClass()) return false;
        if (!super.equals(objectToCompareTo)) return false;
        TenantizedParameterizedLog tenantizedParameterizedLogToCompareTo = (TenantizedParameterizedLog) objectToCompareTo;
        return Objects.equals(getTenantIdentifier(), tenantizedParameterizedLogToCompareTo.getTenantIdentifier()) &&
                Objects.equals(getParameters(), tenantizedParameterizedLogToCompareTo.getParameters());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTenantIdentifier(), getParameters());
    }

    @Override
    public String toString() {
        final StringBuilder toStringBuilder = new StringBuilder(super.toString());
        toStringBuilder.append("tenantIdentifier='").append(getTenantIdentifier()).append('\'');
        toStringBuilder.append(", parameters=").append(getParameters());
        return toStringBuilder.toString();
    }
}
