package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108248bs;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108249bt;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108250bu;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8627a.C114542a;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8627a.C114545d;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8627a.C114546e;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114890v;
import com.google.assistant.p3994s.p3995a.C53365le;
import com.google.assistant.p3994s.p3995a.C53366lf;
import com.google.assistant.p3994s.p3995a.C53368lh;
import com.google.assistant.p3994s.p3995a.C53376lp;
import com.google.assistant.p3994s.p3995a.C53430np;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.be */
/* compiled from: PG */
public final /* synthetic */ class C115001be implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C115002bf f319190a;

    public /* synthetic */ C115001be(C115002bf bfVar) {
        this.f319190a = bfVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C53376lp lpVar;
        C115002bf bfVar = this.f319190a;
        C114542a aVar = new C114542a();
        aVar.f317636a = new C58759qy(C53365le.CONVERSATION_STARTERS);
        C114545d a = aVar.mo101396a();
        C114546e eVar = bfVar.f319194d;
        C53368lh lhVar = bfVar.f319193c.f140071b;
        if (lhVar == null) {
            lhVar = C53368lh.f140044b;
        }
        C58833ax b = eVar.mo101402b(lhVar, a);
        if (!b.mo56113h()) {
            C59104x d = C115002bf.f319191a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ConversationStartersSD");
            ((C59052c) ((C59052c) d).mo56372aa(29486)).mo56386p("#getSuggestionsList(): Could not find CachedElementCandidate with ConversationStarters.");
            return C58485gu.m89845m();
        }
        C58480gp e = C58485gu.m89837e();
        C114890v vVar = bfVar.f319195e;
        C53366lf lfVar = (C53366lf) b.mo56107c();
        if (lfVar.f140037b == 3) {
            lpVar = (C53376lp) lfVar.f140038c;
        } else {
            lpVar = C53376lp.f140063c;
        }
        C53430np npVar = lpVar.f140066b;
        if (npVar == null) {
            npVar = C53430np.f140222e;
        }
        e.mo55396h(vVar.mo101687a(npVar, e.ab));
        if (bfVar.f319192b.v()) {
            C108249bt a2 = ((C108250bu) bfVar.f319196f.mo27525b()).mo96700a(C108248bs.LAUNCH_HQ_WITH_ICON, new Object[0]);
            a2.f301604k = e.ab;
            e.mo55395g(a2);
        }
        C58485gu f = e.mo55394f();
        C58976aa aaVar = C58975e.f156826a;
        int i = ((C58724pq) f).f156474d;
        return e.mo55394f();
    }
}
