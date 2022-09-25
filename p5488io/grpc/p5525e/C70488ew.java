package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import java.util.concurrent.TimeUnit;
import p5488io.grpc.C70137aa;
import p5488io.grpc.C70138ab;
import p5488io.grpc.C70158av;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.ew */
/* compiled from: PG */
final class C70488ew implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Status f187846a;

    /* renamed from: b */
    final /* synthetic */ C70490ey f187847b;

    public C70488ew(C70490ey eyVar, Status status) {
        this.f187847b = eyVar;
        this.f187846a = status;
    }

    public final void run() {
        if (this.f187847b.f187851c.f187868p.f186972a != C70137aa.SHUTDOWN) {
            C70556hj hjVar = this.f187847b.f187851c.f187867o;
            C70490ey eyVar = this.f187847b;
            C70387bc bcVar = eyVar.f187849a;
            if (hjVar == bcVar) {
                eyVar.f187851c.f187867o = null;
                this.f187847b.f187851c.f187858f.mo62201b();
                this.f187847b.f187851c.mo62211d(C70137aa.IDLE);
                return;
            }
            C70493fa faVar = eyVar.f187851c;
            if (faVar.f187866n == bcVar) {
                boolean z = false;
                C58838bb.m90887v(faVar.f187868p.f186972a == C70137aa.CONNECTING, "Expected state is CONNECTING, actual state is %s", this.f187847b.f187851c.f187868p.f186972a);
                C70486eu euVar = this.f187847b.f187851c.f187858f;
                int i = euVar.f187844c + 1;
                euVar.f187844c = i;
                if (i >= ((C70158av) euVar.f187842a.get(euVar.f187843b)).f187011b.size()) {
                    euVar.f187843b++;
                    euVar.f187844c = 0;
                }
                C70486eu euVar2 = this.f187847b.f187851c.f187858f;
                if (euVar2.f187843b >= euVar2.f187842a.size()) {
                    C70493fa faVar2 = this.f187847b.f187851c;
                    faVar2.f187866n = null;
                    faVar2.f187858f.mo62201b();
                    C70493fa faVar3 = this.f187847b.f187851c;
                    Status status = this.f187846a;
                    faVar3.f187857e.mo62447d();
                    C58838bb.m90869d(!status.mo61679g(), "The error status must not be OK");
                    faVar3.mo62212e(new C70138ab(C70137aa.TRANSIENT_FAILURE, status));
                    if (faVar3.f187870r == null) {
                        faVar3.f187870r = new C70443de();
                    }
                    long a = faVar3.f187870r.mo62161a() - faVar3.f187860h.mo56158a(TimeUnit.NANOSECONDS);
                    faVar3.f187856d.mo62077b(2, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", C70493fa.m102929j(status), Long.valueOf(a));
                    if (faVar3.f187861i == null) {
                        z = true;
                    }
                    C58838bb.m90884s(z, "previous reconnectTask is not done");
                    faVar3.f187861i = faVar3.f187857e.mo62444a(new C70474ei(faVar3), a, TimeUnit.NANOSECONDS, faVar3.f187854b);
                    return;
                }
                this.f187847b.f187851c.mo62216i();
            }
        }
    }
}
