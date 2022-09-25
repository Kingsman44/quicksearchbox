package com.google.frameworks.client.data.android.p4640g;

import java.util.ArrayDeque;
import java.util.Queue;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;
import p5488io.grpc.C70897l;
import p5488io.grpc.C70898m;

/* renamed from: com.google.frameworks.client.data.android.g.i */
/* compiled from: PG */
final class C61448i extends C70898m {

    /* renamed from: a */
    public final Object f166131a = new Object();

    /* renamed from: b */
    public final Queue f166132b = new ArrayDeque();

    /* renamed from: c */
    public C70898m f166133c;

    /* renamed from: d */
    final /* synthetic */ C70888j f166134d;

    /* renamed from: e */
    final /* synthetic */ C70338di f166135e;

    /* renamed from: f */
    final /* synthetic */ C70851i f166136f;

    public C61448i(C70888j jVar, C70338di diVar, C70851i iVar) {
        this.f166134d = jVar;
        this.f166135e = diVar;
        this.f166136f = iVar;
        this.f166133c = jVar.mo39510a(diVar, iVar);
    }

    /* renamed from: a */
    public final void mo27478a(C70897l lVar, C70334de deVar) {
        synchronized (this.f166131a) {
            C70334de deVar2 = new C70334de();
            deVar2.mo62032g(deVar);
            this.f166132b.add(new C61445f(this, lVar, deVar2));
            mo58057c().mo27478a(new C61447h(this, lVar), deVar);
        }
    }

    /* renamed from: c */
    public final C70898m mo58057c() {
        C70898m mVar;
        synchronized (this.f166131a) {
            mVar = this.f166133c;
        }
        return mVar;
    }

    /* renamed from: d */
    public final void mo27480d(String str, Throwable th) {
        synchronized (this.f166131a) {
            this.f166132b.add(new C61442c(this, str, th));
            mo58057c().mo27480d(str, th);
        }
    }

    /* renamed from: f */
    public final void mo27481f() {
        synchronized (this.f166131a) {
            this.f166132b.add(new C61443d(this));
            mo58057c().mo27481f();
        }
    }

    /* renamed from: g */
    public final void mo27482g(int i) {
        synchronized (this.f166131a) {
            this.f166132b.add(new C61444e(this, i));
            mo58057c().mo27482g(i);
        }
    }

    /* renamed from: h */
    public final void mo27483h(Object obj) {
        synchronized (this.f166131a) {
            this.f166132b.add(new C61446g(this, obj));
            mo58057c().mo27483h(obj);
        }
    }
}
