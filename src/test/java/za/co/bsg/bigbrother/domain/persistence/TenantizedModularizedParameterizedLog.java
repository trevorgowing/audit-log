package za.co.bsg.bigbrother.domain.persistence;

import java.util.HashMap;
import java.util.Map;

public class TenantizedModularizedParameterizedLog extends BasicLog implements Tenantized, Modularized, Parameterized {

    private String tenantId;

    private String module;

    private Map<String, Object> parameters = new HashMap<>();

    @Override
    public String getTenantId() {
        return tenantId;
    }

    @Override
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public String getModule() {
        return module;
    }

    @Override
    public void setModule(String module) {
        this.module = module;
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
    public void putParameter(String key, Object value) {
        parameters.put(key, value);
    }
}
