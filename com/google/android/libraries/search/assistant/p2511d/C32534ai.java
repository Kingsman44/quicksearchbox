package com.google.android.libraries.search.assistant.p2511d;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.C60922j;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.assistant.d.ai */
/* compiled from: PG */
public final class C32534ai implements Closeable {

    /* renamed from: a */
    public final Executor f87141a;

    /* renamed from: b */
    public final C32541d f87142b = new C32541d();

    /* renamed from: c */
    public final List f87143c = new ArrayList();

    /* renamed from: d */
    public boolean f87144d = false;

    /* renamed from: e */
    public Throwable f87145e;

    public C32534ai(Executor executor) {
        this.f87141a = new C60904dr(executor);
    }

    /* renamed from: a */
    public final C60870cx mo38133a(C32542e eVar) {
        return new C32533ah(this, eVar).mo38132a();
    }

    /* renamed from: b */
    public final C60870cx mo38134b() {
        C32563z zVar = new C32563z(this);
        C60870cx n = C60856cj.m92905n(C47810es.m84965e(zVar), this.f87141a);
        C32526aa aaVar = C32526aa.f87129a;
        return C60922j.m93045h(n, C47810es.m84966f(aaVar), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final void mo38135c(Throwable th) {
        this.f87141a.execute(C47810es.m84977q(new C32527ab(this, th)));
    }

    public final void close() {
        mo38135c((Throwable) null);
    }

    /* renamed from: d */
    public final void mo38137d(Object obj) {
        this.f87141a.execute(C47810es.m84977q(new C32528ac(this, obj)));
    }
}
