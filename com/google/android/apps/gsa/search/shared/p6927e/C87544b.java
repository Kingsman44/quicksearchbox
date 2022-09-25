package com.google.android.apps.gsa.search.shared.p6927e;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.search.shared.e.b */
/* compiled from: PG */
public enum C87544b implements C62957cd {
    UNKNOWN_MESSAGE(0),
    AIRPLANE_MODE(1),
    DATA_ROAMING_OFF(4),
    DEVICE_CLOCK_WRONG(5),
    GMM_INTENT(6),
    INTERNAL_ERROR(7),
    LANGUAGE_PACK_INSTALL(8),
    LANGUAGE_PACK_DOWNLOAD_QUEUED(9),
    MIC_PERMISSION(10),
    MOBILE_DATA_OFF(11),
    NO_CELL_SUPPORT(12),
    NO_DATA_CONNECTION(13),
    NO_SIGNAL(15),
    NO_SIM(16),
    NO_SPEECH_DETECTED(26),
    OFFLINE(17),
    RECONNECTING(18),
    SEARCH_TIMED_OUT(25),
    SIM_CARD_ERROR(20),
    VOICE_ERROR(23),
    WIFI_CAPTIVE_PORTAL(24);
    

    /* renamed from: v */
    public final int f236491v;

    private C87544b(int i) {
        this.f236491v = i;
    }

    /* renamed from: a */
    public static C87544b m142201a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_MESSAGE;
            case 1:
                return AIRPLANE_MODE;
            case 4:
                return DATA_ROAMING_OFF;
            case 5:
                return DEVICE_CLOCK_WRONG;
            case 6:
                return GMM_INTENT;
            case 7:
                return INTERNAL_ERROR;
            case 8:
                return LANGUAGE_PACK_INSTALL;
            case 9:
                return LANGUAGE_PACK_DOWNLOAD_QUEUED;
            case 10:
                return MIC_PERMISSION;
            case 11:
                return MOBILE_DATA_OFF;
            case 12:
                return NO_CELL_SUPPORT;
            case 13:
                return NO_DATA_CONNECTION;
            case 15:
                return NO_SIGNAL;
            case 16:
                return NO_SIM;
            case 17:
                return OFFLINE;
            case 18:
                return RECONNECTING;
            case 20:
                return SIM_CARD_ERROR;
            case 23:
                return VOICE_ERROR;
            case 24:
                return WIFI_CAPTIVE_PORTAL;
            case 25:
                return SEARCH_TIMED_OUT;
            case 26:
                return NO_SPEECH_DETECTED;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m142202b() {
        return C87543a.f236468a;
    }

    public final int getNumber() {
        return this.f236491v;
    }

    public final String toString() {
        return Integer.toString(this.f236491v);
    }
}
