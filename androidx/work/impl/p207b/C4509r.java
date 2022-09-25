package androidx.work.impl.p207b;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.work.impl.b.r */
/* compiled from: PG */
public final class C4509r {

    /* renamed from: a */
    public final String f14269a;

    /* renamed from: b */
    public final int f14270b;

    public C4509r(String str, int i) {
        C69664n.m101061g(str, "workSpecId");
        this.f14269a = str;
        this.f14270b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4509r)) {
            return false;
        }
        C4509r rVar = (C4509r) obj;
        return C69664n.m101066l(this.f14269a, rVar.f14269a) && this.f14270b == rVar.f14270b;
    }

    public final int hashCode() {
        return (this.f14269a.hashCode() * 31) + this.f14270b;
    }

    public final String toString() {
        return "WorkGenerationalId(workSpecId=" + this.f14269a + ", generation=" + this.f14270b + ')';
    }
}
