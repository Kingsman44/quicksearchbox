package com.google.android.material.p3512i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import android.util.Log;
import androidx.core.content.p091b.C1874w;

/* renamed from: com.google.android.material.i.h */
/* compiled from: PG */
public final class C44698h {

    /* renamed from: a */
    public final ColorStateList f116494a;

    /* renamed from: b */
    public final String f116495b;

    /* renamed from: c */
    public final int f116496c;

    /* renamed from: d */
    public final int f116497d;

    /* renamed from: e */
    public final float f116498e;

    /* renamed from: f */
    public final float f116499f;

    /* renamed from: g */
    public final float f116500g;

    /* renamed from: h */
    public final boolean f116501h;

    /* renamed from: i */
    public final float f116502i;

    /* renamed from: j */
    public final ColorStateList f116503j;

    /* renamed from: k */
    public float f116504k;

    /* renamed from: l */
    public boolean f116505l = false;

    /* renamed from: m */
    public Typeface f116506m;

    /* renamed from: n */
    private final int f116507n;

    public C44698h(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C44695e.f116487b);
        this.f116504k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f116503j = C44694d.m79230b(context, obtainStyledAttributes, 3);
        C44694d.m79230b(context, obtainStyledAttributes, 4);
        C44694d.m79230b(context, obtainStyledAttributes, 5);
        this.f116496c = obtainStyledAttributes.getInt(2, 0);
        this.f116497d = obtainStyledAttributes.getInt(1, 1);
        int i2 = true != obtainStyledAttributes.hasValue(12) ? 10 : 12;
        this.f116507n = obtainStyledAttributes.getResourceId(i2, 0);
        this.f116495b = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.f116494a = C44694d.m79230b(context, obtainStyledAttributes, 6);
        this.f116498e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f116499f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f116500g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, C44695e.f116486a);
        this.f116501h = obtainStyledAttributes2.hasValue(0);
        this.f116502i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    /* renamed from: g */
    private final boolean m79239g(Context context) {
        int i = this.f116507n;
        return (i != 0 ? C1874w.m5106c(context, i) : null) != null;
    }

    /* renamed from: a */
    public final Typeface mo47992a(Context context) {
        if (this.f116505l) {
            return this.f116506m;
        }
        if (!context.isRestricted()) {
            try {
                Typeface d = C1874w.m5107d(context, this.f116507n);
                this.f116506m = d;
                if (d != null) {
                    this.f116506m = Typeface.create(d, this.f116496c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font ".concat(String.valueOf(this.f116495b)), e);
            }
        }
        mo47993b();
        this.f116505l = true;
        return this.f116506m;
    }

    /* renamed from: b */
    public final void mo47993b() {
        Typeface typeface;
        String str;
        if (this.f116506m == null && (str = this.f116495b) != null) {
            this.f116506m = Typeface.create(str, this.f116496c);
        }
        if (this.f116506m == null) {
            int i = this.f116497d;
            if (i == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i == 2) {
                typeface = Typeface.SERIF;
            } else if (i != 3) {
                this.f116506m = Typeface.DEFAULT;
                this.f116506m = Typeface.create(this.f116506m, this.f116496c);
            } else {
                typeface = Typeface.MONOSPACE;
            }
            this.f116506m = typeface;
            this.f116506m = Typeface.create(this.f116506m, this.f116496c);
        }
    }

    /* renamed from: c */
    public final void mo47994c(Context context, C44699i iVar) {
        if (m79239g(context)) {
            mo47992a(context);
        } else {
            mo47993b();
        }
        int i = this.f116507n;
        if (i == 0) {
            this.f116505l = true;
            i = 0;
        }
        if (!this.f116505l) {
            try {
                C1874w.m5110g(context, i, new C44696f(this, iVar), (Handler) null);
            } catch (Resources.NotFoundException unused) {
                this.f116505l = true;
                iVar.mo47737a(1);
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font ".concat(String.valueOf(this.f116495b)), e);
                this.f116505l = true;
                iVar.mo47737a(-3);
            }
        } else {
            iVar.mo47738b(this.f116506m, true);
        }
    }

    /* renamed from: d */
    public final void mo47995d(Context context, TextPaint textPaint, C44699i iVar) {
        mo47996e(context, textPaint, iVar);
        ColorStateList colorStateList = this.f116503j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, this.f116503j.getDefaultColor()) : -16777216);
        float f = this.f116500g;
        float f2 = this.f116498e;
        float f3 = this.f116499f;
        ColorStateList colorStateList2 = this.f116494a;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, this.f116494a.getDefaultColor()) : 0);
    }

    /* renamed from: e */
    public final void mo47996e(Context context, TextPaint textPaint, C44699i iVar) {
        if (m79239g(context)) {
            mo47997f(context, textPaint, mo47992a(context));
            return;
        }
        mo47993b();
        mo47997f(context, textPaint, this.f116506m);
        mo47994c(context, new C44697g(this, context, textPaint, iVar));
    }

    /* renamed from: f */
    public final void mo47997f(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface a = C44700j.m79248a(context.getResources().getConfiguration(), typeface);
        if (a != null) {
            typeface = a;
        }
        textPaint.setTypeface(typeface);
        int style = this.f116496c & (typeface.getStyle() ^ -1);
        boolean z = true;
        if (1 != (style & 1)) {
            z = false;
        }
        textPaint.setFakeBoldText(z);
        textPaint.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f116504k);
        if (this.f116501h) {
            textPaint.setLetterSpacing(this.f116502i);
        }
    }
}
