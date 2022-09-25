package com.google.android.apps.search.googleapp.search.p10410f;

import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.f.f */
/* compiled from: PG */
public final class C137430f {

    /* renamed from: a */
    public final String f373798a;

    /* renamed from: b */
    public final C69626l f373799b;

    public C137430f(String str, C69626l lVar) {
        this.f373798a = str;
        this.f373799b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C137430f)) {
            return false;
        }
        C137430f fVar = (C137430f) obj;
        return C69664n.m101066l(this.f373798a, fVar.f373798a) && C69664n.m101066l(this.f373799b, fVar.f373799b);
    }

    public final int hashCode() {
        return (this.f373798a.hashCode() * 31) + this.f373799b.hashCode();
    }

    public final String toString() {
        String str = this.f373798a;
        C69626l lVar = this.f373799b;
        return "ColumnSpec(title=" + str + ", toCell=" + lVar + ")";
    }
}
