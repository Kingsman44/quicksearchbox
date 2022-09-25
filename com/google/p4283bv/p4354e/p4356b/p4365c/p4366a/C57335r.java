package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bv.e.b.c.a.r */
/* compiled from: PG */
public enum C57335r implements C62957cd {
    UNKNOWN(0),
    WIFI(1),
    WIMAX(2),
    ETHERNET(3),
    BLUETOOTH(4),
    MOBILE_NETWORK_TYPE_1XRTT(5),
    MOBILE_NETWORK_TYPE_CDMA(6),
    MOBILE_NETWORK_TYPE_EDGE(7),
    MOBILE_NETWORK_TYPE_EHRPD(8),
    MOBILE_NETWORK_TYPE_EVDO_0(9),
    MOBILE_NETWORK_TYPE_EVDO_A(10),
    MOBILE_NETWORK_TYPE_EVDO_B(11),
    MOBILE_NETWORK_TYPE_GPRS(12),
    MOBILE_NETWORK_TYPE_HSDPA(13),
    MOBILE_NETWORK_TYPE_HSPA(14),
    MOBILE_NETWORK_TYPE_HSPAP(15),
    MOBILE_NETWORK_TYPE_HSUPA(16),
    MOBILE_NETWORK_TYPE_IDEN(17),
    MOBILE_NETWORK_TYPE_LTE(18),
    MOBILE_NETWORK_TYPE_UMTS(19),
    MOBILE_NETWORK_TYPE_NR(20);
    

    /* renamed from: v */
    public final int f153173v;

    private C57335r(int i) {
        this.f153173v = i;
    }

    /* renamed from: a */
    public static C57335r m88325a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return WIFI;
            case 2:
                return WIMAX;
            case 3:
                return ETHERNET;
            case 4:
                return BLUETOOTH;
            case 5:
                return MOBILE_NETWORK_TYPE_1XRTT;
            case 6:
                return MOBILE_NETWORK_TYPE_CDMA;
            case 7:
                return MOBILE_NETWORK_TYPE_EDGE;
            case 8:
                return MOBILE_NETWORK_TYPE_EHRPD;
            case 9:
                return MOBILE_NETWORK_TYPE_EVDO_0;
            case 10:
                return MOBILE_NETWORK_TYPE_EVDO_A;
            case 11:
                return MOBILE_NETWORK_TYPE_EVDO_B;
            case 12:
                return MOBILE_NETWORK_TYPE_GPRS;
            case 13:
                return MOBILE_NETWORK_TYPE_HSDPA;
            case 14:
                return MOBILE_NETWORK_TYPE_HSPA;
            case 15:
                return MOBILE_NETWORK_TYPE_HSPAP;
            case 16:
                return MOBILE_NETWORK_TYPE_HSUPA;
            case 17:
                return MOBILE_NETWORK_TYPE_IDEN;
            case 18:
                return MOBILE_NETWORK_TYPE_LTE;
            case 19:
                return MOBILE_NETWORK_TYPE_UMTS;
            case 20:
                return MOBILE_NETWORK_TYPE_NR;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m88326b() {
        return C57334q.f153150a;
    }

    public final int getNumber() {
        return this.f153173v;
    }

    public final String toString() {
        return Integer.toString(this.f153173v);
    }
}
