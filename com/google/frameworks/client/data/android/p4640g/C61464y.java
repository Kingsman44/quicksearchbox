package com.google.frameworks.client.data.android.p4640g;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70897l;
import p5488io.grpc.C70898m;

/* renamed from: com.google.frameworks.client.data.android.g.y */
/* compiled from: PG */
final class C61464y extends C70898m {

    /* renamed from: a */
    public final Queue f166165a = new ArrayDeque();

    /* renamed from: b */
    public C70898m f166166b = null;

    /* renamed from: c */
    public C70897l f166167c;

    /* renamed from: d */
    public boolean f166168d = false;

    /* renamed from: e */
    private final C60870cx f166169e;

    /* renamed from: f */
    private final Executor f166170f = new C60904dr(C60826bg.f164896a);

    public C61464y(C60870cx cxVar) {
        this.f166169e = cxVar;
    }

    /* renamed from: c */
    private final void m94131c(Runnable runnable) {
        this.f166170f.execute(C47810es.m84977q(new C61461v(this, runnable)));
    }

    /* renamed from: a */
    public final void mo27478a(C70897l lVar, C70334de deVar) {
        this.f166167c = lVar;
        C60870cx cxVar = this.f166169e;
        C61463x xVar = new C61463x(this, lVar);
        C60856cj.m92911t(cxVar, C47810es.m84974n(xVar), this.f166170f);
        m94131c(new C61457r(this, lVar, deVar));
    }

    /* renamed from: d */
    public final void mo27480d(String str, Throwable th) {
        m94131c(new C61462w(this, str, th));
    }

    /* renamed from: f */
    public final void mo27481f() {
        m94131c(new C61458s(this));
    }

    /* renamed from: g */
    public final void mo27482g(int i) {
        m94131c(new C61459t(this, i));
    }

    /* renamed from: h */
    public final void mo27483h(Object obj) {
        m94131c(new C61460u(this, obj));
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.f166166b);
        return obj + "delegate=[" + valueOf + "]";
    }
}
