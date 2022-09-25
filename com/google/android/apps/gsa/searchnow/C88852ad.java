package com.google.android.apps.gsa.searchnow;

import com.google.android.apps.gsa.shared.monet.C90163ad;
import com.google.android.apps.gsa.shared.monet.p7070b.p7101r.C90274c;
import com.google.android.apps.gsa.shared.monet.p7070b.p7101r.C90275d;
import com.google.android.apps.gsa.shared.p6993ao.C89243h;
import com.google.android.apps.gsa.shared.p7148ui.C90633ai;
import com.google.android.apps.gsa.shared.p7148ui.C90714z;
import com.google.android.apps.gsa.sidekick.shared.overlay.C91896e;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;

/* renamed from: com.google.android.apps.gsa.searchnow.ad */
/* compiled from: PG */
final class C88852ad extends C90163ad {

    /* renamed from: a */
    final /* synthetic */ C88861am f240560a;

    public C88852ad(C88861am amVar) {
        this.f240560a = amVar;
    }

    /* renamed from: a */
    public final void mo76767a(C22939d dVar) {
        C90714z zVar;
        C88861am amVar = this.f240560a;
        amVar.f240590T = (C90275d) dVar;
        C91896e eVar = amVar.f240591U;
        if (eVar.f256238j == null) {
            eVar.f256238j = new C90714z(new C89243h(eVar.f256241m), (C90633ai) null, false, eVar.f256232d);
            eVar.f256238j.mo85046j(eVar.f256233e ? 1 : 0, false, false);
        }
        eVar.f256238j.mo85045i(eVar.mo86475c(), false);
        if (eVar.f256240l == 1 && !eVar.f256239k && (zVar = eVar.f256238j) != null) {
            zVar.mo85044h(true, true);
        }
        eVar.mo86480h();
        C88861am amVar2 = this.f240560a;
        amVar2.f240590T.mo83979b(amVar2.f240592V);
        this.f240560a.mo82650k();
        this.f240560a.mo82649j();
    }

    /* renamed from: b */
    public final void mo76768b(C22939d dVar) {
        this.f240560a.f240590T.mo83979b((C90274c) null);
        this.f240560a.f240590T = null;
    }
}
