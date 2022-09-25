package com.google.common.p4522b;

import java.io.Serializable;

/* renamed from: com.google.common.b.gs */
/* compiled from: PG */
final class C58483gs implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final Object[] f156111a;

    public C58483gs(Object[] objArr) {
        this.f156111a = objArr;
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        return C58485gu.m89844l(this.f156111a);
    }
}
