package com.google.android.apps.gsa.staticplugins.actionsui;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.an */
/* compiled from: PG */
public final class C93447an extends Drawable {

    /* renamed from: a */
    private static final Paint f260813a = new Paint();

    /* renamed from: b */
    private static final Rect f260814b = new Rect();

    /* renamed from: c */
    private static final char[] f260815c = new char[1];

    /* renamed from: d */
    private static int f260816d;

    /* renamed from: e */
    private static float f260817e;

    /* renamed from: f */
    private static Bitmap f260818f;

    /* renamed from: g */
    private final Paint f260819g;

    /* renamed from: h */
    private final Resources f260820h;

    /* renamed from: i */
    private final String f260821i;

    /* renamed from: j */
    private final boolean f260822j;

    /* renamed from: k */
    private final int f260823k;

    /* renamed from: l */
    private final int f260824l;

    public C93447an(Resources resources, String str, int i, boolean z, boolean z2) {
        this.f260820h = resources;
        this.f260821i = str;
        this.f260822j = z;
        if (f260818f == null && !m153827a(str)) {
            f260818f = BitmapFactory.decodeResource(resources, R.drawable.ic_person_default_avatar_big);
        }
        Paint paint = new Paint();
        this.f260819g = paint;
        paint.setFilterBitmap(true);
        paint.setDither(true);
        if (f260816d == 0) {
            f260816d = resources.getColor(R.color.letter_tile_font_color);
            f260817e = resources.getFraction(R.dimen.letter_to_tile_ratio, 1, 1);
            Paint paint2 = f260813a;
            paint2.setTypeface(Typeface.create("sans-serif-thin", 0));
            paint2.setTextAlign(Paint.Align.CENTER);
            paint2.setAntiAlias(true);
        }
        this.f260823k = z2 ? f260816d : i;
        this.f260824l = !z2 ? f260816d : i;
    }

    /* renamed from: a */
    private static final boolean m153827a(String str) {
        if (str != null && !str.isEmpty()) {
            char charAt = str.charAt(0);
            if (charAt < 'A' || charAt > 'Z') {
                return charAt >= 'a' && charAt <= 'z';
            }
            return true;
        }
    }

    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty()) {
            Paint paint = f260813a;
            paint.setColor(this.f260823k);
            paint.setAlpha(this.f260819g.getAlpha());
            paint.setColorFilter(this.f260819g.getColorFilter());
            Rect bounds = getBounds();
            int min = Math.min(bounds.width(), bounds.height());
            if (this.f260822j) {
                canvas.drawCircle((float) bounds.centerX(), (float) bounds.centerY(), (float) (min / 2), paint);
            } else {
                canvas.drawRect(bounds, paint);
            }
            if (m153827a(this.f260821i)) {
                char[] cArr = f260815c;
                cArr[0] = Character.toUpperCase(this.f260821i.charAt(0));
                paint.setTextSize(f260817e * ((float) min));
                Rect rect = f260814b;
                paint.getTextBounds(cArr, 0, 1, rect);
                paint.setColor(this.f260824l);
                canvas.drawText(cArr, 0, 1, (float) bounds.centerX(), (float) (bounds.centerY() + (rect.height() / 2)), paint);
                return;
            }
            Bitmap bitmap = f260818f;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            Rect copyBounds = copyBounds();
            int min2 = (int) ((((float) Math.min(copyBounds.width(), copyBounds.height())) * 0.4f) / 2.0f);
            copyBounds.set(copyBounds.centerX() - min2, copyBounds.centerY() - min2, copyBounds.centerX() + min2, copyBounds.centerY() + min2);
            Rect rect2 = f260814b;
            rect2.set(0, 0, width, height);
            canvas.drawBitmap(bitmap, rect2, copyBounds, this.f260819g);
        }
    }

    public final int getOpacity() {
        return -1;
    }

    public final void setAlpha(int i) {
        this.f260819g.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f260819g.setColorFilter(colorFilter);
    }
}
