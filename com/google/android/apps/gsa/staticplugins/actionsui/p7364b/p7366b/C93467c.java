package com.google.android.apps.gsa.staticplugins.actionsui.p7364b.p7366b;

import com.google.android.apps.gsa.search.core.p6775c.p6776a.C85679b;
import com.google.android.apps.gsa.search.core.p6775c.p6776a.C85680c;
import com.google.android.apps.gsa.shared.logger.p7065j.C89932c;
import com.google.android.apps.gsa.shared.monet.p7114f.C90324b;
import com.google.android.apps.gsa.staticplugins.actionsui.C93482bj;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.b.b.c */
/* compiled from: PG */
final class C93467c extends C90324b {

    /* renamed from: a */
    final /* synthetic */ C93469e f260847a;

    public C93467c(C93469e eVar) {
        this.f260847a = eVar;
    }

    /* renamed from: c */
    public final void mo84008c() {
        C85679b bVar = (C85679b) this.f260847a.f260851c;
        C89932c cVar = bVar.f231635c;
        cVar.f246400j = true;
        C58976aa aaVar = C58975e.f156826a;
        cVar.f246399i = null;
        if (!bVar.f231633a.isEmpty()) {
            C85680c cVar2 = (C85680c) bVar.f231633a.get(0);
            cVar2.f231649a.mo82110r(cVar2.f231650b.f239226b, false);
        }
        for (C85680c cVar3 : bVar.f231633a) {
            ((C93482bj) cVar3.f231649a).f260880a = true;
        }
    }
}
