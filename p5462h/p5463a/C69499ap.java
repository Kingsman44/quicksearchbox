package p5462h.p5463a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: h.a.ap */
/* compiled from: PG */
public final class C69499ap {

    /* renamed from: a */
    public final int f185921a;

    /* renamed from: b */
    public final Object f185922b;

    public C69499ap(int i, Object obj) {
        this.f185921a = i;
        this.f185922b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C69499ap)) {
            return false;
        }
        C69499ap apVar = (C69499ap) obj;
        return this.f185921a == apVar.f185921a && C69664n.m101066l(this.f185922b, apVar.f185922b);
    }

    public final int hashCode() {
        int i = this.f185921a * 31;
        Object obj = this.f185922b;
        return i + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f185921a + ", value=" + this.f185922b + ')';
    }
}
