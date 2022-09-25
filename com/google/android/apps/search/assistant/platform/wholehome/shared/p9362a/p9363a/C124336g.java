package com.google.android.apps.search.assistant.platform.wholehome.shared.p9362a.p9363a;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.shared.a.a.g */
/* compiled from: PG */
public final class C124336g {

    /* renamed from: a */
    public final Executor f343216a;

    /* renamed from: b */
    public C60870cx f343217b;

    /* renamed from: c */
    public final C124337h f343218c;

    /* renamed from: d */
    private final Executor f343219d;

    public C124336g(C124337h hVar, Executor executor) {
        this.f343218c = hVar;
        this.f343216a = executor;
        this.f343219d = new C60904dr(executor);
    }

    /* renamed from: a */
    public final C60870cx mo106377a() {
        C124335f fVar = new C124335f(this);
        return C47633f.m84733g(C60856cj.m92905n(C47810es.m84965e(fVar), this.f343219d));
    }
}
