package kotlinx.coroutines;

import java.util.List;
import java.util.ServiceLoader;
import p5462h.C69465a;
import p5462h.C69714l;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5482l.C69734n;

/* renamed from: kotlinx.coroutines.aq */
/* compiled from: PG */
public final class C71416aq {

    /* renamed from: a */
    private static final List f190625a = C69734n.m101138f(C69734n.m101176b(ServiceLoader.load(CoroutineExceptionHandler.class, CoroutineExceptionHandler.class.getClassLoader()).iterator()));

    /* renamed from: a */
    public static final void m104190a(C69585o oVar, Throwable th) {
        C69664n.m101061g(oVar, "context");
        C69664n.m101061g(th, "exception");
        for (CoroutineExceptionHandler handleException : f190625a) {
            try {
                handleException.handleException(oVar, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, C71417ar.m104191a(th, th2));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            C69465a.m100953a(th, new C71609bj(oVar));
        } catch (Throwable th3) {
            C69714l.m101133a(th3);
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
