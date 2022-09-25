package com.google.android.libraries.lens.view.gleam;

/* renamed from: com.google.android.libraries.lens.view.gleam.e */
/* compiled from: PG */
final class C26549e extends C26465ax {

    /* renamed from: a */
    private final float f72368a;

    /* renamed from: b */
    private final String f72369b;

    /* renamed from: c */
    private final float f72370c;

    /* renamed from: d */
    private final float f72371d;

    public C26549e(float f, String str, float f2, float f3) {
        this.f72368a = f;
        if (str != null) {
            this.f72369b = str;
            this.f72370c = f2;
            this.f72371d = f3;
            return;
        }
        throw new NullPointerException("Null text");
    }

    /* renamed from: a */
    public final float mo31719a() {
        return this.f72371d;
    }

    /* renamed from: b */
    public final float mo31720b() {
        return this.f72368a;
    }

    /* renamed from: c */
    public final float mo31721c() {
        return this.f72370c;
    }

    /* renamed from: d */
    public final String mo31722d() {
        return this.f72369b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C26465ax) {
            C26465ax axVar = (C26465ax) obj;
            return Float.floatToIntBits(this.f72368a) == Float.floatToIntBits(axVar.mo31720b()) && this.f72369b.equals(axVar.mo31722d()) && Float.floatToIntBits(this.f72370c) == Float.floatToIntBits(axVar.mo31721c()) && Float.floatToIntBits(this.f72371d) == Float.floatToIntBits(axVar.mo31719a());
        }
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.f72368a) ^ 1000003) * 1000003) ^ this.f72369b.hashCode()) * 1000003) ^ Float.floatToIntBits(this.f72370c)) * 1000003) ^ Float.floatToIntBits(this.f72371d);
    }

    public final String toString() {
        float f = this.f72368a;
        String str = this.f72369b;
        float f2 = this.f72370c;
        float f3 = this.f72371d;
        return "OverallRatingData{value=" + f + ", text=" + str + ", width=" + f2 + ", starRadius=" + f3 + "}";
    }
}
