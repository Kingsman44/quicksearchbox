package com.google.common.p4537i;

import java.io.Serializable;

/* renamed from: com.google.common.i.aa */
/* compiled from: PG */
final class C59271aa implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final String f157385a;

    /* renamed from: b */
    private final int f157386b;

    public C59271aa(String str, int i) {
        this.f157385a = str;
        this.f157386b = i;
    }

    private Object readResolve() {
        return new C59272ab(this.f157385a, this.f157386b);
    }
}
