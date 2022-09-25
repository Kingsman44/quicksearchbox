package com.google.android.libraries.search.logging.p3034a;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.libraries.search.logging.a.l */
/* compiled from: PG */
public final class C38763l {

    /* renamed from: a */
    public final ScheduledExecutorService f102331a;

    /* renamed from: b */
    private final C38728a f102332b;

    /* renamed from: c */
    private final Executor f102333c;

    public C38763l(Executor executor, ScheduledExecutorService scheduledExecutorService, C38728a aVar) {
        this.f102332b = aVar;
        this.f102333c = executor;
        this.f102331a = scheduledExecutorService;
    }

    /* renamed from: a */
    public final C60870cx mo41611a(Set set) {
        C60870cx a = this.f102332b.mo41585a(false);
        C38761j jVar = new C38761j(this, set);
        return C60922j.m93044g(a, C47810es.m84963c(jVar), this.f102333c);
    }
}
