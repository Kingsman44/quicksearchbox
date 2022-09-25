package com.google.android.apps.search.googleapp.discover.p10191i.p10192a.p10194b;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import androidx.core.graphics.C1924a;
import androidx.core.p098j.C2043bi;

/* renamed from: com.google.android.apps.search.googleapp.discover.i.a.b.i */
/* compiled from: PG */
public final class C134367i extends View {

    /* renamed from: a */
    public static final Property f366004a = new C134366h(Float.class);

    /* renamed from: b */
    public int f366005b;

    /* renamed from: c */
    public int f366006c;

    /* renamed from: d */
    public int f366007d;

    /* renamed from: e */
    public int f366008e;

    /* renamed from: f */
    public int f366009f = 1;

    /* renamed from: g */
    public int f366010g = 0;

    /* renamed from: h */
    public float f366011h = 0.0f;

    /* renamed from: i */
    private final Paint f366012i;

    /* renamed from: j */
    private final RectF f366013j;

    /* renamed from: k */
    private boolean f366014k;

    public C134367i(Context context) {
        super(context, (AttributeSet) null, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C134365g.f366003a, 0, 0);
        this.f366005b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f366006c = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        this.f366007d = obtainStyledAttributes.getColor(1, -1);
        this.f366008e = obtainStyledAttributes.getColor(2, C1924a.m5189h(-1, 100));
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f366012i = paint;
        paint.setAntiAlias(true);
        this.f366013j = new RectF();
    }

    /* renamed from: b */
    private final void m218022b(Canvas canvas, int i, int i2, float f) {
        this.f366012i.setColor(i);
        this.f366013j.left = 0.0f;
        this.f366013j.right = 0.0f;
        this.f366013j.top = 0.0f;
        this.f366013j.bottom = (float) canvas.getHeight();
        int width = canvas.getWidth();
        int i3 = this.f366009f;
        int i4 = (width - ((i3 - 1) * this.f366005b)) / i3;
        int i5 = 0;
        float f2 = 0.0f;
        while (i5 < i2) {
            this.f366013j.left = f2;
            this.f366013j.left += i5 > 0 ? (float) this.f366005b : 0.0f;
            float f3 = i5 == this.f366010g ? f : 1.0f;
            RectF rectF = this.f366013j;
            rectF.right = rectF.left + ((float) Math.round(f3 * ((float) i4)));
            f2 = this.f366013j.right;
            if (this.f366014k) {
                float f4 = this.f366013j.left;
                this.f366013j.left = ((float) canvas.getWidth()) - this.f366013j.right;
                this.f366013j.right = ((float) canvas.getWidth()) - f4;
            }
            RectF rectF2 = this.f366013j;
            float f5 = (float) this.f366006c;
            canvas.drawRoundRect(rectF2, f5, f5, this.f366012i);
            i5++;
        }
    }

    /* renamed from: a */
    public final void mo111770a(float f) {
        if (this.f366011h != f) {
            this.f366011h = f;
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m218022b(canvas, this.f366008e, this.f366009f, 1.0f);
        m218022b(canvas, this.f366007d, Math.min(this.f366010g + 1, this.f366009f), this.f366011h);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (C2043bi.m5577f(this) != 1) {
            z2 = false;
        }
        this.f366014k = z2;
    }
}
