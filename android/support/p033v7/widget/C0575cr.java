package android.support.p033v7.widget;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.p033v7.p035b.p036a.C0406a;
import androidx.core.graphics.drawable.C1929b;

/* renamed from: android.support.v7.widget.cr */
/* compiled from: PG */
final class C0575cr extends C0406a {

    /* renamed from: b */
    public boolean f2222b = true;

    public C0575cr(Drawable drawable) {
        super(drawable);
    }

    public final void draw(Canvas canvas) {
        if (this.f2222b) {
            this.f1370a.draw(canvas);
        }
    }

    public final void setHotspot(float f, float f2) {
        if (this.f2222b) {
            C1929b.m5223d(this.f1370a, f, f2);
        }
    }

    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.f2222b) {
            C1929b.m5224e(this.f1370a, i, i2, i3, i4);
        }
    }

    public final boolean setState(int[] iArr) {
        if (this.f2222b) {
            return this.f1370a.setState(iArr);
        }
        return false;
    }

    public final boolean setVisible(boolean z, boolean z2) {
        if (this.f2222b) {
            return super.setVisible(z, z2);
        }
        return false;
    }
}
