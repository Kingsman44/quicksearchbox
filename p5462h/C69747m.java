package p5462h;

import java.io.Serializable;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: h.m */
/* compiled from: PG */
public final class C69747m implements Serializable, C69613f {

    /* renamed from: a */
    private C69615a f186121a;

    /* renamed from: b */
    private volatile Object f186122b = C69786o.f186169a;

    /* renamed from: c */
    private final Object f186123c = this;

    public C69747m(C69615a aVar) {
        this.f186121a = aVar;
    }

    private final Object writeReplace() {
        return new C69589d(mo5768a());
    }

    /* renamed from: b */
    public final boolean mo5769b() {
        return this.f186122b != C69786o.f186169a;
    }

    public final String toString() {
        return mo5769b() ? String.valueOf(mo5768a()) : "Lazy value not initialized yet.";
    }

    /* renamed from: a */
    public final Object mo5768a() {
        Object obj;
        Object obj2 = this.f186122b;
        if (obj2 != C69786o.f186169a) {
            return obj2;
        }
        synchronized (this.f186123c) {
            obj = this.f186122b;
            if (obj == C69786o.f186169a) {
                C69615a aVar = this.f186121a;
                C69664n.m101058d(aVar);
                obj = aVar.mo5672a();
                this.f186122b = obj;
                this.f186121a = null;
            }
        }
        return obj;
    }
}
