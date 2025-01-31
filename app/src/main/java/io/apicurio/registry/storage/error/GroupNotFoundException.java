/*
 * Copyright 2021 Red Hat
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
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

package io.apicurio.registry.storage.error;

import lombok.Getter;

/**
 * @author Fabian Martinez
 */
public class GroupNotFoundException extends NotFoundException {

    private static final long serialVersionUID = -5024749463194169679L;

    @Getter
    private final String groupId;


    public GroupNotFoundException(String groupId) {
        super(message(groupId));
        this.groupId = groupId;
    }


    public GroupNotFoundException(String groupId, Throwable cause) {
        super(message(groupId), cause);
        this.groupId = groupId;
    }


    private static String message(String groupId) {
        return "No group '" + groupId + "' was found.";
    }
}
