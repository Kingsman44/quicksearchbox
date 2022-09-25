package com.google.android.apps.gsa.search.core.state;

import android.databinding.C0118a;
import com.google.android.apps.gsa.search.core.p6519al.p6767x.p6768a.C85612b;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4500cm.p4514b.C58170d;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.bw */
/* compiled from: PG */
public final class C86854bw extends C86898ct {

    /* renamed from: a */
    public static final C59071e f234569a = C59071e.m91332i("com.google.android.apps.gsa.search.core.state.bw");

    /* renamed from: b */
    public final C68214a f234570b;

    /* renamed from: c */
    public final C68214a f234571c;

    /* renamed from: d */
    public final C22871g f234572d;

    /* renamed from: e */
    public C86853bv f234573e;

    /* renamed from: f */
    public long f234574f;

    /* renamed from: g */
    public final C85612b f234575g;

    /* renamed from: h */
    private final C68214a f234576h;

    public C86854bw(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C22871g gVar, C85612b bVar) {
        super(aVar, 56);
        this.f234576h = aVar2;
        this.f234570b = aVar3;
        this.f234571c = aVar4;
        this.f234572d = gVar;
        this.f234575g = bVar;
    }

    /* renamed from: a */
    public final C58170d mo80538a() {
        C58170d dVar;
        C86853bv bvVar = this.f234573e;
        if (bvVar != null && bvVar.f234568e) {
            if (bvVar.f234566c == null && bvVar.f234565b == null) {
                C59104x d = f234569a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "ClockworkState");
                C0118a.m109q(d, "getResponseToShow: ClockworkSearch is completed, but has no responses", 8668, "ClockworkSearch", C58975e.f156826a);
            }
            dVar = bvVar.f234566c;
            if (dVar == null) {
                dVar = bvVar.f234565b;
            }
            if (dVar != null) {
                C58976aa aaVar = C58975e.f156826a;
            }
        } else {
            dVar = null;
        }
        if (dVar != null) {
            C86853bv bvVar2 = this.f234573e;
            if (bvVar2 != null) {
                this.f234574f = bvVar2.f234564a.f252749G;
            }
            this.f234573e = null;
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo80539b(C87171z zVar) {
        CardDecision cardDecision;
        C86853bv bvVar = this.f234573e;
        if (bvVar != null) {
            VoiceAction f = zVar.mo80807f();
            Query query = bvVar.f234564a;
            if (zVar.mo80791X() && zVar.mo80781M(query)) {
                if (zVar.mo80807f() != null && !zVar.mo80783P(zVar.f235555j)) {
                    return;
                }
                if (f == null) {
                    bvVar.mo80536a();
                    mo80541f(mo80538a());
                    C58976aa aaVar = C58975e.f156826a;
                    return;
                }
                if (bvVar.f234567d == null) {
                    bvVar.f234567d = f;
                }
                C86853bv bvVar2 = this.f234573e;
                VoiceAction voiceAction = null;
                if (bvVar2 != null) {
                    VoiceAction voiceAction2 = bvVar2.f234567d;
                    bvVar2.f234567d = null;
                    voiceAction = voiceAction2;
                }
                if (voiceAction != null) {
                    if (((C87171z) this.f234576h.mo27525b()).mo80807f() == voiceAction) {
                        cardDecision = ((C87171z) this.f234576h.mo27525b()).mo80808g();
                    } else {
                        cardDecision = CardDecision.f236248b;
                    }
                    new C90873ag(this.f234575g.mo79094a(voiceAction, cardDecision), this.f234572d, "show clockwork result", new C86846bo(this)).mo85223a(C86847bp.f234557a);
                }
                C58976aa aaVar2 = C58975e.f156826a;
            }
        }
    }

    /* renamed from: e */
    public final void mo80540e(C58170d dVar) {
        C86853bv bvVar = this.f234573e;
        if (bvVar == null) {
            return;
        }
        if (bvVar.f234565b == null || dVar != null) {
            bvVar.f234565b = dVar;
        }
    }

    /* renamed from: f */
    public final void mo80541f(C58170d dVar) {
        if (dVar != null) {
            C90875ai.m148465b(new C86844bm(this), this.f234575g.mo79096c(dVar), this.f234572d, "clockwork search response shown").mo85223a(C86845bn.f234555a);
        }
    }

    /* renamed from: g */
    public final boolean mo80542g(C87052fn fnVar) {
        Query query = fnVar.f235177m;
        C86853bv bvVar = this.f234573e;
        if ((bvVar != null && query.mo84383cP(bvVar.f234564a)) || this.f234574f == fnVar.f235177m.f252749G || !((C86812ai) this.f234570b.mo27525b()).f234471a.mo81873C() || !((C87052fn) this.f234571c.mo27525b()).f235177m.mo84326bK()) {
            return false;
        }
        C58976aa aaVar = C58975e.f156826a;
        this.f234573e = new C86853bv(query);
        return true;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("ClockworkState");
        fVar.mo85290q("current search", this.f234573e);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f234573e);
        return "Clockwork{currentSearch={" + valueOf + "}}";
    }
}
