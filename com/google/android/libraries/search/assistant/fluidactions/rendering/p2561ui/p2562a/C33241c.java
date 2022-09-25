package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2562a;

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
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.a.c */
/* compiled from: PG */
public final class C33241c extends Drawable {

    /* renamed from: a */
    private static final C59071e f88875a = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.rendering.ui.a.c");

    /* renamed from: b */
    private static final Paint f88876b = new Paint();

    /* renamed from: c */
    private static final Rect f88877c = new Rect();

    /* renamed from: d */
    private static final char[] f88878d = new char[2];

    /* renamed from: e */
    private int f88879e;

    /* renamed from: f */
    private float f88880f;

    /* renamed from: g */
    private Bitmap f88881g = null;

    /* renamed from: h */
    private final Paint f88882h;

    /* renamed from: i */
    private final Resources f88883i;

    /* renamed from: j */
    private final String f88884j;

    /* renamed from: k */
    private final boolean f88885k;

    /* renamed from: l */
    private final int f88886l;

    /* renamed from: m */
    private final int f88887m;

    /* renamed from: n */
    private boolean f88888n = false;

    /* renamed from: o */
    private float f88889o = 1.0f;

    public C33241c(Context context, String str, Resources resources, int i, boolean z, boolean z2, float f, boolean z3) {
        this.f88883i = resources;
        this.f88884j = str;
        this.f88885k = z;
        if (!m61664b(str)) {
            this.f88881g = BitmapFactory.decodeResource(resources, R.drawable.quantum_ic_person_white_48);
        }
        Paint paint = new Paint();
        this.f88882h = paint;
        paint.setFilterBitmap(true);
        paint.setDither(true);
        if (this.f88879e == 0) {
            this.f88879e = C19391a.m36980a(context, R.attr.colorOnSecondary);
            this.f88880f = resources.getFraction(R.fraction.fa_letter_tile_drawable_letter_to_tile_ratio, 1, 1);
            Paint paint2 = f88876b;
            paint2.setTypeface(Typeface.create("google_sans_text", 0));
            paint2.setTextAlign(Paint.Align.CENTER);
            paint2.setAntiAlias(true);
        }
        this.f88886l = z2 ? this.f88879e : i;
        this.f88887m = !z2 ? this.f88879e : i;
        this.f88889o = f;
        this.f88888n = z3;
    }

    /* renamed from: a */
    public static C33241c m61663a(Context context, String str, String str2) {
        Resources resources = context.getResources();
        Resources resources2 = context.getResources();
        return new C33241c(context, str, resources, C33240b.m61662a(resources2.obtainTypedArray(R.array.fa_letter_tile_drawable_background_colors), resources2.getInteger(R.integer.fa_letter_tile_drawable_color_length), C19391a.m36980a(context, R.attr.colorSecondary), str2), true, false, 1.0f, false);
    }

    /* renamed from: b */
    private final boolean m61664b(String str) {
        if (C58837ba.m90859h(str)) {
            return false;
        }
        if (Character.isLetter(str.charAt(0)) || (this.f88888n && Character.isDigit(str.charAt(0)))) {
            return true;
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        int i;
        if (!getBounds().isEmpty()) {
            Paint paint = f88876b;
            paint.setColor(this.f88886l);
            paint.setAlpha(this.f88882h.getAlpha());
            paint.setColorFilter(this.f88882h.getColorFilter());
            Rect bounds = getBounds();
            int min = Math.min(bounds.width(), bounds.height());
            if (this.f88885k) {
                canvas.drawCircle((float) bounds.centerX(), (float) bounds.centerY(), (float) (min / 2), paint);
            } else {
                canvas.drawRect(bounds, paint);
            }
            if (this.f88888n) {
                String str = this.f88884j;
                i = Math.min(2, str == null ? 1 : str.length());
            } else {
                i = 1;
            }
            if (m61664b(this.f88884j)) {
                for (int i2 = 0; i2 < i; i2++) {
                    char[] cArr = f88878d;
                    String str2 = this.f88884j;
                    str2.getClass();
                    cArr[i2] = Character.toUpperCase(str2.charAt(i2));
                }
                float f = this.f88880f;
                float f2 = this.f88889o;
                Paint paint2 = f88876b;
                paint2.setTextSize((float) ((int) (f * ((float) min) * f2)));
                char[] cArr2 = f88878d;
                Rect rect = f88877c;
                paint2.getTextBounds(cArr2, 0, 1, rect);
                paint2.setColor(this.f88887m);
                canvas.drawText(cArr2, 0, i, (float) bounds.centerX(), (float) (bounds.centerY() + (rect.height() / 2)), paint2);
                return;
            }
            Bitmap bitmap = this.f88881g;
            if (bitmap != null) {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                Rect copyBounds = copyBounds();
                int min2 = Math.min(copyBounds.width(), copyBounds.height()) / 2;
                copyBounds.set(copyBounds.centerX() - min2, copyBounds.centerY() - min2, copyBounds.centerX() + min2, copyBounds.centerY() + min2);
                Rect rect2 = f88877c;
                rect2.set(0, 0, width, height);
                canvas.drawBitmap(bitmap, rect2, copyBounds, this.f88882h);
                return;
            }
            ((C59052c) ((C59052c) f88875a.mo56226d()).mo56372aa(51162)).mo56386p("#drawLetterTile failed, defaultPersonAvatar is null");
        }
    }

    public final int getOpacity() {
        return -1;
    }

    public final void setAlpha(int i) {
        this.f88882h.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f88882h.setColorFilter(colorFilter);
    }
}
