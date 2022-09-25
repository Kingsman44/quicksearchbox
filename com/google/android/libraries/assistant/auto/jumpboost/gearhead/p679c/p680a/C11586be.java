package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c.p680a;

import com.google.android.apps.gsa.binaries.satin.app.aek;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c.C11553a;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15488n;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4462i.C58048g;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.be */
/* compiled from: PG */
public final class C11586be implements C11553a {

    /* renamed from: a */
    public final Executor f37509a;

    /* renamed from: b */
    public final C15488n f37510b;

    /* renamed from: c */
    public final aek f37511c;

    /* renamed from: d */
    public final C58048g f37512d;

    /* renamed from: e */
    private C60870cx f37513e = C60856cj.m92899h(new IllegalStateException("Prewarm hasn't been started"));

    public C11586be(Executor executor, C15488n nVar, aek aek, C58048g gVar) {
        this.f37509a = executor;
        this.f37510b = nVar;
        this.f37511c = aek;
        this.f37512d = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo20052a() {
        return this.f37513e;
    }

    /* renamed from: b */
    public final void mo20053b() {
        C11583bb bbVar = new C11583bb(this);
        Class<Throwable> cls = Throwable.class;
        this.f37513e = C47633f.m84733g(C60856cj.m92905n(C47810es.m84965e(bbVar), this.f37509a)).mo51515h(new C11584bc(this), this.f37509a).mo51513e(cls, new C11585bd(this), this.f37509a);
    }

    /* renamed from: c */
    public final int mo20054c() {
        return 2;
    }
}
