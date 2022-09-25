package com.google.android.libraries.searchbox.shared.p3202c;

/* renamed from: com.google.android.libraries.searchbox.shared.c.b */
/* compiled from: PG */
public final class C41644b {

    /* renamed from: a */
    public final int f108857a;

    /* renamed from: b */
    public final int f108858b;

    public C41644b(int i, int i2) {
        this.f108857a = i;
        this.f108858b = i2;
    }

    /* renamed from: a */
    public final boolean mo44240a(int i) {
        return this.f108857a <= i && i <= this.f108858b;
    }

    public final String toString() {
        int i = this.f108857a;
        int i2 = this.f108858b;
        return "Range(" + i + "..." + i2 + ")";
    }
}
