package p5488io.grpc;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: io.grpc.fg */
/* compiled from: PG */
final class C70767fg extends C70147ak {

    /* renamed from: a */
    static final ThreadLocal f188585a = new ThreadLocal();

    /* renamed from: b */
    private static final Logger f188586b = Logger.getLogger(C70767fg.class.getName());

    /* renamed from: a */
    public final C70148al mo61713a() {
        C70148al alVar = (C70148al) f188585a.get();
        return alVar == null ? C70148al.f186992d : alVar;
    }

    /* renamed from: b */
    public final C70148al mo61714b(C70148al alVar) {
        C70148al a = mo61713a();
        f188585a.set(alVar);
        return a;
    }

    /* renamed from: c */
    public final void mo61715c(C70148al alVar, C70148al alVar2) {
        if (mo61713a() != alVar) {
            f188586b.logp(Level.SEVERE, "io.grpc.ThreadLocalContextStorage", "detach", "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (alVar2 != C70148al.f186992d) {
            f188585a.set(alVar2);
        } else {
            f188585a.set((Object) null);
        }
    }
}
