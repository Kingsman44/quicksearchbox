package com.google.android.libraries.lens.view.vision;

/* renamed from: com.google.android.libraries.lens.view.vision.d */
/* compiled from: PG */
final class C28162d extends C28174p {

    /* renamed from: a */
    private final int f76624a;

    /* renamed from: b */
    private final int f76625b;

    /* renamed from: c */
    private final float f76626c;

    /* renamed from: d */
    private final int f76627d;

    /* renamed from: e */
    private final int f76628e;

    public C28162d(int i, int i2, float f, int i3, int i4) {
        this.f76624a = i;
        this.f76625b = i2;
        this.f76626c = f;
        this.f76627d = i3;
        this.f76628e = i4;
    }

    /* renamed from: a */
    public final float mo33624a() {
        return this.f76626c;
    }

    /* renamed from: b */
    public final int mo33625b() {
        return this.f76627d;
    }

    /* renamed from: c */
    public final int mo33626c() {
        return this.f76625b;
    }

    /* renamed from: d */
    public final int mo33627d() {
        return this.f76624a;
    }

    /* renamed from: e */
    public final int mo33628e() {
        return this.f76628e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C28174p) {
            C28174p pVar = (C28174p) obj;
            return this.f76624a == pVar.mo33627d() && this.f76625b == pVar.mo33626c() && Float.floatToIntBits(this.f76626c) == Float.floatToIntBits(pVar.mo33624a()) && this.f76627d == pVar.mo33625b() && this.f76628e == pVar.mo33628e();
        }
    }

    public final int hashCode() {
        return ((((((((this.f76624a ^ 1000003) * 1000003) ^ this.f76625b) * 1000003) ^ Float.floatToIntBits(this.f76626c)) * 1000003) ^ this.f76627d) * 1000003) ^ this.f76628e;
    }

    public final String toString() {
        int i = this.f76624a;
        int i2 = this.f76625b;
        float f = this.f76626c;
        int i3 = this.f76627d;
        int i4 = this.f76628e;
        return "FrameAnalyzerStartParams{analyzerWidth=" + i + ", analyzerHeight=" + i2 + ", downsampleFactor=" + f + ", analyzerBufferRowStride=" + i3 + ", analyzerImageFormat=" + C28170l.m52584a(i4) + "}";
    }
}
