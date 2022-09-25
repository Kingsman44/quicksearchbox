package com.google.android.apps.search.assistant.verticals.ambient.p9944o.p9945a;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.apps.search.assistant.verticals.ambient.p10017u.C131834f;
import com.google.android.apps.search.assistant.verticals.ambient.p9912d.C130591a;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9944o.C131101a;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9958a.C131195b;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9958a.C131208o;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.C131720e;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p4016z.C53715bm;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.util.Set;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.o.a.m */
/* compiled from: PG */
public final class C131114m implements C131101a {

    /* renamed from: a */
    public final C58974d f358597a;

    /* renamed from: b */
    public final C131834f f358598b;

    /* renamed from: c */
    public final C130591a f358599c;

    /* renamed from: d */
    public final C131720e f358600d;

    /* renamed from: e */
    public final C131720e f358601e;

    /* renamed from: f */
    public final C131720e f358602f;

    /* renamed from: g */
    public final C131720e f358603g;

    /* renamed from: h */
    public final C60888db f358604h;

    /* renamed from: i */
    public final C47632e f358605i = new C47632e();

    /* renamed from: j */
    public boolean f358606j = false;

    /* renamed from: k */
    private final Set f358607k;

    /* renamed from: l */
    private final C131208o f358608l;

    public C131114m(C130603a aVar, C131834f fVar, C130591a aVar2, C131720e eVar, C131720e eVar2, C131720e eVar3, C131720e eVar4, C131208o oVar, Set set, C60888db dbVar) {
        this.f358597a = aVar.mo109740b(this);
        this.f358598b = fVar;
        this.f358599c = aVar2;
        this.f358600d = eVar;
        this.f358601e = eVar2;
        this.f358602f = eVar3;
        this.f358603g = eVar4;
        this.f358608l = oVar;
        this.f358607k = set;
        this.f358604h = dbVar;
        C46459k.m82829b(mo110079d(), "Failed to start trigger sources.", new Object[0]);
    }

    /* renamed from: a */
    public final C60870cx mo110073a(C131195b bVar) {
        return this.f358608l.mo110116a(bVar);
    }

    /* renamed from: b */
    public final C60870cx mo110074b(C53715bm bmVar, long j) {
        return C47633f.m84733g(mo110079d()).mo51516i(new C131103b(this, bmVar, j), this.f358604h).mo51516i(new C131104c(this, bmVar), this.f358604h);
    }

    /* renamed from: c */
    public final C60870cx mo110078c(C106596h hVar, C53715bm bmVar) {
        return C47638k.m84750a((Iterable) Collection.EL.stream(this.f358607k).map(new C131111j(hVar, bmVar)).collect(C58370cn.f155946a)).mo51520a(C131112k.f358595a, this.f358604h);
    }

    /* renamed from: d */
    public final C60870cx mo110079d() {
        return this.f358605i.mo51512b(new C131113l(this), this.f358604h);
    }
}
