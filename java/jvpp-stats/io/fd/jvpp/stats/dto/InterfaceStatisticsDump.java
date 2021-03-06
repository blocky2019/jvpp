/*
 * Copyright (c) 2019 Cisco and/or its affiliates.
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

package io.fd.jvpp.stats.dto;

/**
 * <p>This class represents request DTO.
 */
public final class InterfaceStatisticsDump implements io.fd.jvpp.dto.JVppDump {

    @Override
    @io.fd.jvpp.coverity.SuppressFBWarnings("UWF_UNWRITTEN_PUBLIC_OR_PROTECTED_FIELD")
    public int hashCode() {
        return java.util.Objects.hash();
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "InterfaceStatisticsDump{}";
    }

    @Override
    public int send(final io.fd.jvpp.JVpp jvpp) throws io.fd.jvpp.VppInvocationException {
        return ((io.fd.jvpp.stats.JVppStats) jvpp).interfaceStatisticsDump();
    }
}
