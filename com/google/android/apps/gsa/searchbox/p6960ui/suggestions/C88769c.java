package com.google.android.apps.gsa.searchbox.p6960ui.suggestions;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.c */
/* compiled from: PG */
public final class C88769c extends Drawable {

    /* renamed from: a */
    private final Drawable f240181a;

    /* renamed from: b */
    private final Paint f240182b;

    /* renamed from: c */
    private final int f240183c;

    /* renamed from: d */
    private final int f240184d;

    /* renamed from: e */
    private final int f240185e;

    /* renamed from: f */
    private final int f240186f = 1;

    public C88769c(Resources resources, int i, int i2, int i3, int i4) {
        this.f240183c = i2;
        this.f240184d = i3;
        this.f240185e = resources.getDimensionPixelSize(R.dimen.search_plate_rounded_corner_radius);
        if (i != 0) {
            Drawable drawable = resources.getDrawable(i);
            this.f240181a = drawable;
            drawable.mutate();
            m143956a(getBounds());
        } else {
            this.f240181a = null;
        }
        Paint paint = new Paint();
        this.f240182b = paint;
        paint.setColor(resources.getColor(i4));
        paint.setStrokeWidth((float) resources.getDimensionPixelSize(R.dimen.suggestion_divider_height));
    }

    /* renamed from: a */
    private final void m143956a(Rect rect) {
        Drawable drawable = this.f240181a;
        if (drawable != null) {
            drawable.setBounds(rect.left, rect.top - this.f240185e, rect.right, rect.bottom);
        }
    }

    public final void draw(Canvas canvas) {
        int i;
        int i2;
        Rect bounds = getBounds();
        int i3 = (this.f240186f == 1 ? bounds.top : bounds.bottom) + this.f240183c;
        if (this.f240181a != null) {
            canvas.save();
            int i4 = bounds.left;
            if (this.f240186f == 1) {
                i2 = i3;
            } else {
                i2 = bounds.top;
            }
            canvas.clipRect(i4, i2, bounds.right, bounds.bottom);
            this.f240181a.draw(canvas);
            canvas.restore();
        }
        if (this.f240181a != null) {
            i = this.f240183c;
        } else {
            i = this.f240184d;
        }
        float f = (float) i3;
        canvas.drawLine((float) (bounds.left + i), f, (float) (bounds.right - i), f, this.f240182b);
    }

    public final int getAlpha() {
        Drawable drawable = this.f240181a;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return 0;
    }

    public final int getOpacity() {
        Drawable drawable = this.f240181a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -1;
    }

    public final boolean getPadding(Rect rect) {
        Drawable drawable = this.f240181a;
        return drawable != null && drawable.getPadding(rect);
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m143956a(rect);
    }

    public final void setAlpha(int i) {
        Drawable drawable = this.f240181a;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f240181a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
