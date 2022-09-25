package p5488io.grpc.p5525e;

import java.util.logging.Level;
import p5488io.grpc.C70246bq;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.ge */
/* compiled from: PG */
final class C70524ge implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Status f187916a;

    /* renamed from: b */
    final /* synthetic */ C70526gg f187917b;

    public C70524ge(C70526gg ggVar, Status status) {
        this.f187917b = ggVar;
        this.f187916a = status;
    }

    public final void run() {
        C70526gg ggVar = this.f187917b;
        Status status = this.f187916a;
        C70542gw.f187958a.logp(Level.WARNING, "io.grpc.internal.ManagedChannelImpl$NameResolverListener", "handleErrorInSyncContext", "[{0}] Failed to resolve name. status={1}", new Object[]{ggVar.f187922c.f188004i, status});
        C70536gq gqVar = ggVar.f187922c.f187978M;
        if (gqVar.f187936a.get() == C70542gw.f187964g) {
            gqVar.mo62254d((C70246bq) null);
        }
        C70542gw gwVar = ggVar.f187922c;
        if (gwVar.f187990Y != 3) {
            gwVar.f187976K.mo62077b(3, "Failed to resolve name: {0}", status);
            ggVar.f187922c.f187990Y = 3;
        }
        C70523gd gdVar = ggVar.f187920a;
        if (gdVar == ggVar.f187922c.f188016u) {
            gdVar.f187914a.f188422b.mo61959a(status);
            ggVar.mo62245c();
        }
    }
}
