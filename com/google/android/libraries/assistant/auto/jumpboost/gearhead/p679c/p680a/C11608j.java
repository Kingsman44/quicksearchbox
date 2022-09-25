package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c.p680a;

import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c.C11626b;
import com.google.android.libraries.search.assistant.p2485a.C32240a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.j */
/* compiled from: PG */
public final class C11608j implements C11626b {

    /* renamed from: a */
    private final Executor f37545a;

    /* renamed from: b */
    private final C32240a f37546b;

    /* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.j$a */
    /* compiled from: PG */
    public interface C11609a {
        /* renamed from: dj */
        C11626b mo20079dj();
    }

    public C11608j(C32240a aVar, Executor executor) {
        this.f37546b = aVar;
        this.f37545a = executor;
    }

    /* renamed from: a */
    public final C60870cx mo20077a() {
        C60870cx a = this.f37546b.f86461a.mo104411a(C11609a.class);
        C11607i iVar = C11607i.f37544a;
        return C60922j.m93045h(a, C47810es.m84966f(iVar), this.f37545a);
    }

    /* renamed from: b */
    public final void mo20078b() {
        C60870cx a = this.f37546b.f86461a.mo104411a(C11609a.class);
        C11606h hVar = C11606h.f37543a;
        C46459k.m82829b(C60922j.m93045h(a, C47810es.m84966f(hVar), this.f37545a), "Failed to start prewarm", new Object[0]);
    }
}
