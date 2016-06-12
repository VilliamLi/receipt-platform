package com.charleskeith.core.infrastructure.jdbc;

import com.charleskeith.core.domain.shared.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * 15-6-13
 *
 * @author Shengzhao Li
 */
public abstract class AbstractJdbcRepository implements Repository {


    @Autowired
    protected JdbcTemplate jdbcTemplate;

}
