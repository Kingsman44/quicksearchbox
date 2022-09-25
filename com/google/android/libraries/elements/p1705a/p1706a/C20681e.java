package com.google.android.libraries.elements.p1705a.p1706a;

import com.google.android.libraries.elements.interfaces.DimensionProxy;
import com.google.android.libraries.elements.interfaces.DimensionUnit;
import com.youtube.p5283a.p5284a.C68101w;

/* renamed from: com.google.android.libraries.elements.a.a.e */
/* compiled from: PG */
public final class C20681e extends DimensionProxy {

    /* renamed from: a */
    public final C68101w f57964a;

    public C20681e(C68101w wVar) {
        this.f57964a = wVar;
    }

    public final DimensionUnit unit() {
        int c = this.f57964a.mo60257c();
        if (c == 1) {
            return DimensionUnit.DIMENSION_UNIT_POINT;
        }
        if (c != 2) {
            return DimensionUnit.DIMENSION_UNIT_UNKNOWN;
        }
        return DimensionUnit.DIMENSION_UNIT_FRACTION;
    }

    public final float value() {
        return this.f57964a.mo60256b();
    }
}
