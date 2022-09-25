package com.google.android.apps.gsa.nga.engine.recognition.p6131m.p6133b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.m.b.d */
/* compiled from: PG */
public enum C77863d implements C62957cd {
    UNKNOWN(0),
    ALWAYS_SODA_FOR_HOTWORD(1),
    SODA_ONLY_MODE(3),
    S3_ONLY_MODE(4),
    RETRYING(8),
    BAD_NETWORK(11),
    SEARCH_PROCESS_DEAD(12),
    NETWORK_AVAILABLE(14),
    NETWORK_NOT_AVAILABLE(15),
    GOOD_NETWORK(16),
    CLIENT_CONFIGURATION(17),
    HALF_LISTENING(18),
    ON_DEVICE_DISABLED(20),
    SODA_COMPONENT_DISABLED(21),
    BLUETOOTH(23),
    COLD_START(24),
    FAST_FLIPPING(25),
    EXPLICITLY_REQUESTED(26),
    SCREEN_LOCKED(27),
    SODA_INITIALIZATION_FAILED(28);
    

    /* renamed from: u */
    public final int f214495u;

    private C77863d(int i) {
        this.f214495u = i;
    }

    /* renamed from: a */
    public static C77863d m124922a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return ALWAYS_SODA_FOR_HOTWORD;
            case 3:
                return SODA_ONLY_MODE;
            case 4:
                return S3_ONLY_MODE;
            case 8:
                return RETRYING;
            case 11:
                return BAD_NETWORK;
            case 12:
                return SEARCH_PROCESS_DEAD;
            case 14:
                return NETWORK_AVAILABLE;
            case 15:
                return NETWORK_NOT_AVAILABLE;
            case 16:
                return GOOD_NETWORK;
            case 17:
                return CLIENT_CONFIGURATION;
            case 18:
                return HALF_LISTENING;
            case 20:
                return ON_DEVICE_DISABLED;
            case 21:
                return SODA_COMPONENT_DISABLED;
            case 23:
                return BLUETOOTH;
            case 24:
                return COLD_START;
            case 25:
                return FAST_FLIPPING;
            case 26:
                return EXPLICITLY_REQUESTED;
            case 27:
                return SCREEN_LOCKED;
            case 28:
                return SODA_INITIALIZATION_FAILED;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m124923b() {
        return C77862c.f214473a;
    }

    public final int getNumber() {
        return this.f214495u;
    }

    public final String toString() {
        return Integer.toString(this.f214495u);
    }
}
