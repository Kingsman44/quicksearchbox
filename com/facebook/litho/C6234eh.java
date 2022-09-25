package com.facebook.litho;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.litho.eh */
/* compiled from: PG */
public final class C6234eh extends Drawable implements Drawable.Callback, C6353gf {

    /* renamed from: a */
    public Drawable f18409a;

    /* renamed from: b */
    public boolean f18410b;

    /* renamed from: c */
    public int f18411c;

    /* renamed from: d */
    public int f18412d;

    /* renamed from: a */
    public final void mo13192a(int i, int i2) {
        this.f18411c = i;
        this.f18412d = i2;
        Drawable drawable = this.f18409a;
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
        }
    }

    /* renamed from: b */
    public final void mo13193b(boolean z, boolean z2) {
        Drawable drawable = this.f18409a;
        if (drawable != null && drawable.isVisible() != z) {
            try {
                this.f18409a.setVisible(z, z2);
            } catch (NullPointerException unused) {
            }
        }
    }

    /* renamed from: c */
    public final boolean mo13194c(MotionEvent motionEvent, View view) {
        Rect bounds = getBounds();
        float x = motionEvent.getX();
        int i = bounds.left;
        float y = motionEvent.getY();
        this.f18409a.setHotspot((float) (((int) x) - i), (float) (((int) y) - bounds.top));
        return false;
    }

    /* renamed from: d */
    public final boolean mo13195d(MotionEvent motionEvent) {
        Drawable drawable = this.f18409a;
        return drawable != null && (drawable instanceof RippleDrawable) && motionEvent.getActionMasked() == 0 && getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    public final void draw(Canvas canvas) {
        if (this.f18409a != null) {
            Rect bounds = getBounds();
            int save = canvas.save();
            canvas.translate((float) bounds.left, (float) bounds.top);
            if (this.f18410b) {
                canvas.clipRect(0, 0, bounds.width(), bounds.height());
            }
            this.f18409a.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public final int getChangingConfigurations() {
        Drawable drawable = this.f18409a;
        if (drawable == null) {
            return -1;
        }
        return drawable.getChangingConfigurations();
    }

    public final Drawable getCurrent() {
        Drawable drawable = this.f18409a;
        if (drawable == null) {
            return null;
        }
        return drawable.getCurrent();
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.f18409a;
        if (drawable == null) {
            return -1;
        }
        return drawable.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.f18409a;
        if (drawable == null) {
            return -1;
        }
        return drawable.getIntrinsicWidth();
    }

    public final int getMinimumHeight() {
        Drawable drawable = this.f18409a;
        if (drawable == null) {
            return -1;
        }
        return drawable.getMinimumHeight();
    }

    public final int getMinimumWidth() {
        Drawable drawable = this.f18409a;
        if (drawable == null) {
            return -1;
        }
        return drawable.getMinimumWidth();
    }

    public final int getOpacity() {
        Drawable drawable = this.f18409a;
        if (drawable == null) {
            return -1;
        }
        return drawable.getOpacity();
    }

    public final boolean getPadding(Rect rect) {
        Drawable drawable = this.f18409a;
        return drawable != null && drawable.getPadding(rect);
    }

    public final int[] getState() {
        Drawable drawable = this.f18409a;
        if (drawable == null) {
            return null;
        }
        return drawable.getState();
    }

    public final Region getTransparentRegion() {
        Drawable drawable = this.f18409a;
        if (drawable == null) {
            return null;
        }
        return drawable.getTransparentRegion();
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final boolean isStateful() {
        Drawable drawable = this.f18409a;
        return drawable != null && drawable.isStateful();
    }

    /* access modifiers changed from: protected */
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f18409a;
        return drawable != null && drawable.setLevel(i);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public final void setAlpha(int i) {
        Drawable drawable = this.f18409a;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    public final void setChangingConfigurations(int i) {
        Drawable drawable = this.f18409a;
        if (drawable != null) {
            drawable.setChangingConfigurations(i);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f18409a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    public final void setDither(boolean z) {
        Drawable drawable = this.f18409a;
        if (drawable != null) {
            drawable.setDither(z);
        }
    }

    public final void setFilterBitmap(boolean z) {
        Drawable drawable = this.f18409a;
        if (drawable != null) {
            drawable.setFilterBitmap(z);
        }
    }

    public final boolean setState(int[] iArr) {
        Drawable drawable = this.f18409a;
        return drawable != null && drawable.setState(iArr);
    }

    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        mo13193b(z, z2);
        return visible;
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
