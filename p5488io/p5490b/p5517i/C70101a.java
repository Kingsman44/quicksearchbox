package p5488io.p5490b.p5517i;

import com.google.android.libraries.elements.p1714d.C20867cr;
import java.util.concurrent.Callable;
import p5488io.p5490b.C70128t;
import p5488io.p5490b.p5495c.C69812e;
import p5488io.p5490b.p5495c.C69814g;
import p5488io.p5490b.p5495c.C69815h;
import p5488io.p5490b.p5495c.C69817j;
import p5488io.p5490b.p5496d.C69821c;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5499b.C69841j;
import p5488io.p5490b.p5497e.p5513j.C70085f;

/* renamed from: io.b.i.a */
/* compiled from: PG */
public final class C70101a {

    /* renamed from: a */
    static volatile C69821c f186833a;

    /* renamed from: b */
    public static volatile C69822d f186834b;

    /* renamed from: c */
    public static volatile C69822d f186835c;

    /* renamed from: d */
    public static volatile C69822d f186836d;

    /* renamed from: e */
    public static volatile C69822d f186837e;

    /* renamed from: f */
    public static volatile C69822d f186838f;

    /* renamed from: g */
    public static volatile C69822d f186839g;

    /* renamed from: h */
    public static volatile C69822d f186840h;

    /* renamed from: i */
    public static volatile C69822d f186841i;

    /* renamed from: j */
    public static volatile C69822d f186842j;

    /* renamed from: k */
    public static volatile C69822d f186843k;

    /* renamed from: l */
    public static volatile C69822d f186844l;

    /* renamed from: m */
    public static volatile C69822d f186845m;

    /* renamed from: n */
    public static volatile C69822d f186846n;

    /* renamed from: o */
    public static volatile C69822d f186847o;

    /* renamed from: p */
    public static volatile C69822d f186848p;

    /* renamed from: q */
    public static volatile boolean f186849q;

    /* renamed from: r */
    public static volatile boolean f186850r;

    /* renamed from: s */
    public static volatile C20867cr f186851s;

    /* renamed from: t */
    public static volatile C20867cr f186852t;

    /* renamed from: u */
    public static volatile C20867cr f186853u;

    /* renamed from: v */
    public static volatile C20867cr f186854v;

    /* renamed from: w */
    public static volatile C20867cr f186855w;

    /* renamed from: a */
    public static C70128t m102019a(C69822d dVar, Callable callable) {
        C70128t tVar = (C70128t) m102021c(dVar, callable);
        C69841j.m101337b(tVar, "Scheduler Callable result can't be null");
        return tVar;
    }

    /* renamed from: b */
    public static C70128t m102020b(Callable callable) {
        try {
            C70128t tVar = (C70128t) callable.call();
            C69841j.m101337b(tVar, "Scheduler Callable result can't be null");
            return tVar;
        } catch (Throwable th) {
            throw C70085f.m101984a(th);
        }
    }

    /* renamed from: c */
    static Object m102021c(C69822d dVar, Object obj) {
        try {
            return dVar.mo25875a(obj);
        } catch (Throwable th) {
            throw C70085f.m101984a(th);
        }
    }

    /* renamed from: d */
    public static Runnable m102022d(Runnable runnable) {
        C69841j.m101337b(runnable, "run is null");
        C69822d dVar = f186834b;
        if (dVar == null) {
            return runnable;
        }
        return (Runnable) m102021c(dVar, runnable);
    }

    /* renamed from: e */
    public static void m102023e(Throwable th) {
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!(th instanceof C69815h) && !(th instanceof C69814g) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof C69812e)) {
            th = new C69817j(th);
        }
        th.printStackTrace();
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
