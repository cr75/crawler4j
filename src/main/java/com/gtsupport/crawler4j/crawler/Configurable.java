/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.gtsupport.crawler4j.crawler;

/**
 * Several core components of crawler4j extend this class
 * to make them configurable.
 *
 * @deprecated This will removed without notice.
 * @author Yasser Ganjisaffar
 */
@Deprecated
public abstract class Configurable {

    protected CrawlConfig config;

    protected Configurable(CrawlConfig config) {
        this.config = config;
    }

    public CrawlConfig getConfig() {
        return config;
    }
}