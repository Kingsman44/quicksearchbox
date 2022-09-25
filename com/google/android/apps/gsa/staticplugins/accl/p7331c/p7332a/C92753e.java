package com.google.android.apps.gsa.staticplugins.accl.p7331c.p7332a;

import android.accounts.Account;
import com.google.android.apps.gsa.p6487s3.producers.C84305d;
import com.google.android.apps.gsa.p6487s3.producers.C84314m;
import com.google.android.apps.gsa.search.core.p6517ak.C84600b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p6968aa.C89045bp;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.speech.helper.C92302a;
import com.google.android.apps.gsa.speech.helper.C92304b;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92446c;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92448e;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92455l;
import com.google.android.apps.gsa.speech.p7298l.p7300b.C92461a;
import com.google.android.libraries.search.location.C38725y;
import com.google.android.libraries.search.location.C38726z;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.common.p4552o.amo;
import com.google.speech.p5208h.C66550ag;
import com.google.speech.p5208h.C66595bu;
import com.google.speech.p5208h.C66678l;
import dagger.C68214a;
import java.util.concurrent.Future;
import p3186j$.time.Duration;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.c.a.e */
/* compiled from: PG */
public final class C92753e {

    /* renamed from: a */
    public final C90931ca f258832a;

    /* renamed from: b */
    public final C89994f f258833b;

    /* renamed from: c */
    public final C92302a f258834c;

    /* renamed from: d */
    public final C92304b f258835d;

    /* renamed from: e */
    public final C68214a f258836e;

    /* renamed from: f */
    private final String f258837f;

    /* renamed from: g */
    private final String f258838g;

    /* renamed from: h */
    private final C86124t f258839h;

    /* renamed from: i */
    private final C68214a f258840i;

    /* renamed from: j */
    private final C68214a f258841j;

    /* renamed from: k */
    private Future f258842k;

    /* renamed from: l */
    private C92455l f258843l;

    /* renamed from: m */
    private Future f258844m;

    /* renamed from: n */
    private final C92461a f258845n;

    public C92753e(String str, String str2, C90931ca caVar, C89994f fVar, C92302a aVar, C92461a aVar2, C86124t tVar, C68214a aVar3, C68214a aVar4, C84600b bVar, C68214a aVar5) {
        this.f258832a = caVar;
        this.f258837f = str;
        this.f258838g = str2;
        this.f258833b = fVar;
        this.f258834c = aVar;
        this.f258845n = aVar2;
        this.f258839h = tVar;
        this.f258840i = aVar3;
        this.f258841j = aVar4;
        C38725y d = C38726z.m68011d(C39226b.TAG_CLASSIC_VOICE_SEARCH_LO);
        d.mo41493b(Duration.ofDays(1));
        this.f258835d = bVar.mo78367a(d.mo41492a());
        this.f258836e = aVar5;
    }

    /* renamed from: d */
    private final synchronized Future m152774d() {
        if (this.f258844m == null) {
            this.f258844m = this.f258832a.mo85138c(new C92446c((C89037bh) this.f258840i.mo27525b(), (C89045bp) this.f258841j.mo27525b()));
        }
        return this.f258844m;
    }

    /* renamed from: e */
    private final synchronized Future m152775e() {
        if (this.f258842k == null) {
            this.f258842k = this.f258832a.mo85138c(new C92448e(this.f258833b, this.f258838g, this.f258845n, (String) null, (amo) null, (String) null, (String) null));
        }
        return this.f258842k;
    }

    /* renamed from: f */
    private final synchronized C69464a m152776f() {
        return new C92752d(this);
    }

    /* renamed from: a */
    public final C84314m mo87451a() {
        return new C84305d(m152774d(), m152775e(), mo87452b().f257883a, (C66678l) null, (C66550ag) null, C90719ac.f253778a.f253779b.nextLong(), this.f258837f, this.f258839h);
    }

    /* renamed from: b */
    public final synchronized C92455l mo87452b() {
        if (this.f258843l == null) {
            this.f258843l = new C92455l(m152776f(), this.f258832a, this.f258834c, this.f258833b, (Account) null, (String) null, (C66595bu) null);
        }
        return this.f258843l;
    }

    /* renamed from: c */
    public final void mo87453c() {
        m152774d().cancel(true);
        m152775e().cancel(true);
        mo87452b().mo87155a();
    }
}
