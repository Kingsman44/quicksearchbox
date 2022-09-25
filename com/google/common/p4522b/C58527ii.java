package com.google.common.p4522b;

import java.io.Serializable;

/* renamed from: com.google.common.b.ii */
/* compiled from: PG */
final class C58527ii implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final Object[] f156177a;

    public C58527ii(Object[] objArr) {
        this.f156177a = objArr;
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        return C58528ij.m90008H(this.f156177a);
    }
}
