package androidx.camera.core.p073b;

/* renamed from: androidx.camera.core.b.a */
/* compiled from: PG */
final class C1427a extends C1447j {

    /* renamed from: a */
    private final float f3985a;

    /* renamed from: b */
    private final float f3986b;

    /* renamed from: c */
    private final float f3987c;

    /* renamed from: d */
    private final float f3988d;

    public C1427a(float f, float f2, float f3, float f4) {
        this.f3985a = f;
        this.f3986b = f2;
        this.f3987c = f3;
        this.f3988d = f4;
    }

    /* renamed from: a */
    public final float mo4318a() {
        return this.f3988d;
    }

    /* renamed from: b */
    public final float mo4319b() {
        return this.f3986b;
    }

    /* renamed from: c */
    public final float mo4320c() {
        return this.f3987c;
    }

    /* renamed from: d */
    public final float mo4321d() {
        return this.f3985a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1447j) {
            C1447j jVar = (C1447j) obj;
            return Float.floatToIntBits(this.f3985a) == Float.floatToIntBits(jVar.mo4321d()) && Float.floatToIntBits(this.f3986b) == Float.floatToIntBits(jVar.mo4319b()) && Float.floatToIntBits(this.f3987c) == Float.floatToIntBits(jVar.mo4320c()) && Float.floatToIntBits(this.f3988d) == Float.floatToIntBits(jVar.mo4318a());
        }
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.f3985a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f3986b)) * 1000003) ^ Float.floatToIntBits(this.f3987c)) * 1000003) ^ Float.floatToIntBits(this.f3988d);
    }

    public final String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f3985a + ", maxZoomRatio=" + this.f3986b + ", minZoomRatio=" + this.f3987c + ", linearZoom=" + this.f3988d + "}";
    }
}
