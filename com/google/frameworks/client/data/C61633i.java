package com.google.frameworks.client.data;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.frameworks.client.data.i */
/* compiled from: PG */
public enum C61633i implements C62957cd {
    DEFAULT_CACHE_OK_IF_VALID(0),
    CACHE_OK_IF_AVAILABLE(1),
    SKIP_CACHE(2),
    CACHE_ONLY(3),
    VALID_CACHE_ONLY(4);
    

    /* renamed from: f */
    private final int f166528f;

    private C61633i(int i) {
        this.f166528f = i;
    }

    public final int getNumber() {
        return this.f166528f;
    }

    public final String toString() {
        return Integer.toString(this.f166528f);
    }
}
