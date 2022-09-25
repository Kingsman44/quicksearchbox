package com.google.android.apps.gsa.staticplugins.p7903ef.p7906c.p7907a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6709dk.C85379a;
import com.google.android.apps.gsa.search.core.p6519al.p6709dk.C85385b;
import com.google.android.apps.gsa.search.core.p6519al.p6741k.C85505a;
import com.google.android.apps.gsa.search.core.p6519al.p6741k.C85515b;
import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.search.core.service.p6848e.C86681c;
import com.google.android.apps.gsa.search.core.service.p6848e.C86685g;
import com.google.android.apps.gsa.search.core.service.p6848e.C86686h;
import com.google.android.apps.gsa.search.core.service.p6851f.C86697a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86726f;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.speech.audio.C92214y;
import com.google.android.apps.gsa.speech.audio.p7268e.C92194i;
import com.google.android.apps.gsa.speech.p7298l.C92474g;
import com.google.android.apps.gsa.staticplugins.p7903ef.p7906c.p7908b.C100488a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2904c.C37478d;
import com.google.android.libraries.search.p2904c.C37520e;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.ef.c.a.i */
/* compiled from: PG */
public final class C100486i implements C86686h {

    /* renamed from: a */
    public static final C59071e f280897a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ef.c.a.i");

    /* renamed from: c */
    public final C100487j f280898c;

    /* renamed from: d */
    public final C85385b f280899d;

    /* renamed from: e */
    public final C100488a f280900e;

    /* renamed from: f */
    public final C85379a f280901f;

    /* renamed from: g */
    public final C92474g f280902g;

    /* renamed from: h */
    public final C68214a f280903h;

    /* renamed from: i */
    public final C92194i f280904i;

    /* renamed from: j */
    public final C68214a f280905j;

    /* renamed from: k */
    public ClientConfig f280906k;

    /* renamed from: l */
    public final C92214y f280907l;

    /* renamed from: m */
    private final C100480c f280908m;

    /* renamed from: n */
    private final C85515b f280909n;

    /* renamed from: o */
    private final C22871g f280910o;

    /* renamed from: p */
    private long f280911p;

    /* renamed from: q */
    private boolean f280912q;

    /* renamed from: r */
    private C60870cx f280913r = C118826c.f331423b;

    public C100486i(C100487j jVar, C100480c cVar, C85515b bVar, C22871g gVar, C85379a aVar, C85385b bVar2, C100488a aVar2, C92474g gVar2, C92214y yVar, C68214a aVar3, C92194i iVar, C68214a aVar4) {
        this.f280898c = jVar;
        this.f280908m = cVar;
        this.f280909n = bVar;
        this.f280910o = gVar;
        this.f280899d = bVar2;
        this.f280900e = aVar2;
        this.f280901f = aVar;
        this.f280902g = gVar2;
        this.f280907l = yVar;
        this.f280903h = aVar3;
        this.f280904i = iVar;
        this.f280905j = aVar4;
    }

    /* renamed from: a */
    private final void m166556a() {
        if (!this.f280898c.f280914a.equals(Query.f252741b) && this.f280913r.isDone()) {
            this.f280913r = this.f280910o.mo28209i(this.f280899d.mo78911e(!this.f280898c.f280914a.mo84363bw("android.speech.extra.BEEP_SUPPRESSED")), "cancel future", new C100485h(this));
        }
    }

    /* renamed from: b */
    public final /* synthetic */ C86726f mo80291b(C21370a aVar) {
        return C86685g.m139632a(aVar);
    }

    /* renamed from: e */
    public final /* synthetic */ C58528ij mo80292e() {
        return C86686h.f234170b;
    }

    /* renamed from: f */
    public final void mo80293f(long j, ClientEventData clientEventData, C86681c cVar) {
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        C58976aa aaVar = C58975e.f156826a;
        int ordinal = a.ordinal();
        if (ordinal != 36) {
            if (ordinal != 37) {
                if (ordinal == 45) {
                    Query query = (Query) clientEventData.mo81912b(Query.class);
                    if (query.f252780s == 0) {
                        C59104x d = f280897a.mo56226d();
                        d.mo56378ag(C58975e.f156826a, "TranscriptionSessionC");
                        ((C59052c) ((C59052c) d).mo56372aa(33456)).mo56386p("Query received by transcription is not committed!");
                    }
                    m166556a();
                    if (!query.mo84447db()) {
                        C59104x d2 = f280897a.mo56226d();
                        d2.mo56378ag(C58975e.f156826a, "TranscriptionSessionC");
                        ((C59052c) ((C59052c) d2).mo56372aa(33453)).mo56386p("Queries handled by this subcontroller should always be of type transcription");
                    }
                    if ((!query.mo84366bz() || !query.mo84336bU()) && !this.f280912q) {
                        this.f280912q = true;
                        this.f280909n.mo79029e(this.f280911p);
                        this.f280909n.mo79033i(C37520e.ROUTE_NO_AUDIO, C37478d.CONNECTION_TYPE_NONE, (C85505a) null, true);
                    }
                    C90875ai.m148465b(C100483f.f280894a, this.f280910o.mo28210j(this.f280913r, "commit transcription query", new C100482e(this, query)), this.f280910o, "transcription logging").mo85223a(C100484g.f280895a);
                    return;
                } else if (ordinal != 47) {
                    C59104x d3 = f280897a.mo56226d();
                    d3.mo56378ag(C58975e.f156826a, "TranscriptionSessionC");
                    ((C59052c) ((C59052c) d3).mo56372aa(33455)).mo56389s("Unhandled client event: %s", a);
                    return;
                }
            }
            m166556a();
        } else if (!this.f280898c.f280914a.equals(Query.f252741b)) {
            this.f280913r = this.f280910o.mo28209i(this.f280899d.mo78910d(), "stop listening", new C100481d(this));
        }
    }

    /* renamed from: g */
    public final /* synthetic */ void mo80294g(boolean z) {
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r(getClass().getName());
    }

    /* renamed from: h */
    public final void mo80295h() {
        this.f280908m.mo81996f();
        if (this.f280912q) {
            this.f280912q = false;
            this.f280909n.mo79028c(this.f280911p);
            this.f280909n.mo79033i(C37520e.ROUTE_NO_AUDIO, C37478d.CONNECTION_TYPE_NONE, (C85505a) null, true);
        }
        m166556a();
        this.f280900e.f280915a = null;
    }

    /* renamed from: i */
    public final void mo80296i(C86697a aVar) {
        C86775r rVar = (C86775r) aVar;
        this.f280900e.f280915a = rVar.f234383e;
        this.f280906k = rVar.f234384f;
    }

    /* renamed from: j */
    public final void mo80297j(long j, C88431bb bbVar, C58833ax axVar) {
        this.f280908m.mo81997g();
        this.f280911p = j;
    }

    /* renamed from: k */
    public final /* synthetic */ boolean mo80298k(ClientConfig clientConfig, ClientConfig clientConfig2) {
        return C86685g.m139633b(clientConfig, clientConfig2);
    }

    /* renamed from: l */
    public final /* synthetic */ boolean mo80299l() {
        return false;
    }
}
