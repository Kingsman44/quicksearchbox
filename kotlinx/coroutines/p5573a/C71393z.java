package kotlinx.coroutines.p5573a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.a.z */
/* compiled from: PG */
public final class C71393z extends C71347aa {

    /* renamed from: a */
    public final Throwable f190598a;

    public C71393z(Throwable th) {
        this.f190598a = th;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C71393z) && C69664n.m101066l(this.f190598a, ((C71393z) obj).f190598a);
    }

    public final int hashCode() {
        Throwable th = this.f190598a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Throwable th = this.f190598a;
        return "Closed(" + th + ")";
    }
}
