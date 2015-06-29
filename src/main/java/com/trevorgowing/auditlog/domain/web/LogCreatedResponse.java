package com.trevorgowing.auditlog.domain.web;

import java.io.Serializable;

public class LogCreatedResponse implements Serializable {

    private long id;

    public LogCreatedResponse(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
