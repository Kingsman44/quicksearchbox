package com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9949b;

import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9930k.C130883x;
import com.google.android.apps.search.assistant.verticals.ambient.p9946p.C131116a;
import com.google.android.apps.search.assistant.verticals.ambient.p9946p.C131123b;
import com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9950c.C131155a;
import com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9950c.C131159e;
import com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9950c.C131160f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p4016z.C53738w;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.p4479cg.C58079k;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.p.b.h */
/* compiled from: PG */
public final class C131136h implements C131116a {

    /* renamed from: a */
    public final C58974d f358638a;

    /* renamed from: b */
    public final C131151w f358639b;

    /* renamed from: c */
    public final C131159e f358640c;

    /* renamed from: d */
    public final C131160f f358641d;

    /* renamed from: e */
    public final C131123b f358642e;

    /* renamed from: f */
    private final Executor f358643f;

    public C131136h(C130603a aVar, C60887da daVar, C131151w wVar, C131159e eVar, C131160f fVar, C131123b bVar) {
        this.f358638a = aVar.mo109740b(this);
        this.f358643f = daVar;
        this.f358639b = wVar;
        this.f358640c = eVar;
        this.f358641d = fVar;
        this.f358642e = bVar;
    }

    /* renamed from: a */
    public final C60870cx mo110080a(C53738w wVar, C130883x xVar) {
        C58079k kVar = wVar.f141082b;
        if (kVar == null) {
            kVar = C58079k.f155250c;
        }
        double d = kVar.f155252a;
        C58079k kVar2 = wVar.f141082b;
        if (kVar2 == null) {
            kVar2 = C58079k.f155250c;
        }
        double d2 = kVar2.f155253b;
        xVar.mo109848e();
        C60870cx b = this.f358640c.mo110105b(((C131155a) this.f358641d).f358667a);
        C131135g gVar = new C131135g(this, wVar, xVar);
        return C60922j.m93044g(b, C47810es.m84963c(gVar), this.f358643f);
    }

    /* renamed from: b */
    public final C60870cx mo110081b(long j, C58079k kVar) {
        return C47633f.m84733g(C47633f.m84733g(this.f358642e.mo110083b(kVar)).mo51516i(new C131132d(this), this.f358643f)).mo51516i(new C131133e(this), this.f358643f).mo51515h(new C131134f(this, j, kVar), this.f358643f);
    }
}
