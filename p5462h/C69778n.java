package p5462h;

import java.io.Serializable;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: h.n */
/* compiled from: PG */
public final class C69778n implements Serializable {

    /* renamed from: a */
    public final Object f186153a;

    /* renamed from: b */
    public final Object f186154b;

    /* renamed from: c */
    public final Object f186155c;

    public C69778n(Object obj, Object obj2, Object obj3) {
        this.f186153a = obj;
        this.f186154b = obj2;
        this.f186155c = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C69778n)) {
            return false;
        }
        C69778n nVar = (C69778n) obj;
        return C69664n.m101066l(this.f186153a, nVar.f186153a) && C69664n.m101066l(this.f186154b, nVar.f186154b) && C69664n.m101066l(this.f186155c, nVar.f186155c);
    }

    public final int hashCode() {
        Object obj = this.f186153a;
        int i = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f186154b;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f186155c;
        if (obj3 != null) {
            i = obj3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "(" + this.f186153a + ", " + this.f186154b + ", " + this.f186155c + ')';
    }
}
