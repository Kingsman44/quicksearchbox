package com.google.android.apps.search.googleapp.discover.p10248y;

import com.google.android.apps.search.googleapp.discover.p10249z.C135359p;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.y.q */
/* compiled from: PG */
public final class C135266q extends C135268s {

    /* renamed from: a */
    public final C135359p f368495a;

    /* renamed from: b */
    private final boolean f368496b;

    /* renamed from: c */
    private final int f368497c;

    public C135266q() {
        this(false, 0, (C135359p) null, 7);
    }

    public /* synthetic */ C135266q(boolean z, int i, C135359p pVar, int i2) {
        boolean z2 = true;
        boolean z3 = z & (!(i2 & true));
        i = (i2 & 2) != 0 ? 0 : i;
        pVar = (i2 & 4) != 0 ? null : pVar;
        this.f368496b = true != z3 ? false : z2;
        this.f368497c = i;
        this.f368495a = pVar;
    }

    /* renamed from: a */
    public final boolean mo112198a(C135268s sVar) {
        C69664n.m101061g(sVar, "other");
        return C69664n.m101066l(this, sVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C135266q)) {
            return false;
        }
        C135266q qVar = (C135266q) obj;
        return this.f368496b == qVar.f368496b && this.f368497c == qVar.f368497c && C69664n.m101066l(this.f368495a, qVar.f368495a);
    }

    public final int hashCode() {
        int i = (((this.f368496b ? 1 : 0) * true) + this.f368497c) * 31;
        C135359p pVar = this.f368495a;
        return i + (pVar == null ? 0 : pVar.hashCode());
    }

    public final String toString() {
        boolean z = this.f368496b;
        int i = this.f368497c;
        C135359p pVar = this.f368495a;
        return "PaginationSpinnerRenderableSlice(isTopSpinner=" + z + ", distance=" + i + ", token=" + pVar + ")";
    }
}
