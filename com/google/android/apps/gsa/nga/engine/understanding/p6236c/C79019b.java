package com.google.android.apps.gsa.nga.engine.understanding.p6236c;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80441u;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.c.b */
/* compiled from: PG */
final class C79019b extends C79029l {

    /* renamed from: a */
    public final C80441u f217309a;

    /* renamed from: b */
    private final double f217310b;

    public C79019b(double d, C80441u uVar) {
        this.f217310b = d;
        if (uVar != null) {
            this.f217309a = uVar;
            return;
        }
        throw new NullPointerException("Null genieNeedsScreenContext");
    }

    /* renamed from: a */
    public final double mo73781a() {
        return this.f217310b;
    }

    /* renamed from: b */
    public final C80441u mo73782b() {
        return this.f217309a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C79029l) {
            C79029l lVar = (C79029l) obj;
            return Double.doubleToLongBits(this.f217310b) == Double.doubleToLongBits(lVar.mo73781a()) && this.f217309a.equals(lVar.mo73782b());
        }
    }

    public final int hashCode() {
        return this.f217309a.hashCode() ^ ((((int) ((Double.doubleToLongBits(this.f217310b) >>> 32) ^ Double.doubleToLongBits(this.f217310b))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        double d = this.f217310b;
        String num = Integer.toString(this.f217309a.f220788d);
        return "Signals{genieScoreForDid=" + d + ", genieNeedsScreenContext=" + num + "}";
    }
}
