package androidx.work.impl.p207b;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.work.impl.b.e */
/* compiled from: PG */
public final class C4496e {

    /* renamed from: a */
    public final String f14257a;

    /* renamed from: b */
    public final Long f14258b;

    public C4496e(String str, Long l) {
        this.f14257a = str;
        this.f14258b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4496e)) {
            return false;
        }
        C4496e eVar = (C4496e) obj;
        return C69664n.m101066l(this.f14257a, eVar.f14257a) && C69664n.m101066l(this.f14258b, eVar.f14258b);
    }

    public final int hashCode() {
        return (this.f14257a.hashCode() * 31) + this.f14258b.hashCode();
    }

    public final String toString() {
        return "Preference(key=" + this.f14257a + ", value=" + this.f14258b + ')';
    }
}
