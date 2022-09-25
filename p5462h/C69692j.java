package p5462h;

import java.io.Serializable;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: h.j */
/* compiled from: PG */
public final class C69692j implements Serializable {

    /* renamed from: a */
    public final Throwable f186058a;

    public C69692j(Throwable th) {
        C69664n.m101061g(th, "exception");
        this.f186058a = th;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C69692j) && C69664n.m101066l(this.f186058a, ((C69692j) obj).f186058a);
    }

    public final int hashCode() {
        return this.f186058a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f186058a + ')';
    }
}
