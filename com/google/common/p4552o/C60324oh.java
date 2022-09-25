package com.google.common.p4552o;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.oh */
/* compiled from: PG */
public enum C60324oh implements C62957cd {
    UNDEFINED(0),
    OFFLINE(1),
    UNKNOWN(2),
    NETWORK_LEVEL_NOT_MET(3),
    QUALITY_NOT_MET(4),
    QUALITY_UNKNOWN(5),
    QUALITY_MET(6),
    UNSTABLE_NOT_MET(7);
    

    /* renamed from: i */
    public final int f163246i;

    private C60324oh(int i) {
        this.f163246i = i;
    }

    /* renamed from: a */
    public static C60324oh m92567a(int i) {
        switch (i) {
            case 0:
                return UNDEFINED;
            case 1:
                return OFFLINE;
            case 2:
                return UNKNOWN;
            case 3:
                return NETWORK_LEVEL_NOT_MET;
            case 4:
                return QUALITY_NOT_MET;
            case 5:
                return QUALITY_UNKNOWN;
            case 6:
                return QUALITY_MET;
            case 7:
                return UNSTABLE_NOT_MET;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m92568b() {
        return C60323og.f163236a;
    }

    public final int getNumber() {
        return this.f163246i;
    }

    public final String toString() {
        return Integer.toString(this.f163246i);
    }
}
