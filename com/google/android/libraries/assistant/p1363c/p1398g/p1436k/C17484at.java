package com.google.android.libraries.assistant.p1363c.p1398g.p1436k;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.assistant.c.g.k.at */
/* compiled from: PG */
public enum C17484at implements C62957cd {
    UNKNOWN_MODE(0),
    CLIENT(1),
    SERVER(2);
    

    /* renamed from: d */
    public final int f50480d;

    private C17484at(int i) {
        this.f50480d = i;
    }

    /* renamed from: a */
    public static C17484at m34786a(int i) {
        if (i == 0) {
            return UNKNOWN_MODE;
        }
        if (i == 1) {
            return CLIENT;
        }
        if (i != 2) {
            return null;
        }
        return SERVER;
    }

    /* renamed from: b */
    public static C62959cf m34787b() {
        return C17483as.f50475a;
    }

    public final int getNumber() {
        return this.f50480d;
    }

    public final String toString() {
        return Integer.toString(this.f50480d);
    }
}
