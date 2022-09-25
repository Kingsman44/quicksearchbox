package com.google.android.apps.gsa.staticplugins.search.session.state;

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

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.bd */
/* compiled from: PG */
public final class C116593bd extends C116780ib {

    /* renamed from: a */
    public static final C59071e f323342a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.search.session.state.bd");

    /* renamed from: b */
    public final C68214a f323343b;

    /* renamed from: c */
    public final C68214a f323344c;

    /* renamed from: d */
    public final C22871g f323345d;

    /* renamed from: e */
    public C116592bc f323346e;

    /* renamed from: f */
    public long f323347f;

    /* renamed from: g */
    public final C85612b f323348g;

    /* renamed from: h */
    private final C68214a f323349h;

    public C116593bd(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C22871g gVar, C85612b bVar) {
        super(aVar, 157);
        this.f323349h = aVar2;
        this.f323343b = aVar3;
        this.f323344c = aVar4;
        this.f323345d = gVar;
        this.f323348g = bVar;
    }

    /* renamed from: e */
    public final C58170d mo102787e() {
        C58170d dVar;
        C116592bc bcVar = this.f323346e;
        if (bcVar != null && bcVar.f323341e) {
            if (bcVar.f323339c == null && bcVar.f323338b == null) {
                C59104x d = f323342a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "S_ClockworkState");
                C0118a.m109q(d, "getResponseToShow: ClockworkSearch is completed, but has no responses", 31988, "S_ClockworkSearch", C58975e.f156826a);
            }
            dVar = bcVar.f323339c;
            if (dVar == null) {
                dVar = bcVar.f323338b;
            }
            if (dVar != null) {
                C58976aa aaVar = C58975e.f156826a;
            }
        } else {
            dVar = null;
        }
        if (dVar != null) {
            C116592bc bcVar2 = this.f323346e;
            if (bcVar2 != null) {
                this.f323347f = bcVar2.f323337a.f252749G;
            }
            this.f323346e = null;
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo102788g(C116836z zVar) {
        CardDecision cardDecision;
        C116592bc bcVar = this.f323346e;
        if (bcVar != null) {
            VoiceAction f = zVar.mo80807f();
            Query query = bcVar.f323337a;
            if (zVar.mo102998ac() && zVar.mo102986P(query)) {
                if (zVar.mo80807f() != null && !zVar.mo102988S(zVar.f324250j)) {
                    return;
                }
                if (f == null) {
                    bcVar.mo102785a();
                    mo102790j(mo102787e());
                    C58976aa aaVar = C58975e.f156826a;
                    return;
                }
                if (bcVar.f323340d == null) {
                    bcVar.f323340d = f;
                }
                C116592bc bcVar2 = this.f323346e;
                VoiceAction voiceAction = null;
                if (bcVar2 != null) {
                    VoiceAction voiceAction2 = bcVar2.f323340d;
                    bcVar2.f323340d = null;
                    voiceAction = voiceAction2;
                }
                if (voiceAction != null) {
                    if (((C116836z) this.f323349h.mo27525b()).mo80807f() == voiceAction) {
                        cardDecision = ((C116836z) this.f323349h.mo27525b()).mo103015j();
                    } else {
                        cardDecision = CardDecision.f236248b;
                    }
                    new C90873ag(this.f323348g.mo79094a(voiceAction, cardDecision), this.f323345d, "show clockwork result", new C116584av(this)).mo85223a(C116585aw.f323327a);
                }
                C58976aa aaVar2 = C58975e.f156826a;
            }
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("ClockworkState");
        fVar.mo85290q("current search", this.f323346e);
    }

    /* renamed from: i */
    public final void mo102789i(C58170d dVar) {
        C116592bc bcVar = this.f323346e;
        if (bcVar == null) {
            return;
        }
        if (bcVar.f323338b == null || dVar != null) {
            bcVar.f323338b = dVar;
        }
    }

    /* renamed from: j */
    public final void mo102790j(C58170d dVar) {
        if (dVar != null) {
            C90875ai.m148465b(new C116582at(this), this.f323348g.mo79096c(dVar), this.f323345d, "clockwork search response shown").mo85223a(C116583au.f323325a);
        }
    }

    /* renamed from: k */
    public final boolean mo102791k(C116735gk gkVar) {
        Query query = gkVar.f323784p;
        C116592bc bcVar = this.f323346e;
        if ((bcVar != null && query.mo84383cP(bcVar.f323337a)) || this.f323347f == gkVar.f323784p.f252749G || !((C116569ag) this.f323343b.mo27525b()).f323267a.mo81873C() || !((C116735gk) this.f323344c.mo27525b()).f323784p.mo84326bK()) {
            return false;
        }
        C58976aa aaVar = C58975e.f156826a;
        this.f323346e = new C116592bc(query);
        return true;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f323346e);
        return "Clockwork{currentSearch={" + valueOf + "}}";
    }
}
