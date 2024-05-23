package org.keycloak.federation.database;

import org.jboss.logging.Logger;
import org.keycloak.component.ComponentModel;
import org.keycloak.models.KeycloakSession;
import org.keycloak.storage.UserStorageProviderFactory;

public class DatabaseFederationProviderFactory implements UserStorageProviderFactory<DatabaseFederationProvider> {
    public static final String PROVIDER_ID = "database";

    private static final Logger logger = Logger.getLogger(DatabaseFederationProviderFactory.class);

    @Override
    public DatabaseFederationProvider create(KeycloakSession session, ComponentModel model) {
        return new DatabaseFederationProvider(session, model);
    }

    @Override
    public String getId() {
        return PROVIDER_ID;
    }

    @Override
    public String getHelpText() {
        return "Database Federation Provider";
    }

    @Override
    public void close() {
        logger.info("<<<<<< Closing factory");
    }
}
