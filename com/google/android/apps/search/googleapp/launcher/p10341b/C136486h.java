package com.google.android.apps.search.googleapp.launcher.p10341b;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.h */
/* compiled from: PG */
public final class C136486h extends C136456d {

    /* renamed from: a */
    public final int f371590a;

    /* renamed from: b */
    public final int f371591b;

    public C136486h(int i, int i2) {
        this.f371591b = i;
        this.f371590a = i2;
    }

    /* renamed from: a */
    public final int mo113059a() {
        return this.f371590a;
    }

    /* renamed from: b */
    public final int mo113060b() {
        return this.f371591b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C136456d) {
            C136456d dVar = (C136456d) obj;
            return this.f371591b == dVar.mo113060b() && this.f371590a == dVar.mo113059a();
        }
    }

    public final int hashCode() {
        return ((this.f371591b ^ 1000003) * 1000003) ^ this.f371590a;
    }

    public final String toString() {
        int i = this.f371591b;
        String str = i != 1 ? i != 2 ? i != 4 ? "null" : "FADE" : "SLIDE" : "NONE";
        int i2 = this.f371590a;
        return "AnimationInfo{animationType=" + str + ", animationDuration=" + i2 + "}";
    }
}
