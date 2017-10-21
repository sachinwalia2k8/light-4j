/*
 * Copyright (c) 2016 Network New Technologies Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.networknt.utility;

import io.undertow.util.HttpString;

/**
 * Constants shared by all light-4j components.
 *
 * @author Steve Hu
 */
public class Constants {
    // headers

    public static final String CORRELATION_ID_STRING = "X-Correlation-Id";
    public static final String TRACEABILITY_ID_STRING = "X-Traceability-Id";
    public static final String USER_ID_STRING = "user_id";
    public static final String CLIENT_ID_STRING = "client_id";
    public static final String SCOPE_CLIENT_ID_STRING = "scope_client_id";
    public static final String SCOPE_STRING = "scope";
    public static final String ENDPOINT_STRING = "endpoint";
    public static final String SWAGGER_OPERATION_STRING = "swagger_operation";
    public static final String SCOPE_TOKEN_STRING = "X-Scope-Token";
    public static final String CONSUL_TOKEN_STRING = "X-Consul-Token";

    public static final HttpString CORRELATION_ID = new HttpString(CORRELATION_ID_STRING);
    public static final HttpString TRACEABILITY_ID = new HttpString(TRACEABILITY_ID_STRING);
    public static final HttpString USER_ID = new HttpString(USER_ID_STRING);
    public static final HttpString CLIENT_ID = new HttpString(CLIENT_ID_STRING);
    public static final HttpString SCOPE_CLIENT_ID = new HttpString(SCOPE_CLIENT_ID_STRING);
    public static final HttpString SCOPE = new HttpString(SCOPE_STRING);
    public static final HttpString ENDPOINT = new HttpString(ENDPOINT_STRING);
    public static final HttpString SWAGGER_OPERATION = new HttpString(SWAGGER_OPERATION_STRING);
    public static final HttpString SCOPE_TOKEN = new HttpString(SCOPE_TOKEN_STRING);
    public static final HttpString CONSUL_TOKEN = new HttpString(CONSUL_TOKEN_STRING);

    // Logger
    public static final String AUDIT_LOGGER = "Audit";

    // Framework
    public static final String FRAMEWORK_NAME = "light";
    public static final String METHOD_CONFIG_PREFIX = "methodconfig.";

    // Switcher
    public static final String REGISTRY_HEARTBEAT_SWITCHER = "RegistryHeartBeat";

    public static final int MILLS = 1;
    public static final int SECOND_MILLS = 1000;
    public static final int MINUTE_MILLS = 60 * SECOND_MILLS;

    public static final String DEFAULT_VERSION = "1.0";
    public static final String DEFAULT_VALUE = "default";
    public static final int DEFAULT_INT_VALUE = 0;
    public static final String DEFAULT_CHARACTER = "utf-8";

    public static final String NODE_TYPE_SERVICE = "service";

    public static final String PROTOCOL_SEPARATOR = "://";
    public static final String PROTOCOL_LIGHT = "light";
    public static final String TAG_ENVIRONMENT = "environment";
    public static final String PATH_SEPARATOR = "/";

    public static final String REGISTRY_PROTOCOL_LOCAL = "local";
    public static final String REGISTRY_PROTOCOL_DIRECT = "direct";
    public static final String REGISTRY_PROTOCOL_ZOOKEEPER = "zookeeper";

    public static final String ZOOKEEPER_REGISTRY_NAMESPACE = "/light";
    public static final String ZOOKEEPER_REGISTRY_COMMAND = "/command";


}
