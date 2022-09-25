package com.google.frameworks.client.data.android.server;

import p5488io.grpc.C70334de;
import p5488io.grpc.C70704ei;
import p5488io.grpc.C70897l;
import p5488io.grpc.Status;

/* renamed from: com.google.frameworks.client.data.android.server.c */
/* compiled from: PG */
final class C61555c extends C70897l {

    /* renamed from: a */
    public final C70704ei f166366a;

    /* renamed from: b */
    final /* synthetic */ C61556d f166367b;

    /* renamed from: c */
    private boolean f166368c;

    public C61555c(C61556d dVar, C70704ei eiVar) {
        this.f166367b = dVar;
        this.f166366a = eiVar;
    }

    /* renamed from: b */
    public final void mo27484b(Status status, C70334de deVar) {
        this.f166366a.mo39476a(status, deVar);
    }

    /* renamed from: c */
    public final void mo27485c(C70334de deVar) {
        this.f166366a.mo58113b(deVar);
    }

    /* renamed from: d */
    public final void mo27486d() {
        this.f166367b.f166369a.mo58118f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized void mo58119e() {
        if (this.f166368c) {
            this.f166367b.f166369a.f166363a.mo27482g(1);
            this.f166368c = false;
        }
    }

    /* renamed from: i */
    public final void mo27487i(Object obj) {
        this.f166366a.mo61743e(obj);
        synchronized (this) {
            if (this.f166366a.mo62064i()) {
                this.f166367b.f166369a.f166363a.mo27482g(1);
            } else {
                this.f166368c = true;
            }
        }
    }
}
