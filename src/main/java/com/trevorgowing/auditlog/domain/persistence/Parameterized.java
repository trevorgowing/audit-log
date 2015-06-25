package com.trevorgowing.auditlog.domain.persistence;

import java.util.Map;

/**
 * Defines a {@link SimpleLog} which has in addition a {@link String} to {@link Object} {@link Map} of parameters;
 */
public interface Parameterized {

    Object getParameter(String key);

    void putParameter(String key, Object value);

    Map<String, Object> getParameters();

    void setParameters(Map<String, Object> parameters);
}
