package com.google.android.libraries.silk.event.p3259a;

import com.google.android.libraries.search.rendering.xuikit.p3145f.p3146a.p3151e.C40503c;
import com.google.android.libraries.silk.event.C41894b;
import com.google.android.libraries.silk.event.C41896d;

/* renamed from: com.google.android.libraries.silk.event.a.b */
/* compiled from: PG */
final class C41891b implements C41896d {

    /* renamed from: a */
    final /* synthetic */ Class f109288a;

    /* renamed from: b */
    final /* synthetic */ C41892c f109289b;

    public C41891b(C41892c cVar, Class cls) {
        this.f109289b = cVar;
        this.f109288a = cls;
    }

    /* renamed from: a */
    public final void mo44352a(C41894b bVar) {
        C41892c cVar = this.f109289b;
        C41893d dVar = cVar.f109290a;
        Class cls = this.f109288a;
        C41890a aVar = new C41890a(cVar);
        dVar.f109293b.put(cls, bVar);
        for (C40503c a : dVar.mo44354a(cls)) {
            a.mo42471a(aVar);
        }
    }

    /* renamed from: b */
    public final void mo44353b() {
        C41893d dVar = this.f109289b.f109290a;
        Class cls = this.f109288a;
        for (C40503c b : dVar.mo44354a(cls)) {
            b.mo42472b();
        }
        dVar.f109293b.remove(cls);
    }
}
