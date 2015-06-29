package com.trevorgowing.auditlog.repository;

import com.trevorgowing.auditlog.domain.persistence.SimpleLog;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;

public interface LogRepository extends ElasticsearchCrudRepository<SimpleLog, Long> {
}
