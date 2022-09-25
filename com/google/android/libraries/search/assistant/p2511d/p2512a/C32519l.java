package com.google.android.libraries.search.assistant.p2511d.p2512a;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.assistant.d.a.l */
/* compiled from: PG */
public final class C32519l {

    /* renamed from: a */
    public final C32508a f87111a;

    /* renamed from: b */
    public final C32518k f87112b;

    /* renamed from: c */
    public final Executor f87113c;

    /* renamed from: d */
    public Throwable f87114d = null;

    /* renamed from: e */
    public final Map f87115e = new HashMap();

    /* renamed from: f */
    public long f87116f = 1;

    public C32519l(C32508a aVar, C32518k kVar, Executor executor) {
        this.f87111a = aVar;
        this.f87112b = kVar;
        this.f87113c = new C60904dr(executor);
    }

    /* renamed from: a */
    public final C60870cx mo38119a(Object obj) {
        C32513f fVar = new C32513f(this, obj);
        return C60856cj.m92905n(C47810es.m84965e(fVar), this.f87113c);
    }

    /* renamed from: b */
    public final void mo38120b(Throwable th) {
        this.f87113c.execute(C47810es.m84977q(new C32517j(this, th)));
    }

    /* renamed from: c */
    public final void mo38121c(C32512e eVar) {
        this.f87113c.execute(C47810es.m84977q(new C32516i(this, eVar)));
    }
}
