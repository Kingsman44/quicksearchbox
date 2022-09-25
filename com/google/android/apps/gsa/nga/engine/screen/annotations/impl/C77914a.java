package com.google.android.apps.gsa.nga.engine.screen.annotations.impl;

import com.google.android.apps.gsa.nga.d.a.w;
import com.google.android.apps.gsa.nga.d.a.y;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.screen.annotations.impl.a */
/* compiled from: PG */
final class C77914a extends C77938r {

    /* renamed from: a */
    public Optional f214640a = Optional.empty();

    /* renamed from: b */
    private Optional f214641b = Optional.empty();

    /* renamed from: c */
    private Optional f214642c = Optional.empty();

    public C77914a() {
    }

    /* renamed from: a */
    public final C77939s mo72900a() {
        return new C77922b(this.f214640a, this.f214641b, this.f214642c);
    }

    /* renamed from: b */
    public final void mo72901b(y yVar) {
        this.f214641b = Optional.ofNullable(yVar);
    }

    /* renamed from: c */
    public final void mo72902c(w wVar) {
        this.f214642c = Optional.ofNullable(wVar);
    }

    public C77914a(C77939s sVar) {
        C77922b bVar = (C77922b) sVar;
        this.f214640a = bVar.f214655a;
        this.f214641b = bVar.f214656b;
        this.f214642c = bVar.f214657c;
    }
}
