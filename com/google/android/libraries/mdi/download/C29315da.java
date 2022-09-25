package com.google.android.libraries.mdi.download;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.mdi.download.da */
/* compiled from: PG */
public enum C29315da implements C62957cd {
    UNDEFINED(0),
    SHARED_PREFERENCES_ONLY(1),
    SHARED_PREFERENCES_AND_PROTOSTORE(2),
    PROTOSTORE_ONLY(3);
    

    /* renamed from: e */
    private final int f79456e;

    private C29315da(int i) {
        this.f79456e = i;
    }

    /* renamed from: a */
    public static C29315da m54209a(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return SHARED_PREFERENCES_ONLY;
        }
        if (i == 2) {
            return SHARED_PREFERENCES_AND_PROTOSTORE;
        }
        if (i != 3) {
            return null;
        }
        return PROTOSTORE_ONLY;
    }

    /* renamed from: b */
    public static C62959cf m54210b() {
        return C28811cz.f78280a;
    }

    public final int getNumber() {
        return this.f79456e;
    }

    public final String toString() {
        return Integer.toString(this.f79456e);
    }
}
