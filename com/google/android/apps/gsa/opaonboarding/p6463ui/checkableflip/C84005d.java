package com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.apps.gsa.shared.util.C90772bp;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.apps.gsa.opaonboarding.ui.checkableflip.d */
/* compiled from: PG */
public final class C84005d extends Drawable {

    /* renamed from: a */
    public final Paint f228840a;

    /* renamed from: b */
    private final Bitmap f228841b;

    /* renamed from: c */
    private boolean f228842c;

    /* renamed from: d */
    private float f228843d;

    /* renamed from: e */
    private float f228844e;

    /* renamed from: f */
    private final Matrix f228845f = new Matrix();

    public C84005d(int i, Drawable drawable) {
        this.f228841b = C90772bp.m148294b(drawable);
        Paint paint = new Paint();
        this.f228840a = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setColor(i);
        if (paint.getAlpha() == 0) {
            this.f228842c = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo77455a(float f) {
        float f2 = this.f228844e;
        this.f228844e = f;
        if (f2 != f) {
            invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo77456b(float f) {
        float f2 = this.f228843d;
        this.f228843d = f;
        if (f2 != f) {
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        int i;
        Rect bounds = getBounds();
        if (isVisible() && !bounds.isEmpty()) {
            if (!this.f228842c) {
                canvas.drawCircle((float) bounds.centerX(), (float) bounds.centerY(), (float) (bounds.width() / 2), this.f228840a);
            }
            this.f228845f.reset();
            Bitmap bitmap = this.f228841b;
            int i2 = 0;
            int width = bitmap != null ? bitmap.getWidth() : 0;
            Bitmap bitmap2 = this.f228841b;
            if (bitmap2 != null) {
                i2 = bitmap2.getHeight();
            }
            Matrix matrix = this.f228845f;
            float f = this.f228843d;
            int i3 = width / 2;
            int i4 = i2 / 2;
            matrix.setScale(f, f, (float) i3, (float) i4);
            this.f228845f.postTranslate((float) (bounds.centerX() - i3), (float) (bounds.centerY() - i4));
            if (this.f228842c) {
                i = PrivateKeyType.INVALID;
            } else {
                i = this.f228840a.getAlpha();
            }
            this.f228840a.setAlpha((int) (((float) i) * this.f228844e));
            Bitmap bitmap3 = this.f228841b;
            if (bitmap3 != null) {
                canvas.drawBitmap(bitmap3, this.f228845f, this.f228840a);
            }
            this.f228840a.setAlpha(i);
        }
    }

    public final int getOpacity() {
        return -1;
    }

    public final void setAlpha(int i) {
        this.f228840a.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f228840a.setColorFilter(colorFilter);
    }
}
