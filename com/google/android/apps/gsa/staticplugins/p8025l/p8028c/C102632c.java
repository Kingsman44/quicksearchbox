package com.google.android.apps.gsa.staticplugins.p8025l.p8028c;

import android.accounts.Account;
import android.content.Context;
import com.google.android.apps.gsa.search.core.p6517ak.C84600b;
import com.google.android.apps.gsa.search.core.p6519al.p6737i.C85494a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p6968aa.C89045bp;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.speech.helper.C92302a;
import com.google.android.apps.gsa.speech.p7295k.p7296a.C92439c;
import com.google.android.apps.gsa.speech.p7295k.p7296a.C92443g;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92446c;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92448e;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92455l;
import com.google.android.apps.gsa.speech.p7298l.p7300b.C92461a;
import com.google.android.libraries.p11033ap.p11034a.C147814a;
import com.google.common.p4552o.amo;
import com.google.p4449cd.p4456g.C57981b;
import com.google.speech.p5208h.C66595bu;
import dagger.C68214a;
import java.util.concurrent.Future;

/* renamed from: com.google.android.apps.gsa.staticplugins.l.c.c */
/* compiled from: PG */
public final class C102632c implements C92439c {

    /* renamed from: a */
    public final C90931ca f286425a;

    /* renamed from: b */
    public final C89994f f286426b;

    /* renamed from: c */
    public final C92302a f286427c;

    /* renamed from: d */
    public final C84600b f286428d;

    /* renamed from: e */
    public final C68214a f286429e;

    /* renamed from: f */
    private final Context f286430f;

    /* renamed from: g */
    private Future f286431g;

    /* renamed from: h */
    private Future f286432h;

    /* renamed from: i */
    private C92455l f286433i;

    /* renamed from: j */
    private final Query f286434j;

    /* renamed from: k */
    private final String f286435k;

    /* renamed from: l */
    private final C85494a f286436l;

    /* renamed from: m */
    private final String f286437m;

    /* renamed from: n */
    private final C68214a f286438n;

    /* renamed from: o */
    private final C86124t f286439o;

    /* renamed from: p */
    private final C68214a f286440p;

    /* renamed from: q */
    private final C68214a f286441q;

    /* renamed from: r */
    private final C92461a f286442r;

    public C102632c(Query query, String str, Context context, C90931ca caVar, C89994f fVar, C85494a aVar, String str2, String str3, C68214a aVar2, C92302a aVar3, C92461a aVar4, C86124t tVar, C68214a aVar5, C68214a aVar6, C84600b bVar, C68214a aVar7) {
        this.f286430f = context;
        this.f286425a = caVar;
        this.f286426b = fVar;
        this.f286434j = query;
        this.f286436l = aVar;
        this.f286435k = str;
        this.f286437m = (!query.mo84364bx("android.opa.extra.CONVERSATION_CLIENT_TYPE") || query.mo84263a("android.opa.extra.CONVERSATION_CLIENT_TYPE") != 3) ? str2 : str3;
        this.f286438n = aVar2;
        this.f286427c = aVar3;
        this.f286442r = aVar4;
        this.f286439o = tVar;
        this.f286440p = aVar5;
        this.f286441q = aVar6;
        this.f286428d = bVar;
        this.f286429e = aVar7;
    }

    /* renamed from: a */
    public final C57981b mo87118a() {
        Future future = this.f286431g;
        if (future == null) {
            future = this.f286425a.mo85138c(new C92446c((C89037bh) this.f286440p.mo27525b(), (C89045bp) this.f286441q.mo27525b()));
        }
        this.f286431g = future;
        Future future2 = this.f286432h;
        if (future2 == null) {
            future2 = this.f286425a.mo85138c(new C92448e(this.f286426b, this.f286437m, this.f286442r, (String) null, (amo) null, (String) null, (String) null));
        }
        this.f286432h = future2;
        C92455l lVar = this.f286433i;
        if (lVar == null) {
            lVar = new C92455l(new C102631b(this), this.f286425a, this.f286427c, this.f286426b, (Account) null, (String) null, (C66595bu) null);
        }
        this.f286433i = lVar;
        C102630a aVar = new C102630a(this.f286431g, this.f286432h, this.f286433i.f257883a, this.f286434j, this.f286435k, this.f286436l, this.f286438n, this.f286439o, new C147814a(this.f286430f));
        return new C92443g(this.f286425a, aVar);
    }

    /* renamed from: b */
    public final void mo87119b() {
        Future future = this.f286431g;
        if (future != null) {
            future.cancel(true);
        }
        Future future2 = this.f286432h;
        if (future2 != null) {
            future2.cancel(true);
        }
        C92455l lVar = this.f286433i;
        if (lVar != null) {
            lVar.mo87155a();
        }
    }

    /* renamed from: c */
    public final void mo87120c() {
        C92455l lVar = this.f286433i;
        if (lVar != null) {
            lVar.mo87156b();
        }
    }

    /* renamed from: d */
    public final /* synthetic */ boolean mo87121d() {
        return false;
    }
}
