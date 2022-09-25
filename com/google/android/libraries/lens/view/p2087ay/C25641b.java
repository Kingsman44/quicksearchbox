package com.google.android.libraries.lens.view.p2087ay;

import android.graphics.Rect;

/* renamed from: com.google.android.libraries.lens.view.ay.b */
/* compiled from: PG */
final class C25641b extends C25621ad {

    /* renamed from: a */
    private final Rect f69751a;

    /* renamed from: b */
    private final Rect f69752b;

    /* renamed from: c */
    private final int f69753c;

    public C25641b(int i, Rect rect, Rect rect2) {
        this.f69753c = i;
        this.f69751a = rect;
        this.f69752b = rect2;
    }

    /* renamed from: a */
    public final Rect mo30732a() {
        return this.f69752b;
    }

    /* renamed from: b */
    public final Rect mo30733b() {
        return this.f69751a;
    }

    /* renamed from: c */
    public final int mo30734c() {
        return this.f69753c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C25621ad) {
            C25621ad adVar = (C25621ad) obj;
            return this.f69753c == adVar.mo30734c() && this.f69751a.equals(adVar.mo30733b()) && this.f69752b.equals(adVar.mo30732a());
        }
    }

    public final int hashCode() {
        return ((((this.f69753c ^ 1000003) * 1000003) ^ this.f69751a.hashCode()) * 1000003) ^ this.f69752b.hashCode();
    }

    public final String toString() {
        String str = this.f69753c != 1 ? "HIGH" : "NORMAL";
        String obj = this.f69751a.toString();
        String obj2 = this.f69752b.toString();
        return "ThinkingGleamsConfig{density=" + str + ", imageRegion=" + obj + ", highDensityRegion=" + obj2 + "}";
    }
}
