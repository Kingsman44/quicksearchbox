package com.google.android.apps.gsa.shared.p7012bb.p7016d;

/* renamed from: com.google.android.apps.gsa.shared.bb.d.c */
/* compiled from: PG */
public final class C89375c extends C89389q {

    /* renamed from: a */
    public final boolean f242315a;

    /* renamed from: b */
    public final boolean f242316b;

    /* renamed from: c */
    public final boolean f242317c;

    public C89375c(boolean z, boolean z2, boolean z3) {
        this.f242315a = z;
        this.f242316b = z2;
        this.f242317c = z3;
    }

    /* renamed from: a */
    public final boolean mo83306a() {
        return this.f242317c;
    }

    /* renamed from: b */
    public final boolean mo83307b() {
        return this.f242315a;
    }

    /* renamed from: c */
    public final boolean mo83308c() {
        return this.f242316b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C89389q) {
            C89389q qVar = (C89389q) obj;
            return this.f242315a == qVar.mo83307b() && this.f242316b == qVar.mo83308c() && this.f242317c == qVar.mo83306a();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((true != this.f242315a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.f242316b ? 1237 : 1231)) * 1000003;
        if (true == this.f242317c) {
            i = 1231;
        }
        return i2 ^ i;
    }

    public final String toString() {
        boolean z = this.f242315a;
        boolean z2 = this.f242316b;
        boolean z3 = this.f242317c;
        return "GsaTaskGraphLoggedElements{shouldLogHighLevelMetrics=" + z + ", shouldLogTasks=" + z2 + ", shouldLogCustomEvents=" + z3 + "}";
    }
}
