package com.google.speech.p5208h;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.speech.h.ak */
/* compiled from: PG */
public enum C66554ak implements C62957cd {
    UNKNOWN(0),
    WIFI(1),
    RTT(2),
    CDMA(3),
    EDGE(4),
    EHRPD(5),
    EVDO_0(6),
    EVDO_A(7),
    EVDO_B(8),
    GPRS(9),
    HSDPA(10),
    HSPA(11),
    HSPAP(12),
    HSUPA(13),
    IDEN(14),
    LTE(15),
    UMTS(16),
    BLUETOOTH(17),
    ETHERNET(18),
    WIMAX(19),
    UNKNOWN_CELLULAR(20),
    NO_NETWORK_INFO(21),
    NO_CONNECTION(22),
    UNKNOWN_CONNECTION_TYPE(23),
    NR(24);
    

    /* renamed from: z */
    public final int f181028z;

    private C66554ak(int i) {
        this.f181028z = i;
    }

    /* renamed from: a */
    public static C66554ak m97248a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return WIFI;
            case 2:
                return RTT;
            case 3:
                return CDMA;
            case 4:
                return EDGE;
            case 5:
                return EHRPD;
            case 6:
                return EVDO_0;
            case 7:
                return EVDO_A;
            case 8:
                return EVDO_B;
            case 9:
                return GPRS;
            case 10:
                return HSDPA;
            case 11:
                return HSPA;
            case 12:
                return HSPAP;
            case 13:
                return HSUPA;
            case 14:
                return IDEN;
            case 15:
                return LTE;
            case 16:
                return UMTS;
            case 17:
                return BLUETOOTH;
            case 18:
                return ETHERNET;
            case 19:
                return WIMAX;
            case 20:
                return UNKNOWN_CELLULAR;
            case 21:
                return NO_NETWORK_INFO;
            case 22:
                return NO_CONNECTION;
            case 23:
                return UNKNOWN_CONNECTION_TYPE;
            case 24:
                return NR;
            default:
                return null;
        }
    }

    public final int getNumber() {
        return this.f181028z;
    }

    public final String toString() {
        return Integer.toString(this.f181028z);
    }
}
