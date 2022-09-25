package com.google.android.libraries.search.logging.p3034a.p3035a;

import com.google.android.libraries.search.logging.p3034a.p3036b.C38752a;
import com.google.android.libraries.search.logging.p3034a.p3036b.C38753b;
import com.google.android.libraries.search.p2476a.p2483e.C32221c;
import com.google.android.libraries.web.profile.C44074i;
import com.google.android.libraries.web.profile.p3431a.C44058f;
import com.google.apps.tiktok.account.data.p3613b.C46180e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.p4559e.C59743a;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.logging.a.a.i */
/* compiled from: PG */
public final class C38737i implements C38729a {

    /* renamed from: a */
    public final ConcurrentLinkedQueue f102266a = new ConcurrentLinkedQueue();

    /* renamed from: b */
    public final Executor f102267b;

    /* renamed from: c */
    public final C44074i f102268c;

    /* renamed from: d */
    public final C44058f f102269d;

    /* renamed from: e */
    public final C32221c f102270e;

    /* renamed from: f */
    private final C46180e f102271f;

    public C38737i(Executor executor, C46180e eVar, C44074i iVar, C44058f fVar, C32221c cVar) {
        this.f102267b = executor;
        this.f102271f = eVar;
        this.f102268c = iVar;
        this.f102269d = fVar;
        this.f102270e = cVar;
    }

    /* renamed from: a */
    public final C60870cx mo41586a(C59743a aVar, C60548tz tzVar, C38753b bVar, C38752a aVar2, C60870cx cxVar) {
        C60870cx a = this.f102271f.mo50251a();
        C47633f i = C47633f.m84733g(this.f102271f.mo50251a()).mo51516i(new C38731c(this), this.f102267b).mo51516i(new C38732d(this), this.f102267b);
        C38733e eVar = new C38733e(aVar2, aVar, tzVar);
        C60870cx h = C60922j.m93045h(cxVar, C47810es.m84966f(eVar), this.f102267b);
        C60870cx b = C47638k.m84753d(h, a, i).mo51521b(new C38734f(this, bVar, h, a, i), this.f102267b);
        C38735g gVar = new C38735g(this);
        return C60922j.m93045h(b, C47810es.m84966f(gVar), this.f102267b);
    }
}
