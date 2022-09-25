package com.google.android.libraries.search.assistant.fluidactions.p2540c;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.c.c */
/* compiled from: PG */
public final class C32970c extends C32973f {

    /* renamed from: a */
    private final C32971d f88338a;

    /* renamed from: b */
    private final int f88339b;

    /* renamed from: c */
    private final int f88340c;

    /* renamed from: d */
    private final int f88341d;

    /* renamed from: e */
    private final boolean f88342e;

    /* renamed from: f */
    private final int f88343f;

    public C32970c(C32971d dVar, int i, int i2, int i3, int i4, boolean z) {
        if (dVar != null) {
            this.f88338a = dVar;
            this.f88343f = i;
            this.f88339b = i2;
            this.f88340c = i3;
            this.f88341d = i4;
            this.f88342e = z;
            return;
        }
        throw new NullPointerException("Null settingKey");
    }

    /* renamed from: a */
    public final int mo38418a() {
        return this.f88340c;
    }

    /* renamed from: b */
    public final int mo38419b() {
        return this.f88339b;
    }

    /* renamed from: c */
    public final int mo38420c() {
        return this.f88341d;
    }

    /* renamed from: d */
    public final C32971d mo38421d() {
        return this.f88338a;
    }

    /* renamed from: e */
    public final boolean mo38422e() {
        return this.f88342e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C32973f) {
            C32973f fVar = (C32973f) obj;
            return this.f88338a.equals(fVar.mo38421d()) && this.f88343f == fVar.mo38424f() && this.f88339b == fVar.mo38419b() && this.f88340c == fVar.mo38418a() && this.f88341d == fVar.mo38420c() && this.f88342e == fVar.mo38422e();
        }
    }

    /* renamed from: f */
    public final int mo38424f() {
        return this.f88343f;
    }

    public final int hashCode() {
        return ((((((((((this.f88338a.hashCode() ^ 1000003) * 1000003) ^ this.f88343f) * 1000003) ^ this.f88339b) * 1000003) ^ this.f88340c) * 1000003) ^ this.f88341d) * 1000003) ^ (true != this.f88342e ? 1237 : 1231);
    }

    public final String toString() {
        String obj = this.f88338a.toString();
        String str = this.f88343f != 1 ? "SLIDER" : "TOGGLE";
        int i = this.f88339b;
        int i2 = this.f88340c;
        int i3 = this.f88341d;
        boolean z = this.f88342e;
        return "DeviceSettingSnapshot{settingKey=" + obj + ", settingType=" + str + ", sliderMin=" + i + ", sliderMax=" + i2 + ", sliderValue=" + i3 + ", toggleValue=" + z + "}";
    }
}
