package com.google.android.apps.gsa.p8867w.p8868a;

import com.google.android.apps.gsa.assist.p501a.C9325m;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.gsa.w.a.b */
/* compiled from: PG */
public final class C118730b {

    /* renamed from: a */
    private final C9325m f331194a;

    /* renamed from: b */
    private final Executor f331195b;

    public C118730b(C9325m mVar, Executor executor) {
        C69664n.m101061g(mVar, "assistUtils");
        C69664n.m101061g(executor, "blockingExecutor");
        this.f331194a = mVar;
        this.f331195b = executor;
    }

    /* renamed from: a */
    public final C60870cx mo103939a() {
        C118727a aVar = new C118727a(this.f331194a);
        return C60856cj.m92904m(C47810es.m84978r(aVar), this.f331195b);
    }
}
