package com.google.common.p4522b;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: com.google.common.b.iv */
/* compiled from: PG */
final class C58540iv implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final Comparator f156193a;

    /* renamed from: b */
    final Object[] f156194b;

    public C58540iv(Comparator comparator, Object[] objArr) {
        this.f156193a = comparator;
        this.f156194b = objArr;
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        C58539iu iuVar = new C58539iu(this.f156193a);
        iuVar.mo55534m(this.f156194b);
        return iuVar.mo55486f();
    }
}
