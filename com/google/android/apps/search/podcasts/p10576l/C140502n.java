package com.google.android.apps.search.podcasts.p10576l;

import com.google.android.apps.gsa.p8867w.p8882j.C118820b;
import com.google.android.apps.search.podcasts.p10601r.p10603b.C140962c;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C43019v;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47637j;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.MessageLite;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.podcasts.l.n */
/* compiled from: PG */
public final class C140502n implements C43019v {

    /* renamed from: a */
    public final C21370a f381615a;

    /* renamed from: b */
    private final C140458at f381616b;

    /* renamed from: c */
    private final C140962c f381617c;

    /* renamed from: d */
    private final C118820b f381618d;

    public C140502n(C118820b bVar, C21370a aVar, C140458at atVar, C140962c cVar) {
        this.f381618d = bVar;
        this.f381615a = aVar;
        this.f381616b = atVar;
        this.f381617c = cVar;
    }

    /* renamed from: a */
    public final C60870cx mo18054a() {
        return C60866ct.f164955a;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C60870cx mo18055b(MessageLite messageLite) {
        C140450al alVar = (C140450al) messageLite;
        boolean z = !(alVar.f381519e != null);
        boolean z2 = !(alVar.f381517c != null);
        C140449ak a = C140449ak.m228147a(alVar.f381518d);
        if (a == null) {
            a = C140449ak.UNRECOGNIZED;
        }
        boolean z3 = a == C140449ak.DEFAULT;
        boolean z4 = !(alVar.f381524j != null);
        boolean z5 = !(alVar.f381521g != null);
        boolean z6 = !(alVar.f381525k != null);
        boolean z7 = !(alVar.f381526l != null);
        boolean z8 = !(alVar.f381527m != null);
        boolean z9 = !(alVar.f381528n != null);
        boolean z10 = !(alVar.f381522h != null);
        if (!z && !z2 && !z3 && !z4 && !z5 && !z6 && !z7 && !z8 && !z9 && !z10) {
            return C60856cj.m92900i(alVar);
        }
        C60870cx b = this.f381617c.mo116046b();
        C118820b bVar = this.f381618d;
        Objects.requireNonNull(bVar);
        C60870cx h = C60922j.m93045h(b, C47810es.m84966f(new C140500l(bVar)), C60826bg.f164896a);
        C140458at atVar = this.f381616b;
        C60870cx g = C60922j.m93044g(atVar.f381536a.mo115421a(C140455aq.f381533a, C140456ar.f381534a), C47810es.m84963c(C140457as.f381535a), atVar.f381537b);
        C47637j b2 = C47638k.m84751b(h, g);
        C140501m mVar = r0;
        C140501m mVar2 = new C140501m(this, h, alVar, z, z2, z3, z4, z5, z6, z7, z8, z9, z10, g);
        return b2.mo51520a(mVar, C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C60870cx mo18056c() {
        return C60856cj.m92900i(true);
    }
}
