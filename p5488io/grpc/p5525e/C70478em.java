package p5488io.grpc.p5525e;

import p5488io.grpc.C70137aa;
import p5488io.grpc.C70765fe;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.em */
/* compiled from: PG */
final class C70478em implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Status f187828a;

    /* renamed from: b */
    final /* synthetic */ C70493fa f187829b;

    public C70478em(C70493fa faVar, Status status) {
        this.f187829b = faVar;
        this.f187828a = status;
    }

    public final void run() {
        if (this.f187829b.f187868p.f186972a != C70137aa.SHUTDOWN) {
            C70493fa faVar = this.f187829b;
            faVar.f187869q = this.f187828a;
            C70556hj hjVar = faVar.f187867o;
            C70493fa faVar2 = this.f187829b;
            C70387bc bcVar = faVar2.f187866n;
            faVar2.f187867o = null;
            C70493fa faVar3 = this.f187829b;
            faVar3.f187866n = null;
            faVar3.mo62211d(C70137aa.SHUTDOWN);
            this.f187829b.f187858f.mo62201b();
            if (this.f187829b.f187864l.isEmpty()) {
                this.f187829b.mo62213f();
            }
            C70493fa faVar4 = this.f187829b;
            faVar4.f187857e.mo62447d();
            C70765fe feVar = faVar4.f187861i;
            if (feVar != null) {
                feVar.mo62443a();
                faVar4.f187861i = null;
                faVar4.f187870r = null;
            }
            C70765fe feVar2 = this.f187829b.f187862j;
            if (feVar2 != null) {
                feVar2.mo62443a();
                this.f187829b.f187863k.mo61831l(this.f187828a);
                C70493fa faVar5 = this.f187829b;
                faVar5.f187862j = null;
                faVar5.f187863k = null;
            }
            if (hjVar != null) {
                hjVar.mo61831l(this.f187828a);
            }
            if (bcVar != null) {
                bcVar.mo61831l(this.f187828a);
            }
        }
    }
}
