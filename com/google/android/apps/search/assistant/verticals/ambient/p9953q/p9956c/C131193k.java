package com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9956c;

import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9961d.C131227j;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9961d.C131230m;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3886c.C50794cr;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.q.c.k */
/* compiled from: PG */
public final class C131193k {

    /* renamed from: a */
    public final C58974d f358797a;

    /* renamed from: b */
    public final C131230m f358798b;

    /* renamed from: c */
    public final C60887da f358799c;

    public C131193k(C130603a aVar, C131230m mVar, C60887da daVar) {
        this.f358797a = aVar.mo109740b(this);
        this.f358798b = mVar;
        this.f358799c = daVar;
    }

    /* renamed from: a */
    public final C60870cx mo110114a(C50794cr crVar, boolean z, boolean z2, List list, Object obj, C131190h hVar, C131192j jVar) {
        C60870cx cxVar;
        if (z) {
            C131230m mVar = this.f358798b;
            cxVar = mVar.f358855a.mo46039a(new C131227j(mVar), mVar.f358857c);
        } else {
            cxVar = C60866ct.f164955a;
        }
        C60870cx a = hVar.mo110112a(list, obj);
        C131188f fVar = new C131188f(this, crVar, z2, z, jVar);
        C60870cx h = C60922j.m93045h(a, C47810es.m84966f(fVar), this.f358799c);
        return C47638k.m84751b(cxVar, h).mo51520a(new C131189g(h), this.f358799c);
    }
}
