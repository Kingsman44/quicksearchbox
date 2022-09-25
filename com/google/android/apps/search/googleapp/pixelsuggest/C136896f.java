package com.google.android.apps.search.googleapp.pixelsuggest;

/* renamed from: com.google.android.apps.search.googleapp.pixelsuggest.f */
/* compiled from: PG */
public final class C136896f {

    /* renamed from: a */
    public final int f372597a;

    /* renamed from: b */
    public int f372598b = 0;

    /* renamed from: c */
    public int f372599c = 0;

    public C136896f(int i) {
        this.f372597a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C136896f)) {
            return false;
        }
        C136896f fVar = (C136896f) obj;
        return this.f372597a == fVar.f372597a && this.f372598b == fVar.f372598b && this.f372599c == fVar.f372599c;
    }

    public final int hashCode() {
        return (((this.f372597a * 31) + this.f372598b) * 31) + this.f372599c;
    }

    public final String toString() {
        int i = this.f372597a;
        int i2 = this.f372598b;
        int i3 = this.f372599c;
        return "PixelSuggestParameters(appsRowHeight=" + i + ", allAppsTop=" + i2 + ", searchBoxTop=" + i3 + ")";
    }
}
