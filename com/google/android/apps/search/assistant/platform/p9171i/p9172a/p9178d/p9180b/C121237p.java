package com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.p9180b;

import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.p9179a.C121215c;
import com.google.android.libraries.assistant.p1594s.p1597b.C19145af;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3781ad.p3789d.p3791b.C48714bv;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.util.Map;
import p3186j$.time.Duration;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.platform.i.a.d.b.p */
/* compiled from: PG */
public final class C121237p implements C121215c {

    /* renamed from: a */
    public static final C59071e f336771a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.i.a.d.b.p");

    /* renamed from: b */
    public static final Duration f336772b = Duration.ofMinutes(10);

    /* renamed from: c */
    public final C60887da f336773c;

    /* renamed from: d */
    public final C60950i f336774d;

    /* renamed from: e */
    C60870cx f336775e = C60856cj.m92900i(true);

    /* renamed from: f */
    public final C58495hd f336776f;

    public C121237p(Map map, C60887da daVar, C60950i iVar) {
        this.f336773c = daVar;
        this.f336774d = iVar;
        this.f336776f = (C58495hd) Collection.EL.stream(map.entrySet()).collect(C58370cn.m89403c(C121233l.f336762a, new C121234m(this), C121223b.f336751a));
    }

    /* renamed from: c */
    private final C60870cx m200529c() {
        if (this.f336775e.isDone() || this.f336775e.isCancelled()) {
            this.f336775e = C60856cj.m92900i(true);
        }
        return this.f336775e;
    }

    /* renamed from: a */
    public final C60870cx mo105085a(C48714bv bvVar) {
        C60870cx c = m200529c();
        C121232k kVar = new C121232k(this, bvVar);
        return C60922j.m93045h(c, C47810es.m84966f(kVar), this.f336773c);
    }

    /* renamed from: b */
    public final C60870cx mo105086b(C19145af afVar) {
        C60870cx c = m200529c();
        C121222a aVar = new C121222a(this, afVar);
        C60870cx h = C60922j.m93045h(c, C47810es.m84966f(aVar), this.f336773c);
        C121228g gVar = C121228g.f336756a;
        this.f336775e = C60922j.m93044g(h, C47810es.m84963c(gVar), this.f336773c);
        return h;
    }
}
