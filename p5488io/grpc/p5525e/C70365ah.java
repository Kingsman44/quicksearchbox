package p5488io.grpc.p5525e;

import java.io.InputStream;
import p5488io.grpc.Status;
import p5488io.p5489a.C69792b;

/* renamed from: io.grpc.e.ah */
/* compiled from: PG */
final class C70365ah extends C70390bf {

    /* renamed from: a */
    final /* synthetic */ C70672lr f187544a;

    /* renamed from: b */
    final /* synthetic */ C70368ak f187545b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C70365ah(C70368ak akVar, C70672lr lrVar) {
        super(akVar.f187552c.f187560d);
        this.f187545b = akVar;
        this.f187544a = lrVar;
    }

    /* renamed from: a */
    public final void mo62079a() {
        InputStream g;
        int i = C69792b.f186180a;
        if (this.f187545b.f187551b == null) {
            while (true) {
                try {
                    g = this.f187544a.mo61868g();
                    if (g != null) {
                        C70368ak akVar = this.f187545b;
                        akVar.f187550a.mo27487i(akVar.f187552c.f187557a.f187500e.mo23739b(g));
                        g.close();
                    } else {
                        return;
                    }
                } catch (Throwable th) {
                    C70460dv.m102880h(this.f187544a);
                    this.f187545b.mo62081b(Status.f186904b.mo61678e(th).withDescription("Failed to read message."));
                    return;
                }
            }
        } else {
            C70460dv.m102880h(this.f187544a);
        }
    }
}
