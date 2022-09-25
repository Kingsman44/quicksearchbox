package com.google.android.libraries.lens.common.text.selection.p2009ui;

/* renamed from: com.google.android.libraries.lens.common.text.selection.ui.b */
/* compiled from: PG */
final class C24155b extends C24169j {

    /* renamed from: a */
    private final int f65976a;

    /* renamed from: b */
    private final int f65977b;

    /* renamed from: c */
    private final int f65978c;

    public C24155b(int i, int i2, int i3) {
        this.f65976a = i;
        this.f65977b = i2;
        this.f65978c = i3;
    }

    /* renamed from: a */
    public final int mo29578a() {
        return this.f65977b;
    }

    /* renamed from: b */
    public final int mo29579b() {
        return this.f65976a;
    }

    /* renamed from: c */
    public final int mo29580c() {
        return this.f65978c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C24169j) {
            C24169j jVar = (C24169j) obj;
            return this.f65976a == jVar.mo29579b() && this.f65977b == jVar.mo29578a() && this.f65978c == jVar.mo29580c();
        }
    }

    public final int hashCode() {
        return ((((this.f65976a ^ 1000003) * 1000003) ^ this.f65977b) * 1000003) ^ this.f65978c;
    }

    public final String toString() {
        int i = this.f65976a;
        int i2 = this.f65977b;
        int i3 = this.f65978c;
        return "RotationAngles{rangeStartAngle=" + i + ", rangeEndAngle=" + i2 + ", targetAngle=" + i3 + "}";
    }
}
