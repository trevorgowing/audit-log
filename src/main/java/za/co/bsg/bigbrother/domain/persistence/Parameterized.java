package za.co.bsg.bigbrother.domain.persistence;

import java.util.Map;

/**
 * Defines a {@link BasicLog} which has in addition a {@link Map} of parameters;
 */
public interface Parameterized {

    Object getParameter(String key);

    void putParameter(String key, Object value);

    Map<String, Object> getParameters();

    void setParameters(Map<String, Object> parameters);
}
