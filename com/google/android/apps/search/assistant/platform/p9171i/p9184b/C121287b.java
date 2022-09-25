package com.google.android.apps.search.assistant.platform.p9171i.p9184b;

import com.google.android.apps.gsa.binaries.satin.app.atx;
import com.google.android.apps.gsa.binaries.satin.app.atz;
import com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9185a.C121284d;
import com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9185a.C121285e;
import com.google.android.apps.search.assistant.platform.p9171i.p9227d.p9228a.C121479c;
import com.google.android.apps.search.assistant.platform.p9171i.p9227d.p9228a.C121480d;
import com.google.android.apps.search.assistant.platform.p9171i.p9227d.p9228a.C121481e;
import com.google.android.libraries.assistant.p1594s.p1597b.C19169bc;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4450a.C57934a;
import com.google.p4449cd.p4462i.C58048g;
import dagger.p5294a.C68225k;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.i.b.b */
/* compiled from: PG */
public final class C121287b implements C121285e, C121284d {

    /* renamed from: a */
    public static final C59071e f336856a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.i.b.b");

    /* renamed from: b */
    public Optional f336857b = Optional.empty();

    /* renamed from: c */
    private final C121479c f336858c;

    /* renamed from: d */
    private final atx f336859d;

    /* renamed from: e */
    private final C58048g f336860e;

    public C121287b(atx atx, C58048g gVar, C121479c cVar) {
        this.f336859d = atx;
        this.f336860e = gVar;
        this.f336858c = cVar;
    }

    /* renamed from: b */
    public final synchronized Optional mo105109b() {
        return this.f336857b;
    }

    /* renamed from: c */
    public final C60870cx mo105110c() {
        C57934a a = this.f336860e.mo54628a("Tapas Indexer");
        C121479c cVar = this.f336858c;
        C121480d e = C121481e.m200734e();
        cVar.mo105176a(e);
        e.mo105166c(C19169bc.f53691g);
        C121481e a2 = e.mo105164a();
        atx atx = this.f336859d;
        atx.f204343c = a;
        a2.getClass();
        atx.f204344d = a2;
        C68225k.m98529a(atx.f204343c, C57934a.class);
        C68225k.m98529a(atx.f204344d, C121481e.class);
        atz atz = new atz(atx.f204341a, atx.f204342b, atx.f204343c, atx.f204344d);
        C60870cx gq = atz.b.mo60297gq();
        C121280a aVar = new C121280a(this, atz);
        C60856cj.m92911t(gq, C47810es.m84974n(aVar), C60826bg.f164896a);
        return gq;
    }
}
