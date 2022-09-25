package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7735b.p7740c;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.g.c.b;
import com.google.android.apps.gsa.p8889z.p8893c.p8899f.C118895a;
import com.google.android.apps.gsa.p8889z.p8893c.p8899f.C118896b;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C119053i;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C119067w;
import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87722bd;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87723be;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87724bf;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.C90606n;
import com.google.android.apps.gsa.shared.speech.C90607o;
import com.google.android.apps.gsa.shared.speech.p7139a.C90528t;
import com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7735b.p7736a.C98933w;
import com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7735b.p7736a.C98934x;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16730ar;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.C62940bt;
import dagger.C68214a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.b.b.c.ai */
/* compiled from: PG */
public final class C98976ai extends C98934x {

    /* renamed from: g */
    private static final C59071e f276675g = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cv.i.b.b.c.ai");

    /* renamed from: a */
    C86232bo f276676a;

    /* renamed from: b */
    Query f276677b;

    /* renamed from: c */
    C90606n f276678c;

    /* renamed from: d */
    final C98990aw f276679d;

    /* renamed from: e */
    int f276680e;

    /* renamed from: f */
    int f276681f;

    /* renamed from: h */
    private final SettableFuture f276682h;

    /* renamed from: i */
    private final C68214a f276683i;

    /* renamed from: j */
    private final long f276684j;

    /* renamed from: k */
    private final C119053i f276685k;

    /* renamed from: l */
    private final boolean f276686l;

    /* renamed from: m */
    private final boolean f276687m;

    /* renamed from: n */
    private final b f276688n;

    /* renamed from: o */
    private final C86610af f276689o;

    /* renamed from: p */
    private final C98933w f276690p;

    /* renamed from: q */
    private boolean f276691q;

    /* renamed from: r */
    private Optional f276692r = Optional.empty();

    /* renamed from: s */
    private C86232bo f276693s = null;

    /* renamed from: t */
    private boolean f276694t;

    /* renamed from: u */
    private boolean f276695u;

    /* renamed from: v */
    private boolean f276696v;

    /* renamed from: w */
    private Query f276697w;

    /* renamed from: x */
    private C86232bo f276698x;

    public C98976ai(C22871g gVar, C98933w wVar, C119067w wVar2, SettableFuture settableFuture, C68214a aVar, Query query, C90021c cVar, boolean z, b bVar, C86610af afVar) {
        super(wVar, wVar2.mo91376a(), wVar2);
        boolean z2 = false;
        this.f276694t = false;
        this.f276695u = false;
        this.f276696v = false;
        this.f276679d = new C98990aw(gVar, cVar.mo79743a(C90086ek.f250333bE));
        this.f276682h = settableFuture;
        this.f276683i = aVar;
        this.f276684j = query.f252749G;
        this.f276687m = (cVar.mo79746e(C90086ek.f250373bs) || cVar.mo79746e(C90086ek.f250277aB)) ? true : z2;
        this.f276680e = 1;
        this.f276681f = 1;
        this.f276685k = wVar2.mo91376a();
        this.f276686l = z;
        this.f276688n = bVar;
        this.f276689o = afVar;
        this.f276690p = wVar;
    }

    /* renamed from: p */
    private final void m164019p(C89849ae aeVar) {
        C89856f fVar = new C89856f();
        fVar.f246201a = aeVar;
        fVar.mo83701c("rId", Long.toString(this.f276684j));
        ((C89859i) this.f276683i.mo27525b()).mo74236a(fVar.mo83699a());
    }

    /* renamed from: q */
    private final void m164020q(C16730ar arVar) {
        C86775r rVar = this.f276689o.f233977l;
        if (rVar != null) {
            C87684al alVar = new C87684al(C88244um.CAR_ASSISTANT_NETWORK_STATE);
            C62940bt btVar = C87722bd.f237197a;
            C87723be beVar = (C87723be) C87724bf.f237198c.createBuilder();
            beVar.copyOnWrite();
            C87724bf bfVar = (C87724bf) beVar.instance;
            bfVar.f237201b = arVar.f48937e;
            bfVar.f237200a |= 1;
            alVar.mo81965b(btVar, (C87724bf) beVar.build());
            rVar.f234383e.mo80379b(alVar.mo81964a());
        }
    }

    /* renamed from: r */
    private final void m164021r(C118896b bVar) {
        this.f276685k.f332140a.f332136q.mo54591h(bVar);
        if (((C118895a) bVar).f331594c) {
            this.f276685k.f332140a.f332136q.mo54589f(true);
        }
    }

    /* renamed from: s */
    private final void m164022s(int i) {
        if (this.f276681f == 1) {
            if (i == 2) {
                m164019p(C89849ae.VOICE_SEARCH_EMBEDDED_DONE);
            } else {
                m164019p(C89849ae.VOICE_SEARCH_EMBEDDED_FAILED);
            }
        }
        this.f276681f = i;
    }

    /* renamed from: t */
    private final void m164023t(int i) {
        if (this.f276680e == 1) {
            if (i == 2) {
                m164019p(C89849ae.VOICE_SEARCH_NETWORK_DONE);
            } else {
                m164019p(C89849ae.VOICE_SEARCH_NETWORK_FAILED);
            }
        }
        this.f276680e = i;
    }

    /* renamed from: a */
    public final void mo91323a(C90607o oVar) {
        C58976aa aaVar = C58975e.f156826a;
        int i = oVar.f253280a;
        if (i == 1) {
            m164019p(C89849ae.VOICE_SEARCH_EMBEDDED_SPEECH_START);
        } else if (i == 2) {
            m164019p(C89849ae.VOICE_SEARCH_NETWORK_SPEECH_START);
        }
        super.mo91323a(oVar);
    }

    /* renamed from: b */
    public final void mo91324b(int i) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f276681f != 2 && i == 1) {
            m164020q(C16730ar.ASSUMING_GOOD_NETWORK);
            if (this.f276687m && this.f276680e != 3) {
                Query query = this.f276677b;
                if (!(query == null || this.f276676a == null)) {
                    C59104x b = f276675g.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "AHybridFallbackEventM");
                    ((C59052c) ((C59052c) b).mo56372aa(31383)).mo56389s("Fulfillment done by network for query text: %s", query.f252768g);
                    super.mo91329g(1, query, this.f276676a);
                }
                C90606n nVar = this.f276678c;
                if (nVar != null) {
                    super.mo91327e(1, nVar);
                }
            }
            if (this.f276680e != 3) {
                m164023t(2);
            }
            this.f276688n.e = 2;
            m164019p(C89849ae.VOICE_SEARCH_NETWORK_HANDLED_SEARCH_RESULT);
            super.mo91324b(1);
        }
    }

    /* renamed from: c */
    public final void mo91325c(C90607o oVar) {
        C58976aa aaVar = C58975e.f156826a;
        int i = oVar.f253280a;
        if (i == 1) {
            m164019p(C89849ae.VOICE_SEARCH_EMBEDDED_SPEECH_END_GRACE_PERIOD_START);
        } else if (i == 2) {
            m164019p(C89849ae.VOICE_SEARCH_NETWORK_SPEECH_END_GRACE_PERIOD_START);
        }
        C98990aw awVar = this.f276679d;
        C98975ah ahVar = new C98975ah(this);
        if (awVar.f276764a == null) {
            awVar.f276764a = awVar.f276766c.mo28203c(awVar.f276765b, awVar.f276767d, new C98989av(awVar, ahVar));
        }
        super.mo91325c(oVar);
    }

    /* renamed from: d */
    public final void mo91326d(int i, boolean z, C90528t tVar, C86232bo boVar) {
        C58976aa aaVar = C58975e.f156826a;
        int i2 = this.f276681f;
        if (i2 == 1) {
            if (tVar.f253082c != 524305) {
                i2 = 1;
            } else {
                m164023t(3);
                this.f276692r = Optional.m71637of(tVar);
                m164020q(C16730ar.OFFLINE);
                this.f276693s = boVar;
                super.mo91326d(i, z, tVar, boVar);
                return;
            }
        }
        if (i == 2) {
            m164022s(3);
            if (this.f276680e == 3) {
                m164020q(C16730ar.OFFLINE);
                super.mo91326d(1, this.f276691q, (C90528t) this.f276692r.get(), this.f276693s);
                return;
            }
            return;
        }
        if (i == 1) {
            if (i2 != 2) {
                m164023t(3);
                this.f276691q = z;
                this.f276692r = Optional.m71637of(tVar);
                this.f276693s = boVar;
                if (this.f276681f == 3) {
                    i = 1;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        m164020q(C16730ar.OFFLINE);
        super.mo91326d(i, z, tVar, boVar);
    }

    /* renamed from: e */
    public final void mo91327e(int i, C90606n nVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (!mo91356m()) {
            if (i != 1) {
                C59104x d = f276675g.mo56226d();
                d.mo56378ag(C58975e.f156826a, "AHybridFallbackEventM");
                ((C59052c) ((C59052c) d).mo56372aa(31394)).mo56386p("#handleMediaDataResult invoked for embedded!");
            } else if (this.f276687m) {
                this.f276678c = nVar;
            } else {
                m164023t(2);
                super.mo91327e(1, nVar);
            }
        }
    }

    /* renamed from: f */
    public final void mo91328f(int i) {
        C58976aa aaVar = C58975e.f156826a;
        if (!mo91356m()) {
            if (i == 2) {
                m164022s(3);
                if (this.f276680e == 3) {
                    m164020q(C16730ar.OFFLINE);
                    super.mo91326d(1, this.f276691q, (C90528t) this.f276692r.get(), (C86232bo) null);
                    return;
                }
                return;
            }
            if (i == 1) {
                m164023t(2);
                i = 1;
            }
            m164020q(C16730ar.ASSUMING_GOOD_NETWORK);
            super.mo91328f(i);
        }
    }

    /* renamed from: g */
    public final void mo91329g(int i, Query query, C86232bo boVar) {
        C58976aa aaVar = C58975e.f156826a;
        mo91355l(i, query, boVar);
    }

    /* renamed from: h */
    public final void mo91330h(int i, C118896b bVar) {
        int i2;
        if (this.f276694t || i != 2) {
            i2 = i;
        } else {
            this.f276694t = true;
            m164019p(C89849ae.VOICE_SEARCH_EMBEDDED_FIRST_RECOGNITION);
            i = 2;
            i2 = 2;
        }
        if (!this.f276695u && i == 1) {
            this.f276695u = true;
            m164019p(C89849ae.VOICE_SEARCH_NETWORK_FIRST_RECOGNITION);
        }
        C58976aa aaVar = C58975e.f156826a;
        if (!mo91356m()) {
            if (i2 == 2) {
                if (this.f276686l) {
                    C118895a aVar = (C118895a) bVar;
                    m164021r(new C118895a(aVar.f331592a, aVar.f331593b, false, aVar.f331595d));
                }
            } else if (i2 == 1) {
                C118895a aVar2 = (C118895a) bVar;
                if (aVar2.f331594c) {
                    m164019p(C89849ae.VOICE_SEARCH_NETWORK_FINAL_TEXT_RECOGNIZED);
                    if (!this.f276687m) {
                        m164023t(2);
                    }
                }
                if (!this.f276686l) {
                    super.mo91330h(1, bVar);
                } else if (aVar2.f331594c) {
                    m164021r(bVar);
                }
            }
        }
    }

    /* renamed from: i */
    public final void mo91331i(int i) {
        C58976aa aaVar = C58975e.f156826a;
        if (!mo91356m() && i == 1) {
            m164018o(1);
        }
    }

    /* renamed from: j */
    public final boolean mo91332j(int i) {
        C58976aa aaVar = C58975e.f156826a;
        return !mo91356m() && i == 1;
    }

    /* renamed from: l */
    public final void mo91355l(int i, Query query, C86232bo boVar) {
        if (mo91356m()) {
            C58976aa aaVar = C58975e.f156826a;
        } else if (i == 2) {
            if (this.f276680e == 2) {
                C58976aa aaVar2 = C58975e.f156826a;
            } else if (boVar == null) {
                C58976aa aaVar3 = C58975e.f156826a;
                this.f276682h.mo57356n(query);
                this.f276697w = query;
                m164019p(C89849ae.VOICE_SEARCH_RECEIVED_EMBEDDED_QUERY);
            } else {
                this.f276698x = boVar;
                m164019p(C89849ae.VOICE_SEARCH_EMBEDDED_FULFILLMENT_FINISHED);
                if (this.f276679d.f276768e.get()) {
                    C59104x b = f276675g.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "AHybridFallbackEventM");
                    ((C59052c) ((C59052c) b).mo56372aa(31403)).mo56389s("Fulfillment done by embedded for query text: %s", query.f252768g);
                    query.getClass();
                    m164019p(C89849ae.VOICE_SEARCH_EMBEDDED_FINAL_TEXT_RECOGNIZED);
                    m164019p(C89849ae.VOICE_SEARCH_EMBEDDED_HANDLED_SEARCH_RESULT);
                    m164022s(2);
                    super.mo91330h(2, new C118895a(query.f252768g.toString(), BuildConfig.FLAVOR, true, query.f252754L));
                    m164018o(2);
                    m164020q(C16730ar.OFFLINE);
                    this.f276690p.mo91338e();
                    super.mo91329g(2, query, boVar);
                    this.f276688n.e = 3;
                    super.mo91324b(2);
                    return;
                }
                C58976aa aaVar4 = C58975e.f156826a;
                m164019p(C89849ae.VOICE_SEARCH_EMBEDDED_FULFILLMENT_FINISHED_STILL_IN_GRACE_PERIOD);
            }
        } else if (i == 1) {
            this.f276676a = boVar;
            if (this.f276687m) {
                C58976aa aaVar5 = C58975e.f156826a;
                m164019p(C89849ae.VOICE_SEARCH_NETWORK_BUFFER_SEARCH_RESULT);
                this.f276677b = query;
                return;
            }
            C58976aa aaVar6 = C58975e.f156826a;
            m164019p(C89849ae.VOICE_SEARCH_NETWORK_HANDLE_RECOGNITION_COMPLETE_WINS);
            m164023t(2);
            super.mo91329g(1, query, boVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo91356m() {
        return this.f276681f == 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo91357n() {
        if (this.f276681f == 2 || this.f276680e == 2) {
            C58976aa aaVar = C58975e.f156826a;
            m164019p(C89849ae.VOICE_SEARCH_GRACE_PERIOD_END_FULFILLMENT_ALREADY_DONE);
        } else if (this.f276697w == null || this.f276698x == null) {
            C58976aa aaVar2 = C58975e.f156826a;
            m164019p(C89849ae.VOICE_SEARCH_GRACE_PERIOD_END_EMBEDDED_NOT_FINISHED);
        } else {
            C58976aa aaVar3 = C58975e.f156826a;
            m164019p(C89849ae.VOICE_SEARCH_GRACE_PERIOD_END_EMBEDDED_FINISHED);
            mo91355l(2, this.f276697w, this.f276698x);
        }
    }

    /* renamed from: o */
    private final void m164018o(int i) {
        if (!this.f276696v) {
            this.f276696v = true;
            if (i == 2) {
                m164019p(C89849ae.VOICE_SEARCH_EMBEDDED_SUCCESS_PLAY_SOUND);
            } else {
                m164019p(C89849ae.VOICE_SEARCH_NETWORK_SUCCESS_PLAY_SOUND);
            }
            super.mo91331i(i);
        }
    }
}
