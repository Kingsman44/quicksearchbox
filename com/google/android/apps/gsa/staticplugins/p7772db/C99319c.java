package com.google.android.apps.gsa.staticplugins.p7772db;

import android.accounts.Account;
import android.databinding.C0118a;
import com.google.android.apps.gsa.assist.p501a.C9318f;
import com.google.android.apps.gsa.assist.p502b.C9358b;
import com.google.android.apps.gsa.assist.p502b.C9359c;
import com.google.android.apps.gsa.p6487s3.producers.C84299a;
import com.google.android.apps.gsa.p6487s3.producers.C84303b;
import com.google.android.apps.gsa.p6487s3.producers.C84306e;
import com.google.android.apps.gsa.p6487s3.producers.C84307f;
import com.google.android.apps.gsa.p6487s3.producers.C84314m;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p6968aa.C89045bp;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.speech.helper.C92302a;
import com.google.android.apps.gsa.speech.helper.C92304b;
import com.google.android.apps.gsa.speech.p7295k.p7296a.C92439c;
import com.google.android.apps.gsa.speech.p7295k.p7296a.C92443g;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92446c;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92448e;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92455l;
import com.google.android.apps.gsa.speech.p7298l.C92473f;
import com.google.android.apps.gsa.speech.p7298l.p7300b.C92461a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.C57981b;
import com.google.speech.p5208h.C66595bu;
import dagger.C68214a;
import java.util.concurrent.Future;

/* renamed from: com.google.android.apps.gsa.staticplugins.db.c */
/* compiled from: PG */
public final class C99319c implements C92439c {

    /* renamed from: f */
    private static final C59071e f277777f = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.db.c");

    /* renamed from: a */
    public final C90931ca f277778a;

    /* renamed from: b */
    public final C92304b f277779b;

    /* renamed from: c */
    public final C89994f f277780c;

    /* renamed from: d */
    public final C92302a f277781d;

    /* renamed from: e */
    public final C92473f f277782e;

    /* renamed from: g */
    private final C9359c f277783g;

    /* renamed from: h */
    private final C86124t f277784h;

    /* renamed from: i */
    private final C68214a f277785i;

    /* renamed from: j */
    private final C68214a f277786j;

    /* renamed from: k */
    private final C84306e f277787k;

    /* renamed from: l */
    private final C84299a f277788l;

    /* renamed from: m */
    private final Query f277789m;

    /* renamed from: n */
    private final C68214a f277790n;

    /* renamed from: o */
    private Future f277791o;

    /* renamed from: p */
    private Future f277792p;

    /* renamed from: q */
    private C92455l f277793q;

    /* renamed from: r */
    private final C92461a f277794r;

    public C99319c(C9359c cVar, C84306e eVar, C84299a aVar, C92473f fVar, C90931ca caVar, C92304b bVar, C89994f fVar2, C92461a aVar2, C86124t tVar, C92302a aVar3, C68214a aVar4, C68214a aVar5, Query query, C68214a aVar6) {
        C58976aa aaVar = C58975e.f156826a;
        this.f277778a = caVar;
        this.f277783g = cVar;
        this.f277779b = bVar;
        this.f277780c = fVar2;
        this.f277794r = aVar2;
        this.f277784h = tVar;
        this.f277781d = aVar3;
        this.f277785i = aVar4;
        this.f277786j = aVar5;
        this.f277787k = eVar;
        this.f277788l = aVar;
        this.f277782e = fVar;
        this.f277789m = query;
        this.f277790n = aVar6;
    }

    /* renamed from: a */
    public final C57981b mo87118a() {
        C60870cx cxVar;
        C84314m mVar;
        C58976aa aaVar = C58975e.f156826a;
        Future future = this.f277791o;
        if (future == null) {
            C90931ca caVar = this.f277778a;
            C89994f fVar = this.f277780c;
            C92473f fVar2 = this.f277782e;
            future = caVar.mo85138c(new C92448e(fVar, fVar2.f258031s, this.f277794r, fVar2.f258019g, fVar2.f258007C, (String) null, (String) null));
        }
        this.f277791o = future;
        Future future2 = this.f277792p;
        if (future2 == null) {
            future2 = this.f277778a.mo85138c(new C92446c((C89037bh) this.f277785i.mo27525b(), (C89045bp) this.f277786j.mo27525b()));
        }
        this.f277792p = future2;
        C92455l lVar = this.f277793q;
        if (lVar == null) {
            lVar = new C92455l(new C99318b(this), this.f277778a, this.f277781d, this.f277780c, (Account) null, (String) null, (C66595bu) null);
        }
        this.f277793q = lVar;
        C9359c cVar = this.f277783g;
        if (cVar == null) {
            C59104x c = f277777f.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ScrnSrchReqPrducrFctry");
            C0118a.m96d(c, "ClientUserContextProducer not injected correctly", 31823, C58979ad.FULL);
            cxVar = null;
        } else {
            cxVar = this.f277778a.mo85138c(new C9358b(cVar));
        }
        C99317a aVar = new C99317a(cxVar, this.f277791o, this.f277792p, this.f277793q.f257883a, this.f277789m.f252749G, this.f277782e.f258033u, this.f277784h);
        C90931ca caVar2 = this.f277778a;
        C84314m[] mVarArr = new C84314m[2];
        mVarArr[0] = aVar;
        if (this.f277789m.mo84403cj()) {
            mVar = new C84303b(this.f277788l, this.f277789m);
        } else {
            this.f277787k.f229439a = C9318f.CONTEXTUAL;
            mVar = new C84307f(this.f277787k, this.f277789m, this.f277790n);
        }
        mVarArr[1] = mVar;
        return new C92443g(caVar2, mVarArr);
    }

    /* renamed from: b */
    public final void mo87119b() {
        C58976aa aaVar = C58975e.f156826a;
        Future future = this.f277792p;
        if (future != null) {
            future.cancel(true);
        }
        C92455l lVar = this.f277793q;
        if (lVar != null) {
            lVar.f257883a.cancel(true);
        }
        Future future2 = this.f277791o;
        if (future2 != null) {
            future2.cancel(true);
        }
    }

    /* renamed from: c */
    public final void mo87120c() {
        C92455l lVar = this.f277793q;
        if (lVar != null) {
            lVar.mo87156b();
        }
    }

    /* renamed from: d */
    public final /* synthetic */ boolean mo87121d() {
        return false;
    }
}
