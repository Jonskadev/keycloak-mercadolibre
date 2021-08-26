/*
 * Copyright 2018 Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.keycloak.social.mercadolibre;

import org.keycloak.broker.oidc.OAuth2IdentityProviderConfig;
import org.keycloak.broker.provider.AbstractIdentityProviderFactory;
import org.keycloak.broker.social.SocialIdentityProviderFactory;
import org.keycloak.models.IdentityProviderModel;
import org.keycloak.models.KeycloakSession;

/**
 * @author <a href="mailto:juan.olguin.13@sansano.usm.cl">Juan Carlos Olguin</a>
 */
public class MercadolibreIdentityProviderFactory extends AbstractIdentityProviderFactory<MercadolibreIdentityProvider>
        implements SocialIdentityProviderFactory<MercadolibreIdentityProvider> {

    public static final String PROVIDER_ID = "mercadolibre";

    @Override
    public String getName() {
        return "Mercadolibre";
    }

    @Override
    public MercadolibreIdentityProvider create(KeycloakSession session, IdentityProviderModel model) {
        return new MercadolibreIdentityProvider(session, new MercadolibreIdentityProviderConfig(model));
    }

    @Override
    public MercadolibreIdentityProviderConfig createConfig() {
        return new MercadolibreIdentityProviderConfig();
    }

    @Override
    public String getId() {
        return PROVIDER_ID;
    }
}