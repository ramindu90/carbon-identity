/*
 * Copyright (c) 2015 WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.workflow.mgt;

import java.util.HashSet;
import java.util.Set;

public class WorkFlowConstants {

    public static final String WF_STATUS_NO_MATCHING_EXECUTORS = "NO_MATCHING_EXECUTOR";

    public static final String WF_PARAM_TYPE_PRIMITIVE = "primitive";
    public static final String WF_PARAM_TYPE_STRING = "string";
    public static final String WF_PARAM_TYPE_BASIC_LIST = "list";
    public static final String WF_PARAM_TYPE_BASIC_MAP = "map";

    public static final String WF_REQUEST_STATUS_CREATED = "created";

    public static final Set<Class> NUMERIC_CLASSES;

    static {
        NUMERIC_CLASSES = new HashSet<Class>();
        NUMERIC_CLASSES.add(Integer.class);
        NUMERIC_CLASSES.add(Long.class);
        NUMERIC_CLASSES.add(Short.class);
        NUMERIC_CLASSES.add(Character.class);
        NUMERIC_CLASSES.add(Byte.class);
        NUMERIC_CLASSES.add(Float.class);
        NUMERIC_CLASSES.add(Double.class);
    }
}
