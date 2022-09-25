package p5488io.grpc.p5527g;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p5488io.grpc.p5525e.C70460dv;
import p5488io.grpc.p5525e.C70667lm;

/* renamed from: io.grpc.g.k */
/* compiled from: PG */
final class C70830k implements C70667lm {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo62176a() {
        return Executors.newCachedThreadPool(C70460dv.m102884l("grpc-okhttp-%d"));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo62177b(Object obj) {
        ((ExecutorService) obj).shutdown();
    }
}
