package com.google.android.apps.gsa.shared.p7012bb.p7016d;

import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.p4449cd.p4453d.C57958d;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.shared.bb.d.ae */
/* compiled from: PG */
final class C89368ae extends C89382j {

    /* renamed from: a */
    private final AtomicBoolean f242303a = new AtomicBoolean(false);

    /* renamed from: b */
    private final C89371ah f242304b;

    /* renamed from: c */
    private final C89367ad f242305c;

    public C89368ae(C89371ah ahVar, C89384l lVar, C89387o oVar, C90476a aVar) {
        this.f242304b = ahVar;
        this.f242305c = new C89367ad(lVar, oVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo83299c() {
        this.f242303a.set(false);
    }

    /* renamed from: f */
    public final void mo20646f(C57958d dVar, long j) {
        if (this.f242303a.compareAndSet(false, true)) {
            C89371ah ahVar = this.f242304b;
            C89367ad adVar = this.f242305c;
            ahVar.f242311a.put(Integer.valueOf(System.identityHashCode(adVar)), adVar);
        }
    }
}
