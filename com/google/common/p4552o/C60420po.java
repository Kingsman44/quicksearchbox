package com.google.common.p4552o;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.po */
/* compiled from: PG */
public enum C60420po implements C62957cd {
    UNKNOWN(0),
    S3_NATIVE(1),
    S3_ENDPOINTER_FALLBACK(2),
    S3_LAST_CANDIDATE(3),
    SODA_AUDIO_LEVEL(4),
    SODA_LAST_CANDIDATE(5),
    S3_TRUE_EOQ(6),
    SODA_TRUE_EOQ(7),
    SODA_NATIVE(8),
    SODA_ENDPOINTER_FALLBACK(9),
    NON_VOICE_INTERACTION_CLIENT(10);
    

    /* renamed from: l */
    public final int f163509l;

    private C60420po(int i) {
        this.f163509l = i;
    }

    /* renamed from: a */
    public static C60420po m92578a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return S3_NATIVE;
            case 2:
                return S3_ENDPOINTER_FALLBACK;
            case 3:
                return S3_LAST_CANDIDATE;
            case 4:
                return SODA_AUDIO_LEVEL;
            case 5:
                return SODA_LAST_CANDIDATE;
            case 6:
                return S3_TRUE_EOQ;
            case 7:
                return SODA_TRUE_EOQ;
            case 8:
                return SODA_NATIVE;
            case 9:
                return SODA_ENDPOINTER_FALLBACK;
            case 10:
                return NON_VOICE_INTERACTION_CLIENT;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m92579b() {
        return C60419pn.f163496a;
    }

    public final int getNumber() {
        return this.f163509l;
    }

    public final String toString() {
        return Integer.toString(this.f163509l);
    }
}
