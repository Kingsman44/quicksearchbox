package kotlinx.coroutines.p5578d;

import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60917ed;
import java.util.concurrent.ExecutionException;
import kotlinx.coroutines.C71807q;
import p5462h.C69714l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.d.j */
/* compiled from: PG */
final class C71664j implements Runnable {

    /* renamed from: a */
    private final C60870cx f191115a;

    /* renamed from: b */
    private final C71807q f191116b;

    public C71664j(C60870cx cxVar, C71807q qVar) {
        C69664n.m101061g(cxVar, "futureToObserve");
        this.f191115a = cxVar;
        this.f191116b = qVar;
    }

    public final void run() {
        if (this.f191115a.isCancelled()) {
            this.f191116b.mo63039l((Throwable) null);
            return;
        }
        try {
            this.f191116b.mo61338mb(C60917ed.m93034a(this.f191115a));
        } catch (ExecutionException e) {
            C71807q qVar = this.f191116b;
            Throwable cause = e.getCause();
            C69664n.m101058d(cause);
            qVar.mo61338mb(C69714l.m101133a(cause));
        }
    }
}
