package com.google.android.apps.gsa.shared.monet.p7069a;

import com.google.android.libraries.gsa.p1876k.C22864c;

/* renamed from: com.google.android.apps.gsa.shared.monet.a.c */
/* compiled from: PG */
final class C90151c implements C22864c, C90154f {

    /* renamed from: a */
    final /* synthetic */ C90156h f251904a;

    /* renamed from: b */
    private final String f251905b;

    /* renamed from: c */
    private C22864c f251906c;

    public C90151c(C90156h hVar, String str, C22864c cVar) {
        this.f251904a = hVar;
        this.f251905b = str;
        if (hVar.f251915b.get()) {
            this.f251906c = cVar;
            hVar.f251916c.add(this);
        }
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C22864c cVar = this.f251906c;
        mo83907b();
        if (cVar != null) {
            return cVar.mo17879a(obj);
        }
        throw new C90149a(this.f251904a.f251914a, this.f251905b);
    }

    /* renamed from: b */
    public final void mo83907b() {
        this.f251906c = null;
        this.f251904a.f251916c.remove(this);
    }
}
