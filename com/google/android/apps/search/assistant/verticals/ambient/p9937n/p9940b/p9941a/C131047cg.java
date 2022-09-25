package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.p9941a;

import com.google.android.apps.search.assistant.platform.p9141h.p9162h.C121125c;
import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.C131077g;
import com.google.android.apps.search.assistant.verticals.ambient.settings.C131575p;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.b.a.cg */
/* compiled from: PG */
public final class C131047cg implements C131077g {

    /* renamed from: a */
    private final C131575p f358469a;

    /* renamed from: b */
    private final ExecutorService f358470b;

    /* renamed from: c */
    private final C121125c f358471c;

    public C131047cg(C131575p pVar, C121125c cVar, ExecutorService executorService) {
        this.f358469a = pVar;
        this.f358471c = cVar;
        this.f358470b = executorService;
    }

    /* renamed from: a */
    public final C60870cx mo95545a() {
        C60870cx b = this.f358469a.mo110195b();
        C60870cx a = this.f358471c.mo105058a();
        return C47638k.m84753d(b, a).mo51520a(new C131046cf(b, a), this.f358470b);
    }
}
