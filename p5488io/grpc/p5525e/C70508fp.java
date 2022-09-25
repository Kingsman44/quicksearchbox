package p5488io.grpc.p5525e;

import java.lang.Thread;
import java.util.logging.Level;
import java.util.logging.Logger;
import p5488io.grpc.C70137aa;
import p5488io.grpc.C70246bq;

/* renamed from: io.grpc.e.fp */
/* compiled from: PG */
final class C70508fp implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    final /* synthetic */ C70542gw f187888a;

    public C70508fp(C70542gw gwVar) {
        this.f187888a = gwVar;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        Logger logger = C70542gw.f187958a;
        Level level = Level.SEVERE;
        logger.logp(level, "io.grpc.internal.ManagedChannelImpl$2", "uncaughtException", "[" + this.f187888a.f188004i + "] Uncaught exception in the SynchronizationContext. Panic!", th);
        C70542gw gwVar = this.f187888a;
        if (!gwVar.f188018w) {
            gwVar.f188018w = true;
            gwVar.f187989X.mo62341b(true);
            gwVar.mo62282p(false);
            gwVar.mo62283q(new C70505fm(th));
            gwVar.f187978M.mo62254d((C70246bq) null);
            gwVar.f187976K.mo62076a(4, "PANIC! Entering TRANSIENT_FAILURE");
            gwVar.f188012q.mo62106a(C70137aa.TRANSIENT_FAILURE);
        }
    }
}
