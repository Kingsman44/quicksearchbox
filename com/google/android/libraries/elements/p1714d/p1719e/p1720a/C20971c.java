package com.google.android.libraries.elements.p1714d.p1719e.p1720a;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.C70128t;
import p5488io.p5490b.p5494b.C69803b;

/* renamed from: com.google.android.libraries.elements.d.e.a.c */
/* compiled from: PG */
final class C20971c {

    /* renamed from: a */
    public final C70128t f58780a;

    /* renamed from: b */
    public final C70128t f58781b;

    /* renamed from: c */
    public final AtomicReference f58782c = new AtomicReference();

    /* renamed from: d */
    public final AtomicBoolean f58783d = new AtomicBoolean(true);

    /* renamed from: e */
    public final C20974f f58784e;

    public C20971c(C20974f fVar, C70128t tVar, C70128t tVar2) {
        this.f58784e = fVar;
        this.f58780a = tVar;
        this.f58781b = tVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo26082a() {
        C69803b bVar = (C69803b) this.f58782c.getAndSet((Object) null);
        if (bVar != null) {
            bVar.dispose();
        }
    }
}
