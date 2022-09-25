package com.google.android.apps.gsa.search.core.p6816p;

import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.search.core.p.bm */
/* compiled from: PG */
public final class C86230bm {

    /* renamed from: a */
    public final C60870cx f233050a;

    /* renamed from: b */
    public volatile long f233051b;

    public C86230bm() {
        this(C60856cj.m92898g());
    }

    public C86230bm(C60870cx cxVar) {
        this.f233051b = -1;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        Objects.requireNonNull(timeUnit);
        this.f233050a = C60922j.m93044g(cxVar, new C86229bl(timeUnit), C60826bg.f164896a);
    }
}
