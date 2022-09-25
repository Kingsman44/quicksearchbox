package androidx.core.p097i;

/* renamed from: androidx.core.i.e */
/* compiled from: PG */
public final class C1970e {

    /* renamed from: a */
    public final Object f5888a;

    /* renamed from: b */
    public final Object f5889b;

    public C1970e(Object obj, Object obj2) {
        this.f5888a = obj;
        this.f5889b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1970e)) {
            return false;
        }
        C1970e eVar = (C1970e) obj;
        if (!C1968c.m5305b(eVar.f5888a, this.f5888a) || !C1968c.m5305b(eVar.f5889b, this.f5889b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.f5888a;
        int i = 0;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f5889b;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        return "Pair{" + this.f5888a + " " + this.f5889b + "}";
    }
}
