package com.google.p4184bj.p4193c.p4197c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bj.c.c.ae */
/* compiled from: PG */
public enum C55931ae implements C62957cd {
    VALUE_ORIGIN_UNKNOWN(0),
    IN_MEMORY_CACHE(1),
    PERSISTENT_CACHE(2),
    CACHE_MISS(3);
    

    /* renamed from: e */
    public final int f148887e;

    private C55931ae(int i) {
        this.f148887e = i;
    }

    /* renamed from: a */
    public static C55931ae m87858a(int i) {
        if (i == 0) {
            return VALUE_ORIGIN_UNKNOWN;
        }
        if (i == 1) {
            return IN_MEMORY_CACHE;
        }
        if (i == 2) {
            return PERSISTENT_CACHE;
        }
        if (i != 3) {
            return null;
        }
        return CACHE_MISS;
    }

    /* renamed from: b */
    public static C62959cf m87859b() {
        return C55930ad.f148881a;
    }

    public final int getNumber() {
        return this.f148887e;
    }

    public final String toString() {
        return Integer.toString(this.f148887e);
    }
}
