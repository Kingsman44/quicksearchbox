package p5488io.grpc.p5525e;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: io.grpc.e.dq */
/* compiled from: PG */
final class C70455dq implements C70667lm {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo62176a() {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, C70460dv.m102884l("grpc-timer-%d"));
        try {
            newScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", new Class[]{Boolean.TYPE}).invoke(newScheduledThreadPool, new Object[]{true});
        } catch (NoSuchMethodException unused) {
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
        return Executors.unconfigurableScheduledExecutorService(newScheduledThreadPool);
    }

    /* renamed from: b */
    public final /* synthetic */ void mo62177b(Object obj) {
        ((ScheduledExecutorService) obj).shutdown();
    }
}
