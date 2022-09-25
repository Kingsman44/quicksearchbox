package com.google.android.apps.gsa.staticplugins.p7922eo;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.gsa.c.a.a;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C119053i;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C119067w;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.search.core.p6816p.C86237bt;
import com.google.android.apps.gsa.search.core.p6816p.C86245ca;
import com.google.android.apps.gsa.search.core.p6816p.C86246cb;
import com.google.android.apps.gsa.search.core.service.p6842a.C86593a;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.logger.C89886e;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.C90530b;
import com.google.android.apps.gsa.shared.speech.C90606n;
import com.google.android.apps.gsa.shared.speech.p7139a.C90523o;
import com.google.android.apps.gsa.shared.speech.p7139a.C90528t;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.speech.audio.C92173d;
import com.google.android.apps.gsa.speech.audio.C92185e;
import com.google.android.apps.gsa.speech.audio.C92195f;
import com.google.android.apps.gsa.speech.audio.C92214y;
import com.google.android.apps.gsa.speech.p7270c.C92218a;
import com.google.android.apps.gsa.speech.p7270c.C92221d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;
import com.google.speech.p5230n.p5232b.C67400ap;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.eo.n */
/* compiled from: PG */
public final class C100617n implements C119067w {

    /* renamed from: a */
    public static final C59071e f281353a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.eo.n");

    /* renamed from: b */
    public final C58833ax f281354b;

    /* renamed from: c */
    public final C21370a f281355c;

    /* renamed from: d */
    public final Context f281356d;

    /* renamed from: e */
    public final C22871g f281357e;

    /* renamed from: f */
    private final C119053i f281358f;

    /* renamed from: g */
    private final C68214a f281359g;

    /* renamed from: h */
    private final C68214a f281360h;

    /* renamed from: i */
    private final Query f281361i;

    /* renamed from: j */
    private final ClientConfig f281362j;

    /* renamed from: k */
    private final C58833ax f281363k;

    /* renamed from: l */
    private final C89994f f281364l;

    /* renamed from: m */
    private final C86237bt f281365m;

    /* renamed from: n */
    private final C68214a f281366n;

    /* renamed from: o */
    private final C68214a f281367o;

    /* renamed from: p */
    private final C86124t f281368p;

    /* renamed from: q */
    private final C92214y f281369q;

    public C100617n(C58833ax axVar, C119053i iVar, C21370a aVar, C68214a aVar2, C68214a aVar3, Context context, Query query, C92214y yVar, C58833ax axVar2, ClientConfig clientConfig, C89994f fVar, C22871g gVar, C86237bt btVar, C68214a aVar4, C68214a aVar5, C86124t tVar) {
        this.f281354b = axVar;
        this.f281358f = iVar;
        this.f281355c = aVar;
        this.f281359g = aVar2;
        this.f281360h = aVar3;
        this.f281356d = context;
        this.f281361i = query;
        this.f281369q = yVar;
        this.f281363k = axVar2;
        this.f281362j = clientConfig;
        this.f281364l = fVar;
        this.f281357e = gVar;
        this.f281365m = btVar;
        this.f281366n = aVar4;
        this.f281367o = aVar5;
        this.f281368p = tVar;
    }

    /* renamed from: i */
    private final void m166747i(int i) {
        if (this.f281354b.mo56113h() && this.f281361i.mo84412cs()) {
            this.f281357e.mo28211k(this.f281358f.f332140a.f332125f.f232931a, "Add the auto fulfillMode logging for query %s", new C100615l(this, i));
        }
    }

    /* renamed from: j */
    private final void m166748j(C86232bo boVar) {
        if (!this.f281358f.f332140a.f332120a.f232931a.isDone()) {
            this.f281358f.f332140a.f332120a.mo79832b(boVar);
        }
    }

    /* renamed from: a */
    public final C119053i mo91376a() {
        return this.f281358f;
    }

    /* renamed from: b */
    public final void mo91377b(C63088z zVar) {
        this.f281358f.f332140a.f332134o.mo54591h(zVar);
    }

    /* renamed from: c */
    public final void mo91378c(int i) {
        C60870cx cxVar;
        C22872h.m42743c(C86593a.class);
        C58976aa aaVar = C58975e.f156826a;
        this.f281358f.f332140a.mo104101m();
        if (i == 1) {
            ((C89859i) this.f281359g.mo27525b()).mo83702b(C89849ae.VOICE_SEARCH_NETWORK_RECOGNIZER_DONE);
            m166747i(i);
        } else if (i != 2) {
            ((C89859i) this.f281359g.mo27525b()).mo83702b(C89849ae.VOICE_SEARCH_UNKNOWN_RECOGNIZER_DONE);
        } else {
            ((C89859i) this.f281359g.mo27525b()).mo83702b(C89849ae.VOICE_SEARCH_EMBEDDED_RECOGNIZER_DONE);
            m166747i(i);
        }
        if (this.f281364l.mo83870aG()) {
            if (this.f281363k.mo56113h()) {
                cxVar = this.f281357e.mo28210j((C60870cx) this.f281363k.mo56107c(), "Dump audio for debug logging.", new C100614k(this));
            } else {
                C92214y yVar = this.f281369q;
                if (yVar != null) {
                    a a = yVar.mo86890a();
                    if (a != null) {
                        cxVar = new C92195f(this.f281356d, this.f281357e, this.f281355c, (C68214a) null, C92185e.f257010a).mo86855b(a.c, "-vs", (C92173d) null);
                    } else {
                        cxVar = C60856cj.m92899h(new C100616m("Can't retrieve last audio from AudioStore."));
                    }
                } else {
                    cxVar = C60856cj.m92899h(new C100616m("Can't dump audio because both recordedAudioFuture and audioStore are null."));
                }
            }
            C90875ai.m148465b(C100612i.f281348a, cxVar, this.f281357e, "dump audios").mo85223a(C100613j.f281349a);
        }
    }

    /* renamed from: d */
    public final void mo91379d(int i) {
        C22872h.m42743c(C86593a.class);
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f281361i.mo84369cB() && !this.f281358f.f332140a.f332124e.f232931a.isDone()) {
            this.f281358f.f332140a.mo104095g();
        }
    }

    /* renamed from: e */
    public final void mo91380e(Query query, C86232bo boVar) {
        C22872h.m42743c(C86593a.class);
        C58976aa aaVar = C58975e.f156826a;
        if (!TextUtils.isEmpty(query.f252768g)) {
            this.f281365m.mo79904a(boVar);
            this.f281358f.f332140a.mo104096h(C58833ax.m90834k(query));
            C92218a aVar = ((C92221d) this.f281366n.mo27525b()).f257113c;
            if (aVar != null) {
                aVar.f257096a = boVar;
            }
        }
        m166748j(boVar);
    }

    /* renamed from: f */
    public final void mo91381f(C90606n nVar) {
        this.f281358f.f332140a.mo104100l(C58833ax.m90834k(((C90530b) nVar).f253083a));
        this.f281358f.f332140a.mo104092d(C58833ax.m90834k(nVar));
    }

    /* renamed from: g */
    public final void mo91382g(C67400ap apVar) {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: h */
    public final void mo91383h(C90528t tVar) {
        C22872h.m42743c(C86593a.class);
        C59104x d = f281353a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "VSResultWRHandler");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(tVar)).mo56372aa(33681)).mo56389s("#handleError %s", tVar);
        if (this.f281362j.mo81878H() && tVar.f253082c != 393244 && ((C89037bh) this.f281360h.mo27525b()).mo27377b().mo83040a()) {
            C89886e b = ((C89911f) this.f281367o.mo27525b()).mo83756b(new C90523o(65568));
            b.mo83725d(this.f281361i.f252749G);
            b.mo83721a();
        }
        C86246cb a = C86245ca.m138881a(this.f281361i, this.f281355c.mo26871c(), this.f281360h, (C89859i) this.f281359g.mo27525b(), this.f281367o, this.f281368p);
        a.mo79840k(tVar);
        a.mo79921al(ActionData.f235991b);
        m166748j(a);
    }
}
