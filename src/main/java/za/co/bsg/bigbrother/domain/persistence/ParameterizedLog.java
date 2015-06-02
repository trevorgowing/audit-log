package za.co.bsg.bigbrother.domain.persistence;

import java.util.HashMap;
import java.util.Map;

public class ParameterizedLog implements Parameterized {

    private Map<String, Object> parameters = new HashMap<>();

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
}
