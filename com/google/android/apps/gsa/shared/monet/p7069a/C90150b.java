package com.google.android.apps.gsa.shared.monet.p7069a;

import com.google.android.libraries.gsa.p1876k.C22862b;

/* renamed from: com.google.android.apps.gsa.shared.monet.a.b */
/* compiled from: PG */
final class C90150b implements C22862b, C90154f {

    /* renamed from: a */
    final /* synthetic */ C90156h f251901a;

    /* renamed from: b */
    private final String f251902b;

    /* renamed from: c */
    private C22862b f251903c;

    public C90150b(C90156h hVar, String str, C22862b bVar) {
        this.f251901a = hVar;
        this.f251902b = str;
        if (hVar.f251915b.get()) {
            this.f251903c = bVar;
            hVar.f251916c.add(this);
        }
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C22862b bVar = this.f251903c;
        mo83907b();
        if (bVar != null) {
            return bVar.mo17947a();
        }
        throw new C90149a(this.f251901a.f251914a, this.f251902b);
    }

    /* renamed from: b */
    public final void mo83907b() {
        this.f251903c = null;
        this.f251901a.f251916c.remove(this);
    }
}
