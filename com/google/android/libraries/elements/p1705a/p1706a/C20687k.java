package com.google.android.libraries.elements.p1705a.p1706a;

import com.google.android.libraries.elements.interfaces.MarqueeSpeedCurveType;
import com.google.android.libraries.elements.interfaces.ScrollableContainerMarqueeSpeedProxy;
import com.youtube.p5283a.p5284a.C68062ay;

/* renamed from: com.google.android.libraries.elements.a.a.k */
/* compiled from: PG */
public final class C20687k extends ScrollableContainerMarqueeSpeedProxy {

    /* renamed from: a */
    private final C68062ay f57972a;

    public C20687k(C68062ay ayVar) {
        this.f57972a = ayVar;
    }

    public final MarqueeSpeedCurveType marqueeSpeedCurveType() {
        C68062ay ayVar = this.f57972a;
        int a = ayVar.mo16913a(4);
        if (a != 0) {
            int i = ayVar.f24704b.getInt(a + ayVar.f24703a);
            if (i == 1) {
                return MarqueeSpeedCurveType.MARQUEE_SPEED_CURVE_TYPE_LINEAR;
            }
            if (i == 2) {
                return MarqueeSpeedCurveType.MARQUEE_SPEED_CURVE_TYPE_ACCELERATE_DECELERATE;
            }
        }
        return MarqueeSpeedCurveType.MARQUEE_SPEED_CURVE_UNKNOWN;
    }

    public final long scrollSpeed() {
        C68062ay ayVar = this.f57972a;
        int a = ayVar.mo16913a(6);
        if (a != 0) {
            return ayVar.f24704b.getLong(a + ayVar.f24703a);
        }
        return 0;
    }
}
