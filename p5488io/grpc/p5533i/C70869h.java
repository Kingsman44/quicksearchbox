package p5488io.grpc.p5533i;

import com.google.common.base.C58838bb;
import p5488io.grpc.C70898m;

/* renamed from: io.grpc.i.h */
/* compiled from: PG */
public final class C70869h extends C70868g {

    /* renamed from: a */
    public boolean f189041a;

    /* renamed from: b */
    public final C70898m f189042b;

    /* renamed from: c */
    public final boolean f189043c;

    /* renamed from: d */
    public Runnable f189044d;

    /* renamed from: e */
    private boolean f189045e = false;

    /* renamed from: f */
    private boolean f189046f = false;

    public C70869h(C70898m mVar, boolean z) {
        this.f189042b = mVar;
        this.f189043c = z;
    }

    /* renamed from: a */
    public final void mo20121a() {
        this.f189042b.mo27481f();
        this.f189046f = true;
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        this.f189042b.mo27480d("Cancelled by client with StreamObserver.onError()", th);
        this.f189045e = true;
    }

    /* renamed from: c */
    public final void mo20123c(Object obj) {
        C58838bb.m90884s(!this.f189045e, "Stream was terminated by error, no further calls are allowed");
        C58838bb.m90884s(!this.f189046f, "Stream is already completed, no further calls are allowed");
        this.f189042b.mo27483h(obj);
    }

    /* renamed from: d */
    public final void mo62578d(Runnable runnable) {
        if (!this.f189041a) {
            this.f189044d = runnable;
            return;
        }
        throw new IllegalStateException("Cannot alter onReadyHandler after call started. Use ClientResponseObserver");
    }

    /* renamed from: e */
    public final void mo62579e(String str) {
        this.f189042b.mo27480d("Client requested cancellation", (Throwable) null);
    }

    /* renamed from: f */
    public final void mo62580f() {
        if (!this.f189043c) {
            this.f189042b.mo27482g(2);
        } else {
            this.f189042b.mo27482g(1);
        }
    }
}
