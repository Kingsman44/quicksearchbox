package p5488io.grpc.p5525e;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: io.grpc.e.dp */
/* compiled from: PG */
final class C70454dp implements C70667lm {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo62176a() {
        return Executors.newCachedThreadPool(C70460dv.m102884l("grpc-default-executor-%d"));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo62177b(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    public final String toString() {
        return "grpc-default-executor";
    }
}
