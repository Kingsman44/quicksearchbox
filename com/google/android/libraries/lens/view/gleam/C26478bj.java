package com.google.android.libraries.lens.view.gleam;

/* renamed from: com.google.android.libraries.lens.view.gleam.bj */
/* compiled from: PG */
final class C26478bj {

    /* renamed from: a */
    public final float f72124a;

    /* renamed from: b */
    public float f72125b = 1.0f;

    /* renamed from: c */
    public int f72126c = 1;

    /* renamed from: d */
    private final float f72127d;

    public C26478bj(C26594fn fnVar) {
        this.f72124a = (float) fnVar.f72500e;
        this.f72127d = (float) fnVar.f72501f;
    }

    /* renamed from: a */
    public final float mo31734a(float f) {
        C26493by byVar = C26493by.SHADOW_LAYER;
        int i = this.f72126c;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            return 1.0f;
        } else {
            if (i2 == 1) {
                return 0.0f;
            }
            if (i2 != 2) {
                throw new IllegalStateException("Unknown state: ".concat(i != 1 ? i != 2 ? "LINEAR_PROPORTION_TO_MIN_MAX_HEIGHTS" : "FORCE_TRANSPARENT_INITIAL_HEIGHT_UNDER_THRESHOLD" : "UNINITIALIZED"));
            }
            float f2 = this.f72124a;
            if (f <= f2) {
                return 0.0f;
            }
            float f3 = this.f72127d;
            if (f >= f3) {
                return 1.0f;
            }
            return (f - f2) / (f3 - f2);
        }
    }
}
