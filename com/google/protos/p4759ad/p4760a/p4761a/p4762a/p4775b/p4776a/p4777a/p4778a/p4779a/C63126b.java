package com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4775b.p4776a.p4777a.p4778a.p4779a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62958ce;

/* renamed from: com.google.protos.ad.a.a.a.b.a.a.a.a.b */
/* compiled from: PG */
public enum C63126b implements C62957cd {
    UNKNOWN(0),
    HANDOVER_FAILED(1),
    CONNECTION_TO_OPA_FAILED(2),
    DELTA_STREAMING_FAILED(3),
    TTS_STREAMING_FAILED(4),
    OPA_RESUME_TIMEOUT(5),
    MISSING_METADATA(6),
    REPEATED_METADATA(7),
    PREEMPTED(8);
    

    /* renamed from: j */
    public static final C62958ce f170468j = null;

    /* renamed from: k */
    private final int f170470k;

    static {
        f170468j = new C63125a();
    }

    private C63126b(int i) {
        this.f170470k = i;
    }

    /* renamed from: a */
    public static C63126b m96187a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return HANDOVER_FAILED;
            case 2:
                return CONNECTION_TO_OPA_FAILED;
            case 3:
                return DELTA_STREAMING_FAILED;
            case 4:
                return TTS_STREAMING_FAILED;
            case 5:
                return OPA_RESUME_TIMEOUT;
            case 6:
                return MISSING_METADATA;
            case 7:
                return REPEATED_METADATA;
            case 8:
                return PREEMPTED;
            default:
                return null;
        }
    }

    public final int getNumber() {
        return this.f170470k;
    }

    public final String toString() {
        return Integer.toString(this.f170470k);
    }
}
