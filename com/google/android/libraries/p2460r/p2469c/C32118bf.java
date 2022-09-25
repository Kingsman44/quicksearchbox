package com.google.android.libraries.p2460r.p2469c;

import com.google.p4283bv.p4354e.p4367c.p4368a.C57461ee;
import java.util.List;

/* renamed from: com.google.android.libraries.r.c.bf */
/* compiled from: PG */
final class C32118bf extends C32091av {

    /* renamed from: a */
    public final int f86245a;

    /* renamed from: b */
    public final boolean f86246b;

    /* renamed from: c */
    public final List f86247c;

    public C32118bf(C57461ee eeVar) {
        this.f86245a = eeVar.f153500b;
        this.f86246b = eeVar.f153502d;
        this.f86247c = eeVar.f153504f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C32118bf)) {
            return false;
        }
        C32118bf bfVar = (C32118bf) obj;
        return bfVar.f86245a == this.f86245a && bfVar.f86246b == this.f86246b && this.f86247c.equals(bfVar.f86247c);
    }

    public final int hashCode() {
        return (((this.f86245a * 31) + (this.f86246b ? 1 : 0)) * 31) + this.f86247c.hashCode();
    }
}
