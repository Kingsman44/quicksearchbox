package kotlinx.coroutines.p5582h;

import java.util.concurrent.Executor;
import kotlinx.coroutines.C71414ao;
import kotlinx.coroutines.C71631cd;
import kotlinx.coroutines.p5579e.C71710ar;
import kotlinx.coroutines.p5579e.C71711as;
import kotlinx.coroutines.p5579e.C71739u;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.C69586p;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.h.d */
/* compiled from: PG */
public final class C71764d extends C71631cd implements Executor {

    /* renamed from: c */
    public static final C71764d f191272c = new C71764d();

    /* renamed from: d */
    private static final C71414ao f191273d;

    static {
        C71772l lVar = C71772l.f191286c;
        int i = C71710ar.f191177a;
        if (i <= 64) {
            i = 64;
        }
        int c = C71711as.m104851c("kotlinx.coroutines.io.parallelism", i, 0, 0, 12);
        if (c > 0) {
            f191273d = new C71739u(lVar, c);
            return;
        }
        throw new IllegalArgumentException("Expected positive parallelism level, but got " + c);
    }

    private C71764d() {
    }

    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    /* renamed from: d */
    public final void mo62766d(C69585o oVar, Runnable runnable) {
        C69664n.m101061g(oVar, "context");
        C69664n.m101061g(runnable, "block");
        f191273d.mo62766d(oVar, runnable);
    }

    /* renamed from: e */
    public final void mo62773e(C69585o oVar, Runnable runnable) {
        C69664n.m101061g(oVar, "context");
        f191273d.mo62773e(oVar, runnable);
    }

    public final void execute(Runnable runnable) {
        C69664n.m101061g(runnable, "command");
        mo62766d(C69586p.f185991a, runnable);
    }

    public final String toString() {
        return "Dispatchers.IO";
    }
}
