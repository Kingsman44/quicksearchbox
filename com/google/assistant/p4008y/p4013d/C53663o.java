package com.google.assistant.p4008y.p4013d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.y.d.o */
/* compiled from: PG */
public enum C53663o implements C62957cd {
    UNKNOWN(0),
    CHANNEL_OPT_OUT(1),
    SYSTEM_OPT_OUT(2),
    CAMPAIGN_OPT_OUT(3),
    OPA_TURNED_OFF(4),
    FEATURE_FLAG_DISABLED(5),
    GOOGLE_NOW_FIRST_RUN_OPT_IN(6),
    NOT_AWAITING_UPGRADE(7),
    INVALID_PAYLOAD(8),
    NGA_NOT_ELIGIBLE(9),
    NGA_PIE_NOT_ELIGIBLE(10);
    

    /* renamed from: l */
    public final int f140856l;

    private C53663o(int i) {
        this.f140856l = i;
    }

    /* renamed from: a */
    public static C53663o m86882a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return CHANNEL_OPT_OUT;
            case 2:
                return SYSTEM_OPT_OUT;
            case 3:
                return CAMPAIGN_OPT_OUT;
            case 4:
                return OPA_TURNED_OFF;
            case 5:
                return FEATURE_FLAG_DISABLED;
            case 6:
                return GOOGLE_NOW_FIRST_RUN_OPT_IN;
            case 7:
                return NOT_AWAITING_UPGRADE;
            case 8:
                return INVALID_PAYLOAD;
            case 9:
                return NGA_NOT_ELIGIBLE;
            case 10:
                return NGA_PIE_NOT_ELIGIBLE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m86883b() {
        return C53662n.f140843a;
    }

    public final int getNumber() {
        return this.f140856l;
    }

    public final String toString() {
        return Integer.toString(this.f140856l);
    }
}
