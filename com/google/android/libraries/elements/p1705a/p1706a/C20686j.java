package com.google.android.libraries.elements.p1705a.p1706a;

import com.google.android.libraries.elements.interfaces.MarqueeScrollDirection;
import com.google.android.libraries.elements.interfaces.ScrollableContainerMarqueeConfigProxy;
import com.google.android.libraries.elements.interfaces.ScrollableContainerMarqueeSpeedProxy;
import com.youtube.p5283a.p5284a.C68061ax;

/* renamed from: com.google.android.libraries.elements.a.a.j */
/* compiled from: PG */
public final class C20686j extends ScrollableContainerMarqueeConfigProxy {

    /* renamed from: a */
    private final C68061ax f57971a;

    public C20686j(C68061ax axVar) {
        this.f57971a = axVar;
    }

    public final boolean alwaysScroll() {
        C68061ax axVar = this.f57971a;
        int a = axVar.mo16913a(12);
        return (a == 0 || axVar.f24704b.get(a + axVar.f24703a) == 0) ? false : true;
    }

    public final float delaySeconds() {
        C68061ax axVar = this.f57971a;
        int a = axVar.mo16913a(4);
        if (a != 0) {
            return axVar.f24704b.getFloat(a + axVar.f24703a);
        }
        return 0.0f;
    }

    public final long loopCount() {
        C68061ax axVar = this.f57971a;
        int a = axVar.mo16913a(6);
        return (long) (a != 0 ? axVar.f24704b.getInt(a + axVar.f24703a) : 0);
    }

    public final float marqueeSpacing() {
        C68061ax axVar = this.f57971a;
        int a = axVar.mo16913a(14);
        if (a != 0) {
            return axVar.f24704b.getFloat(a + axVar.f24703a);
        }
        return 0.0f;
    }

    public final ScrollableContainerMarqueeSpeedProxy marqueeSpeed() {
        if (this.f57971a.mo60144g() != null) {
            return new C20687k(this.f57971a.mo60144g());
        }
        return null;
    }

    public final MarqueeScrollDirection scrollDirection() {
        C68061ax axVar = this.f57971a;
        int a = axVar.mo16913a(8);
        if (a != 0) {
            int i = axVar.f24704b.getInt(a + axVar.f24703a);
            if (i == 1) {
                return MarqueeScrollDirection.MARQUEE_SCROLL_DIRECTION_DEFAULT;
            }
            if (i == 2) {
                return MarqueeScrollDirection.MARQUEE_SCROLL_DIRECTION_RIGHT_TO_LEFT;
            }
            if (i == 3) {
                return MarqueeScrollDirection.MARQUEE_SCROLL_DIRECTION_LEFT_TO_RIGHT;
            }
        }
        return MarqueeScrollDirection.MARQUEE_SCROLL_DIRECTION_UNKNOWN;
    }
}
