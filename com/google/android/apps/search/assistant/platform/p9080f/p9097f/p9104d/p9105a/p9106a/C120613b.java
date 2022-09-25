package com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.p9105a.p9106a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62958ce;

/* renamed from: com.google.android.apps.search.assistant.platform.f.f.d.a.a.b */
/* compiled from: PG */
public enum C120613b implements C62957cd {
    UNKNOWN_INTERNAL_ERROR(0),
    COMPLETED_BUT_NO_RESPONSE(1),
    UNKNOWN_PREFETCH_TYPE(2);
    

    /* renamed from: d */
    public static final C62958ce f335484d = null;

    /* renamed from: e */
    private final int f335486e;

    static {
        f335484d = new C120612a();
    }

    private C120613b(int i) {
        this.f335486e = i;
    }

    /* renamed from: a */
    public static C120613b m199762a(int i) {
        if (i == 0) {
            return UNKNOWN_INTERNAL_ERROR;
        }
        if (i == 1) {
            return COMPLETED_BUT_NO_RESPONSE;
        }
        if (i != 2) {
            return null;
        }
        return UNKNOWN_PREFETCH_TYPE;
    }

    public final int getNumber() {
        return this.f335486e;
    }

    public final String toString() {
        return Integer.toString(this.f335486e);
    }
}
