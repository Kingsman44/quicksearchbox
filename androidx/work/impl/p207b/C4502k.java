package androidx.work.impl.p207b;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.work.impl.b.k */
/* compiled from: PG */
public final class C4502k {

    /* renamed from: a */
    public final String f14262a;

    /* renamed from: b */
    public final int f14263b;

    /* renamed from: c */
    public final int f14264c;

    public C4502k(String str, int i, int i2) {
        C69664n.m101061g(str, "workSpecId");
        this.f14262a = str;
        this.f14263b = i;
        this.f14264c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4502k)) {
            return false;
        }
        C4502k kVar = (C4502k) obj;
        return C69664n.m101066l(this.f14262a, kVar.f14262a) && this.f14263b == kVar.f14263b && this.f14264c == kVar.f14264c;
    }

    public final int hashCode() {
        return (((this.f14262a.hashCode() * 31) + this.f14263b) * 31) + this.f14264c;
    }

    public final String toString() {
        return "SystemIdInfo(workSpecId=" + this.f14262a + ", generation=" + this.f14263b + ", systemId=" + this.f14264c + ')';
    }
}
