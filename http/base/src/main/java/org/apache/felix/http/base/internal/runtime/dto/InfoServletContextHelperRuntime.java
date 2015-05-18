/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.felix.http.base.internal.runtime.dto;

import javax.servlet.ServletContext;

import org.apache.felix.http.base.internal.runtime.ServletContextHelperInfo;

public class InfoServletContextHelperRuntime implements ServletContextHelperRuntime, Comparable<InfoServletContextHelperRuntime>
{
    private final ServletContextHelperInfo info;

    private final ServletContext servletContext;

    public InfoServletContextHelperRuntime(final ServletContextHelperInfo info)
    {
        this(info, null);
    }

    public InfoServletContextHelperRuntime(final ServletContextHelperInfo info, final ServletContext ctx)
    {
        this.info = info;
        this.servletContext = ctx;
    }

    @Override
    public ServletContext getSharedContext()
    {
        return this.servletContext;
    }

    @Override
    public ServletContextHelperInfo getContextInfo()
    {
        return info;
    }

    @Override
    public int compareTo(final InfoServletContextHelperRuntime other)
    {
        return info.compareTo(other.info);
    }
}