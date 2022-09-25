package com.google.android.libraries.gsa.monet.tools.recycling.p1927c;

import com.google.android.libraries.gsa.monet.p1886a.C22947l;
import com.google.android.libraries.gsa.monet.tools.children.shared.ChildData;
import com.google.android.libraries.gsa.monet.tools.recycling.shared.C23310c;
import com.google.android.libraries.gsa.monet.tools.recycling.shared.RecyclingChildCoordinator$RecyclingChildData;

/* renamed from: com.google.android.libraries.gsa.monet.tools.recycling.c.t */
/* compiled from: PG */
final class C23304t implements C22947l {

    /* renamed from: a */
    final /* synthetic */ C23305u f63799a;

    public C23304t(C23305u uVar) {
        this.f63799a = uVar;
    }

    /* renamed from: b */
    public final void mo28288b() {
        C23310c cVar = this.f63799a.f63800a;
        cVar.getClass();
        cVar.f63699e.clear();
        cVar.f63700f.clear();
        C23295k kVar = cVar.f63702h;
        if (kVar != null && !cVar.f63698d.isEmpty()) {
            int size = cVar.f63698d.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                kVar.mo28788a(size, (RecyclingChildCoordinator$RecyclingChildData) ((ChildData) cVar.f63698d.remove(size)));
            }
        }
        cVar.f63698d.clear();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo28289c() {
    }

    /* renamed from: h */
    public final /* synthetic */ void mo28290h() {
    }
}
