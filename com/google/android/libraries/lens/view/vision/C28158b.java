package com.google.android.libraries.lens.view.vision;

/* renamed from: com.google.android.libraries.lens.view.vision.b */
/* compiled from: PG */
public final class C28158b extends C28167i {

    /* renamed from: a */
    private final int f76610a;

    /* renamed from: b */
    private final int f76611b;

    /* renamed from: c */
    private final int f76612c;

    /* renamed from: d */
    private final int f76613d;

    /* renamed from: e */
    private final int f76614e;

    /* renamed from: f */
    private final int f76615f;

    public C28158b(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f76610a = i;
        this.f76611b = i2;
        this.f76612c = i3;
        this.f76613d = i4;
        this.f76614e = i5;
        this.f76615f = i6;
    }

    /* renamed from: a */
    public final int mo33611a() {
        return this.f76612c;
    }

    /* renamed from: b */
    public final int mo33612b() {
        return this.f76610a;
    }

    /* renamed from: c */
    public final int mo33613c() {
        return this.f76613d;
    }

    /* renamed from: d */
    public final int mo33614d() {
        return this.f76611b;
    }

    /* renamed from: e */
    public final int mo33615e() {
        return this.f76614e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C28167i) {
            C28167i iVar = (C28167i) obj;
            return this.f76610a == iVar.mo33612b() && this.f76611b == iVar.mo33614d() && this.f76612c == iVar.mo33611a() && this.f76613d == iVar.mo33613c() && this.f76614e == iVar.mo33615e() && this.f76615f == iVar.mo33617f();
        }
    }

    /* renamed from: f */
    public final int mo33617f() {
        return this.f76615f;
    }

    public final int hashCode() {
        return ((((((((((this.f76610a ^ 1000003) * 1000003) ^ this.f76611b) * 1000003) ^ this.f76612c) * 1000003) ^ this.f76613d) * 1000003) ^ this.f76614e) * 1000003) ^ this.f76615f;
    }
}
