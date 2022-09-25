package com.google.protos.p4985f.p5030q;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.protos.f.q.ev */
/* compiled from: PG */
public enum C65188ev implements C62957cd {
    REQUEST_TYPE_UNSPECIFIED(0),
    REQUEST_TYPE_INITIAL(1),
    REQUEST_TYPE_CONTEXT(2),
    REQUEST_TYPE_PREFETCH(3),
    REQUEST_TYPE_FINAL(4),
    REQUEST_TYPE_CANCEL(5),
    UNRECOGNIZED(-1);
    

    /* renamed from: h */
    private final int f176420h;

    private C65188ev(int i) {
        this.f176420h = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f176420h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
