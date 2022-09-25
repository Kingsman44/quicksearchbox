package p5462h;

import java.io.Serializable;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: h.i */
/* compiled from: PG */
public final class C69685i implements Serializable {

    /* renamed from: a */
    public final Object f186052a;

    /* renamed from: b */
    public final Object f186053b;

    public C69685i(Object obj, Object obj2) {
        this.f186052a = obj;
        this.f186053b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C69685i)) {
            return false;
        }
        C69685i iVar = (C69685i) obj;
        return C69664n.m101066l(this.f186052a, iVar.f186052a) && C69664n.m101066l(this.f186053b, iVar.f186053b);
    }

    public final int hashCode() {
        Object obj = this.f186052a;
        int i = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f186053b;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "(" + this.f186052a + ", " + this.f186053b + ')';
    }
}
