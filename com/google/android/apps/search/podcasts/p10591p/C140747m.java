package com.google.android.apps.search.podcasts.p10591p;

import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.p.m */
/* compiled from: PG */
public final class C140747m {

    /* renamed from: a */
    public final C140745k f382194a;

    /* renamed from: b */
    public final C21370a f382195b;

    /* renamed from: c */
    private final Executor f382196c;

    public C140747m(C140745k kVar, C21370a aVar, Executor executor) {
        C69664n.m101061g(kVar, "podcastsClientStreamz");
        C69664n.m101061g(aVar, "clock");
        C69664n.m101061g(executor, "lightweightExecutor");
        this.f382194a = kVar;
        this.f382195b = aVar;
        this.f382196c = executor;
    }

    /* renamed from: a */
    public final void mo115851a(String str, String str2, C60870cx cxVar) {
        C140989k.m228949g(cxVar, this.f382196c, new C140746l(this, this.f382195b.mo26871c(), str, str2));
    }
}
