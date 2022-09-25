package com.google.android.apps.gsa.p8889z.p8893c.p8897d;

import com.google.android.apps.gsa.speech.p7272e.p7275c.C92263a;
import com.google.p4449cd.p4456g.p4457a.C57975a;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.z.c.d.e */
/* compiled from: PG */
final class C118881e extends C57975a {

    /* renamed from: a */
    final /* synthetic */ Executor f331554a;

    /* renamed from: b */
    final /* synthetic */ C92263a f331555b;

    public C118881e(Executor executor, C92263a aVar) {
        this.f331554a = executor;
        this.f331555b = aVar;
    }

    /* renamed from: e */
    private final void m197331e() {
        Executor executor = this.f331554a;
        C92263a aVar = this.f331555b;
        Objects.requireNonNull(aVar);
        executor.execute(new C118880d(aVar));
    }

    /* renamed from: gQ */
    public final void mo20339gQ(boolean z) {
        m197331e();
    }

    /* renamed from: gR */
    public final void mo20340gR(Throwable th) {
        m197331e();
    }
}
