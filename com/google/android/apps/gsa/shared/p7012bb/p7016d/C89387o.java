package com.google.android.apps.gsa.shared.p7012bb.p7016d;

/* renamed from: com.google.android.apps.gsa.shared.bb.d.o */
/* compiled from: PG */
public final class C89387o {

    /* renamed from: a */
    public final int f242361a;

    /* renamed from: b */
    public final C89386n f242362b;

    public C89387o(int i, C89386n nVar) {
        this.f242361a = i;
        this.f242362b = nVar;
    }

    /* renamed from: a */
    public final C89389q mo83319a() {
        if (!mo83320b()) {
            return C89389q.f242365d;
        }
        int i = this.f242361a;
        int i2 = i & 1;
        boolean z = false;
        boolean z2 = (i & 4) != 0;
        boolean z3 = (i & 2) != 0;
        if (1 == i2) {
            z = true;
        }
        return new C89375c(z, z2, z3);
    }

    /* renamed from: b */
    public final boolean mo83320b() {
        return (this.f242361a & 7) != 0;
    }

    /* renamed from: c */
    public final boolean mo83321c() {
        return (this.f242361a & 8) != 0;
    }
}
