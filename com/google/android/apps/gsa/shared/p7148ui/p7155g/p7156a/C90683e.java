package com.google.android.apps.gsa.shared.p7148ui.p7155g.p7156a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import androidx.core.content.C1878d;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58837ba;

/* renamed from: com.google.android.apps.gsa.shared.ui.g.a.e */
/* compiled from: PG */
public final class C90683e extends Drawable {

    /* renamed from: a */
    private static final Paint f253587a = new Paint();

    /* renamed from: b */
    private static final Rect f253588b = new Rect();

    /* renamed from: c */
    private static final char[] f253589c = new char[2];

    /* renamed from: d */
    private static int f253590d;

    /* renamed from: e */
    private static float f253591e;

    /* renamed from: f */
    private static Bitmap f253592f;

    /* renamed from: g */
    private final Paint f253593g;

    /* renamed from: h */
    private final Resources f253594h;

    /* renamed from: i */
    private final String f253595i;

    /* renamed from: j */
    private final boolean f253596j;

    /* renamed from: k */
    private final int f253597k;

    /* renamed from: l */
    private final int f253598l;

    /* renamed from: m */
    private float f253599m = 1.0f;

    public C90683e(Context context, Resources resources, String str, int i) {
        this.f253594h = resources;
        this.f253595i = str;
        this.f253596j = true;
        if (f253592f == null && !m148051a(str)) {
            f253592f = BitmapFactory.decodeResource(resources, R.drawable.quantum_ic_person_white_48);
        }
        Paint paint = new Paint();
        this.f253593g = paint;
        paint.setFilterBitmap(true);
        paint.setDither(true);
        if (f253590d == 0) {
            f253590d = C1878d.m5128a(context, R.color.letter_tile_font_color);
            f253591e = resources.getFraction(R.dimen.letter_to_tile_ratio, 1, 1);
            Paint paint2 = f253587a;
            paint2.setTypeface(Typeface.create("sans-serif", 0));
            paint2.setTextAlign(Paint.Align.CENTER);
            paint2.setAntiAlias(true);
        }
        this.f253597k = i;
        this.f253598l = f253590d;
        this.f253599m = 1.0f;
    }

    /* renamed from: a */
    private static final boolean m148051a(String str) {
        if (!C58837ba.m90859h(str) && Character.isLetter(str.charAt(0))) {
            return true;
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty()) {
            Paint paint = f253587a;
            paint.setColor(this.f253597k);
            paint.setAlpha(paint.getAlpha());
            paint.setColorFilter(paint.getColorFilter());
            Rect bounds = getBounds();
            int min = Math.min(bounds.width(), bounds.height());
            if (this.f253596j) {
                canvas.drawCircle((float) bounds.centerX(), (float) bounds.centerY(), (float) (min / 2), paint);
            } else {
                canvas.drawRect(bounds, paint);
            }
            if (m148051a(this.f253595i)) {
                for (int i = 0; i <= 0; i++) {
                    char[] cArr = f253589c;
                    String str = this.f253595i;
                    str.getClass();
                    cArr[i] = Character.toUpperCase(str.charAt(i));
                }
                float f = f253591e;
                float f2 = this.f253599m;
                Paint paint2 = f253587a;
                paint2.setTextSize((float) ((int) (f * ((float) min) * f2)));
                char[] cArr2 = f253589c;
                Rect rect = f253588b;
                paint2.getTextBounds(cArr2, 0, 1, rect);
                paint2.setColor(this.f253598l);
                canvas.drawText(cArr2, 0, 1, (float) bounds.centerX(), (float) (bounds.centerY() + (rect.height() / 2)), paint2);
                return;
            }
            Bitmap bitmap = f253592f;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            Rect copyBounds = copyBounds();
            int min2 = Math.min(copyBounds.width(), copyBounds.height()) / 2;
            copyBounds.set(copyBounds.centerX() - min2, copyBounds.centerY() - min2, copyBounds.centerX() + min2, copyBounds.centerY() + min2);
            Rect rect2 = f253588b;
            rect2.set(0, 0, width, height);
            canvas.drawBitmap(bitmap, rect2, copyBounds, this.f253593g);
        }
    }

    public final int getOpacity() {
        return -1;
    }

    public final void setAlpha(int i) {
        this.f253593g.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f253593g.setColorFilter(colorFilter);
    }
}
