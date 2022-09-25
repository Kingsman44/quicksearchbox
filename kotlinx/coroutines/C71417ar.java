package kotlinx.coroutines;

import p5462h.C69465a;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.ar */
/* compiled from: PG */
public final class C71417ar {
    /* renamed from: a */
    public static final Throwable m104191a(Throwable th, Throwable th2) {
        C69664n.m101061g(th, "originalException");
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        C69465a.m100953a(runtimeException, th);
        return runtimeException;
    }

    /* renamed from: b */
    public static final void m104192b(C69585o oVar, Throwable th) {
        C69664n.m101061g(oVar, "context");
        C69664n.m101061g(th, "exception");
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) oVar.get(CoroutineExceptionHandler.f190535b);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(oVar, th);
            } else {
                C71416aq.m104190a(oVar, th);
            }
        } catch (Throwable th2) {
            C71416aq.m104190a(oVar, m104191a(th, th2));
        }
    }
}
