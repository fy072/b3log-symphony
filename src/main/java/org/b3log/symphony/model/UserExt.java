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
package org.b3log.symphony.model;

/**
 * This class defines ext of user model relevant keys.
 *
 * @author <a href="mailto:DL88250@gmail.com">Liang Ding</a>
 * @version 1.0.0.0, Aug 2, 2012
 * @since 0.2.0
 * @see org.b3log.latke.model.User
 */
public final class UserExt {

    /**
     * Key of user article count.
     */
    public static final String USER_ARTICLE_COUNT = "userArticleCount";
    /**
     * Key of user comment count.
     */
    public static final String USER_COMMENT_COUNT = "userCommentCount";
    /**
     * Key of user status.
     */
    public static final String USER_STATUS = "userStatus";

    /**
     * Private constructor.
     */
    private UserExt() {
    }
}
