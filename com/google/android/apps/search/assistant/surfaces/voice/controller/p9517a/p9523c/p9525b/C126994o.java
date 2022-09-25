package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.b.o */
/* compiled from: PG */
public enum C126994o implements C62957cd {
    NETWORK_UNKNOWN_REASON(0),
    NETWORK_AIRPLANE_ON_WIFI_OFF(1),
    NETWORK_AIRPLANE_ON_WIFI_ON(2),
    NETWORK_NO_CELL_SUPPORT_WIFI_OFF(3),
    NETWORK_NO_CELL_SUPPORT_WIFI_ON(4),
    NETWORK_NO_SIM_CARD_WIFI_OFF(5),
    NETWORK_NO_SIM_CARD_WIFI_ON(6),
    NETWORK_SIM_CARD_LOCKED(7),
    NETWORK_SIM_CARD_ERROR_WIFI_OFF(8),
    NETWORK_SIM_CARD_ERROR_WIFI_ON(9),
    NETWORK_MOBILE_DATA_OFF_WIFI_OFF(10),
    NETWORK_MOBILE_DATA_OFF_WIFI_ON(11),
    NETWORK_DATA_ROAMING_OFF_WIFI_OFF(12),
    NETWORK_DATA_ROAMING_OFF_WIFI_ON(13),
    NETWORK_NO_DATA_CONNECTION(14),
    NETWORK_CAPTIVE_PORTAL_DETECTED(15);
    

    /* renamed from: q */
    public final int f349704q;

    private C126994o(int i) {
        this.f349704q = i;
    }

    /* renamed from: a */
    public static C126994o m207730a(int i) {
        switch (i) {
            case 0:
                return NETWORK_UNKNOWN_REASON;
            case 1:
                return NETWORK_AIRPLANE_ON_WIFI_OFF;
            case 2:
                return NETWORK_AIRPLANE_ON_WIFI_ON;
            case 3:
                return NETWORK_NO_CELL_SUPPORT_WIFI_OFF;
            case 4:
                return NETWORK_NO_CELL_SUPPORT_WIFI_ON;
            case 5:
                return NETWORK_NO_SIM_CARD_WIFI_OFF;
            case 6:
                return NETWORK_NO_SIM_CARD_WIFI_ON;
            case 7:
                return NETWORK_SIM_CARD_LOCKED;
            case 8:
                return NETWORK_SIM_CARD_ERROR_WIFI_OFF;
            case 9:
                return NETWORK_SIM_CARD_ERROR_WIFI_ON;
            case 10:
                return NETWORK_MOBILE_DATA_OFF_WIFI_OFF;
            case 11:
                return NETWORK_MOBILE_DATA_OFF_WIFI_ON;
            case 12:
                return NETWORK_DATA_ROAMING_OFF_WIFI_OFF;
            case 13:
                return NETWORK_DATA_ROAMING_OFF_WIFI_ON;
            case 14:
                return NETWORK_NO_DATA_CONNECTION;
            case 15:
                return NETWORK_CAPTIVE_PORTAL_DETECTED;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m207731b() {
        return C126993n.f349686a;
    }

    public final int getNumber() {
        return this.f349704q;
    }

    public final String toString() {
        return Integer.toString(this.f349704q);
    }
}
