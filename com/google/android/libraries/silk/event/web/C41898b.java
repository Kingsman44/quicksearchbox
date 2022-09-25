package com.google.android.libraries.silk.event.web;

import com.google.android.libraries.search.rendering.xuikit.p3145f.p3146a.p3151e.C40503c;
import com.google.android.libraries.silk.event.C41894b;
import com.google.android.libraries.silk.event.C41896d;

/* renamed from: com.google.android.libraries.silk.event.web.b */
/* compiled from: PG */
final class C41898b implements C41896d {

    /* renamed from: a */
    final /* synthetic */ Class f109297a;

    /* renamed from: b */
    final /* synthetic */ C41899c f109298b;

    public C41898b(C41899c cVar, Class cls) {
        this.f109298b = cVar;
        this.f109297a = cls;
    }

    /* renamed from: a */
    public final void mo44352a(C41894b bVar) {
        C41899c cVar = this.f109298b;
        Class cls = this.f109297a;
        C41900d c = cVar.mo44355c();
        C41897a aVar = new C41897a(cVar);
        c.f109303b.put(cls, bVar);
        for (C40503c a : c.mo44357b(cls)) {
            a.mo42471a(aVar);
        }
    }

    /* renamed from: b */
    public final void mo44353b() {
        C41899c cVar = this.f109298b;
        Class cls = this.f109297a;
        C41900d c = cVar.mo44355c();
        for (C40503c b : c.mo44357b(cls)) {
            b.mo42472b();
        }
        c.f109303b.remove(cls);
    }
}
