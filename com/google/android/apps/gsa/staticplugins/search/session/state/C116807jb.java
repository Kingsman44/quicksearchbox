package com.google.android.apps.gsa.staticplugins.search.session.state;

import android.support.p033v7.widget.LinearLayoutManager;
import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85422c;
import com.google.android.apps.gsa.search.core.p6519al.p6743l.C85516a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.search.core.state.p6874f.C87038e;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7053c.C89878a;
import com.google.android.apps.gsa.shared.logger.p7053c.C89881d;
import com.google.android.apps.gsa.shared.logger.p7053c.C89882e;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.p7066m.C90114fl;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.C90606n;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.speech.audio.p7268e.C92194i;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protobuf.C63088z;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.jb */
/* compiled from: PG */
public final class C116807jb implements C85422c {

    /* renamed from: a */
    private final C68214a f324090a;

    /* renamed from: b */
    private final C68214a f324091b;

    /* renamed from: c */
    private final C68214a f324092c;

    /* renamed from: d */
    private final C68214a f324093d;

    /* renamed from: e */
    private final C68214a f324094e;

    /* renamed from: f */
    private final C85516a f324095f;

    /* renamed from: g */
    private final C68214a f324096g;

    /* renamed from: h */
    private final C86124t f324097h;

    public C116807jb(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C85516a aVar6, C68214a aVar7, C86124t tVar) {
        this.f324090a = aVar;
        this.f324091b = aVar2;
        this.f324092c = aVar3;
        this.f324093d = aVar4;
        this.f324094e = aVar5;
        this.f324095f = aVar6;
        this.f324096g = aVar7;
        this.f324097h = tVar;
    }

    /* renamed from: a */
    public final void mo78935a(Query query) {
        C58976aa aaVar = C58975e.f156826a;
        if (((C116735gk) this.f324090a.mo27525b()).f323784p.mo84383cP(query)) {
            ((C116755hd) this.f324092c.mo27525b()).mo102926j(2);
            this.f324095f.mo79039e();
        }
    }

    /* renamed from: b */
    public final void mo78936b(Query query) {
        C58976aa aaVar = C58975e.f156826a;
        if (((C116735gk) this.f324090a.mo27525b()).f323784p.mo84383cP(query)) {
            C116755hd hdVar = (C116755hd) this.f324092c.mo27525b();
            int i = hdVar.f323886s;
            if (i != 0) {
                if (i == 1 || i == 2) {
                    hdVar.mo102926j(5);
                } else if (!(i == 4 || i == 5 || i == 6 || i == 7 || i == 9)) {
                    hdVar.mo102926j(4);
                }
            }
            this.f324095f.mo79040f();
        }
    }

    /* renamed from: c */
    public final void mo78937c(Query query) {
        C58976aa aaVar = C58975e.f156826a;
        if (((C116735gk) this.f324090a.mo27525b()).f323784p.mo84383cP(query)) {
            ((C116735gk) this.f324090a.mo27525b()).mo102872M(query);
        }
    }

    /* renamed from: d */
    public final void mo78938d(Query query, C89061q qVar) {
        C58976aa aaVar = C58975e.f156826a;
        C89881d d = C89882e.m146357d();
        ((C89878a) d).f246244a = qVar.mo27433c();
        ((C116720fw) this.f324091b.mo27525b()).mo102850m(d.mo83713a(), query.f252749G);
    }

    /* renamed from: e */
    public final void mo78939e(byte[] bArr) {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: f */
    public final void mo78940f(Query query) {
        C58976aa aaVar = C58975e.f156826a;
        ((C116735gk) this.f324090a.mo27525b()).mo102864A(query);
    }

    /* renamed from: g */
    public final void mo78941g(Query query, SearchError searchError) {
        C58976aa aaVar = C58975e.f156826a;
        ((C116735gk) this.f324090a.mo27525b()).mo102907x(query, searchError);
    }

    /* renamed from: h */
    public final void mo78942h(Query query) {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: i */
    public final void mo78943i(Query query, SearchError searchError) {
        C58976aa aaVar = C58975e.f156826a;
        ((C116735gk) this.f324090a.mo27525b()).mo102907x(query, searchError);
    }

    /* renamed from: j */
    public final void mo78944j(Query query, C86232bo boVar) {
        C58976aa aaVar = C58975e.f156826a;
        C116764hm hmVar = (C116764hm) this.f324096g.mo27525b();
        new C90873ag(boVar.mo79893q(), hmVar.f323917b, "Pass back action data", new C116758hg(hmVar, query)).mo85223a(C116759hh.f323909a);
        new C90873ag(boVar.mo79871G(), hmVar.f323917b, "Pass back SRP metadata", new C116760hi(hmVar, query)).mo85223a(C116761hj.f323912a);
        new C90873ag(boVar.mo79896t(), hmVar.f323917b, "Pass back Clockwork result", new C116762hk(hmVar, query)).mo85223a(C116763hl.f323915a);
    }

    /* renamed from: k */
    public final void mo78945k(Query query) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f324097h.mo79746e(C90110fh.f250663bH)) {
            if (((C116735gk) this.f324090a.mo27525b()).mo102884aa() && query.mo84395cb(this.f324097h.mo79745c(C90110fh.f250705k), this.f324097h.mo79745c(C90110fh.f250636ah)) && !query.mo84391cX() && !((C116735gk) this.f324090a.mo27525b()).f323736B && !query.mo84461do()) {
                ((C116735gk) this.f324090a.mo27525b()).mo102909z(query);
                return;
            } else if (!query.mo84391cX() && !((C116735gk) this.f324090a.mo27525b()).f323736B && query.mo84461do()) {
                ((C92194i) this.f324094e.mo27525b()).mo86849e(true);
            }
        }
        ((C116755hd) this.f324092c.mo27525b()).mo102926j(5);
        ((C116755hd) this.f324092c.mo27525b()).f323877j.mo78791a();
        ((C116735gk) this.f324090a.mo27525b()).mo102909z(query);
    }

    /* renamed from: l */
    public final void mo78946l(Query query) {
        C58976aa aaVar = C58975e.f156826a;
        C116735gk gkVar = (C116735gk) this.f324090a.mo27525b();
        if ((query.f252765d & 8796093022208L) != 0) {
            gkVar.mo102875P(query.mo84262Z());
        } else {
            if (gkVar.f323784p.mo84383cP(query)) {
                C87038e.m140568b(query, 172, C58833ax.m90834k(C59687cb.f160034bf), gkVar.f323777i, gkVar.f323779k, gkVar.f323778j);
                C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
                tzVar.copyOnWrite();
                C60555uf ufVar = (C60555uf) tzVar.instance;
                ufVar.f164093a |= 2;
                ufVar.f164258m = 172;
                String b = C39191a.m68623b(gkVar.f323784p.f252749G);
                tzVar.copyOnWrite();
                C60555uf ufVar2 = (C60555uf) tzVar.instance;
                b.getClass();
                ufVar2.f164093a |= 4;
                ufVar2.f164259n = b;
                tzVar.copyOnWrite();
                C60555uf ufVar3 = (C60555uf) tzVar.instance;
                ufVar3.f164250e |= LinearLayoutManager.INVALID_OFFSET;
                ufVar3.f164106aM = false;
                C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
                gkVar.mo102892aj(query);
                gkVar.mo102873N(query);
            }
            C116755hd hdVar = (C116755hd) this.f324092c.mo27525b();
            hdVar.f323875h.edit().putInt("agsa_legacy_voice_search_queries_counter_from_active_user", hdVar.f323875h.getInt("agsa_legacy_voice_search_queries_counter_from_active_user", 0) + 1).putLong("agsa_legacy_voice_search_punt_count", 0).putLong("agsa_legacy_voice_search_latest_query_timestamp_millis", hdVar.f323880m.mo26870b()).apply();
        }
        gkVar.mo80591ar();
        C116755hd hdVar2 = (C116755hd) this.f324092c.mo27525b();
        hdVar2.f323875h.edit().putInt("agsa_legacy_voice_search_queries_counter_from_active_user", hdVar2.f323875h.getInt("agsa_legacy_voice_search_queries_counter_from_active_user", 0) + 1).putLong("agsa_legacy_voice_search_punt_count", 0).putLong("agsa_legacy_voice_search_latest_query_timestamp_millis", hdVar2.f323880m.mo26870b()).apply();
    }

    /* renamed from: m */
    public final void mo78947m(Query query, C90606n nVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f324097h.mo79746e(C90114fl.f250727a)) {
            TtsState ttsState = (TtsState) this.f324093d.mo27525b();
            C63088z b = nVar.mo84646b();
            if (!((C116735gk) ttsState.f323218b.mo27525b()).f323784p.mo84383cP(query)) {
                return;
            }
            if (BitFlags.m148144f(ttsState.f323221e.f253762b, 1)) {
                boolean z = ttsState.f323220d;
            } else if (ttsState.f323225i == null) {
                ttsState.f323225i = b;
                b.mo59031d();
                ttsState.mo102755j();
            }
        }
    }

    /* renamed from: n */
    public final void mo78948n() {
        C58976aa aaVar = C58975e.f156826a;
        ((C116735gk) this.f324090a.mo27525b()).mo80461o();
    }

    /* renamed from: o */
    public final void mo78949o(Query query, String str, String str2, boolean z, String str3) {
        C58976aa aaVar = C58975e.f156826a;
        if (((C116735gk) this.f324090a.mo27525b()).f323784p.mo84383cP(query)) {
            C116755hd hdVar = (C116755hd) this.f324092c.mo27525b();
            if (!hdVar.mo102928m(query)) {
                return;
            }
            if (hdVar.f323888u) {
                C59104x d = C116755hd.f323854a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "S_SearchPlateState");
                ((C59052c) ((C59052c) d).mo56372aa(32222)).mo56386p("updateRecognizedText called after text already final.");
                return;
            }
            if (z) {
                if (!str2.isEmpty()) {
                    C59104x d2 = C116755hd.f323854a.mo56226d();
                    d2.mo56378ag(C58975e.f156826a, "S_SearchPlateState");
                    ((C59052c) ((C59052c) d2).mo56372aa(32221)).mo56386p("Final updateRecognizedText call with non-empty pending text");
                    int i = C90755l.f253831a;
                    return;
                }
                hdVar.f323890w = str2;
                hdVar.f323889v = str;
                hdVar.f323888u = true;
                hdVar.f323877j.mo78793c(hdVar.f323889v, str3);
                hdVar.mo102926j(9);
            } else if (!hdVar.f323889v.equals(str) || !hdVar.f323890w.equals(str2)) {
                hdVar.f323890w = str2;
                hdVar.f323889v = str;
                int i2 = hdVar.f323886s;
                if (!(i2 == 4 || i2 == 5 || i2 == 8 || i2 == 7 || i2 == 9 || i2 == 0)) {
                    hdVar.mo102926j(10);
                }
                if (!hdVar.f323889v.isEmpty() || !hdVar.f323890w.isEmpty()) {
                    hdVar.f323877j.mo78800k(hdVar.f323889v, hdVar.f323890w, str3);
                }
            } else {
                return;
            }
            hdVar.mo80591ar();
        }
    }

    /* renamed from: p */
    public final void mo78950p(Query query) {
        C58976aa aaVar = C58975e.f156826a;
        C116755hd hdVar = (C116755hd) this.f324092c.mo27525b();
        if (hdVar.mo102928m(query)) {
            hdVar.mo102925i();
            hdVar.mo102926j(1);
        }
    }

    /* renamed from: q */
    public final void mo78951q(Query query) {
        C58976aa aaVar = C58975e.f156826a;
        if (((C116735gk) this.f324090a.mo27525b()).f323784p.mo84383cP(query)) {
            ((C116755hd) this.f324092c.mo27525b()).mo102926j(3);
        }
    }

    /* renamed from: r */
    public final void mo78952r() {
        C58976aa aaVar = C58975e.f156826a;
        C116735gk gkVar = (C116735gk) this.f324090a.mo27525b();
        gkVar.mo102873N(gkVar.f323784p.mo84495w());
        gkVar.f323783o = gkVar.f323784p;
    }
}
