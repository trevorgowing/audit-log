package com.trevorgowing.auditlog.domain.persistence;

import org.springframework.data.elasticsearch.annotations.Document;

import java.time.Instant;
import java.util.Objects;

@Document(indexName = "logs")
public class SimpleLog {

    private String action;
    private Instant actionInstant;
    private String actionedByUserIdentifier;

    public SimpleLog() {}

    public SimpleLog(String action, Instant actionInstant, String actionedByUserIdentifier) {
        this.action = action;
        this.actionInstant = actionInstant;
        this.actionedByUserIdentifier = actionedByUserIdentifier;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Instant getActionInstant() {
        return actionInstant;
    }

    public void setActionInstant(Instant actionInstant) {
        this.actionInstant = actionInstant;
    }

    public String getActionedByUserIdentifier() {
        return actionedByUserIdentifier;
    }

    public void setActionedByUserIdentifier(String actionedByUserIdentifier) {
        this.actionedByUserIdentifier = actionedByUserIdentifier;
    }

    @Override
    public boolean equals(Object objectToCompareTo) {
        if (this == objectToCompareTo) return true;
        if (objectToCompareTo == null || getClass() != objectToCompareTo.getClass()) return false;
        SimpleLog simpleLogToCompareTo = (SimpleLog) objectToCompareTo;
        return Objects.equals(getAction(), simpleLogToCompareTo.getAction()) &&
                Objects.equals(getActionInstant(), simpleLogToCompareTo.getActionInstant()) &&
                Objects.equals(getActionedByUserIdentifier(), simpleLogToCompareTo.getActionedByUserIdentifier());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAction(), getActionInstant(), getActionedByUserIdentifier());
    }

    @Override
    public String toString() {
        final StringBuilder toStringBuilder = new StringBuilder(getClass().getSimpleName());
        toStringBuilder.append(": ").append("action='").append(getAction()).append('\'');
        toStringBuilder.append(", actionInstant=").append(getActionInstant());
        toStringBuilder.append(", actionedByUserIdentifier='").append(getActionedByUserIdentifier()).append('\'');
        return toStringBuilder.toString();
    }
}
