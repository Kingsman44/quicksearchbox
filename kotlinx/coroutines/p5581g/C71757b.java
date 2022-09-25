package kotlinx.coroutines.p5581g;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71417ar;
import p5462h.C69465a;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: kotlinx.coroutines.g.b */
/* compiled from: PG */
public final class C71757b {
    /* renamed from: a */
    public static final void m104946a(Throwable th, C69585o oVar) {
        C69664n.m101061g(th, "cause");
        C69664n.m101061g(oVar, "context");
        if (!(th instanceof CancellationException)) {
            try {
                C70101a.m102023e(th);
            } catch (Throwable th2) {
                C69465a.m100953a(th, th2);
                C71417ar.m104192b(oVar, th);
            }
        }
    }
}
