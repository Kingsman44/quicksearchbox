package com.google.android.libraries.onegoogle.actions;

/* renamed from: com.google.android.libraries.onegoogle.actions.f */
/* compiled from: PG */
public final class C30805f extends C30809j {

    /* renamed from: a */
    public final int f83126a;

    /* renamed from: b */
    public final int f83127b;

    /* renamed from: c */
    public final int f83128c;

    /* renamed from: d */
    public final boolean f83129d;

    public C30805f(int i, int i2, int i3, boolean z) {
        this.f83126a = i;
        this.f83127b = i2;
        this.f83128c = i3;
        this.f83129d = z;
    }

    /* renamed from: a */
    public final int mo36503a() {
        return this.f83127b;
    }

    /* renamed from: b */
    public final int mo36504b() {
        return this.f83128c;
    }

    /* renamed from: c */
    public final int mo36505c() {
        return this.f83126a;
    }

    /* renamed from: d */
    public final boolean mo36506d() {
        return this.f83129d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C30809j) {
            C30809j jVar = (C30809j) obj;
            return this.f83126a == jVar.mo36505c() && this.f83127b == jVar.mo36503a() && this.f83128c == jVar.mo36504b() && this.f83129d == jVar.mo36506d();
        }
    }

    public final int hashCode() {
        return ((((((this.f83126a ^ 1000003) * 1000003) ^ this.f83127b) * 1000003) ^ this.f83128c) * 1000003) ^ (true != this.f83129d ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.f83126a;
        int i2 = this.f83127b;
        int i3 = this.f83128c;
        boolean z = this.f83129d;
        return "ActionViewHolderAttributes{iconColor=" + i + ", highlightChipBackgroundColor=" + i2 + ", highlightChipTextColor=" + i3 + ", isEnlargedDiscs=" + z + "}";
    }
}
