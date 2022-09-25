package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.search.c.dk */
/* compiled from: PG */
public enum C37504dk implements C62957cd {
    UNKNOWN_ROUTING_STATUS(0),
    UPDATED(1),
    FAILED_ROUTING_DUE_TO_INACTIVE_CLIENT(2),
    FAILED_ROUTING_DUE_TO_UNSUPPORTED_HOTWORD_ROUTE_PARAMS(4),
    FAILED_ROUTING_TO_BUILTIN_DUE_TO_AUDIO_REQUEST_CLIENT_CONNECTED_TO_BLUETOOTH(5),
    FAILED_ROUTING_DUE_TO_DISCONNECT_ALREADY_CALLED(6),
    FAILED_ROUTING_DUE_TO_AUDIO_ADAPTER_NOT_REGISTERED(7),
    FAILED_ROUTING_DUE_TO_HANDOVER_ROUTE_NOT_MAPPED(8),
    FAILED_ROUTING_DUE_TO_START_SCO_FAILED(9),
    FAILED_ROUTING_DUE_TO_AUDIO_ROUTE_LOST(10),
    FAILED_ROUTING_DUE_TO_SCO_TIMEOUT(11),
    FAILED_ROUTING_DUE_TO_BLUETOOTH_NOT_AVAILABLE(12),
    FAILED_ROUTING_DUE_TO_NO_BLUETOOTH_HEADSET_FOUND(13),
    FAILED_ROUTING_DUE_TO_NO_BLUETOOTH_PROFILE_FOUND(14),
    FAILED_ROUTING_DUE_TO_GETTING_BLUETOOTH_HEADSET_FAILED(15),
    FAILED_ROUTING_DUE_TO_BLUETOOTH_PERMISSION_DENIED(16),
    FAILED_ROUTING_DUE_TO_CANNOT_CONNECT_TO_AUDIO_ADAPTER(17),
    FAILED_ROUTING_UNEXPECTED_AUDIO_ADAPTER_CONNECTION(18),
    FAILED_GETTING_ROUTING_STATUS_FUTURE(101);
    

    /* renamed from: t */
    public final int f99586t;

    private C37504dk(int i) {
        this.f99586t = i;
    }

    /* renamed from: a */
    public static C37504dk m66506a(int i) {
        if (i == 0) {
            return UNKNOWN_ROUTING_STATUS;
        }
        if (i == 1) {
            return UPDATED;
        }
        if (i == 2) {
            return FAILED_ROUTING_DUE_TO_INACTIVE_CLIENT;
        }
        if (i == 101) {
            return FAILED_GETTING_ROUTING_STATUS_FUTURE;
        }
        switch (i) {
            case 4:
                return FAILED_ROUTING_DUE_TO_UNSUPPORTED_HOTWORD_ROUTE_PARAMS;
            case 5:
                return FAILED_ROUTING_TO_BUILTIN_DUE_TO_AUDIO_REQUEST_CLIENT_CONNECTED_TO_BLUETOOTH;
            case 6:
                return FAILED_ROUTING_DUE_TO_DISCONNECT_ALREADY_CALLED;
            case 7:
                return FAILED_ROUTING_DUE_TO_AUDIO_ADAPTER_NOT_REGISTERED;
            case 8:
                return FAILED_ROUTING_DUE_TO_HANDOVER_ROUTE_NOT_MAPPED;
            case 9:
                return FAILED_ROUTING_DUE_TO_START_SCO_FAILED;
            case 10:
                return FAILED_ROUTING_DUE_TO_AUDIO_ROUTE_LOST;
            case 11:
                return FAILED_ROUTING_DUE_TO_SCO_TIMEOUT;
            case 12:
                return FAILED_ROUTING_DUE_TO_BLUETOOTH_NOT_AVAILABLE;
            case 13:
                return FAILED_ROUTING_DUE_TO_NO_BLUETOOTH_HEADSET_FOUND;
            case 14:
                return FAILED_ROUTING_DUE_TO_NO_BLUETOOTH_PROFILE_FOUND;
            case 15:
                return FAILED_ROUTING_DUE_TO_GETTING_BLUETOOTH_HEADSET_FAILED;
            case 16:
                return FAILED_ROUTING_DUE_TO_BLUETOOTH_PERMISSION_DENIED;
            case 17:
                return FAILED_ROUTING_DUE_TO_CANNOT_CONNECT_TO_AUDIO_ADAPTER;
            case 18:
                return FAILED_ROUTING_UNEXPECTED_AUDIO_ADAPTER_CONNECTION;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m66507b() {
        return C37503dj.f99565a;
    }

    public final int getNumber() {
        return this.f99586t;
    }

    public final String toString() {
        return Integer.toString(this.f99586t);
    }
}
