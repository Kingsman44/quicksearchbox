package p5462h.p5470d.p5471a;

import p5462h.p5470d.C69593b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: h.d.a.b */
/* compiled from: PG */
public final class C69592b extends C69593b {
    /* renamed from: a */
    public final void mo61358a(Throwable th, Throwable th2) {
        C69664n.m101061g(th, "cause");
        C69664n.m101061g(th2, "exception");
        if (C69591a.f185996a == null || C69591a.f185996a.intValue() >= 19) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th2});
            } catch (Exception unused) {
            }
        } else {
            super.mo61358a(th, th2);
        }
    }
}
