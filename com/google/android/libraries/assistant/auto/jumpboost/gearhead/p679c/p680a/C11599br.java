package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c.p680a;

import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c.C11553a;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15488n;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1270m.C16408a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.br */
/* compiled from: PG */
public final class C11599br implements C11553a {

    /* renamed from: a */
    public final C15488n f37531a;

    /* renamed from: b */
    public final C16408a f37532b;

    /* renamed from: c */
    private final Executor f37533c;

    /* renamed from: d */
    private C60870cx f37534d = C60856cj.m92899h(new IllegalStateException("Prewarm hasn't been started"));

    public C11599br(Executor executor, C15488n nVar, C16408a aVar) {
        this.f37533c = executor;
        this.f37531a = nVar;
        this.f37532b = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo20052a() {
        return this.f37534d;
    }

    /* renamed from: b */
    public final void mo20053b() {
        C11596bo boVar = new C11596bo(this);
        Class<Throwable> cls = Throwable.class;
        this.f37534d = C47633f.m84733g(C60856cj.m92905n(C47810es.m84965e(boVar), this.f37533c)).mo51515h(new C11597bp(this), this.f37533c).mo51513e(cls, new C11598bq(this), this.f37533c);
    }

    /* renamed from: c */
    public final int mo20054c() {
        return 1;
    }
}
