CREATE TABLE customer (
       customer_id serial4 NOT NULL,
       customer_name varchar(100) NULL,
       audit_insert_ts timestamp NULL DEFAULT now(),
       audit_last_upd_ts timestamp NULL DEFAULT now(),
       audit_username varchar(100) NULL DEFAULT USER,
       internal_contact_names varchar(1024) NULL,
       internal_contact_emails varchar(1024) NULL,
       external_contact_names varchar(1024) NULL,
       external_contact_emails varchar(1024) NULL,
       customer_tags varchar(1024) NULL,
       CONSTRAINT customer_pkey PRIMARY KEY (customer_id)
);