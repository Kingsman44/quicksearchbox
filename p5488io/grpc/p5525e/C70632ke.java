package p5488io.grpc.p5525e;

/* renamed from: io.grpc.e.ke */
/* compiled from: PG */
final class C70632ke extends C70630kc {
    /* renamed from: a */
    public final boolean mo62377a(C70633kf kfVar) {
        synchronized (kfVar) {
            if (kfVar.f188285a != 0) {
                return false;
            }
            kfVar.f188285a = -1;
            return true;
        }
    }

    /* renamed from: b */
    public final void mo62378b(C70633kf kfVar) {
        synchronized (kfVar) {
            kfVar.f188285a = 0;
        }
    }
}
