package com.google.android.libraries.elements.p1705a.p1706a;

import com.google.android.libraries.elements.interfaces.PointProxy;
import com.google.android.libraries.elements.interfaces.ScrollableContainerMarqueeConfigProxy;
import com.google.android.libraries.elements.interfaces.ScrollableContainerTypeDirection;
import com.google.android.libraries.elements.interfaces.ScrollableContainerTypeOverscrollMode;
import com.google.android.libraries.elements.interfaces.ScrollableContainerTypeProxy;
import com.google.android.libraries.elements.interfaces.SizeProxy;
import com.youtube.p5283a.p5284a.C68069be;

/* renamed from: com.google.android.libraries.elements.a.a.m */
/* compiled from: PG */
public final class C20689m extends ScrollableContainerTypeProxy {

    /* renamed from: a */
    public final C68069be f57974a;

    public C20689m(C68069be beVar) {
        this.f57974a = beVar;
    }

    public final PointProxy contentOffset() {
        if (this.f57974a.mo60162h() != null) {
            return new C20688l(this.f57974a.mo60162h());
        }
        return null;
    }

    public final SizeProxy contentSize() {
        if (this.f57974a.mo60163i() != null) {
            return new C20690n(this.f57974a.mo60163i());
        }
        return null;
    }

    public final ScrollableContainerTypeDirection direction() {
        C68069be beVar = this.f57974a;
        int a = beVar.mo16913a(4);
        if (a != 0) {
            int i = beVar.f24704b.getInt(a + beVar.f24703a);
            if (i == 1) {
                return ScrollableContainerTypeDirection.SCROLLABLE_CONTAINER_TYPE_DIRECTION_HORIZONTAL;
            }
            if (i == 2) {
                return ScrollableContainerTypeDirection.SCROLLABLE_CONTAINER_TYPE_DIRECTION_VERTICAL;
            }
        }
        return ScrollableContainerTypeDirection.SCROLLABLE_CONTAINER_TYPE_DIRECTION_UNKNOWN;
    }

    public final /* bridge */ /* synthetic */ ScrollableContainerMarqueeConfigProxy marqueeConfig() {
        if (this.f57974a.mo60161g() != null) {
            return new C20686j(this.f57974a.mo60161g());
        }
        return null;
    }

    public final ScrollableContainerTypeOverscrollMode overscrollMode() {
        C68069be beVar = this.f57974a;
        int a = beVar.mo16913a(20);
        if (a != 0) {
            int i = beVar.f24704b.getInt(a + beVar.f24703a);
            if (i == 1) {
                return ScrollableContainerTypeOverscrollMode.SCROLLABLE_CONTAINER_TYPE_OVERSCROLL_MODE_NEVER;
            }
            if (i == 2) {
                return ScrollableContainerTypeOverscrollMode.SCROLLABLE_CONTAINER_TYPE_OVERSCROLL_MODE_IF_CONTENT_SCROLLS;
            }
            if (i == 3) {
                return ScrollableContainerTypeOverscrollMode.SCROLLABLE_CONTAINER_TYPE_OVERSCROLL_MODE_ALWAYS;
            }
        }
        return ScrollableContainerTypeOverscrollMode.SCROLLABLE_CONTAINER_TYPE_OVERSCROLL_MODE_UNSPECIFIED;
    }

    public final boolean showHorizontalIndicator() {
        return this.f57974a.mo60164j();
    }

    public final boolean showVerticalIndicator() {
        return this.f57974a.mo60165k();
    }
}
