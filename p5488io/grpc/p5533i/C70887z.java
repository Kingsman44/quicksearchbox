package p5488io.grpc.p5533i;

import com.google.common.base.C58838bb;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70704ei;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;

/* renamed from: io.grpc.i.z */
/* compiled from: PG */
public final class C70887z extends C70883v {

    /* renamed from: a */
    public final C70704ei f189070a;

    /* renamed from: b */
    volatile boolean f189071b;

    /* renamed from: c */
    public boolean f189072c;

    /* renamed from: d */
    public Runnable f189073d;

    /* renamed from: e */
    private final boolean f189074e;

    /* renamed from: f */
    private boolean f189075f;

    /* renamed from: g */
    private boolean f189076g = false;

    /* renamed from: h */
    private boolean f189077h = false;

    public C70887z(C70704ei eiVar, boolean z) {
        this.f189070a = eiVar;
        this.f189074e = z;
    }

    /* renamed from: a */
    public final void mo20121a() {
        this.f189070a.mo39476a(Status.f186902OK, new C70334de());
        this.f189077h = true;
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        C70334de a = Status.m102098a(th);
        if (a == null) {
            a = new C70334de();
        }
        this.f189070a.mo39476a(Status.m102100d(th), a);
        this.f189076g = true;
    }

    /* renamed from: c */
    public final void mo20123c(Object obj) {
        if (!this.f189071b || !this.f189074e) {
            C58838bb.m90884s(!this.f189076g, "Stream was terminated by error, no further calls are allowed");
            C58838bb.m90884s(!this.f189077h, "Stream is already completed, no further calls are allowed");
            if (!this.f189075f) {
                this.f189070a.mo58113b(new C70334de());
                this.f189075f = true;
            }
            this.f189070a.mo61743e(obj);
            return;
        }
        throw new C70761fa(Status.f186904b.withDescription("call already cancelled. Use ServerCallStreamObserver.setOnCancelHandler() to disable this exception"), (C70334de) null, true);
    }

    /* renamed from: d */
    public final void mo62583d(Runnable runnable) {
        C58838bb.m90884s(!this.f189072c, "Cannot alter onCancelHandler after initialization. May only be called during the initial call to the application, before the service returns its StreamObserver");
        this.f189073d = runnable;
    }
}
