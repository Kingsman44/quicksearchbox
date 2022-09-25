package kotlinx.coroutines;

import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.ad */
/* compiled from: PG */
public final class C71397ad {

    /* renamed from: a */
    public final Object f190606a;

    /* renamed from: b */
    public final C69626l f190607b;

    public C71397ad(Object obj, C69626l lVar) {
        this.f190606a = obj;
        this.f190607b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C71397ad)) {
            return false;
        }
        C71397ad adVar = (C71397ad) obj;
        return C69664n.m101066l(this.f190606a, adVar.f190606a) && C69664n.m101066l(this.f190607b, adVar.f190607b);
    }

    public final int hashCode() {
        Object obj = this.f190606a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f190607b.hashCode();
    }

    public final String toString() {
        Object obj = this.f190606a;
        C69626l lVar = this.f190607b;
        return "CompletedWithCancellation(result=" + obj + ", onCancellation=" + lVar + ")";
    }
}
