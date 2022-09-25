package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c.p680a;

import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c.C11553a;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15488n;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1331a.C16850a;
import com.google.android.libraries.assistant.p1363c.p1398g.p1444o.p1446b.C17584j;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.ay */
/* compiled from: PG */
public final class C11579ay implements C11553a {

    /* renamed from: a */
    public final C15488n f37498a;

    /* renamed from: b */
    public final C16850a f37499b;

    /* renamed from: c */
    public final C17584j f37500c;

    /* renamed from: d */
    private final Executor f37501d;

    /* renamed from: e */
    private final Executor f37502e;

    /* renamed from: f */
    private C60870cx f37503f = C60856cj.m92899h(new IllegalStateException("Prewarm hasn't been started"));

    public C11579ay(Executor executor, Executor executor2, C15488n nVar, C16850a aVar, C17584j jVar) {
        this.f37501d = executor;
        this.f37502e = executor2;
        this.f37498a = nVar;
        this.f37499b = aVar;
        this.f37500c = jVar;
    }

    /* renamed from: a */
    public final C60870cx mo20052a() {
        return this.f37503f;
    }

    /* renamed from: b */
    public final void mo20053b() {
        C11575au auVar = new C11575au(this);
        Class<Throwable> cls = Throwable.class;
        this.f37503f = C47633f.m84733g(C60856cj.m92905n(C47810es.m84965e(auVar), this.f37502e)).mo51515h(new C11576av(this), this.f37502e).mo51515h(new C11577aw(this), this.f37501d).mo51513e(cls, new C11578ax(this), this.f37501d);
    }

    /* renamed from: c */
    public final int mo20054c() {
        return 1;
    }
}
