package com.google.android.apps.search.assistant.platform.p9080f.p9120k.p9122b;

import com.google.android.apps.search.assistant.platform.p9080f.p9120k.C120782c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.f.k.b.b */
/* compiled from: PG */
public final class C120781b {

    /* renamed from: a */
    public final Optional f335909a;

    /* renamed from: b */
    private final Executor f335910b;

    public C120781b(Optional optional, Executor executor) {
        this.f335909a = optional;
        this.f335910b = executor;
    }

    /* renamed from: a */
    public final C60870cx mo104931a() {
        if (this.f335909a.isEmpty()) {
            return C60856cj.m92900i(Optional.empty());
        }
        C60870cx b = ((C120782c) this.f335909a.get()).mo104926b();
        C120780a aVar = new C120780a(this);
        return C60922j.m93044g(b, C47810es.m84963c(aVar), this.f335910b);
    }
}
