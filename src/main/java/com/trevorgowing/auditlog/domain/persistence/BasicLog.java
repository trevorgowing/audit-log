package com.trevorgowing.auditlog.domain.persistence;

import org.springframework.data.elasticsearch.annotations.Document;

import java.time.Instant;
import java.util.Objects;

@Document(indexName = "logs")
public class BasicLog {

    private String action;

    private Instant actionInstant;

    private String actionedByUserIdentifier;

    public BasicLog() {}

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
        if (!(objectToCompareTo instanceof BasicLog)) return false;
        BasicLog basicLogToCompareTo = (BasicLog) objectToCompareTo;
        return Objects.equals(getActionedByUserIdentifier(), basicLogToCompareTo.getActionedByUserIdentifier()) &&
                Objects.equals(getAction(), basicLogToCompareTo.getAction()) &&
                Objects.equals(getActionInstant(), basicLogToCompareTo.getActionInstant());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getActionedByUserIdentifier(), getAction(), getActionInstant());
    }

    @Override
    public String toString() {
        return "BasicLog{" + "userId='" + actionedByUserIdentifier + '\'' +
                ", action='" + action + '\'' +
                ", actionInstant=" + actionInstant + '}';
    }
}
