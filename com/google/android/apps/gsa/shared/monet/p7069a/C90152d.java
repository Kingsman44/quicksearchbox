package com.google.android.apps.gsa.shared.monet.p7069a;

import com.google.android.libraries.gsa.p1876k.C22868d;

/* renamed from: com.google.android.apps.gsa.shared.monet.a.d */
/* compiled from: PG */
final class C90152d implements C22868d, C90154f {

    /* renamed from: a */
    final /* synthetic */ C90156h f251907a;

    /* renamed from: b */
    private C22868d f251908b;

    public C90152d(C90156h hVar, C22868d dVar) {
        this.f251907a = hVar;
        if (hVar.f251915b.get()) {
            this.f251908b = dVar;
            hVar.f251916c.add(this);
        }
    }

    /* renamed from: b */
    public final void mo83907b() {
        this.f251908b = null;
        this.f251907a.f251916c.remove(this);
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C22868d dVar = this.f251908b;
        mo83907b();
        if (dVar != null) {
            dVar.mo17701gl(th);
        }
    }

    /* renamed from: gm */
    public final void mo17702gm(Object obj) {
        C22868d dVar = this.f251908b;
        mo83907b();
        if (dVar != null) {
            dVar.mo17702gm(obj);
        }
    }
}
