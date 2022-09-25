package androidx.navigation;

import android.os.Bundle;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.navigation.g */
/* compiled from: PG */
public final class C3886g {

    /* renamed from: a */
    public final C3860ca f12469a;

    /* renamed from: b */
    public final boolean f12470b;

    /* renamed from: c */
    public final boolean f12471c;

    /* renamed from: d */
    private final Object f12472d;

    public C3886g(C3860ca caVar, boolean z, Object obj, boolean z2) {
        if (!caVar.f12421l && z) {
            throw new IllegalArgumentException(C69664n.m101057c(caVar.mo8104b(), " does not allow nullable values"));
        } else if (z || !z2 || obj != null) {
            this.f12469a = caVar;
            this.f12470b = z;
            this.f12472d = obj;
            this.f12471c = z2;
        } else {
            throw new IllegalArgumentException("Argument with type " + caVar.mo8104b() + " has null value but is not nullable.");
        }
    }

    /* renamed from: a */
    public final void mo8130a(String str, Bundle bundle) {
        C69664n.m101061g(str, "name");
        if (this.f12471c) {
            this.f12469a.mo8105c(bundle, str, this.f12472d);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C69664n.m101066l(getClass(), obj.getClass())) {
            return false;
        }
        C3886g gVar = (C3886g) obj;
        if (this.f12470b != gVar.f12470b || this.f12471c != gVar.f12471c || !C69664n.m101066l(this.f12469a, gVar.f12469a)) {
            return false;
        }
        Object obj2 = this.f12472d;
        if (obj2 != null) {
            return C69664n.m101066l(obj2, gVar.f12472d);
        }
        return gVar.f12472d == null;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((((this.f12469a.hashCode() * 31) + (this.f12470b ? 1 : 0)) * 31) + (this.f12471c ? 1 : 0)) * 31;
        Object obj = this.f12472d;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        return hashCode + i;
    }
}
