package p5488io.grpc.p5525e;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;
import p5488io.grpc.C70898m;

/* renamed from: io.grpc.e.gh */
/* compiled from: PG */
final class C70527gh extends C70888j {

    /* renamed from: a */
    final /* synthetic */ C70536gq f187923a;

    public C70527gh(C70536gq gqVar) {
        this.f187923a = gqVar;
    }

    /* renamed from: a */
    public final C70898m mo39510a(C70338di diVar, C70851i iVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor i = this.f187923a.f187938c.mo62275i(iVar);
        C70542gw gwVar = this.f187923a.f187938c;
        C70512ft ftVar = gwVar.f187992aa;
        if (gwVar.f187971F) {
            scheduledExecutorService = null;
        } else {
            scheduledExecutorService = this.f187923a.f187938c.f188005j.mo57961b();
        }
        C70371an anVar = new C70371an(diVar, i, iVar, ftVar, scheduledExecutorService, this.f187923a.f187938c.f187974I);
        C70542gw gwVar2 = this.f187923a.f187938c;
        anVar.f187563g = gwVar2.f188010o;
        anVar.f187564h = gwVar2.f188011p;
        return anVar;
    }

    /* renamed from: b */
    public final String mo39511b() {
        return this.f187923a.f187937b;
    }
}
