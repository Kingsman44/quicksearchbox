package com.google.android.apps.search.assistant.platform.p9080f.p9089c.p9091b;

import com.google.android.apps.search.assistant.platform.p9080f.p9089c.C120518a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.f.c.b.b */
/* compiled from: PG */
public final class C120529b {

    /* renamed from: a */
    public final Optional f335199a;

    /* renamed from: b */
    private final Executor f335200b;

    public C120529b(Optional optional, Executor executor) {
        this.f335199a = optional;
        this.f335200b = executor;
    }

    /* renamed from: a */
    public final C60870cx mo104805a() {
        if (this.f335199a.isEmpty()) {
            return C60856cj.m92900i(Optional.empty());
        }
        C60870cx a = ((C120518a) this.f335199a.get()).mo104800a();
        C120528a aVar = new C120528a(this);
        return C60922j.m93044g(a, C47810es.m84963c(aVar), this.f335200b);
    }
}
