package com.google.android.apps.gsa.staticplugins.p7441bb;

import java.util.ArrayDeque;
import java.util.Queue;
import p3186j$.util.Objects;
import p5488io.grpc.C70161ay;
import p5488io.grpc.C70256c;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70897l;
import p5488io.grpc.C70898m;

/* renamed from: com.google.android.apps.gsa.staticplugins.bb.s */
/* compiled from: PG */
public class C94502s extends C70161ay {

    /* renamed from: a */
    private final Queue f264211a = new ArrayDeque();

    /* renamed from: b */
    public final C70898m f264212b;

    /* renamed from: c */
    private boolean f264213c;

    public C94502s(C70898m mVar) {
        this.f264212b = mVar;
    }

    /* renamed from: j */
    private final void m155862j(Runnable runnable) {
        synchronized (this) {
            if (this.f264213c) {
                runnable.run();
            } else {
                this.f264211a.add(runnable);
            }
        }
    }

    /* renamed from: b */
    public final C70256c mo62057b() {
        C70256c b;
        synchronized (this) {
            if (this.f264213c) {
                b = this.f264212b.mo62057b();
            } else {
                throw new IllegalStateException("Shouldn't be called before delayedStart");
            }
        }
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C70898m mo61735c() {
        return this.f264212b;
    }

    /* renamed from: d */
    public final void mo27480d(String str, Throwable th) {
        m155862j(new C94501r(this, str, th));
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo88488e(C70897l lVar, C70334de deVar) {
        synchronized (this) {
            this.f264212b.mo27478a(lVar, deVar);
            for (Runnable run : this.f264211a) {
                run.run();
            }
            this.f264211a.clear();
            this.f264213c = true;
        }
    }

    /* renamed from: f */
    public final void mo27481f() {
        C70898m mVar = this.f264212b;
        Objects.requireNonNull(mVar);
        m155862j(new C94498o(mVar));
    }

    /* renamed from: g */
    public final void mo27482g(int i) {
        m155862j(new C94499p(this, i));
    }

    /* renamed from: h */
    public final void mo27483h(Object obj) {
        m155862j(new C94500q(this, obj));
    }

    /* renamed from: i */
    public final boolean mo62058i() {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.f264213c && this.f264212b.mo62058i()) {
                z = true;
            }
        }
        return z;
    }
}
