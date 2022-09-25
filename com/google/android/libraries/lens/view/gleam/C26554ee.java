package com.google.android.libraries.lens.view.gleam;

import com.google.android.libraries.lens.view.filters.translation.C26119db;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.lens.view.gleam.ee */
/* compiled from: PG */
public final /* synthetic */ class C26554ee implements C26119db {

    /* renamed from: a */
    public final /* synthetic */ C26559ej f72376a;

    public /* synthetic */ C26554ee(C26559ej ejVar) {
        this.f72376a = ejVar;
    }

    /* renamed from: a */
    public final void mo31311a(boolean z) {
        C26559ej ejVar = this.f72376a;
        Stream stream = Collection.EL.stream(ejVar.f72398d.f72053b);
        Class<C26491bw> cls = C26491bw.class;
        Objects.requireNonNull(cls);
        Stream filter = stream.filter(new C26555ef(cls));
        Class<C26491bw> cls2 = C26491bw.class;
        Objects.requireNonNull(cls2);
        filter.map(new C26556eg(cls2)).forEach(new C26557eh(z));
        ejVar.mo31827f();
    }
}
