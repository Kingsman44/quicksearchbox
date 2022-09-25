package kotlinx.coroutines.p5579e;

import java.lang.reflect.Constructor;
import p5462h.C69692j;
import p5462h.C69714l;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: kotlinx.coroutines.e.q */
/* compiled from: PG */
public final class C71735q extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ Constructor f191213a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71735q(Constructor constructor) {
        super(1);
        this.f191213a = constructor;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        Object obj2;
        Throwable th = (Throwable) obj;
        C69664n.m101061g(th, "e");
        try {
            Object newInstance = this.f191213a.newInstance(new Object[0]);
            C69664n.m101059e(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
            Throwable th2 = (Throwable) newInstance;
            th2.initCause(th);
            obj2 = th2;
        } catch (Throwable th3) {
            obj2 = C69714l.m101133a(th3);
        }
        boolean z = obj2 instanceof C69692j;
        Object obj3 = obj2;
        if (true == z) {
            obj3 = null;
        }
        return (Throwable) obj3;
    }
}
