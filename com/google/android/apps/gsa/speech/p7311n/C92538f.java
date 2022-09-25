package com.google.android.apps.gsa.speech.p7311n;

import com.google.android.apps.gsa.search.core.p6805i.C86109e;
import com.google.android.apps.gsa.search.core.p6805i.C86117m;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90116fn;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p395al.p408c.p414c.p416b.C8512v;
import com.google.p395al.p408c.p414c.p416b.C8513w;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.speech.n.f */
/* compiled from: PG */
final class C92538f implements C86109e {

    /* renamed from: a */
    final /* synthetic */ C68214a f258267a;

    public C92538f(C68214a aVar) {
        this.f258267a = aVar;
    }

    /* renamed from: a */
    public final void mo70818a(C86124t tVar, C86117m mVar) {
        C92541i iVar = (C92541i) this.f258267a.mo27525b();
        C58976aa aaVar = C58975e.f156826a;
        C8513w wVar = (C8513w) tVar.mo79754t(C90116fn.f250744a, C8513w.f29529p.getParserForType());
        if (wVar != null) {
            C8512v vVar = (C8512v) iVar.mo87317b().toBuilder();
            vVar.mergeFrom(wVar);
            C8513w wVar2 = (C8513w) vVar.build();
            synchronized (iVar.f258269b) {
                if (!wVar2.equals(iVar.f258270c) && C92541i.m152355f(wVar2)) {
                    iVar.f258270c = wVar2;
                    iVar.mo87318d();
                    iVar.mo87319e();
                    iVar.f258272e = true;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo70819b(C86124t tVar) {
        mo70818a(tVar, C86117m.f232762a);
    }
}
