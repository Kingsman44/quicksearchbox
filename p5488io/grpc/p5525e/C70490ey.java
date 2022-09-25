package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import p5488io.grpc.C70244bo;
import p5488io.grpc.C70766ff;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.ey */
/* compiled from: PG */
final class C70490ey implements C70555hi {

    /* renamed from: a */
    final C70387bc f187849a;

    /* renamed from: b */
    boolean f187850b = false;

    /* renamed from: c */
    final /* synthetic */ C70493fa f187851c;

    public C70490ey(C70493fa faVar, C70387bc bcVar) {
        this.f187851c = faVar;
        this.f187849a = bcVar;
    }

    /* renamed from: a */
    public final void mo62205a(boolean z) {
        this.f187851c.mo62214g(this.f187849a, z);
    }

    /* renamed from: b */
    public final void mo62206b() {
        this.f187851c.f187856d.mo62076a(2, "READY");
        C70766ff ffVar = this.f187851c.f187857e;
        ffVar.mo62446c(new C70487ev(this));
        ffVar.mo62445b();
    }

    /* renamed from: c */
    public final void mo62207c(Status status) {
        this.f187851c.f187856d.mo62077b(2, "{0} SHUTDOWN with {1}", this.f187849a.mo61901c(), C70493fa.m102929j(status));
        this.f187850b = true;
        C70766ff ffVar = this.f187851c.f187857e;
        ffVar.mo62446c(new C70488ew(this, status));
        ffVar.mo62445b();
    }

    /* renamed from: d */
    public final void mo62208d() {
        C58838bb.m90884s(this.f187850b, "transportShutdown() must be called before transportTerminated().");
        this.f187851c.f187856d.mo62077b(2, "{0} Terminated", this.f187849a.mo61901c());
        C70244bo boVar = this.f187851c.f187855c;
        C70244bo.m102393c(boVar.f187240f, this.f187849a);
        this.f187851c.mo62214g(this.f187849a, false);
        C70766ff ffVar = this.f187851c.f187857e;
        ffVar.mo62446c(new C70489ex(this));
        ffVar.mo62445b();
    }
}
