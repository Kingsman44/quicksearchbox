package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.search.c.cy */
/* compiled from: PG */
public enum C37476cy implements C62957cd {
    UNKNOWN_DISCONNECT_REASON(0),
    DISCONNECT_REASON_FAILED_CONNECT_TO_AUDIO_ROUTE(1),
    DISCONNECT_REASON_AUDIO_ROUTE_LOST(2),
    DISCONNECT_REASON_CLIENT_REQUESTED_ROUTE_UPDATE(3),
    DISCONNECT_REASON_MISSING_AUDIO_ROUTE_IMPLEMENTATION(4),
    DISCONNECT_REASON_CLIENT_DEACTIVATED(5),
    DISCONNECT_REASON_AUDIO_ADAPTER_UNREGISTERED(6),
    DISCONNECT_REASON_AUDIO_ADAPTER_NOT_REGISTERED(7),
    DISCONNECT_REASON_INACTIVE_CLIENT(8),
    DISCONNECT_REASON_START_SCO_FAILED(9),
    DISCONNECT_REASON_START_SCO_TIMEOUT(10),
    DISCONNECT_REASON_NO_BLUETOOTH_HEADSET_CONNECTED(11),
    DISCONNECT_REASON_NO_BLUETOOTH_PROFILE_FOUND(12),
    DISCONNECT_REASON_FAILED_GETTING_BLUETOOTH_HEADSET(13),
    DISCONNECT_REASON_BLUETOOTH_NOT_AVAILABLE(14),
    DISCONNECT_REASON_BLUETOOTH_PERMISSION_DENIED(15),
    DISCONNECT_REASON_FAILED_CONNECT_TO_AUDIO_ADAPTER(16),
    DISCONNECT_REASON_UNEXPECTED_AUDIO_ADAPTER_CONNECTION(17),
    FAILED_GETTING_DISCONNECT_REASON(100);
    

    /* renamed from: t */
    public final int f99492t;

    private C37476cy(int i) {
        this.f99492t = i;
    }

    /* renamed from: a */
    public static C37476cy m66492a(int i) {
        if (i == 100) {
            return FAILED_GETTING_DISCONNECT_REASON;
        }
        switch (i) {
            case 0:
                return UNKNOWN_DISCONNECT_REASON;
            case 1:
                return DISCONNECT_REASON_FAILED_CONNECT_TO_AUDIO_ROUTE;
            case 2:
                return DISCONNECT_REASON_AUDIO_ROUTE_LOST;
            case 3:
                return DISCONNECT_REASON_CLIENT_REQUESTED_ROUTE_UPDATE;
            case 4:
                return DISCONNECT_REASON_MISSING_AUDIO_ROUTE_IMPLEMENTATION;
            case 5:
                return DISCONNECT_REASON_CLIENT_DEACTIVATED;
            case 6:
                return DISCONNECT_REASON_AUDIO_ADAPTER_UNREGISTERED;
            case 7:
                return DISCONNECT_REASON_AUDIO_ADAPTER_NOT_REGISTERED;
            case 8:
                return DISCONNECT_REASON_INACTIVE_CLIENT;
            case 9:
                return DISCONNECT_REASON_START_SCO_FAILED;
            case 10:
                return DISCONNECT_REASON_START_SCO_TIMEOUT;
            case 11:
                return DISCONNECT_REASON_NO_BLUETOOTH_HEADSET_CONNECTED;
            case 12:
                return DISCONNECT_REASON_NO_BLUETOOTH_PROFILE_FOUND;
            case 13:
                return DISCONNECT_REASON_FAILED_GETTING_BLUETOOTH_HEADSET;
            case 14:
                return DISCONNECT_REASON_BLUETOOTH_NOT_AVAILABLE;
            case 15:
                return DISCONNECT_REASON_BLUETOOTH_PERMISSION_DENIED;
            case 16:
                return DISCONNECT_REASON_FAILED_CONNECT_TO_AUDIO_ADAPTER;
            case 17:
                return DISCONNECT_REASON_UNEXPECTED_AUDIO_ADAPTER_CONNECTION;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m66493b() {
        return C37475cx.f99471a;
    }

    public final int getNumber() {
        return this.f99492t;
    }

    public final String toString() {
        return Integer.toString(this.f99492t);
    }
}
