package androidx.camera.core.p069a.p070a.p072b;

import androidx.core.p097i.C1974i;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: androidx.camera.core.a.a.b.k */
/* compiled from: PG */
final class C1262k implements Runnable {

    /* renamed from: a */
    final Future f3664a;

    /* renamed from: b */
    final C1255d f3665b;

    public C1262k(Future future, C1255d dVar) {
        this.f3664a = future;
        this.f3665b = dVar;
    }

    public final void run() {
        try {
            Future future = this.f3664a;
            boolean isDone = future.isDone();
            new StringBuilder("Future was expected to be done, ").append(future);
            C1974i.m5315c(isDone, "Future was expected to be done, ".concat(String.valueOf(future)));
            this.f3665b.mo3795b(C1263l.m3435g(future));
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                this.f3665b.mo3794a(e);
            } else {
                this.f3665b.mo3794a(cause);
            }
        } catch (Error | RuntimeException e2) {
            this.f3665b.mo3794a(e2);
        }
    }

    public final String toString() {
        return getClass().getSimpleName() + "," + this.f3665b;
    }
}
