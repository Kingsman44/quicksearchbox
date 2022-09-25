package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import p5488io.grpc.C70153aq;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70897l;
import p5488io.grpc.Status;
import p5488io.p5489a.C69792b;

/* renamed from: io.grpc.e.ak */
/* compiled from: PG */
final class C70368ak implements C70374aq {

    /* renamed from: a */
    public final C70897l f187550a;

    /* renamed from: b */
    public Status f187551b;

    /* renamed from: c */
    final /* synthetic */ C70371an f187552c;

    public C70368ak(C70371an anVar, C70897l lVar) {
        this.f187552c = anVar;
        C58838bb.m90866a(lVar, "observer");
        this.f187550a = lVar;
    }

    /* renamed from: a */
    public final void mo62080a(Status status, C70373ap apVar, C70334de deVar) {
        int i = C69792b.f186180a;
        C70153aq c = this.f187552c.mo62086c();
        if (status.getCode() == Status.Code.CANCELLED && c != null && c.mo61723e()) {
            C70469ed edVar = new C70469ed();
            this.f187552c.f187561e.mo61756b(edVar);
            Status status2 = Status.f186907e;
            new StringBuilder("ClientCall was cancelled at or after deadline. ").append(edVar);
            status = status2.mo61677b("ClientCall was cancelled at or after deadline. ".concat(edVar.f187819a.toString()));
            deVar = new C70334de();
        }
        this.f187552c.f187558b.execute(new C70366ai(this, status, deVar));
    }

    /* renamed from: b */
    public final void mo62081b(Status status) {
        this.f187551b = status;
        this.f187552c.f187561e.mo61757c(status);
    }

    /* renamed from: c */
    public final void mo62082c(C70334de deVar) {
        int i = C69792b.f186180a;
        this.f187552c.f187558b.execute(new C70364ag(this, deVar));
    }

    /* renamed from: d */
    public final void mo62083d(C70672lr lrVar) {
        int i = C69792b.f186180a;
        this.f187552c.f187558b.execute(new C70365ah(this, lrVar));
    }

    /* renamed from: e */
    public final void mo62084e() {
        if (!this.f187552c.f187557a.f187496a.mo62041a()) {
            int i = C69792b.f186180a;
            this.f187552c.f187558b.execute(new C70367aj(this));
        }
    }
}
