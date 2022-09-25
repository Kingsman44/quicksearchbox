package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.search.c.ef */
/* compiled from: PG */
public enum C37565ef implements C62957cd {
    UNSET(0),
    CLIENT_REQUESTED(1),
    NEW_AUDIO_REQUEST_CLIENT_LISTENING(2),
    NEW_HOTWORD_CLIENT_LISTENING(3),
    TIMEOUT(4),
    CLIENT_DEACTIVATED(5),
    FAILED_START_LISTENING(6),
    SEAMLESS_HANDOVER_TIMEOUT(7),
    FAILED_TO_CONNECT_TO_AUDIO_ROUTE(100),
    AUDIO_ROUTE_LOST(101),
    AUDIO_ROUTE_DISCONNECT_CLIENT_REQUESTED(102),
    MISSING_AUDIO_ROUTE_IMPLEMENTATION(103),
    ERROR_IN_GETTING_AUDIO_ROUTE_DISCONNECT_STATUS(104),
    UNKNOWN_AUDIO_ROUTE_DISCONNECT_STATUS(105),
    AUDIO_ADAPTER_NOT_REGISTERED(106),
    UNEXPECTED_AUDIO_SOURCE_OPENED(107);
    

    /* renamed from: q */
    public final int f99828q;

    private C37565ef(int i) {
        this.f99828q = i;
    }

    /* renamed from: a */
    public static C37565ef m66573a(int i) {
        switch (i) {
            case 0:
                return UNSET;
            case 1:
                return CLIENT_REQUESTED;
            case 2:
                return NEW_AUDIO_REQUEST_CLIENT_LISTENING;
            case 3:
                return NEW_HOTWORD_CLIENT_LISTENING;
            case 4:
                return TIMEOUT;
            case 5:
                return CLIENT_DEACTIVATED;
            case 6:
                return FAILED_START_LISTENING;
            case 7:
                return SEAMLESS_HANDOVER_TIMEOUT;
            default:
                switch (i) {
                    case 100:
                        return FAILED_TO_CONNECT_TO_AUDIO_ROUTE;
                    case 101:
                        return AUDIO_ROUTE_LOST;
                    case 102:
                        return AUDIO_ROUTE_DISCONNECT_CLIENT_REQUESTED;
                    case 103:
                        return MISSING_AUDIO_ROUTE_IMPLEMENTATION;
                    case 104:
                        return ERROR_IN_GETTING_AUDIO_ROUTE_DISCONNECT_STATUS;
                    case 105:
                        return UNKNOWN_AUDIO_ROUTE_DISCONNECT_STATUS;
                    case 106:
                        return AUDIO_ADAPTER_NOT_REGISTERED;
                    case 107:
                        return UNEXPECTED_AUDIO_SOURCE_OPENED;
                    default:
                        return null;
                }
        }
    }

    /* renamed from: b */
    public static C62959cf m66574b() {
        return C37564ee.f99810a;
    }

    public final int getNumber() {
        return this.f99828q;
    }

    public final String toString() {
        return Integer.toString(this.f99828q);
    }
}
