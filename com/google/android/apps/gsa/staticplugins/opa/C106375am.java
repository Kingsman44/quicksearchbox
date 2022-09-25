package com.google.android.apps.gsa.staticplugins.opa;

import android.content.Context;
import com.google.android.apps.gsa.search.shared.p6930h.C87571n;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90029ch;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.util.p7176n.C91067j;
import com.google.assistant.p3994s.p3995a.C53275hw;
import com.google.assistant.p3994s.p3995a.C53287ih;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.am */
/* compiled from: PG */
public final /* synthetic */ class C106375am implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C109040fj f296727a;

    public /* synthetic */ C106375am(C109040fj fjVar) {
        this.f296727a = fjVar;
    }

    public final void run() {
        C109040fj fjVar = this.f296727a;
        if (fjVar.f303455t.mo79746e(C90037cp.f248468aw)) {
            fjVar.mo97459aU();
            C58976aa aaVar = C58975e.f156826a;
            fjVar.f303457v.mo65089a(C91067j.m148771c(fjVar.f303455t));
        } else if (fjVar.f303455t.mo79746e(C90037cp.f248416X)) {
            C58976aa aaVar2 = C58975e.f156826a;
            fjVar.mo97459aU();
            fjVar.f303457v.mo65089a(C91067j.m148770b(fjVar.f303346c));
        } else if (fjVar.f303455t.mo79746e(C90037cp.f248411S)) {
            C58976aa aaVar3 = C58975e.f156826a;
            fjVar.mo97459aU();
            fjVar.f303457v.mo65089a(C91067j.m148769a(fjVar.f303346c));
        } else {
            ((C109467mf) fjVar.f303313bT.mo27525b()).mo97847b(C89849ae.OPA_INPUT_PLATE_ZERO_STATE);
            if (fjVar.f303455t.mo79746e(C90014bt.f247287eM)) {
                fjVar.mo97459aU();
                Context context = fjVar.f303346c;
                C53275hw hwVar = (C53275hw) C53287ih.f139693l.createBuilder();
                hwVar.copyOnWrite();
                C53287ih ihVar = (C53287ih) hwVar.instance;
                ihVar.f139698d = 1;
                ihVar.f139695a |= 1;
                hwVar.copyOnWrite();
                C53287ih ihVar2 = (C53287ih) hwVar.instance;
                ihVar2.f139702h = 1;
                ihVar2.f139695a |= 64;
                hwVar.copyOnWrite();
                C53287ih ihVar3 = (C53287ih) hwVar.instance;
                ihVar3.f139703i = 21;
                ihVar3.f139695a |= 128;
                ((C87571n) fjVar.f303272af.mo27525b()).mo81698j(context, (C53287ih) hwVar.build());
            } else if (fjVar.f303450o.mo95399aj()) {
                fjVar.mo97459aU();
                fjVar.mo97434V();
            } else if (fjVar.f303266aZ.f318451d != null) {
                fjVar.mo97498bH(false, false, false, 19);
            } else {
                fjVar.mo97498bH(false, false, false, 13);
                if (fjVar.f303455t.mo79746e(C90029ch.f248205S)) {
                    fjVar.mo97434V();
                }
            }
        }
    }
}
