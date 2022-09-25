package com.google.android.libraries.search.location.p3029a.p3032c.p3033a;

import com.google.android.libraries.search.location.p3029a.p3031b.C38608a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.search.location.a.c.a.o */
/* compiled from: PG */
final class C38651o extends C38649m {

    /* renamed from: a */
    final /* synthetic */ C38653q f102116a;

    public C38651o(C38653q qVar) {
        this.f102116a = qVar;
        C58976aa aaVar = C58975e.f156826a;
        C38644h hVar = qVar.f102119c.f102103a;
        Iterator it = hVar.f102104a.values().iterator();
        while (it.hasNext()) {
            hVar.mo41539d((C38643g) it.next());
            it.remove();
        }
    }

    /* renamed from: a */
    public final C38649m mo41541a(boolean z) {
        return z ? new C38650n(this.f102116a) : this;
    }

    /* renamed from: b */
    public final void mo41542b(C38652p pVar) {
        this.f102116a.f102119c.f102103a.mo41539d((C38643g) pVar);
        throw new C38608a();
    }
}
