package com.google.android.apps.gsa.shared.monet.p7069a;

import com.google.android.libraries.gsa.p1876k.C22870f;

/* renamed from: com.google.android.apps.gsa.shared.monet.a.g */
/* compiled from: PG */
final class C90155g implements C22870f, C90154f {

    /* renamed from: a */
    final /* synthetic */ C90156h f251911a;

    /* renamed from: b */
    private final String f251912b;

    /* renamed from: c */
    private C22870f f251913c;

    public C90155g(C90156h hVar, String str, C22870f fVar) {
        this.f251911a = hVar;
        this.f251912b = str;
        if (hVar.f251915b.get()) {
            this.f251913c = fVar;
            hVar.f251916c.add(this);
        }
    }

    /* renamed from: b */
    public final void mo83907b() {
        this.f251913c = null;
        this.f251911a.f251916c.remove(this);
    }

    public final void run() {
        C22870f fVar = this.f251913c;
        mo83907b();
        if (fVar != null) {
            fVar.run();
            return;
        }
        throw new C90149a(this.f251911a.f251914a, this.f251912b);
    }
}
