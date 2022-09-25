package com.google.common.p4522b;

import java.util.Iterator;
import p3186j$.util.Objects;

/* renamed from: com.google.common.b.hv */
/* compiled from: PG */
final class C58513hv extends C58800sl {

    /* renamed from: a */
    int f156154a;

    /* renamed from: b */
    Object f156155b;

    /* renamed from: c */
    final /* synthetic */ Iterator f156156c;

    public C58513hv(Iterator it) {
        this.f156156c = it;
    }

    public final boolean hasNext() {
        return this.f156154a > 0 || this.f156156c.hasNext();
    }

    public final Object next() {
        int i = this.f156154a;
        if (i <= 0) {
            C58691ok okVar = (C58691ok) this.f156156c.next();
            this.f156155b = okVar.mo55768b();
            i = okVar.mo55767a();
        }
        this.f156154a = i - 1;
        return Objects.requireNonNull(this.f156155b);
    }
}
