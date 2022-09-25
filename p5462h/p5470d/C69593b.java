package p5462h.p5470d;

import java.lang.reflect.Method;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: h.d.b */
/* compiled from: PG */
public class C69593b {
    /* renamed from: a */
    public void mo61358a(Throwable th, Throwable th2) {
        C69664n.m101061g(th, "cause");
        C69664n.m101061g(th2, "exception");
        Method method = C69590a.f185995a;
        if (method != null) {
            method.invoke(th, new Object[]{th2});
        }
    }
}
