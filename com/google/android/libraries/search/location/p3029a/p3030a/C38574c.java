package com.google.android.libraries.search.location.p3029a.p3030a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.libraries.search.location.a.a.c */
/* compiled from: PG */
public enum C38574c implements C62957cd {
    CAPABILITY_RESULT_UNKNOWN(0),
    CAPABILITY_RESULT_CAPABILITY_IS_NOT_PRESENT(1),
    CAPABILITY_RESULT_CAPABILITY_IS_PRESENT(2),
    CAPABILITY_RESULT_UNABLE_TO_GET_CAPABILITY(3),
    CAPABILITY_RESULT_NOT_UNDER_REGULATIONS(4);
    

    /* renamed from: f */
    private final int f101972f;

    private C38574c(int i) {
        this.f101972f = i;
    }

    public final int getNumber() {
        return this.f101972f;
    }

    public final String toString() {
        return Integer.toString(this.f101972f);
    }
}
