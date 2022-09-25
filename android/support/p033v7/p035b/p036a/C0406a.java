package android.support.p033v7.p035b.p036a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.C1928a;
import androidx.core.graphics.drawable.C1929b;

/* renamed from: android.support.v7.b.a.a */
/* compiled from: PG */
public class C0406a extends Drawable implements Drawable.Callback {

    /* renamed from: a */
    public final Drawable f1370a;

    public C0406a(Drawable drawable) {
        Drawable drawable2 = this.f1370a;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1370a = drawable;
        drawable.setCallback(this);
    }

    public void draw(Canvas canvas) {
        this.f1370a.draw(canvas);
    }

    public final int getChangingConfigurations() {
        return this.f1370a.getChangingConfigurations();
    }

    public final Drawable getCurrent() {
        return this.f1370a.getCurrent();
    }

    public final int getIntrinsicHeight() {
        return this.f1370a.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.f1370a.getIntrinsicWidth();
    }

    public final int getMinimumHeight() {
        return this.f1370a.getMinimumHeight();
    }

    public final int getMinimumWidth() {
        return this.f1370a.getMinimumWidth();
    }

    public final int getOpacity() {
        return this.f1370a.getOpacity();
    }

    public final boolean getPadding(Rect rect) {
        return this.f1370a.getPadding(rect);
    }

    public final int[] getState() {
        return this.f1370a.getState();
    }

    public final Region getTransparentRegion() {
        return this.f1370a.getTransparentRegion();
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final boolean isAutoMirrored() {
        return C1928a.m5219e(this.f1370a);
    }

    public final boolean isStateful() {
        return this.f1370a.isStateful();
    }

    public final void jumpToCurrentState() {
        this.f1370a.jumpToCurrentState();
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        this.f1370a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public final boolean onLevelChange(int i) {
        return this.f1370a.setLevel(i);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public final void setAlpha(int i) {
        this.f1370a.setAlpha(i);
    }

    public final void setAutoMirrored(boolean z) {
        C1928a.m5218d(this.f1370a, z);
    }

    public final void setChangingConfigurations(int i) {
        this.f1370a.setChangingConfigurations(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f1370a.setColorFilter(colorFilter);
    }

    public final void setDither(boolean z) {
        this.f1370a.setDither(z);
    }

    public final void setFilterBitmap(boolean z) {
        this.f1370a.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        C1929b.m5223d(this.f1370a, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C1929b.m5224e(this.f1370a, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f1370a.setState(iArr);
    }

    public final void setTint(int i) {
        C1929b.m5225f(this.f1370a, i);
    }

    public final void setTintList(ColorStateList colorStateList) {
        C1929b.m5226g(this.f1370a, colorStateList);
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        C1929b.m5227h(this.f1370a, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f1370a.setVisible(z, z2);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
