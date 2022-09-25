package kotlinx.coroutines;

import p5462h.p5466c.C69553a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.av */
/* compiled from: PG */
public final class C71421av extends C69553a {

    /* renamed from: a */
    public static final C71420au f190628a = new C71420au();

    /* renamed from: b */
    public final String f190629b;

    public C71421av(String str) {
        super(f190628a);
        this.f190629b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C71421av) && C69664n.m101066l(this.f190629b, ((C71421av) obj).f190629b);
    }

    public final int hashCode() {
        return this.f190629b.hashCode();
    }

    public final String toString() {
        String str = this.f190629b;
        return "CoroutineName(" + str + ")";
    }
}
