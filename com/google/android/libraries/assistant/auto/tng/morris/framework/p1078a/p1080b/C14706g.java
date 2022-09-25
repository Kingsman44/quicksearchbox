package com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.g */
/* compiled from: PG */
final class C14706g extends C14707h {

    /* renamed from: a */
    private final int f44454a;

    /* renamed from: b */
    private final int f44455b;

    public C14706g(int i, int i2) {
        this.f44454a = i;
        this.f44455b = i2;
    }

    /* renamed from: a */
    public final int mo21693a() {
        return this.f44454a;
    }

    /* renamed from: b */
    public final int mo21694b() {
        return this.f44455b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C14707h) {
            C14707h hVar = (C14707h) obj;
            return this.f44454a == hVar.mo21693a() && this.f44455b == hVar.mo21694b();
        }
    }

    public final int hashCode() {
        return ((this.f44454a ^ 1000003) * 1000003) ^ this.f44455b;
    }

    public final String toString() {
        int i = this.f44454a;
        int i2 = this.f44455b;
        return "BubbleCoordinates{xCoordinate=" + i + ", yCoordinate=" + i2 + "}";
    }
}
