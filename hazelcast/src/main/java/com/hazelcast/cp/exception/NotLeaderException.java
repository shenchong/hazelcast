/*
 * Copyright (c) 2008-2019, Hazelcast, Inc. All Rights Reserved.
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

package com.hazelcast.cp.exception;

import com.hazelcast.core.Endpoint;
import com.hazelcast.cp.CPGroupId;

/**
 * A {@code CPSubsystemException} which is thrown when
 * a leader-only request is received by a non-leader member.
 */
public class NotLeaderException extends CPSubsystemException {
    private static final long serialVersionUID = 1817579502149525710L;

    public NotLeaderException(CPGroupId groupId, Endpoint local, Endpoint leader) {
        super(local + " is not LEADER of " + groupId + ". Known leader is: "
                + (leader != null ? leader : "N/A") , leader);
    }
}
