package com.google.android.apps.gsa.shared.monet.p7069a;

import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.shared.monet.a.e */
/* compiled from: PG */
final class C90153e implements C22869e, C90154f {

    /* renamed from: a */
    final /* synthetic */ C90156h f251909a;

    /* renamed from: b */
    private C22869e f251910b;

    public C90153e(C90156h hVar, C22869e eVar) {
        this.f251909a = hVar;
        if (hVar.f251915b.get()) {
            this.f251910b = eVar;
            hVar.f251916c.add(this);
        }
    }

    /* renamed from: b */
    public final void mo83907b() {
        this.f251910b = null;
        this.f251909a.f251916c.remove(this);
    }

    public final void run() {
        C22869e eVar = this.f251910b;
        mo83907b();
        if (eVar != null) {
            eVar.run();
        }
    }
}
