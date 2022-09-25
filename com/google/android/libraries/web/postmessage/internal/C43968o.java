package com.google.android.libraries.web.postmessage.internal;

import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.postmessage.C43950a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.web.postmessage.internal.o */
/* compiled from: PG */
public final class C43968o {

    /* renamed from: a */
    public Consumer f114465a;

    /* renamed from: b */
    private final Executor f114466b;

    public C43968o(Executor executor, Consumer consumer) {
        this.f114465a = consumer;
        this.f114466b = executor;
    }

    /* renamed from: a */
    public final C60870cx mo46960a(String str) {
        if (C19559g.m37305d(Thread.currentThread())) {
            return mo46961b(str);
        }
        C43967n nVar = new C43967n(this, str);
        return C60856cj.m92905n(C47810es.m84965e(nVar), this.f114466b);
    }

    /* renamed from: b */
    public final C60870cx mo46961b(String str) {
        Consumer consumer = this.f114465a;
        if (consumer == null) {
            return C60856cj.m92899h(new C43950a());
        }
        consumer.accept(str);
        return C60866ct.f164955a;
    }
}
