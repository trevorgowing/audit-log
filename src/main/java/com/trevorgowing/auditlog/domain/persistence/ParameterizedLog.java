package com.trevorgowing.auditlog.domain.persistence;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ParameterizedLog extends SimpleLog implements Parameterized {

    private Map<String, Object> parameters = new HashMap<>();

    public ParameterizedLog(String action, Instant actionInstant, String actionedByUserIdentifier,
                            Map<String, Object> parameters) {
        super(action, actionInstant, actionedByUserIdentifier);
        this.parameters = parameters;
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
        ParameterizedLog parameterizedLogToCompareTo = (ParameterizedLog) objectToCompareTo;
        return Objects.equals(getParameters(), parameterizedLogToCompareTo.getParameters());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getParameters());
    }

    @Override
    public String toString() {
        final StringBuilder toStringBuilder = new StringBuilder(super.toString());
        toStringBuilder.append("parameters=").append(getParameters());
        return toStringBuilder.toString();
    }
}
