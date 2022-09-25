package com.google.protos.p4985f.p5030q;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62958ce;

/* renamed from: com.google.protos.f.q.fb */
/* compiled from: PG */
public enum C65195fb implements C62957cd {
    NO_ERROR(0),
    MISSING_CONTEXT(1),
    POST_PROCESSING_FAILURE(2),
    NO_FULFILLER(3),
    FULFILLER_FAILED(4),
    OTHER_FAILED(5),
    UNRECOGNIZED(-1);
    

    /* renamed from: h */
    public static final C62958ce f176450h = null;

    /* renamed from: i */
    private final int f176452i;

    static {
        f176450h = new C65194fa();
    }

    private C65195fb(int i) {
        this.f176452i = i;
    }

    /* renamed from: a */
    public static C65195fb m96585a(int i) {
        if (i == 0) {
            return NO_ERROR;
        }
        if (i == 1) {
            return MISSING_CONTEXT;
        }
        if (i == 2) {
            return POST_PROCESSING_FAILURE;
        }
        if (i == 3) {
            return NO_FULFILLER;
        }
        if (i == 4) {
            return FULFILLER_FAILED;
        }
        if (i != 5) {
            return null;
        }
        return OTHER_FAILED;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f176452i;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
