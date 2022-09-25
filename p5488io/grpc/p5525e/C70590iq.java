package p5488io.grpc.p5525e;

import java.util.Collection;
import java.util.concurrent.Future;

/* renamed from: io.grpc.e.iq */
/* compiled from: PG */
final class C70590iq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Collection f188176a;

    /* renamed from: b */
    final /* synthetic */ C70623jw f188177b;

    /* renamed from: c */
    final /* synthetic */ Future f188178c;

    /* renamed from: d */
    final /* synthetic */ Future f188179d;

    /* renamed from: e */
    final /* synthetic */ C70625jy f188180e;

    public C70590iq(C70625jy jyVar, Collection collection, C70623jw jwVar, Future future, Future future2) {
        this.f188180e = jyVar;
        this.f188176a = collection;
        this.f188177b = jwVar;
        this.f188178c = future;
        this.f188179d = future2;
    }

    public final void run() {
        for (C70623jw jwVar : this.f188176a) {
            if (jwVar != this.f188177b) {
                jwVar.f188235a.mo61757c(C70625jy.f188245g);
            }
        }
        Future future = this.f188178c;
        if (future != null) {
            future.cancel(false);
        }
        Future future2 = this.f188179d;
        if (future2 != null) {
            future2.cancel(false);
        }
        this.f188180e.mo62233r();
    }
}
