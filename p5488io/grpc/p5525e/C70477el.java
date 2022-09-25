package p5488io.grpc.p5525e;

import java.net.SocketAddress;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p5488io.grpc.C70137aa;
import p5488io.grpc.C70158av;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.el */
/* compiled from: PG */
final class C70477el implements Runnable {

    /* renamed from: a */
    final /* synthetic */ List f187826a;

    /* renamed from: b */
    final /* synthetic */ C70493fa f187827b;

    public C70477el(C70493fa faVar, List list) {
        this.f187827b = faVar;
        this.f187826a = list;
    }

    public final void run() {
        C70556hj hjVar;
        SocketAddress a = this.f187827b.f187858f.mo62200a();
        C70486eu euVar = this.f187827b.f187858f;
        euVar.f187842a = this.f187826a;
        euVar.mo62201b();
        this.f187827b.f187859g = this.f187826a;
        if (this.f187827b.f187868p.f186972a == C70137aa.READY || this.f187827b.f187868p.f186972a == C70137aa.CONNECTING) {
            C70486eu euVar2 = this.f187827b.f187858f;
            int i = 0;
            while (true) {
                if (i < euVar2.f187842a.size()) {
                    int indexOf = ((C70158av) euVar2.f187842a.get(i)).f187011b.indexOf(a);
                    if (indexOf != -1) {
                        euVar2.f187843b = i;
                        euVar2.f187844c = indexOf;
                        break;
                    }
                    i++;
                } else if (this.f187827b.f187868p.f186972a == C70137aa.READY) {
                    hjVar = this.f187827b.f187867o;
                    this.f187827b.f187867o = null;
                    this.f187827b.f187858f.mo62201b();
                    this.f187827b.mo62211d(C70137aa.IDLE);
                } else {
                    this.f187827b.f187866n.mo61831l(Status.f186916n.withDescription("InternalSubchannel closed pending transport due to address change"));
                    C70493fa faVar = this.f187827b;
                    faVar.f187866n = null;
                    faVar.f187858f.mo62201b();
                    this.f187827b.mo62216i();
                }
            }
        }
        hjVar = null;
        if (hjVar != null) {
            C70493fa faVar2 = this.f187827b;
            if (faVar2.f187862j != null) {
                faVar2.f187863k.mo61831l(Status.f186916n.withDescription("InternalSubchannel closed transport early due to address change"));
                this.f187827b.f187862j.mo62443a();
                C70493fa faVar3 = this.f187827b;
                faVar3.f187862j = null;
                faVar3.f187863k = null;
            }
            C70493fa faVar4 = this.f187827b;
            faVar4.f187863k = hjVar;
            faVar4.f187862j = faVar4.f187857e.mo62444a(new C70476ek(this), 5, TimeUnit.SECONDS, this.f187827b.f187854b);
        }
    }
}
