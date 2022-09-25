package com.google.speech.p5218j;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.speech.j.kz */
/* compiled from: PG */
public enum C67098kz implements C62957cd {
    UNKNOWN(0),
    S3_NATIVE(1),
    S3_ENDPOINTER_FALLBACK(2),
    S3_TRUE_EOQ(3),
    SODA_ENDPOINTER_FALLBACK(4),
    SODA_TRUE_EOQ(5),
    SODA_NATIVE(6);
    

    /* renamed from: h */
    public final int f182418h;

    private C67098kz(int i) {
        this.f182418h = i;
    }

    /* renamed from: a */
    public static C67098kz m97422a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return S3_NATIVE;
            case 2:
                return S3_ENDPOINTER_FALLBACK;
            case 3:
                return S3_TRUE_EOQ;
            case 4:
                return SODA_ENDPOINTER_FALLBACK;
            case 5:
                return SODA_TRUE_EOQ;
            case 6:
                return SODA_NATIVE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m97423b() {
        return C67097ky.f182409a;
    }

    public final int getNumber() {
        return this.f182418h;
    }

    public final String toString() {
        return Integer.toString(this.f182418h);
    }
}
