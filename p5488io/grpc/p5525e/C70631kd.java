package p5488io.grpc.p5525e;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: io.grpc.e.kd */
/* compiled from: PG */
final class C70631kd extends C70630kc {

    /* renamed from: a */
    private final AtomicIntegerFieldUpdater f188282a;

    public C70631kd(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.f188282a = atomicIntegerFieldUpdater;
    }

    /* renamed from: a */
    public final boolean mo62377a(C70633kf kfVar) {
        return this.f188282a.compareAndSet(kfVar, 0, -1);
    }

    /* renamed from: b */
    public final void mo62378b(C70633kf kfVar) {
        this.f188282a.set(kfVar, 0);
    }
}
