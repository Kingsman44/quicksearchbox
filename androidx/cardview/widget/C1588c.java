package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.cardview.widget.c */
/* compiled from: PG */
public final class C1588c extends Drawable {

    /* renamed from: a */
    public float f4348a;

    /* renamed from: b */
    public float f4349b;

    /* renamed from: c */
    public boolean f4350c = false;

    /* renamed from: d */
    public boolean f4351d = true;

    /* renamed from: e */
    public ColorStateList f4352e;

    /* renamed from: f */
    private final Paint f4353f;

    /* renamed from: g */
    private final RectF f4354g;

    /* renamed from: h */
    private final Rect f4355h;

    /* renamed from: i */
    private PorterDuffColorFilter f4356i;

    /* renamed from: j */
    private ColorStateList f4357j;

    /* renamed from: k */
    private PorterDuff.Mode f4358k = PorterDuff.Mode.SRC_IN;

    public C1588c(ColorStateList colorStateList, float f) {
        this.f4348a = f;
        this.f4353f = new Paint(5);
        mo4481a(colorStateList);
        this.f4354g = new RectF();
        this.f4355h = new Rect();
    }

    /* renamed from: c */
    private final PorterDuffColorFilter m4207c(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: a */
    public final void mo4481a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f4352e = colorStateList;
        this.f4353f.setColor(colorStateList.getColorForState(getState(), this.f4352e.getDefaultColor()));
    }

    /* renamed from: b */
    public final void mo4482b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f4354g.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f4355h.set(rect);
        if (this.f4350c) {
            float b = C1589d.m4211b(this.f4349b, this.f4348a, this.f4351d);
            this.f4355h.inset((int) Math.ceil((double) C1589d.m4210a(this.f4349b, this.f4348a, this.f4351d)), (int) Math.ceil((double) b));
            this.f4354g.set(this.f4355h);
        }
    }

    public final void draw(Canvas canvas) {
        Paint paint = this.f4353f;
        boolean z = false;
        if (this.f4356i != null && paint.getColorFilter() == null) {
            paint.setColorFilter(this.f4356i);
            z = true;
        }
        RectF rectF = this.f4354g;
        float f = this.f4348a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter((ColorFilter) null);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f4355h, this.f4348a);
    }

    public final boolean isStateful() {
        ColorStateList colorStateList = this.f4357j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f4352e;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        mo4482b(rect);
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f4352e;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f4353f.getColor();
        if (z) {
            this.f4353f.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f4357j;
        if (colorStateList2 == null || (mode = this.f4358k) == null) {
            return z;
        }
        this.f4356i = m4207c(colorStateList2, mode);
        return true;
    }

    public final void setAlpha(int i) {
        this.f4353f.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f4353f.setColorFilter(colorFilter);
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.f4357j = colorStateList;
        this.f4356i = m4207c(colorStateList, this.f4358k);
        invalidateSelf();
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        this.f4358k = mode;
        this.f4356i = m4207c(this.f4357j, mode);
        invalidateSelf();
    }
}
