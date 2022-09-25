package com.google.frameworks.client.data.android.server;

import p5488io.grpc.C70703eh;
import p5488io.grpc.C70898m;

/* renamed from: com.google.frameworks.client.data.android.server.b */
/* compiled from: PG */
final class C61554b extends C70703eh {

    /* renamed from: a */
    public final C70898m f166363a;

    /* renamed from: b */
    final /* synthetic */ C61556d f166364b;

    /* renamed from: c */
    private boolean f166365c;

    public C61554b(C61556d dVar, C70898m mVar) {
        this.f166364b = dVar;
        this.f166363a = mVar;
    }

    /* renamed from: a */
    public final void mo51551a() {
        this.f166363a.mo27480d("Server cancelled", (Throwable) null);
    }

    /* renamed from: c */
    public final void mo51553c() {
        this.f166363a.mo27481f();
    }

    /* renamed from: d */
    public final void mo51554d(Object obj) {
        this.f166363a.mo27483h(obj);
        synchronized (this) {
            if (this.f166363a.mo62058i()) {
                this.f166364b.f166370b.f166366a.mo62062g(1);
            } else {
                this.f166365c = true;
            }
        }
    }

    /* renamed from: e */
    public final void mo51555e() {
        this.f166364b.f166370b.mo58119e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final synchronized void mo58118f() {
        if (this.f166365c) {
            this.f166364b.f166370b.f166366a.mo62062g(1);
            this.f166365c = false;
        }
    }
}
