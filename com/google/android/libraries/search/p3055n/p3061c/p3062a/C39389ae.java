package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.search.n.c.a.ae */
/* compiled from: PG */
public enum C39389ae implements C62957cd {
    UNSPECIFIED(0),
    INITIALIZE(1),
    SHUTDOWN(2),
    CONFIG_UPDATE_FROM_APA(3),
    INTERNAL_CONFIG_CHANGE(4),
    HOTWORD_TIMEOUT(5),
    HOTWORD_DETECTED_DISCONNECT_FUTURE_FINISHED_PROPERLY(6),
    HOTWORD_DETECTED_DISCONNECT_FUTURE_EXCEPTION(7),
    HOTWORD_START_ERROR(8),
    HOTWORD_RUNTIME_ERROR(9),
    RECONFIG_HOTWORD_DETECTORS(10),
    HOTWORD_DETECTED(11),
    SODA_STOPPED(12),
    SODA_AUDIO_ADAPTER_DISCONNECTED(13),
    UNRECOGNIZED(-1);
    

    /* renamed from: p */
    private final int f103721p;

    private C39389ae(int i) {
        this.f103721p = i;
    }

    /* renamed from: a */
    public static C39389ae m68786a(int i) {
        switch (i) {
            case 0:
                return UNSPECIFIED;
            case 1:
                return INITIALIZE;
            case 2:
                return SHUTDOWN;
            case 3:
                return CONFIG_UPDATE_FROM_APA;
            case 4:
                return INTERNAL_CONFIG_CHANGE;
            case 5:
                return HOTWORD_TIMEOUT;
            case 6:
                return HOTWORD_DETECTED_DISCONNECT_FUTURE_FINISHED_PROPERLY;
            case 7:
                return HOTWORD_DETECTED_DISCONNECT_FUTURE_EXCEPTION;
            case 8:
                return HOTWORD_START_ERROR;
            case 9:
                return HOTWORD_RUNTIME_ERROR;
            case 10:
                return RECONFIG_HOTWORD_DETECTORS;
            case 11:
                return HOTWORD_DETECTED;
            case 12:
                return SODA_STOPPED;
            case 13:
                return SODA_AUDIO_ADAPTER_DISCONNECTED;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m68787b() {
        return C39388ad.f103704a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f103721p;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
