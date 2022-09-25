package com.google.android.libraries.lens.view.gallery.p2112e;

import android.animation.ArgbEvaluator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import com.google.android.googlequicksearchbox.R;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.libraries.lens.view.gallery.e.a */
/* compiled from: PG */
public final class C26408a extends Drawable {

    /* renamed from: a */
    public int f71846a;

    /* renamed from: b */
    public float f71847b;

    /* renamed from: c */
    public boolean f71848c = true;

    /* renamed from: d */
    private final Paint f71849d;

    /* renamed from: e */
    private final Paint f71850e;

    /* renamed from: f */
    private final ArgbEvaluator f71851f = new ArgbEvaluator();

    /* renamed from: g */
    private final int f71852g;

    /* renamed from: h */
    private final int f71853h;

    /* renamed from: i */
    private final VectorDrawable f71854i;

    /* renamed from: j */
    private final VectorDrawable f71855j;

    /* renamed from: k */
    private final int f71856k;

    /* renamed from: l */
    private final Rect f71857l = new Rect();

    /* renamed from: m */
    private final int f71858m;

    /* renamed from: n */
    private final int f71859n;

    /* renamed from: o */
    private final boolean f71860o;

    /* renamed from: p */
    private int f71861p;

    public C26408a(Resources resources, boolean z) {
        Paint paint = new Paint();
        this.f71849d = paint;
        Paint paint2 = new Paint();
        this.f71850e = paint2;
        this.f71860o = z;
        int color = resources.getColor(R.color.filter_selector_color);
        this.f71852g = color;
        int color2 = resources.getColor(R.color.lens_gallery_background);
        this.f71853h = color2;
        paint.setColor(color);
        paint2.setColor(color2);
        paint2.setAlpha(PrivateKeyType.INVALID);
        VectorDrawable vectorDrawable = (VectorDrawable) resources.getDrawable(R.drawable.filter_lvf_camera_view_left_corner);
        this.f71854i = vectorDrawable;
        vectorDrawable.setTint(paint2.getColor());
        VectorDrawable vectorDrawable2 = (VectorDrawable) resources.getDrawable(R.drawable.filter_lvf_camera_view_right_corner);
        this.f71855j = vectorDrawable2;
        vectorDrawable2.setTint(paint2.getColor());
        this.f71856k = resources.getDimensionPixelSize(R.dimen.lvf_camera_view_bottom_corner_radius);
        this.f71859n = resources.getDimensionPixelSize(R.dimen.lens_overlay_scrim_height);
        this.f71858m = resources.getDimensionPixelSize(R.dimen.lens_gallery_camera_view_padding_bottom);
    }

    /* renamed from: a */
    public final void mo31607a(int i) {
        int i2 = this.f71858m;
        this.f71861p = i <= i2 ? 0 : i - i2;
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        int i;
        Rect bounds = getBounds();
        int i2 = bounds.top;
        int i3 = this.f71861p;
        if (i3 > 0) {
            i2 += (int) (((float) i3) + this.f71847b);
        }
        float f = (float) i2;
        canvas.drawRect((float) bounds.left, f, (float) bounds.right, (float) bounds.bottom, this.f71850e);
        int i4 = this.f71861p;
        if (i4 > 0 && (i = this.f71846a) > 0) {
            if (this.f71848c) {
                float f2 = this.f71847b;
                float f3 = 0.0f;
                if (f2 > 0.0f) {
                    float f4 = (float) i;
                    if (f2 <= f4) {
                        f3 = 1.0f - (f2 / f4);
                    }
                    this.f71849d.setColor(this.f71852g);
                    this.f71849d.setAlpha((int) (f3 * 204.0f));
                } else {
                    int i5 = this.f71859n;
                    if (i4 < i5) {
                        this.f71849d.setColor(this.f71853h);
                        this.f71849d.setAlpha(PrivateKeyType.INVALID);
                    } else if (i4 > i - i5) {
                        this.f71849d.setColor(this.f71852g);
                        this.f71849d.setAlpha(204);
                    } else {
                        float f5 = (float) i5;
                        float f6 = ((float) (i4 - i5)) / (((float) i) - (f5 + f5));
                        this.f71849d.setColor(((Integer) this.f71851f.evaluate(f6, Integer.valueOf(this.f71853h), Integer.valueOf(this.f71852g))).intValue());
                        this.f71849d.setAlpha((int) (((1.0f - f6) * 51.0f) + 204.0f));
                    }
                }
                canvas.drawRect((float) bounds.left, 0.0f, (float) bounds.right, f, this.f71849d);
            }
            if (this.f71860o) {
                this.f71857l.top = i2 - this.f71856k;
                this.f71857l.bottom = i2;
                this.f71857l.left = bounds.left;
                this.f71857l.right = bounds.left + this.f71856k;
                this.f71854i.setBounds(this.f71857l);
                this.f71854i.draw(canvas);
                this.f71857l.left = bounds.right - this.f71856k;
                this.f71857l.right = bounds.right;
                this.f71855j.setBounds(this.f71857l);
                this.f71855j.draw(canvas);
            }
        }
    }

    public final int getOpacity() {
        return -1;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
