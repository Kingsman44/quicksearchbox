package com.google.android.apps.search.assistant.surfaces.dictation.service.p9448h;

import com.google.android.apps.gsa.binaries.satin.app.aom;
import com.google.android.apps.gsa.binaries.satin.app.aon;
import com.google.android.apps.search.assistant.libraries.dictation.starter.C119305a;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125160i;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9448h.p9449a.C125760a;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9450i.C125806d;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125912ab;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125931t;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125937z;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126303al;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.h.s */
/* compiled from: PG */
public final class C125795s {

    /* renamed from: a */
    public static final C59071e f346703a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.dictation.service.h.s");

    /* renamed from: b */
    public final C125912ab f346704b;

    /* renamed from: c */
    public final C125806d f346705c;

    /* renamed from: d */
    public final C119305a f346706d;

    /* renamed from: e */
    public final C60888db f346707e;

    /* renamed from: f */
    public final aom f346708f;

    /* renamed from: g */
    public final aon f346709g;

    /* renamed from: h */
    private final C125937z f346710h;

    /* renamed from: i */
    private final C125760a f346711i;

    /* renamed from: j */
    private final long f346712j;

    public C125795s(C125760a aVar, C125937z zVar, C125912ab abVar, aom aom, aon aon, C125806d dVar, C119305a aVar2, long j, C60888db dbVar) {
        this.f346710h = zVar;
        this.f346704b = abVar;
        this.f346711i = aVar;
        this.f346708f = aom;
        this.f346709g = aon;
        this.f346705c = dVar;
        this.f346706d = aVar2;
        this.f346712j = j;
        this.f346707e = dbVar;
    }

    /* renamed from: a */
    public final C60870cx mo107118a() {
        C60870cx e = this.f346710h.mo107202a().mo107186e(true);
        C125787k kVar = new C125787k(this);
        return C60922j.m93045h(e, C47810es.m84966f(kVar), this.f346707e);
    }

    /* renamed from: b */
    public final C60870cx mo107119b(C125160i iVar) {
        C60870cx cxVar;
        C125931t a = this.f346710h.mo107202a();
        C60870cx d = a.mo107185d();
        C125791o oVar = new C125791o(this, a);
        C46459k.m82829b(C60922j.m93045h(d, C47810es.m84966f(oVar), this.f346707e), "Error notifying eligibility to interactor [SD]", new Object[0]);
        long j = this.f346712j;
        if (j == -1 || j > a.mo107182a()) {
            C60870cx d2 = a.mo107185d();
            C125789m mVar = new C125789m(this, a, iVar);
            C60870cx g = C60922j.m93044g(d2, C47810es.m84963c(mVar), this.f346707e);
            C125760a aVar = this.f346711i;
            Objects.requireNonNull(aVar);
            C126303al alVar = new C126303al(new C125790n(aVar));
            cxVar = C60922j.m93044g(g, C47810es.m84963c(alVar), this.f346707e);
        } else {
            C60870cx b = a.f347135b.mo107167b(a.f347134a.f347148c);
            C125792p pVar = new C125792p(this, a, iVar);
            C60870cx g2 = C60922j.m93044g(b, C47810es.m84963c(pVar), this.f346707e);
            C125760a aVar2 = this.f346711i;
            Objects.requireNonNull(aVar2);
            C126303al alVar2 = new C126303al(new C125793q(aVar2));
            cxVar = C60922j.m93044g(g2, C47810es.m84963c(alVar2), this.f346707e);
        }
        C125788l lVar = new C125788l(this, iVar);
        return C60922j.m93045h(cxVar, C47810es.m84966f(lVar), this.f346707e);
    }
}
