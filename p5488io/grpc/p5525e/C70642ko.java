package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import java.util.concurrent.Executor;
import p5488io.grpc.C70141ae;
import p5488io.grpc.C70253bx;
import p5488io.grpc.C70334de;
import p5488io.grpc.Status;
import p5488io.p5489a.C69792b;

/* renamed from: io.grpc.e.ko */
/* compiled from: PG */
final class C70642ko implements C70659le {

    /* renamed from: a */
    public final C70141ae f188312a;

    /* renamed from: b */
    private final Executor f188313b;

    /* renamed from: c */
    private final Executor f188314c;

    /* renamed from: d */
    private final C70658ld f188315d;

    /* renamed from: e */
    private C70659le f188316e;

    public C70642ko(Executor executor, Executor executor2, C70658ld ldVar, C70141ae aeVar) {
        this.f188313b = executor;
        this.f188314c = executor2;
        this.f188315d = ldVar;
        this.f188312a = aeVar;
    }

    /* renamed from: a */
    public final void mo62381a(Status status) {
        int i = C69792b.f186180a;
        if (!status.mo61679g()) {
            Throwable th = status.f186920q;
            if (th == null) {
                th = C70253bx.m102405a(Status.f186904b.withDescription("RPC cancelled"));
            }
            this.f188314c.execute(new C70637kj(this.f188312a, th));
        }
        this.f188313b.execute(new C70638kk(this, status));
    }

    /* renamed from: b */
    public final void mo62382b() {
        int i = C69792b.f186180a;
        this.f188313b.execute(new C70639kl(this));
    }

    /* renamed from: c */
    public final C70659le mo62384c() {
        C70659le leVar = this.f188316e;
        if (leVar != null) {
            return leVar;
        }
        throw new IllegalStateException("listener unset");
    }

    /* renamed from: d */
    public final void mo62083d(C70672lr lrVar) {
        int i = C69792b.f186180a;
        this.f188313b.execute(new C70640km(this, lrVar));
    }

    /* renamed from: e */
    public final void mo62084e() {
        int i = C69792b.f186180a;
        this.f188313b.execute(new C70641kn(this));
    }

    /* renamed from: f */
    public final void mo62385f(Throwable th) {
        this.f188315d.mo61774e(Status.f186905c.mo61678e(th), new C70334de());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo62386g(C70659le leVar) {
        C58838bb.m90866a(leVar, "listener must not be null");
        C58838bb.m90884s(this.f188316e == null, "Listener already set");
        this.f188316e = leVar;
    }
}
