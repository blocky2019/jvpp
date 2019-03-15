/*
 * Copyright (c) 2016 Cisco and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.fd.jvpp.core.examples;

import io.fd.jvpp.core.types.InterfaceIndex;
import java.io.PrintStream;
import io.fd.jvpp.core.types.IfStatusFlags;
import io.fd.jvpp.core.dto.SwInterfaceSetFlags;
import io.fd.jvpp.core.dto.SwInterfaceEvent;
import io.fd.jvpp.core.dto.WantInterfaceEvents;

final class NotificationUtils {

    private NotificationUtils() {}

    static PrintStream printNotification(final SwInterfaceEvent msg) {
        return System.out.printf("Received interface notification: ifc: %s%n", msg);
    }

    static SwInterfaceSetFlags getChangeInterfaceState() {
        final SwInterfaceSetFlags swInterfaceSetFlags = new SwInterfaceSetFlags();
        swInterfaceSetFlags.flags = new IfStatusFlags();
        swInterfaceSetFlags.flags.add(IfStatusFlags.IfStatusFlagsOptions.IF_STATUS_API_FLAG_ADMIN_UP);
        swInterfaceSetFlags.swIfIndex = new InterfaceIndex();
        swInterfaceSetFlags.swIfIndex.interfaceindex = 0;
        return swInterfaceSetFlags;
    }

    static WantInterfaceEvents getEnableInterfaceNotificationsReq() {
        WantInterfaceEvents wantInterfaceEvents = new WantInterfaceEvents();
        wantInterfaceEvents.pid = 1;
        wantInterfaceEvents.enableDisable = 1;
        return wantInterfaceEvents;
    }

    static WantInterfaceEvents getDisableInterfaceNotificationsReq() {
        WantInterfaceEvents wantInterfaceEvents = new WantInterfaceEvents();
        wantInterfaceEvents.pid = 1;
        wantInterfaceEvents.enableDisable = 0;
        return wantInterfaceEvents;
    }
}
