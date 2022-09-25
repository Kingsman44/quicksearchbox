package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.state.C86842bk;
import com.google.android.apps.gsa.search.core.state.C87135ic;
import com.google.android.apps.gsa.search.core.state.C87141ii;
import com.google.android.apps.gsa.search.core.state.C87143ik;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60537to;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.jg */
/* compiled from: PG */
public final class C116812jg implements C87143ik {

    /* renamed from: a */
    private final C116811jf f324127a;

    /* renamed from: b */
    private final C86842bk f324128b;

    /* renamed from: c */
    private final C86842bk f324129c;

    /* renamed from: d */
    private final C86842bk f324130d;

    public C116812jg(C116811jf jfVar, C68214a aVar, C68214a aVar2, C68214a aVar3) {
        this.f324127a = jfVar;
        this.f324128b = new C86842bk(aVar);
        this.f324129c = new C86842bk(aVar2);
        this.f324130d = new C86842bk(aVar3);
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f324127a;
    }

    /* renamed from: b */
    public final void mo80513b(C87135ic icVar) {
        this.f324128b.mo80534b(icVar);
        this.f324129c.mo80534b(icVar);
        this.f324130d.mo80534b(icVar);
        boolean z = this.f324128b.f234552a;
        if (z || this.f324129c.f234552a || this.f324130d.f234552a) {
            C116811jf jfVar = this.f324127a;
            C86842bk bkVar = this.f324129c;
            C86842bk bkVar2 = this.f324130d;
            if (bkVar2.f234552a || z || bkVar.f234552a) {
                if (jfVar.f324111j.equals(Query.f252741b)) {
                    C58976aa aaVar = C58975e.f156826a;
                } else {
                    C60870cx cxVar = jfVar.f324114m;
                    boolean z2 = false;
                    if (cxVar == null || cxVar.isDone()) {
                        if (jfVar.f324113l == null) {
                            C58976aa aaVar2 = C58975e.f156826a;
                        } else if (((C116735gk) jfVar.f324104c.mo27525b()).mo102893ak(jfVar.f324111j)) {
                            C58976aa aaVar3 = C58975e.f156826a;
                            if (!((C116735gk) jfVar.f324104c.mo27525b()).f323784p.mo84369cB() && !((C116836z) jfVar.f324103b.mo27525b()).mo102995Z() && !((C116755hd) jfVar.f324106e.mo27525b()).f323888u && !jfVar.f324111j.mo84363bw("android.speech.extra.BEEP_SUPPRESSED")) {
                                z2 = true;
                            }
                            jfVar.f324113l.mo78931a(C60537to.NO_LONGER_HANDLED, z2);
                            ((C116755hd) jfVar.f324106e.mo27525b()).mo102926j(9);
                            jfVar.f324111j = Query.f252741b;
                            jfVar.f324113l = null;
                        } else {
                            C116735gk gkVar = (C116735gk) jfVar.f324104c.mo27525b();
                            if (gkVar.f323784p.mo84383cP(jfVar.f324111j) && gkVar.f323788t) {
                                gkVar.f323788t = false;
                                gkVar.f323736B = true;
                                C58976aa aaVar4 = C58975e.f156826a;
                                jfVar.f324113l.mo78932b();
                                if (!jfVar.f324108g.mo79746e(C90110fh.f250637ai)) {
                                    ((C116755hd) jfVar.f324106e.mo27525b()).mo102926j(5);
                                }
                            }
                        }
                    } else if (((C116735gk) jfVar.f324104c.mo27525b()).mo102893ak(jfVar.f324111j)) {
                        jfVar.f324107f.mo78930e(jfVar.f324111j);
                        C58976aa aaVar5 = C58975e.f156826a;
                        if (jfVar.f324114m.cancel(false)) {
                            jfVar.f324111j = Query.f252741b;
                        }
                    }
                }
            }
            if (bkVar2.f234552a) {
                jfVar.f324112k = true;
            }
        }
    }
}
