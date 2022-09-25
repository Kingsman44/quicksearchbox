package androidx.appsearch.p047a;

import androidx.core.p097i.C1968c;

/* renamed from: androidx.appsearch.a.aa */
/* compiled from: PG */
public final class C0828aa {

    /* renamed from: a */
    public final String f2788a;

    /* renamed from: b */
    public final int f2789b;

    public C0828aa(String str, int i) {
        str.getClass();
        this.f2788a = str;
        this.f2789b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0828aa)) {
            return false;
        }
        C0828aa aaVar = (C0828aa) obj;
        return this.f2789b == aaVar.f2789b && this.f2788a.equals(aaVar.f2788a);
    }

    public final int hashCode() {
        return C1968c.m5304a(this.f2788a, Integer.valueOf(this.f2789b));
    }

    public final String toString() {
        if (this.f2789b == -1) {
            return this.f2788a;
        }
        return this.f2788a + "[" + this.f2789b + "]";
    }
}
