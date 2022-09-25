package com.google.android.apps.search.assistant.platform.pcp.p9329f;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.f.cb */
/* compiled from: PG */
public enum C123762cb implements C62957cd {
    AFFINITY_TYPE_UNSPECIFIED(0),
    CALL(1),
    TEXT(2),
    AGGREGATE(3);
    

    /* renamed from: e */
    public final int f341879e;

    private C123762cb(int i) {
        this.f341879e = i;
    }

    /* renamed from: a */
    public static C123762cb m203107a(int i) {
        if (i == 0) {
            return AFFINITY_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return CALL;
        }
        if (i == 2) {
            return TEXT;
        }
        if (i != 3) {
            return null;
        }
        return AGGREGATE;
    }

    /* renamed from: b */
    public static C62959cf m203108b() {
        return C123761ca.f341873a;
    }

    public final int getNumber() {
        return this.f341879e;
    }

    public final String toString() {
        return Integer.toString(this.f341879e);
    }
}
