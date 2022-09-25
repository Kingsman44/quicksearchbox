package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8826g;

import android.accounts.Account;
import android.content.ContentResolver;
import com.google.android.apps.gsa.search.core.p6517ak.C84600b;
import com.google.android.apps.gsa.search.core.p6519al.p6737i.C85494a;
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
import com.google.android.apps.gsa.speech.p7298l.p7300b.C92461a;
import com.google.android.libraries.search.location.C38725y;
import com.google.android.libraries.search.location.C38726z;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.p4449cd.p4456g.C57981b;
import com.google.speech.p5208h.C66595bu;
import dagger.C68214a;
import java.util.concurrent.Future;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.g.c */
/* compiled from: PG */
public final class C118060c implements C92439c {

    /* renamed from: a */
    public final C90931ca f327650a;

    /* renamed from: b */
    public final C89994f f327651b;

    /* renamed from: c */
    public final C92302a f327652c;

    /* renamed from: d */
    public final C92304b f327653d;

    /* renamed from: e */
    public final C68214a f327654e;

    /* renamed from: f */
    private Future f327655f;

    /* renamed from: g */
    private Future f327656g;

    /* renamed from: h */
    private C92455l f327657h;

    /* renamed from: i */
    private final Query f327658i;

    /* renamed from: j */
    private final String f327659j;

    /* renamed from: k */
    private final C85494a f327660k;

    /* renamed from: l */
    private final String f327661l;

    /* renamed from: m */
    private final C68214a f327662m;

    /* renamed from: n */
    private final ContentResolver f327663n;

    /* renamed from: o */
    private final C86124t f327664o;

    /* renamed from: p */
    private final C68214a f327665p;

    /* renamed from: q */
    private final C68214a f327666q;

    /* renamed from: r */
    private final C92461a f327667r;

    public C118060c(Query query, String str, C90931ca caVar, C89994f fVar, C85494a aVar, String str2, String str3, C68214a aVar2, ContentResolver contentResolver, C92302a aVar3, C92461a aVar4, C86124t tVar, C68214a aVar5, C68214a aVar6, C84600b bVar, C68214a aVar7) {
        this.f327650a = caVar;
        this.f327651b = fVar;
        this.f327658i = query;
        this.f327660k = aVar;
        this.f327659j = str;
        this.f327661l = (!query.mo84364bx("android.opa.extra.CONVERSATION_CLIENT_TYPE") || query.mo84263a("android.opa.extra.CONVERSATION_CLIENT_TYPE") != 3) ? str2 : str3;
        this.f327662m = aVar2;
        this.f327663n = contentResolver;
        this.f327652c = aVar3;
        this.f327667r = aVar4;
        this.f327664o = tVar;
        this.f327665p = aVar5;
        this.f327666q = aVar6;
        C38725y d = C38726z.m68011d(C39226b.TAG_CLASSIC_VOICE_SEARCH_LO);
        d.mo41493b(Duration.ofDays(1));
        this.f327653d = bVar.mo78367a(d.mo41492a());
        this.f327654e = aVar7;
    }

    /* renamed from: a */
    public final C57981b mo87118a() {
        Future future = this.f327655f;
        if (future == null) {
            future = this.f327650a.mo85138c(new C92446c((C89037bh) this.f327665p.mo27525b(), (C89045bp) this.f327666q.mo27525b()));
        }
        this.f327655f = future;
        Future future2 = this.f327656g;
        if (future2 == null) {
            future2 = this.f327650a.mo85138c(new C92448e(this.f327651b, this.f327661l, this.f327667r, (String) null, this.f327658i.f252760R, (String) null, (String) null));
        }
        this.f327656g = future2;
        C92455l lVar = this.f327657h;
        if (lVar == null) {
            lVar = new C92455l(new C118059b(this), this.f327650a, this.f327652c, this.f327651b, (Account) null, (String) null, (C66595bu) null);
        }
        this.f327657h = lVar;
        C118058a aVar = new C118058a(this.f327655f, this.f327656g, this.f327657h.f257883a, this.f327658i, this.f327659j, this.f327660k, this.f327662m, this.f327663n, this.f327664o);
        return new C92443g(this.f327650a, aVar);
    }

    /* renamed from: b */
    public final void mo87119b() {
        Future future = this.f327655f;
        if (future != null) {
            future.cancel(true);
        }
        Future future2 = this.f327656g;
        if (future2 != null) {
            future2.cancel(true);
        }
        C92455l lVar = this.f327657h;
        if (lVar != null) {
            lVar.mo87155a();
        }
    }

    /* renamed from: c */
    public final void mo87120c() {
        C92455l lVar = this.f327657h;
        if (lVar != null) {
            lVar.mo87156b();
        }
    }

    /* renamed from: d */
    public final /* synthetic */ boolean mo87121d() {
        return false;
    }
}
