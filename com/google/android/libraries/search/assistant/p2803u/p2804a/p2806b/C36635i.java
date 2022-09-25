package com.google.android.libraries.search.assistant.p2803u.p2804a.p2806b;

import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.assistant.u.a.b.i */
/* compiled from: PG */
public final class C36635i {

    /* renamed from: a */
    private final C42876ab f95482a;

    /* renamed from: b */
    private final Executor f95483b;

    public C36635i(C42876ab abVar, Executor executor) {
        this.f95482a = abVar;
        this.f95483b = executor;
    }

    /* renamed from: a */
    public final C60870cx mo40293a(String str, int i) {
        return this.f95482a.mo46039a(new C36633g(str, i), this.f95483b);
    }

    /* renamed from: b */
    public final C60870cx mo40294b(String str) {
        return C60922j.m93044g(this.f95482a.mo46042d(), C47810es.m84963c(new C36634h(str)), this.f95483b);
    }
}
