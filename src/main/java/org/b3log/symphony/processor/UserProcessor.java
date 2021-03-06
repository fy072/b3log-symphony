/*
 * Copyright (c) 2012, B3log Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.b3log.symphony.processor;

import java.io.IOException;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.b3log.latke.annotation.RequestProcessing;
import org.b3log.latke.annotation.RequestProcessor;
import org.b3log.latke.service.LangPropsService;
import org.b3log.latke.servlet.HTTPRequestContext;
import org.b3log.latke.servlet.HTTPRequestMethod;
import org.b3log.symphony.service.UserMgmtService;
import org.b3log.symphony.service.UserQueryService;

/**
 * User processor.
 * 
 * <p>
 * For user
 *   <ul>
 *     <li>User Home</li>
 *     <li>Settings</li>
 *   </ul>
 * </p>
 *
 * @author <a href="mailto:DL88250@gmail.com">Liang Ding</a>
 * @version 1.0.0.0, Aug 16, 2012
 * @since 0.2.0
 */
@RequestProcessor
public class UserProcessor {

    /**
     * Logger.
     */
    private static final Logger LOGGER = Logger.getLogger(UserProcessor.class.getName());
    /**
     * User management service.
     */
    private UserMgmtService userMgmtService = UserMgmtService.getInstance();
    /**
     * User query service.
     */
    private UserQueryService userQueryService = UserQueryService.getInstance();
    /**
     * Language service.
     */
    private LangPropsService langPropsService = LangPropsService.getInstance();

    /**
     * Shows user home page.
     * 
     * @param context the specified context
     * @param request the specified request
     * @param response the specified response
     * @throws IOException io exception 
     */
    @RequestProcessing(value = "/home/*", method = HTTPRequestMethod.GET)
    public void showHome(final HTTPRequestContext context, final HttpServletRequest request, final HttpServletResponse response)
            throws IOException {
        final String requestURI = request.getRequestURI();
        
        final String userName = requestURI.substring("/home/".length());
        
    }

    /**
     * Shows settings page.
     * 
     * @param context the specified context
     * @param request the specified request
     * @param response the specified response
     * @throws IOException io exception 
     */
    @RequestProcessing(value = "/settings", method = HTTPRequestMethod.GET)
    public void showSettings(final HTTPRequestContext context, final HttpServletRequest request, final HttpServletResponse response)
            throws IOException {
    }

    /**
     * Updates user settings.
     * 
     * @param context the specified context
     * @param request the specified request
     * @param response the specified response
     * @throws ServletException servlet exception
     * @throws IOException io exception 
     */
    @RequestProcessing(value = "/settings", method = HTTPRequestMethod.POST)
    public void updateSettings(final HTTPRequestContext context, final HttpServletRequest request, final HttpServletResponse response)
            throws ServletException, IOException {
    }
}
