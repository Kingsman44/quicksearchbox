package com.google.android.libraries.componentview.components.elements.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.componentview.components.elements.views.b */
/* compiled from: PG */
public final class C20461b extends View {

    /* renamed from: a */
    public float f57549a;

    /* renamed from: b */
    private final Bitmap f57550b;

    /* renamed from: c */
    private final Rect f57551c;

    /* renamed from: d */
    private final RectF f57552d;

    /* renamed from: e */
    private final Matrix f57553e;

    /* renamed from: f */
    private int f57554f;

    /* renamed from: g */
    private int f57555g;

    /* renamed from: h */
    private final Paint f57556h;

    /* renamed from: i */
    private final Paint f57557i;

    /* renamed from: j */
    private final RectF f57558j = new RectF();

    /* renamed from: k */
    private final RectF f57559k = new RectF();

    /* renamed from: l */
    private final Matrix f57560l = new Matrix();

    /* renamed from: m */
    private final Matrix f57561m = new Matrix();

    /* renamed from: n */
    private int f57562n;

    /* renamed from: o */
    private int f57563o;

    /* renamed from: p */
    private int f57564p = 0;

    /* renamed from: q */
    private int f57565q = 0;

    public C20461b(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f57556h = paint;
        Paint paint2 = new Paint();
        this.f57557i = paint2;
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.ic_half_star);
        this.f57550b = decodeResource;
        Rect rect = new Rect(0, 0, decodeResource.getWidth(), decodeResource.getHeight());
        this.f57551c = rect;
        this.f57552d = new RectF(rect);
        Matrix matrix = new Matrix();
        this.f57553e = matrix;
        matrix.setScale(-1.0f, 1.0f);
        matrix.postTranslate((float) decodeResource.getWidth(), 0.0f);
        mo25404b(-1609445);
        mo25403a(-1118482);
        paint.setFilterBitmap(true);
        paint2.setFilterBitmap(true);
        setLayerType(2, (Paint) null);
    }

    /* renamed from: a */
    public final void mo25403a(int i) {
        if (this.f57555g != i) {
            this.f57555g = i;
            this.f57557i.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
            invalidate();
        }
    }

    /* renamed from: b */
    public final void mo25404b(int i) {
        if (this.f57554f != i) {
            this.f57554f = i;
            this.f57556h.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        Paint paint;
        Paint paint2;
        int i;
        if (this.f57562n > 0) {
            int f = C2043bi.m5577f(this);
            for (int i2 = 0; i2 < 5; i2++) {
                double d = (double) (this.f57549a - ((float) i2));
                if (d < 0.25d) {
                    paint = this.f57557i;
                } else {
                    paint = this.f57556h;
                }
                if (d < 0.75d) {
                    paint2 = this.f57557i;
                } else {
                    paint2 = this.f57556h;
                }
                if (f == 1) {
                    i = (5 - i2) - 1;
                    Paint paint3 = paint;
                    paint = paint2;
                    paint2 = paint3;
                } else {
                    i = i2;
                }
                int paddingLeft = getPaddingLeft();
                int i3 = this.f57565q;
                int i4 = this.f57562n;
                int i5 = paddingLeft + i3 + (i * (this.f57563o + i4));
                int paddingTop = getPaddingTop() + this.f57564p;
                float f2 = (float) paddingTop;
                float f3 = (float) ((i4 / 2) + i5);
                float f4 = (float) (paddingTop + this.f57562n);
                this.f57558j.set((float) i5, f2, f3, f4);
                canvas.drawBitmap(this.f57550b, this.f57551c, this.f57558j, paint);
                this.f57559k.set(f3, f2, (float) (i5 + i4), f4);
                this.f57561m.setRectToRect(this.f57552d, this.f57559k, Matrix.ScaleToFit.FILL);
                this.f57560l.setConcat(this.f57561m, this.f57553e);
                canvas.drawBitmap(this.f57550b, this.f57560l, paint2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (measuredHeight - getPaddingTop()) - getPaddingBottom();
        int i3 = (int) (((float) paddingTop) * 5.08f);
        int i4 = (int) (((float) paddingLeft) / 5.08f);
        if (paddingLeft > i3 && View.MeasureSpec.getMode(i) != 1073741824) {
            measuredWidth = getPaddingRight() + getPaddingLeft() + i3;
            paddingLeft = i3;
        }
        if (paddingTop > i4 && View.MeasureSpec.getMode(i2) != 1073741824) {
            measuredHeight = getPaddingTop() + i4 + getPaddingBottom();
            paddingTop = i4;
        }
        int min = Math.min(paddingLeft, i3);
        int min2 = Math.min(paddingTop, i4);
        this.f57565q = (paddingLeft - min) / 2;
        this.f57564p = (paddingTop - min2) / 2;
        this.f57562n = min2;
        this.f57563o = (int) (((float) min2) * 0.02f);
        setMeasuredDimension(measuredWidth, measuredHeight);
    }
}
