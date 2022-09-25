package com.google.android.libraries.componentview.components.p1693e.p1695b;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
import androidx.viewpager.widget.C4277j;
import androidx.viewpager.widget.ViewPager;
import com.google.android.libraries.componentview.p1697d.C20482m;

/* renamed from: com.google.android.libraries.componentview.components.e.b.a */
/* compiled from: PG */
public final class C20355a extends View implements C4277j {

    /* renamed from: b */
    private static final int f57230b = Color.argb(41, 0, 0, 0);

    /* renamed from: c */
    private static final int f57231c = Color.argb(102, 0, 0, 0);

    /* renamed from: a */
    public ViewPager f57232a;

    /* renamed from: d */
    private final float f57233d;

    /* renamed from: e */
    private final float f57234e;

    /* renamed from: f */
    private final Paint f57235f;

    /* renamed from: g */
    private final Paint f57236g;

    public C20355a(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f57235f = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(f57231c);
        Paint paint2 = new Paint();
        this.f57236g = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint2.setColor(f57230b);
        this.f57233d = (float) ((int) (C20482m.m38433a(context) * 6.0f));
        this.f57234e = (float) ((int) (C20482m.m38433a(context) * 10.0f));
    }

    /* renamed from: b */
    private final int m38265b() {
        ViewPager viewPager = this.f57232a;
        if (viewPager != null) {
            return viewPager.f13818b.mo9175k();
        }
        return 0;
    }

    /* renamed from: d */
    private final int m38266d() {
        return (this.f57232a == null ? 0 : (int) this.f57233d) + getPaddingTop() + getPaddingBottom();
    }

    /* renamed from: f */
    private final int m38267f() {
        return m38268g() + getPaddingLeft() + getPaddingRight();
    }

    /* renamed from: g */
    private final int m38268g() {
        if (this.f57232a == null) {
            return 0;
        }
        int b = m38265b();
        return (int) ((this.f57233d * ((float) b)) + (this.f57234e * ((float) (b - 1))));
    }

    /* renamed from: a */
    public final void mo9182a(int i) {
    }

    /* renamed from: c */
    public final void mo9183c(int i, float f, int i2) {
    }

    /* renamed from: e */
    public final void mo9184e(int i) {
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        Paint paint;
        super.onDraw(canvas);
        float measuredWidth = (float) (getMeasuredWidth() - (getPaddingLeft() + getPaddingRight()));
        float measuredHeight = (float) (getMeasuredHeight() - (getPaddingTop() + getPaddingBottom()));
        if (measuredWidth > 0.0f && measuredHeight > 0.0f) {
            int b = m38265b();
            ViewPager viewPager = this.f57232a;
            int i = viewPager != null ? viewPager.f13819c : -1;
            float f = this.f57233d / 2.0f;
            float paddingLeft = ((((float) getPaddingLeft()) + (measuredWidth / 2.0f)) - ((float) (m38268g() / 2))) + f;
            float paddingTop = ((float) getPaddingTop()) + (measuredHeight / 2.0f);
            for (int i2 = 0; i2 < b; i2++) {
                if (i == i2) {
                    paint = this.f57235f;
                } else {
                    paint = this.f57236g;
                }
                canvas.drawCircle(paddingLeft, paddingTop, f, paint);
                paddingLeft += this.f57233d + this.f57234e;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(View.MeasureSpec.getSize(i), Math.max(m38267f(), getSuggestedMinimumWidth()));
        } else if (mode != 0) {
            i3 = mode != 1073741824 ? getDefaultSize(getSuggestedMinimumWidth(), i) : View.MeasureSpec.getSize(i);
        } else {
            i3 = Math.max(m38267f(), getSuggestedMinimumWidth());
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE) {
            i4 = Math.min(View.MeasureSpec.getSize(i2), Math.max(m38266d(), getSuggestedMinimumHeight()));
        } else if (mode2 != 0) {
            i4 = mode2 != 1073741824 ? getDefaultSize(getSuggestedMinimumHeight(), i2) : View.MeasureSpec.getSize(i2);
        } else {
            i4 = Math.max(m38266d(), getSuggestedMinimumHeight());
        }
        setMeasuredDimension(i3, i4);
    }
}
