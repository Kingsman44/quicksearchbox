package com.google.common.p4522b;

import java.io.Serializable;

/* renamed from: com.google.common.b.fz */
/* compiled from: PG */
final class C58463fz implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final C58471gg f156088a;

    public C58463fz(C58471gg ggVar) {
        this.f156088a = ggVar;
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        return this.f156088a.mo55229u();
    }
}
