package com.google.android.libraries.elements.p1705a.p1706a;

import com.google.android.libraries.elements.interfaces.PointProxy;
import com.google.android.libraries.elements.interfaces.RectCornersProxy;
import com.google.android.libraries.elements.interfaces.StylePropertiesProxy;
import com.google.p370af.C7490c;
import com.youtube.p5283a.p5284a.C68072bh;

/* renamed from: com.google.android.libraries.elements.a.a.p */
/* compiled from: PG */
public final class C20692p extends StylePropertiesProxy {

    /* renamed from: a */
    public final C68072bh f57977a;

    /* renamed from: b */
    public final RectCornersProxy f57978b;

    /* renamed from: c */
    public final PointProxy f57979c;

    public C20692p(C68072bh bhVar) {
        C20691o oVar;
        this.f57977a = bhVar;
        C20688l lVar = null;
        if (bhVar.mo60177p() == null) {
            oVar = null;
        } else {
            oVar = new C20691o(bhVar.mo60177p());
        }
        this.f57978b = oVar;
        this.f57979c = bhVar.mo60176o() != null ? new C20688l(bhVar.mo60176o()) : lVar;
    }

    public final long backgroundColor() {
        return this.f57977a.mo60173l();
    }

    public final long borderColor() {
        return this.f57977a.mo60174m();
    }

    public final float borderRadius() {
        return this.f57977a.mo60168g();
    }

    public final RectCornersProxy borderRadiusCorners() {
        return this.f57978b;
    }

    public final float borderWidth() {
        return this.f57977a.mo60169h();
    }

    public final boolean clipBounds() {
        return this.f57977a.mo60178r();
    }

    public final boolean hasBackgroundColor() {
        return C7490c.m22726p(this.f57977a, 4);
    }

    public final boolean hasBorderColor() {
        return C7490c.m22726p(this.f57977a, 8);
    }

    public final boolean hasBorderRadius() {
        return C7490c.m22726p(this.f57977a, 12);
    }

    public final boolean hasBorderWidth() {
        return C7490c.m22726p(this.f57977a, 10);
    }

    public final boolean hasClipBounds() {
        return C7490c.m22726p(this.f57977a, 16);
    }

    public final boolean hasOpacity() {
        return C7490c.m22726p(this.f57977a, 6);
    }

    public final boolean hasRotation() {
        return C7490c.m22726p(this.f57977a, 24);
    }

    public final boolean hasScale() {
        return C7490c.m22726p(this.f57977a, 22);
    }

    public final float opacity() {
        return this.f57977a.mo60170i();
    }

    public final float rotation() {
        return this.f57977a.mo60171j();
    }

    public final float scale() {
        return this.f57977a.mo60172k();
    }

    public final PointProxy translation() {
        return this.f57979c;
    }
}
