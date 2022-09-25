package com.google.android.apps.gsa.shared.p6968aa;

import com.google.common.p4522b.C58528ij;
import com.google.speech.p5208h.C66554ak;

/* renamed from: com.google.android.apps.gsa.shared.aa.be */
/* compiled from: PG */
public final class C89034be {

    /* renamed from: a */
    private static final C58528ij f241309a = C58528ij.m90013M(C66554ak.UNKNOWN, C66554ak.NO_NETWORK_INFO, C66554ak.NO_CONNECTION, C66554ak.UNKNOWN_CONNECTION_TYPE);

    /* renamed from: a */
    public static C66554ak m144791a(C89062r rVar) {
        boolean a = rVar.mo83040a();
        int i = rVar.f241373e;
        int i2 = rVar.f241374f;
        if (!a) {
            return C66554ak.NO_CONNECTION;
        }
        if (i == 1) {
            return C66554ak.WIFI;
        }
        if (i == 6) {
            return C66554ak.WIMAX;
        }
        if (i == 7) {
            return C66554ak.BLUETOOTH;
        }
        if (i == 9) {
            return C66554ak.ETHERNET;
        }
        if (i != 0) {
            return C66554ak.UNKNOWN_CONNECTION_TYPE;
        }
        if (i2 == 20) {
            return C66554ak.NR;
        }
        switch (i2) {
            case 1:
                return C66554ak.GPRS;
            case 2:
                return C66554ak.EDGE;
            case 3:
                return C66554ak.UMTS;
            case 4:
                return C66554ak.CDMA;
            case 5:
                return C66554ak.EVDO_0;
            case 6:
                return C66554ak.EVDO_A;
            case 7:
                return C66554ak.RTT;
            case 8:
                return C66554ak.HSDPA;
            case 9:
                return C66554ak.HSUPA;
            case 10:
                return C66554ak.HSPA;
            case 11:
                return C66554ak.IDEN;
            case 12:
                return C66554ak.EVDO_B;
            case 13:
                return C66554ak.LTE;
            case 14:
                return C66554ak.EHRPD;
            case 15:
                return C66554ak.HSPAP;
            default:
                return C66554ak.UNKNOWN_CELLULAR;
        }
    }

    /* renamed from: b */
    public static boolean m144792b(C66554ak akVar) {
        return akVar == C66554ak.UNKNOWN || akVar == C66554ak.UNKNOWN_CONNECTION_TYPE;
    }

    /* renamed from: c */
    public static boolean m144793c(C66554ak akVar) {
        return !f241309a.contains(akVar);
    }
}
