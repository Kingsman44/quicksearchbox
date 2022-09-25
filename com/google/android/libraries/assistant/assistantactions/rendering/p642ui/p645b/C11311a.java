package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.p645b;

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
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.rendering.p641d.C11307e;
import com.google.common.base.C58837ba;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.b.a */
/* compiled from: PG */
public final class C11311a extends Drawable {

    /* renamed from: a */
    private static final Paint f36756a = new Paint();

    /* renamed from: b */
    private static final Rect f36757b = new Rect();

    /* renamed from: c */
    private static final char[] f36758c = new char[2];

    /* renamed from: d */
    private static Bitmap f36759d;

    /* renamed from: e */
    private int f36760e;

    /* renamed from: f */
    private float f36761f;

    /* renamed from: g */
    private final Paint f36762g;

    /* renamed from: h */
    private final Resources f36763h;

    /* renamed from: i */
    private final String f36764i;

    /* renamed from: j */
    private final boolean f36765j;

    /* renamed from: k */
    private final int f36766k;

    /* renamed from: l */
    private final int f36767l;

    /* renamed from: m */
    private float f36768m = 1.0f;

    public C11311a(Context context, String str, String str2) {
        Resources resources = context.getResources();
        Resources resources2 = context.getResources();
        int a = C11312b.m26923a(resources2.obtainTypedArray(R.array.letter_tile_colors), resources2.getInteger(R.integer.letter_tile_colors_length), C11307e.m26908a(context, R.attr.fluid_actions_letter_tile_color_picker_default_color), str2);
        this.f36763h = resources;
        this.f36764i = str;
        this.f36765j = true;
        if (f36759d == null && !m26922a(str)) {
            f36759d = BitmapFactory.decodeResource(resources, R.drawable.quantum_ic_person_white_48);
        }
        Paint paint = new Paint();
        this.f36762g = paint;
        paint.setFilterBitmap(true);
        paint.setDither(true);
        if (this.f36760e == 0) {
            this.f36760e = C11307e.m26908a(context, R.attr.fluid_actions_letter_tile_font_color);
            this.f36761f = resources.getFraction(R.dimen.letter_to_tile_ratio, 1, 1);
            Paint paint2 = f36756a;
            paint2.setTypeface(Typeface.create("google_sans_text", 0));
            paint2.setTextAlign(Paint.Align.CENTER);
            paint2.setAntiAlias(true);
        }
        this.f36766k = a;
        this.f36767l = this.f36760e;
        this.f36768m = 1.0f;
    }

    /* renamed from: a */
    private static final boolean m26922a(String str) {
        if (!C58837ba.m90859h(str) && Character.isLetter(str.charAt(0))) {
            return true;
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty()) {
            Paint paint = f36756a;
            paint.setColor(this.f36766k);
            paint.setAlpha(this.f36762g.getAlpha());
            paint.setColorFilter(this.f36762g.getColorFilter());
            Rect bounds = getBounds();
            int min = Math.min(bounds.width(), bounds.height());
            if (this.f36765j) {
                canvas.drawCircle((float) bounds.centerX(), (float) bounds.centerY(), (float) (min / 2), paint);
            } else {
                canvas.drawRect(bounds, paint);
            }
            if (m26922a(this.f36764i)) {
                for (int i = 0; i <= 0; i++) {
                    char[] cArr = f36758c;
                    String str = this.f36764i;
                    str.getClass();
                    cArr[i] = Character.toUpperCase(str.charAt(i));
                }
                float f = this.f36761f;
                float f2 = this.f36768m;
                Paint paint2 = f36756a;
                paint2.setTextSize((float) ((int) (f * ((float) min) * f2)));
                char[] cArr2 = f36758c;
                Rect rect = f36757b;
                paint2.getTextBounds(cArr2, 0, 1, rect);
                paint2.setColor(this.f36767l);
                canvas.drawText(cArr2, 0, 1, (float) bounds.centerX(), (float) (bounds.centerY() + (rect.height() / 2)), paint2);
                return;
            }
            Bitmap bitmap = f36759d;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            Rect copyBounds = copyBounds();
            int min2 = Math.min(copyBounds.width(), copyBounds.height()) / 2;
            copyBounds.set(copyBounds.centerX() - min2, copyBounds.centerY() - min2, copyBounds.centerX() + min2, copyBounds.centerY() + min2);
            Rect rect2 = f36757b;
            rect2.set(0, 0, width, height);
            canvas.drawBitmap(bitmap, rect2, copyBounds, this.f36762g);
        }
    }

    public final int getOpacity() {
        return -1;
    }

    public final void setAlpha(int i) {
        this.f36762g.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f36762g.setColorFilter(colorFilter);
    }
}
