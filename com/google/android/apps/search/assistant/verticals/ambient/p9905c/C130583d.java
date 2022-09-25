package com.google.android.apps.search.assistant.verticals.ambient.p9905c;

import com.google.android.apps.search.assistant.verticals.ambient.p9905c.p9907b.C130573s;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9965s.C131279c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.util.Map;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.c.d */
/* compiled from: PG */
public final class C130583d implements C131279c {

    /* renamed from: a */
    public final C58974d f357672a;

    /* renamed from: b */
    public final Map f357673b;

    /* renamed from: c */
    public final C130573s f357674c;

    /* renamed from: d */
    public final C130586e f357675d;

    /* renamed from: e */
    private final C60887da f357676e;

    public C130583d(C130603a aVar, Map map, C130573s sVar, C130586e eVar, C60887da daVar) {
        this.f357672a = aVar.mo109740b(this);
        this.f357673b = map;
        this.f357674c = sVar;
        this.f357675d = eVar;
        this.f357676e = daVar;
    }

    /* renamed from: a */
    public final C60870cx mo109735a(C58485gu guVar) {
        if (!this.f357675d.mo109731a()) {
            return C60856cj.m92899h(new IllegalStateException("AiAi is not available."));
        }
        C60870cx e = C60856cj.m92896e((Iterable) Collection.EL.stream(guVar).map(new C130554b(this)).collect(C58370cn.f155946a));
        C130574c cVar = new C130574c(this);
        return C60922j.m93045h(e, C47810es.m84966f(cVar), this.f357676e);
    }
}
