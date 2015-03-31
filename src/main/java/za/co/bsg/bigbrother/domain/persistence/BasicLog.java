package za.co.bsg.bigbrother.domain.persistence;

import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.util.Objects;

@Document(collection = "logs")
public class BasicLog {

    private String sourceApplication;

    private String userId;

    private String action;

    private Instant actionInstant;

    public BasicLog() {}

    public String getSourceApplication() {
        return sourceApplication;
    }

    public void setSourceApplication(String sourceApplication) {
        this.sourceApplication = sourceApplication;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BasicLog)) return false;
        BasicLog basicLog = (BasicLog) o;
        return Objects.equals(getSourceApplication(), basicLog.getSourceApplication()) &&
                Objects.equals(getUserId(), basicLog.getUserId()) &&
                Objects.equals(getAction(), basicLog.getAction()) &&
                Objects.equals(getActionInstant(), basicLog.getActionInstant());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSourceApplication(), getUserId(), getAction(), getActionInstant());
    }

    @Override
    public String toString() {
        return "BasicLog{" + "sourceApplication='" + sourceApplication + '\'' +
                ", userId='" + userId + '\'' +
                ", action='" + action + '\'' +
                ", actionInstant=" + actionInstant + '}';
    }
}
