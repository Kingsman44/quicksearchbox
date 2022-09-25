package com.google.android.apps.gsa.staticplugins.opa.worker.p8614i.p8616b;

import android.accounts.Account;
import com.google.android.apps.gsa.assistant.settings.shared.ae;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6517ak.C84600b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88344ye;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.speech.helper.C92302a;
import com.google.android.apps.gsa.speech.helper.C92304b;
import com.google.android.apps.gsa.speech.p7295k.p7296a.C92439c;
import com.google.android.apps.gsa.speech.p7295k.p7296a.C92443g;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92448e;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92455l;
import com.google.android.apps.gsa.speech.p7298l.p7300b.C92461a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112982q;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113425ff;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.location.C38725y;
import com.google.android.libraries.search.location.C38726z;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.common.p4552o.amo;
import com.google.p4449cd.p4456g.C57981b;
import com.google.speech.p5208h.C66595bu;
import dagger.C68214a;
import java.util.concurrent.Future;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.i.b.e */
/* compiled from: PG */
public final class C114344e implements C92439c {

    /* renamed from: a */
    public final C90931ca f317027a;

    /* renamed from: b */
    public final C89994f f317028b;

    /* renamed from: c */
    public final C92302a f317029c;

    /* renamed from: d */
    public final C92304b f317030d;

    /* renamed from: e */
    public final C68214a f317031e;

    /* renamed from: f */
    private Future f317032f;

    /* renamed from: g */
    private C92455l f317033g;

    /* renamed from: h */
    private final C88344ye f317034h;

    /* renamed from: i */
    private final String f317035i;

    /* renamed from: j */
    private final C86124t f317036j;

    /* renamed from: k */
    private final C86054o f317037k;

    /* renamed from: l */
    private final C113425ff f317038l;

    /* renamed from: m */
    private final C22871g f317039m;

    /* renamed from: n */
    private final ae f317040n;

    /* renamed from: o */
    private final C68214a f317041o;

    /* renamed from: p */
    private final C68214a f317042p;

    /* renamed from: q */
    private final C112982q f317043q;

    /* renamed from: r */
    private final C68214a f317044r;

    /* renamed from: s */
    private final C68214a f317045s;

    /* renamed from: t */
    private final C92461a f317046t;

    public C114344e(C88344ye yeVar, String str, C90931ca caVar, C89994f fVar, C92302a aVar, C92461a aVar2, C86124t tVar, C84600b bVar, C68214a aVar3, C86054o oVar, C113425ff ffVar, C22871g gVar, ae aeVar, C68214a aVar4, C68214a aVar5, C112982q qVar, C68214a aVar6, C68214a aVar7) {
        this.f317027a = caVar;
        this.f317028b = fVar;
        this.f317034h = yeVar;
        this.f317035i = str;
        this.f317029c = aVar;
        this.f317046t = aVar2;
        this.f317036j = tVar;
        C38725y d = C38726z.m68011d(C39226b.TAG_CLASSIC_VOICE_SEARCH_LO);
        d.mo41493b(Duration.ofDays(1));
        C84600b bVar2 = bVar;
        this.f317030d = bVar.mo78367a(d.mo41492a());
        this.f317031e = aVar3;
        this.f317037k = oVar;
        this.f317038l = ffVar;
        this.f317039m = gVar;
        this.f317040n = aeVar;
        this.f317041o = aVar4;
        this.f317042p = aVar5;
        this.f317043q = qVar;
        this.f317044r = aVar6;
        this.f317045s = aVar7;
    }

    /* renamed from: a */
    public final C57981b mo87118a() {
        Future future = this.f317032f;
        if (future == null) {
            future = this.f317027a.mo85138c(new C92448e(this.f317028b, "assistant-tapas", this.f317046t, (String) null, (amo) null, (String) null, (String) null));
        }
        this.f317032f = future;
        C92455l lVar = this.f317033g;
        if (lVar == null) {
            lVar = new C92455l(new C114343d(this), this.f317027a, this.f317029c, this.f317028b, (Account) null, (String) null, (C66595bu) null);
        }
        this.f317033g = lVar;
        C114342c cVar = new C114342c(this.f317032f, this.f317033g.f257883a, this.f317034h, this.f317035i, this.f317036j, this.f317037k, this.f317038l, this.f317039m, this.f317040n, this.f317041o, this.f317042p, this.f317043q, this.f317044r, this.f317045s);
        return new C92443g(this.f317027a, cVar);
    }

    /* renamed from: b */
    public final void mo87119b() {
        Future future = this.f317032f;
        if (future != null) {
            future.cancel(true);
        }
        C92455l lVar = this.f317033g;
        if (lVar != null) {
            lVar.mo87155a();
        }
    }

    /* renamed from: c */
    public final void mo87120c() {
        C92455l lVar = this.f317033g;
        if (lVar != null) {
            lVar.mo87156b();
        }
    }

    /* renamed from: d */
    public final /* synthetic */ boolean mo87121d() {
        return false;
    }
}
