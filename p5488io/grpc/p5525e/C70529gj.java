package p5488io.grpc.p5525e;

import java.util.ArrayList;
import java.util.Collection;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.gj */
/* compiled from: PG */
final class C70529gj implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C70536gq f187925a;

    public C70529gj(C70536gq gqVar) {
        this.f187925a = gqVar;
    }

    public final void run() {
        ArrayList arrayList;
        if (this.f187925a.f187936a.get() == C70542gw.f187964g) {
            this.f187925a.f187936a.set((Object) null);
        }
        Collection<C70535gp> collection = this.f187925a.f187938c.f188020y;
        if (collection != null) {
            for (C70535gp d : collection) {
                d.mo27480d("Channel is forcefully shutdown", (Throwable) null);
            }
        }
        C70541gv gvVar = this.f187925a.f187938c.f187967B;
        Status status = C70542gw.f187960c;
        gvVar.mo62274a(status);
        synchronized (gvVar.f187954a) {
            arrayList = new ArrayList(gvVar.f187955b);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C70372ao) arrayList.get(i)).mo61757c(status);
        }
        gvVar.f187957d.f187966A.mo61832m(status);
    }
}
