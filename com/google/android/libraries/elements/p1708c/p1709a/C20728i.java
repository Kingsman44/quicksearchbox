package com.google.android.libraries.elements.p1708c.p1709a;

/* renamed from: com.google.android.libraries.elements.c.a.i */
/* compiled from: PG */
final class C20728i extends C20742w {

    /* renamed from: a */
    private final int f58043a;

    /* renamed from: b */
    private final int f58044b;

    public C20728i(int i, int i2) {
        this.f58043a = i;
        this.f58044b = i2;
    }

    /* renamed from: a */
    public final int mo25809a() {
        return this.f58043a;
    }

    /* renamed from: b */
    public final int mo25810b() {
        return this.f58044b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C20742w) {
            C20742w wVar = (C20742w) obj;
            return this.f58043a == wVar.mo25809a() && this.f58044b == wVar.mo25810b();
        }
    }

    public final int hashCode() {
        return ((this.f58043a ^ 1000003) * 1000003) ^ this.f58044b;
    }

    public final String toString() {
        int i = this.f58043a;
        int i2 = this.f58044b;
        return "HapticFeedback{hapticFeedbackConstant=" + i + ", versionCode=" + i2 + "}";
    }
}
