package p5488io.grpc.p5525e;

import p5488io.grpc.C70137aa;
import p5488io.grpc.C70280ci;

/* renamed from: io.grpc.e.gc */
/* compiled from: PG */
final class C70522gc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C70280ci f187911a;

    /* renamed from: b */
    final /* synthetic */ C70137aa f187912b;

    /* renamed from: c */
    final /* synthetic */ C70523gd f187913c;

    public C70522gc(C70523gd gdVar, C70280ci ciVar, C70137aa aaVar) {
        this.f187913c = gdVar;
        this.f187911a = ciVar;
        this.f187912b = aaVar;
    }

    public final void run() {
        C70523gd gdVar = this.f187913c;
        C70542gw gwVar = gdVar.f187915b;
        if (gdVar == gwVar.f188016u) {
            gwVar.mo62283q(this.f187911a);
            if (this.f187912b != C70137aa.SHUTDOWN) {
                this.f187913c.f187915b.f187976K.mo62077b(2, "Entering {0} state with picker: {1}", this.f187912b, this.f187911a);
                this.f187913c.f187915b.f188012q.mo62106a(this.f187912b);
            }
        }
    }
}
