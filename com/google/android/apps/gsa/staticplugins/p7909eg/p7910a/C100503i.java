package com.google.android.apps.gsa.staticplugins.p7909eg.p7910a;

import android.accounts.Account;
import com.google.android.apps.gsa.p6487s3.producers.C84305d;
import com.google.android.apps.gsa.search.core.p6517ak.C84600b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p6968aa.C89045bp;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.speech.helper.C92302a;
import com.google.android.apps.gsa.speech.helper.C92304b;
import com.google.android.apps.gsa.speech.p7295k.p7296a.C92439c;
import com.google.android.apps.gsa.speech.p7295k.p7296a.C92443g;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92446c;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92448e;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92455l;
import com.google.android.apps.gsa.speech.p7298l.C92472e;
import com.google.android.apps.gsa.speech.p7298l.C92473f;
import com.google.android.apps.gsa.speech.p7298l.p7300b.C92461a;
import com.google.android.libraries.search.location.C38725y;
import com.google.android.libraries.search.location.C38726z;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.p4449cd.p4456g.C57981b;
import com.google.speech.p5208h.C66550ag;
import com.google.speech.p5208h.C66595bu;
import com.google.speech.p5208h.C66678l;
import dagger.C68214a;
import java.util.concurrent.Future;
import p3186j$.time.Duration;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.eg.a.i */
/* compiled from: PG */
public final class C100503i implements C92439c {

    /* renamed from: a */
    public final C90931ca f280980a;

    /* renamed from: b */
    public final C92473f f280981b;

    /* renamed from: c */
    public final C89994f f280982c;

    /* renamed from: d */
    public final C92302a f280983d;

    /* renamed from: e */
    public final C92304b f280984e;

    /* renamed from: f */
    private final TtsRequest f280985f;

    /* renamed from: g */
    private final String f280986g;

    /* renamed from: h */
    private final long f280987h;

    /* renamed from: i */
    private final Future f280988i;

    /* renamed from: j */
    private final Future f280989j;

    /* renamed from: k */
    private final C86124t f280990k;

    /* renamed from: l */
    private final C92455l f280991l;

    /* renamed from: m */
    private final C68214a f280992m;

    /* renamed from: n */
    private final C68214a f280993n;

    /* renamed from: o */
    private final C92461a f280994o;

    public C100503i(TtsRequest ttsRequest, String str, long j, C90931ca caVar, C69464a aVar, C86124t tVar, C89994f fVar, C92302a aVar2, C92461a aVar3, C84600b bVar, C68214a aVar4, C68214a aVar5) {
        C90931ca caVar2 = caVar;
        this.f280985f = ttsRequest;
        this.f280986g = str;
        this.f280987h = j;
        this.f280980a = caVar2;
        this.f280990k = tVar;
        C92473f a = ((C92472e) aVar.mo17428b()).mo87218a();
        this.f280981b = a;
        this.f280982c = fVar;
        this.f280994o = aVar3;
        this.f280983d = aVar2;
        this.f280992m = aVar4;
        this.f280993n = aVar5;
        C38725y d = C38726z.m68011d(C39226b.TAG_CLASSIC_VOICE_SEARCH_LO);
        d.mo41493b(Duration.ofDays(1));
        this.f280984e = bVar.mo78367a(d.mo41492a());
        this.f280988i = caVar2.mo85138c(new C92446c((C89037bh) aVar4.mo27525b(), (C89045bp) aVar5.mo27525b()));
        C89994f fVar2 = fVar;
        this.f280989j = caVar2.mo85138c(new C92448e(fVar2, a.f258031s, aVar3, a.f258019g, a.f258007C, (String) null, (String) null));
        this.f280991l = new C92455l(new C100502h(this), caVar2, aVar2, fVar2, (Account) null, (String) null, (C66595bu) null);
    }

    /* renamed from: a */
    public final C57981b mo87118a() {
        return new C92443g(this.f280980a, new C84305d(this.f280988i, this.f280989j, this.f280991l.f257883a, (C66678l) null, (C66550ag) null, this.f280987h, "synthesizer", this.f280990k), new C100495a(this.f280985f, this.f280986g, this.f280990k));
    }

    /* renamed from: b */
    public final void mo87119b() {
        this.f280988i.cancel(true);
        this.f280989j.cancel(true);
        this.f280991l.mo87155a();
    }

    /* renamed from: c */
    public final void mo87120c() {
        this.f280991l.mo87156b();
    }

    /* renamed from: d */
    public final /* synthetic */ boolean mo87121d() {
        return false;
    }
}
