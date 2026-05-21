package com.example.vulnerable.service;

import java.net.http.HttpRequest;

public class QueryBuilder {

        private String clause;

        public QueryBuilder where(String clause) {
            this.clause = clause;
            return this;
        }

        public String build() {
            return "SELECT * FROM users WHERE " + clause;
        }
    }




