package com.google.android.apps.gsa.staticplugins.p7772db;

import android.content.Context;
import com.google.android.apps.gsa.assist.p501a.C9318f;
import com.google.android.apps.gsa.assist.p501a.C9321i;
import com.google.android.apps.gsa.assist.p502b.C9359c;
import com.google.android.apps.gsa.p6487s3.C84295m;
import com.google.android.apps.gsa.p6487s3.producers.C84299a;
import com.google.android.apps.gsa.p6487s3.producers.C84306e;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6517ak.C84600b;
import com.google.android.apps.gsa.search.core.p6519al.p6656cl.C85133a;
import com.google.android.apps.gsa.search.core.p6519al.p6664cp.C85168a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87865gl;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87866gm;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87867gn;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.p7139a.C90523o;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.speech.helper.C92302a;
import com.google.android.apps.gsa.speech.helper.C92304b;
import com.google.android.apps.gsa.speech.p7298l.p7300b.C92461a;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.C107892be;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.location.C38725y;
import com.google.android.libraries.search.location.C38726z;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.common.base.C58838bb;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5208h.C66610ch;
import com.google.speech.p5208h.C66611ci;
import com.google.speech.p5208h.C66629d;
import dagger.C68214a;
import p3186j$.time.Duration;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.db.h */
/* compiled from: PG */
public final class C99324h extends C86734a implements C85168a, C84295m {

    /* renamed from: a */
    public static final C59071e f277799a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.db.h");

    /* renamed from: A */
    private C107892be f277800A;

    /* renamed from: b */
    public final Object f277801b = new Object();

    /* renamed from: c */
    public final C68214a f277802c;

    /* renamed from: f */
    public final C90931ca f277803f;

    /* renamed from: g */
    public final C22871g f277804g;

    /* renamed from: h */
    public final C92304b f277805h;

    /* renamed from: i */
    public final C89994f f277806i;

    /* renamed from: j */
    public final C86124t f277807j;

    /* renamed from: k */
    public final C92302a f277808k;

    /* renamed from: l */
    public final C68214a f277809l;

    /* renamed from: m */
    public final C68214a f277810m;

    /* renamed from: n */
    public final C9359c f277811n;

    /* renamed from: o */
    public final C69464a f277812o;

    /* renamed from: p */
    public final Context f277813p;

    /* renamed from: q */
    public final C84306e f277814q;

    /* renamed from: r */
    public final C84299a f277815r;

    /* renamed from: s */
    public final C85133a f277816s;

    /* renamed from: t */
    public final C68214a f277817t;

    /* renamed from: u */
    public final C58881cr f277818u = new C99323g(this);

    /* renamed from: v */
    public Query f277819v;

    /* renamed from: w */
    public C60870cx f277820w;

    /* renamed from: x */
    public final C92461a f277821x;

    /* renamed from: y */
    private final C9321i f277822y;

    /* renamed from: z */
    private final C22871g f277823z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99324h(Context context, C90931ca caVar, C22871g gVar, C68214a aVar, C84600b bVar, C89994f fVar, C86124t tVar, C92461a aVar2, C92302a aVar3, C68214a aVar4, C68214a aVar5, C69464a aVar6, C9359c cVar, C84306e eVar, C84299a aVar7, C9321i iVar, C85133a aVar8, C22871g gVar2, C68214a aVar9) {
        super(C118575h.WORKER_NOW_ON_TAP, "screensearch");
        this.f277813p = context;
        this.f277802c = aVar;
        this.f277803f = caVar;
        this.f277804g = gVar;
        this.f277811n = cVar;
        C38725y d = C38726z.m68011d(C39226b.TAG_CLASSIC_VOICE_SEARCH_LO);
        d.mo41493b(Duration.ofDays(1));
        C84600b bVar2 = bVar;
        this.f277805h = bVar.mo78367a(d.mo41492a());
        this.f277806i = fVar;
        this.f277807j = tVar;
        this.f277821x = aVar2;
        this.f277808k = aVar3;
        this.f277812o = aVar6;
        this.f277809l = aVar4;
        this.f277810m = aVar5;
        this.f277814q = eVar;
        this.f277815r = aVar7;
        this.f277822y = iVar;
        this.f277816s = aVar8;
        this.f277823z = gVar2;
        this.f277817t = aVar9;
    }

    /* renamed from: a */
    public final void mo77831a(C90523o oVar) {
        C107892be beVar = this.f277800A;
        if (beVar != null) {
            C58976aa aaVar = C58975e.f156826a;
            C87866gm gmVar = (C87866gm) C87867gn.f237714e.createBuilder();
            gmVar.copyOnWrite();
            C87867gn gnVar = (C87867gn) gmVar.instance;
            gnVar.f237716a |= 2;
            gnVar.f237718c = true;
            gmVar.copyOnWrite();
            C87867gn gnVar2 = (C87867gn) gmVar.instance;
            gnVar2.f237716a |= 4;
            gnVar2.f237719d = true;
            C87684al alVar = new C87684al(C88244um.HANDLE_CONTEXTUAL_CARDS);
            alVar.mo81965b(C87865gl.f237713a, (C87867gn) gmVar.build());
            beVar.mo96326a(alVar.mo81964a());
        }
        mo79108hY();
    }

    /* renamed from: c */
    public final void mo77832c(C90523o oVar) {
        ((C59052c) ((C59052c) ((C59052c) f277799a.mo56225c()).mo56382g(oVar)).mo56372aa(31834)).mo56386p("#onNonFatalError");
    }

    /* renamed from: d */
    public final void mo77833d(C66611ci ciVar) {
        C107892be beVar = this.f277800A;
        if (beVar != null) {
            C66610ch a = C66610ch.m97260a(ciVar.f181209b);
            if (a == null) {
                a = C66610ch.IN_PROGRESS;
            }
            C58976aa aaVar = C58975e.f156826a;
            int i = a.f181205e;
            C62940bt r2 = C62942bv.checkIsLite(C66629d.f181275b);
            ciVar.mo58887l(r2);
            ciVar.f169962ag.mo58857o(r2.f169971d);
            ciVar.getSerializedSize();
            C87866gm gmVar = (C87866gm) C87867gn.f237714e.createBuilder();
            C62940bt r3 = C62942bv.checkIsLite(C66629d.f181275b);
            ciVar.mo58887l(r3);
            if (!ciVar.f169962ag.mo58857o(r3.f169971d)) {
                boolean z = true;
                if (!(a == C66610ch.DONE_ERROR || a == C66610ch.DONE_SUCCESS)) {
                    z = false;
                }
                gmVar.copyOnWrite();
                C87867gn gnVar = (C87867gn) gmVar.instance;
                gnVar.f237716a |= 4;
                gnVar.f237719d = z;
                C87684al alVar = new C87684al(C88244um.HANDLE_CONTEXTUAL_CARDS);
                alVar.mo81965b(C87865gl.f237713a, (C87867gn) gmVar.build());
                beVar.mo96326a(alVar.mo81964a());
            }
        }
    }

    /* renamed from: e */
    public final void mo78758e(Query query, C107892be beVar) {
        C58838bb.m90868c(query.mo84322bG());
        synchronized (this.f277801b) {
            mo79108hY();
            this.f277819v = query;
        }
        if (!query.mo84403cj()) {
            this.f277822y.mo17529f(C9318f.CONTEXTUAL);
        }
        this.f277800A = beVar;
        this.f277803f.mo85139d(new C99322f(this));
    }

    /* renamed from: hY */
    public final void mo79108hY() {
        synchronized (this.f277801b) {
            C60870cx cxVar = this.f277820w;
            if (cxVar != null) {
                new C90873ag(cxVar, this.f277823z, "Stopping NetworkRecognitionRunner", new C99320d(this)).mo85223a(C99321e.f277796a);
                this.f277820w = null;
            }
            this.f277819v = null;
        }
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
