package com.google.android.libraries.lens.view.p2159q;

import androidx.work.WorkerParameters;
import com.google.android.libraries.lens.view.filters.translation.p2106a.C26034j;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.contrib.work.C46575i;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.util.ArrayList;
import p3186j$.util.Map;

/* renamed from: com.google.android.libraries.lens.view.q.h */
/* compiled from: PG */
public final class C27634h implements C46575i {

    /* renamed from: a */
    public final C29409fd f75490a;

    /* renamed from: b */
    public final C26034j f75491b;

    /* renamed from: c */
    private final C60887da f75492c;

    /* renamed from: d */
    private final C42876ab f75493d;

    public C27634h(C60887da daVar, C42876ab abVar, C29409fd fdVar, C26034j jVar) {
        this.f75492c = daVar;
        this.f75493d = abVar;
        this.f75490a = fdVar;
        this.f75491b = jVar;
    }

    /* renamed from: b */
    public final C60870cx mo21393b(WorkerParameters workerParameters) {
        ArrayList arrayList = new ArrayList();
        Map.EL.forEach(this.f75491b.mo31240b().mo55367b(), new C27549a(this, arrayList));
        C47633f g = C47633f.m84733g(C60856cj.m92896e(arrayList));
        C27606b bVar = C27606b.f75424a;
        C60870cx g2 = C60922j.m93044g(g, C47810es.m84963c(bVar), this.f75492c);
        C60870cx d = this.f75493d.mo46042d();
        C60870cx b = C47638k.m84753d(g2, d).mo51521b(new C27629c(this, g2, d), this.f75492c);
        C27630d dVar = C27630d.f75485a;
        return C60922j.m93044g(b, C47810es.m84963c(dVar), this.f75492c);
    }
}
