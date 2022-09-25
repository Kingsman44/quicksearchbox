package com.google.android.apps.search.podcasts.p10550b.p10556f;

import com.google.android.apps.search.podcasts.p10550b.p10554d.C140055e;
import com.google.android.apps.search.podcasts.p10601r.p10603b.C140962c;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.List;

/* renamed from: com.google.android.apps.search.podcasts.b.f.aj */
/* compiled from: PG */
final class C140095aj {

    /* renamed from: a */
    public final C60870cx f380717a;

    /* renamed from: b */
    public final C60870cx f380718b;

    public C140095aj(C140055e eVar, C140962c cVar) {
        C60870cx b = cVar.mo116046b();
        this.f380717a = b;
        C140092ag agVar = new C140092ag(eVar);
        this.f380718b = C60922j.m93044g(b, C47810es.m84963c(agVar), C60826bg.f164896a);
    }

    /* renamed from: a */
    public final void mo115458a(C140088ac acVar) {
        List e = acVar.mo115447e();
        if (e != null) {
            C46459k.m82829b(C47633f.m84733g(this.f380718b).mo51516i(new C140089ad(acVar, e), C60826bg.f164896a), "saveToLocalStorageFailed", new Object[0]);
        }
    }
}
