package com.google.android.libraries.gsa.p1859d.p1861b;

/* renamed from: com.google.android.libraries.gsa.d.b.c */
/* compiled from: PG */
public final class C22757c extends C22749a {

    /* renamed from: a */
    public final int f62636a;

    /* renamed from: b */
    public final int f62637b;

    public C22757c(int i, int i2) {
        this.f62637b = i;
        this.f62636a = i2;
    }

    /* renamed from: a */
    public final int mo27913a() {
        return this.f62636a;
    }

    /* renamed from: b */
    public final int mo27914b() {
        return this.f62637b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C22749a) {
            C22749a aVar = (C22749a) obj;
            return this.f62637b == aVar.mo27914b() && this.f62636a == aVar.mo27913a();
        }
    }

    public final int hashCode() {
        return ((this.f62637b ^ 1000003) * 1000003) ^ this.f62636a;
    }

    public final String toString() {
        int i = this.f62637b;
        String str = i != 1 ? i != 2 ? i != 4 ? "null" : "FADE" : "SLIDE" : "NONE";
        int i2 = this.f62636a;
        return "AnimationDescriptor{animationType=" + str + ", duration=" + i2 + "}";
    }
}
