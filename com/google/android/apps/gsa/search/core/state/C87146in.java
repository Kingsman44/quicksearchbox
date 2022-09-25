package com.google.android.apps.gsa.search.core.state;

import android.support.p033v7.widget.LinearLayoutManager;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85422c;
import com.google.android.apps.gsa.search.core.p6519al.p6743l.C85516a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.search.core.state.p6874f.C87038e;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87722bd;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87723be;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87724bf;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7053c.C89878a;
import com.google.android.apps.gsa.shared.logger.p7053c.C89881d;
import com.google.android.apps.gsa.shared.logger.p7053c.C89882e;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.C90114fl;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.C90606n;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16730ar;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protobuf.C62940bt;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.in */
/* compiled from: PG */
public final class C87146in implements C85422c {

    /* renamed from: a */
    public static final C59071e f235461a = C59071e.m91332i("com.google.android.apps.gsa.search.core.state.in");

    /* renamed from: b */
    public final C68214a f235462b;

    /* renamed from: c */
    public final C86124t f235463c;

    /* renamed from: d */
    public final Query f235464d;

    /* renamed from: e */
    private final C68214a f235465e;

    /* renamed from: f */
    private final C68214a f235466f;

    /* renamed from: g */
    private final C68214a f235467g;

    /* renamed from: h */
    private final C68214a f235468h;

    /* renamed from: i */
    private final C85516a f235469i;

    /* renamed from: j */
    private final C68214a f235470j;

    /* renamed from: k */
    private final C22871g f235471k;

    /* renamed from: l */
    private final C68214a f235472l;

    public C87146in(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C85516a aVar6, C68214a aVar7, C86124t tVar, Query query, C22871g gVar, C68214a aVar8) {
        this.f235465e = aVar;
        this.f235462b = aVar2;
        this.f235466f = aVar3;
        this.f235467g = aVar4;
        this.f235468h = aVar5;
        this.f235469i = aVar6;
        this.f235470j = aVar7;
        this.f235463c = tVar;
        this.f235464d = query;
        this.f235471k = gVar;
        this.f235472l = aVar8;
    }

    /* renamed from: a */
    public final void mo78935a(Query query) {
        C58976aa aaVar = C58975e.f156826a;
        if (((C87052fn) this.f235462b.mo27525b()).f235177m.mo84383cP(query)) {
            ((C87062fx) this.f235467g.mo27525b()).mo80726e(2);
            this.f235469i.mo79039e();
            C87023eq eqVar = (C87023eq) this.f235465e.mo27525b();
            if (eqVar.f235037b.mo79746e(C90014bt.f247277eC) && !((C86812ai) eqVar.f235041f.mo27525b()).f234471a.mo81898p()) {
                eqVar.f235044i.mo78654b();
            }
            if (((C87052fn) eqVar.f235038c.mo27525b()).f235177m.mo84327bL()) {
                eqVar.f235043h.mo78609E(new C87684al(C88244um.CONTINUOUS_MATCH_STARTED).mo81964a());
            }
        }
    }

    /* renamed from: b */
    public final void mo78936b(Query query) {
        C58976aa aaVar = C58975e.f156826a;
        if (((C87052fn) this.f235462b.mo27525b()).f235177m.mo84383cP(query)) {
            C87062fx fxVar = (C87062fx) this.f235467g.mo27525b();
            int i = fxVar.f235222l;
            if (i != 0) {
                if (i == 1 || i == 2) {
                    fxVar.mo80726e(5);
                } else if (!(i == 4 || i == 5 || i == 6 || i == 7 || i == 9)) {
                    fxVar.mo80726e(4);
                }
            }
            this.f235469i.mo79040f();
            C87023eq eqVar = (C87023eq) this.f235465e.mo27525b();
            if (eqVar.f235037b.mo79746e(C90014bt.f247760nI) && eqVar.f235037b.mo79746e(C90014bt.f247677lf) && !((C86812ai) eqVar.f235041f.mo27525b()).f234471a.mo81898p()) {
                eqVar.f235044i.mo78655c();
            }
            if (((C87052fn) eqVar.f235038c.mo27525b()).f235177m.mo84327bL()) {
                eqVar.f235043h.mo78609E(new C87684al(C88244um.CONTINUOUS_MATCH_STOPPED).mo81964a());
            }
        }
    }

    /* renamed from: c */
    public final void mo78937c(Query query) {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: d */
    public final void mo78938d(Query query, C89061q qVar) {
        C58976aa aaVar = C58975e.f156826a;
        C89881d d = C89882e.m146357d();
        ((C89878a) d).f246244a = qVar.mo27433c();
        ((C87042fd) this.f235466f.mo27525b()).mo80670n(d.mo83713a(), query.f252749G);
    }

    /* renamed from: e */
    public final void mo78939e(byte[] bArr) {
        C58976aa aaVar = C58975e.f156826a;
        C87023eq eqVar = (C87023eq) this.f235465e.mo27525b();
        if (eqVar.f235050o) {
            eqVar.f235043h.mo78632q(bArr);
        } else {
            eqVar.f235060y.add(bArr);
        }
    }

    /* renamed from: f */
    public final void mo78940f(Query query) {
        C58976aa aaVar = C58975e.f156826a;
        if (query.mo84403cj()) {
            ((C87023eq) this.f235465e.mo27525b()).mo80637k(query);
        } else {
            ((C87052fn) this.f235462b.mo27525b()).mo80717v(query);
        }
        if (this.f235463c.mo79746e(C90114fl.f250732f) && query.mo84369cB()) {
            ((C87062fx) this.f235467g.mo27525b()).mo80726e(9);
        }
    }

    /* renamed from: g */
    public final void mo78941g(Query query, SearchError searchError) {
        C58976aa aaVar = C58975e.f156826a;
        if (query.mo84403cj()) {
            ((C87023eq) this.f235465e.mo27525b()).mo80634g(query, searchError);
        } else {
            ((C87052fn) this.f235462b.mo27525b()).mo80714s(query, searchError);
        }
    }

    /* renamed from: h */
    public final void mo78942h(Query query) {
        C58976aa aaVar = C58975e.f156826a;
        if (query.mo84403cj()) {
            C85005h hVar = ((C87023eq) this.f235465e.mo27525b()).f235043h;
            C87684al alVar = new C87684al(C88244um.CAR_ASSISTANT_NETWORK_STATE);
            C62940bt btVar = C87722bd.f237197a;
            C87723be beVar = (C87723be) C87724bf.f237198c.createBuilder();
            C16730ar arVar = C16730ar.SLOW_CONNECTION;
            beVar.copyOnWrite();
            C87724bf bfVar = (C87724bf) beVar.instance;
            bfVar.f237201b = arVar.f48937e;
            bfVar.f237200a |= 1;
            alVar.mo81965b(btVar, (C87724bf) beVar.build());
            hVar.mo78609E(alVar.mo81964a());
        }
    }

    /* renamed from: i */
    public final void mo78943i(Query query, SearchError searchError) {
        C58976aa aaVar = C58975e.f156826a;
        ((C87052fn) this.f235462b.mo27525b()).mo80714s(query, searchError);
    }

    /* renamed from: j */
    public final void mo78944j(Query query, C86232bo boVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (query.mo84403cj()) {
            ((C87023eq) this.f235465e.mo27525b()).mo80635i(query, boVar);
        } else {
            ((C87085gh) this.f235470j.mo27525b()).mo80732a(query, boVar);
        }
    }

    /* renamed from: k */
    public final void mo78945k(Query query) {
        C58976aa aaVar = C58975e.f156826a;
        ((C87062fx) this.f235467g.mo27525b()).mo80726e(5);
        ((C87062fx) this.f235467g.mo27525b()).f235217g.mo78791a();
        C87052fn fnVar = (C87052fn) this.f235462b.mo27525b();
        if (fnVar.mo80698T(query, false, fnVar.f235186v, false)) {
            fnVar.mo80591ar();
        }
    }

    /* renamed from: l */
    public final void mo78946l(Query query) {
        C58976aa aaVar = C58975e.f156826a;
        C87052fn fnVar = (C87052fn) this.f235462b.mo27525b();
        if (fnVar.f235177m.mo84383cP(query)) {
            C87038e.m140568b(query, 172, C58833ax.m90834k(C59687cb.f160034bf), fnVar.f235171g, fnVar.f235173i, fnVar.f235172h);
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 172;
            String b = C39191a.m68623b(fnVar.f235177m.f252749G);
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
            fnVar.mo80700V(query);
            fnVar.f235177m = fnVar.mo80712n(query);
            fnVar.mo80591ar();
        }
    }

    /* renamed from: m */
    public final void mo78947m(Query query, C90606n nVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (query.mo84403cj()) {
            ((C87023eq) this.f235465e.mo27525b()).mo80636j(query, nVar);
        } else if (!this.f235463c.mo79746e(C90114fl.f250727a)) {
            ((TtsState) this.f235468h.mo27525b()).mo80410j(query, nVar.mo84646b());
        }
    }

    /* renamed from: n */
    public final void mo78948n() {
        C58976aa aaVar = C58975e.f156826a;
        ((C87052fn) this.f235462b.mo27525b()).mo80461o();
    }

    /* renamed from: o */
    public final void mo78949o(Query query, String str, String str2, boolean z, String str3) {
        C58976aa aaVar = C58975e.f156826a;
        if (str3 != null && !str3.equals(query.f252754L)) {
            C59104x d = f235461a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "VoiceSearchEventBus");
            ((C59052c) ((C59052c) d).mo56372aa(9057)).mo56386p("language doesnt match getLanguageOverride");
        }
        if (((C87052fn) this.f235462b.mo27525b()).f235177m.mo84383cP(query)) {
            if (z && this.f235463c.mo79746e(C90082eg.f250067dx)) {
                C59104x b = f235461a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "VoiceSearchEventBus");
                ((C59052c) ((C59052c) b).mo56372aa(9055)).mo56389s("Recognized Text: %s", str);
            }
            C87062fx fxVar = (C87062fx) this.f235467g.mo27525b();
            if (str3 != null && !str3.equals(query.f252754L)) {
                ((C59052c) ((C59052c) C87062fx.f235211a.mo56226d()).mo56372aa(8885)).mo56386p("language doesnt match getLanguageOverride");
            }
            if (fxVar.mo80728i(query)) {
                if (fxVar.f235224n) {
                    ((C59052c) ((C59052c) C87062fx.f235211a.mo56226d()).mo56372aa(8883)).mo56386p("updateRecognizedText called after text already final.");
                } else {
                    if (z) {
                        if (!str2.isEmpty()) {
                            ((C59052c) ((C59052c) C87062fx.f235211a.mo56226d()).mo56372aa(8882)).mo56386p("Final updateRecognizedText call with non-empty pending text");
                            int i = C90755l.f253831a;
                        } else {
                            fxVar.f235227q = str2;
                            fxVar.f235226p = str;
                            fxVar.f235224n = true;
                            fxVar.f235217g.mo78793c(fxVar.f235226p, str3);
                            fxVar.mo80726e(9);
                        }
                    } else if (!fxVar.f235226p.equals(str) || !fxVar.f235227q.equals(str2)) {
                        fxVar.f235227q = str2;
                        fxVar.f235226p = str;
                        int i2 = fxVar.f235222l;
                        if (!(i2 == 4 || i2 == 5 || i2 == 8 || i2 == 7 || i2 == 9 || i2 == 0)) {
                            fxVar.mo80726e(10);
                        }
                        if (!fxVar.f235226p.isEmpty() || !fxVar.f235227q.isEmpty()) {
                            fxVar.f235217g.mo78800k(fxVar.f235226p, fxVar.f235227q, str3);
                        }
                    }
                    fxVar.mo80591ar();
                }
            }
            if (this.f235463c.mo79746e(C90014bt.f247222dA) && !this.f235463c.mo79746e(C90014bt.f247239dR)) {
                new C90873ag(((C89037bh) this.f235472l.mo27525b()).mo27378c(), this.f235471k, "check connectivity info", new C87144il(this, z, str)).mo85223a(C87145im.f235460a);
            }
        }
    }

    /* renamed from: p */
    public final void mo78950p(Query query) {
        C58976aa aaVar = C58975e.f156826a;
        C87062fx fxVar = (C87062fx) this.f235467g.mo27525b();
        if (fxVar.mo80728i(query)) {
            fxVar.mo80725a();
            fxVar.mo80726e(1);
        }
    }

    /* renamed from: q */
    public final void mo78951q(Query query) {
        C58976aa aaVar = C58975e.f156826a;
        if (((C87052fn) this.f235462b.mo27525b()).f235177m.mo84383cP(query)) {
            ((C87062fx) this.f235467g.mo27525b()).mo80726e(3);
            if (query.mo84403cj()) {
                ((C87023eq) this.f235465e.mo27525b()).f235043h.mo78636u();
            }
        }
    }

    /* renamed from: r */
    public final void mo78952r() {
        C58976aa aaVar = C58975e.f156826a;
        C87052fn fnVar = (C87052fn) this.f235462b.mo27525b();
        fnVar.mo80684A(fnVar.f235177m.mo84495w());
    }
}
