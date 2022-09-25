package com.google.android.libraries.lens.common.text.selection.p2009ui.p2011b;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.common.text.selection.p2008c.C24152b;

/* renamed from: com.google.android.libraries.lens.common.text.selection.ui.b.f */
/* compiled from: PG */
public final class C24161f extends View {

    /* renamed from: a */
    public float f66002a;

    /* renamed from: b */
    public float f66003b;

    /* renamed from: c */
    public float f66004c;

    /* renamed from: d */
    public float f66005d;

    /* renamed from: e */
    public float f66006e;

    /* renamed from: f */
    public View f66007f;

    /* renamed from: g */
    public boolean f66008g;

    /* renamed from: h */
    public boolean f66009h;

    /* renamed from: i */
    private final float f66010i;

    /* renamed from: j */
    private float f66011j = 0.0f;

    /* renamed from: k */
    private float f66012k = 0.0f;

    /* renamed from: l */
    private float f66013l = 0.0f;

    /* renamed from: m */
    private final Paint f66014m;

    /* renamed from: n */
    private final Paint f66015n;

    /* renamed from: o */
    private final Paint f66016o;

    /* renamed from: p */
    private final Paint f66017p;

    /* renamed from: q */
    private final Matrix f66018q = new Matrix();

    /* renamed from: r */
    private final Matrix f66019r = new Matrix();

    /* renamed from: s */
    private final Path f66020s = new Path();

    /* renamed from: t */
    private ViewPropertyAnimator f66021t;

    /* renamed from: u */
    private int f66022u = 2;

    public C24161f(Context context) {
        super(context, (AttributeSet) null, 0);
        Resources resources = context.getResources();
        this.f66010i = resources.getDimension(R.dimen.debug_dot_size);
        Paint paint = new Paint(1);
        this.f66015n = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(resources.getColor(R.color.magnifier_stroke_color));
        paint.setStrokeWidth(resources.getDimension(R.dimen.magnifier_stroke_size));
        Paint paint2 = new Paint();
        this.f66014m = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(-16777216);
        Paint paint3 = new Paint();
        this.f66016o = paint3;
        paint3.setColor(resources.getColor(R.color.magnifier_shadow_color));
        paint3.setMaskFilter(new BlurMaskFilter(resources.getDimension(R.dimen.magnifier_shadow_size), BlurMaskFilter.Blur.OUTER));
        Paint paint4 = new Paint();
        this.f66017p = paint4;
        paint4.setColor(-65281);
        paint4.setStyle(Paint.Style.FILL);
    }

    /* renamed from: c */
    private final float m44900c() {
        return C24152b.m44879a(this.f66022u) ? this.f66002a : this.f66003b;
    }

    /* renamed from: d */
    private final float m44901d() {
        return this.f66004c - (m44900c() * 0.5f);
    }

    /* renamed from: e */
    private final float m44902e() {
        return C24152b.m44879a(this.f66022u) ? this.f66003b : this.f66002a;
    }

    /* renamed from: f */
    private static void m44903f(Matrix matrix, float f, float f2) {
        matrix.postTranslate(-f, f * f2);
    }

    /* renamed from: g */
    private final void m44904g(Canvas canvas) {
        canvas.drawCircle(this.f66011j, this.f66012k, this.f66010i, this.f66017p);
    }

    /* renamed from: a */
    public final void mo29595a(float f, Animator.AnimatorListener animatorListener) {
        ViewPropertyAnimator viewPropertyAnimator = this.f66021t;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator duration = animate().alpha(f).setDuration(60);
        this.f66021t = duration;
        if (animatorListener != null) {
            duration.setListener(animatorListener);
        }
        this.f66021t.start();
    }

    /* renamed from: b */
    public final void mo29596b(PointF pointF, float f, int i) {
        if (!this.f66008g) {
            this.f66008g = true;
            mo29595a(1.0f, new C24159d(this));
        }
        int[] iArr = new int[2];
        View view = this.f66007f;
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        this.f66011j = pointF.x - ((float) iArr[0]);
        this.f66012k = pointF.y - ((float) iArr[1]);
        this.f66013l = f;
        this.f66022u = i;
        double sin = Math.sin(Math.toRadians((double) (f + 90.0f)));
        double cos = Math.cos(Math.toRadians((double) (this.f66013l + 90.0f)));
        float e = m44902e();
        float c = m44900c();
        float d = m44901d();
        float f2 = ((float) cos) * d;
        float f3 = d * ((float) sin);
        Matrix matrix = this.f66018q;
        float f4 = this.f66005d;
        matrix.setScale(f4, f4, this.f66011j, this.f66012k);
        this.f66018q.postTranslate(f2, f3);
        this.f66019r.setTranslate((-e) / 2.0f, (-c) / 2.0f);
        this.f66019r.postRotate(this.f66013l);
        this.f66019r.postTranslate(this.f66011j + f2, this.f66012k + f3);
        View view2 = this.f66007f;
        if (view2 != null) {
            int width = view2.getWidth();
            float sin2 = (float) Math.sin(Math.toRadians((double) (this.f66013l + 90.0f)));
            if (Math.abs(sin2) >= 0.35f) {
                float e2 = m44902e();
                float c2 = m44900c();
                float d2 = m44901d();
                float cos2 = (float) Math.cos(Math.toRadians((double) (this.f66013l + 90.0f)));
                float f5 = cos2 / sin2;
                float f6 = d2 * cos2;
                float f7 = c2 / 2.0f;
                float[] fArr = {0.0f, f7};
                float[] fArr2 = {e2, f7};
                this.f66019r.mapPoints(fArr);
                this.f66019r.mapPoints(fArr2);
                float min = Math.min(fArr[0], fArr2[0]);
                float f8 = (float) width;
                float max = Math.max(fArr[0], fArr2[0]) - f8;
                if (min < 0.0f) {
                    m44903f(this.f66019r, min, f5);
                }
                if (max > 0.0f) {
                    m44903f(this.f66019r, max, f5);
                }
                float f9 = this.f66011j + f6;
                if (f9 < 0.0f) {
                    m44903f(this.f66018q, f9, f5);
                }
                float f10 = f9 - f8;
                if (f10 > 0.0f) {
                    m44903f(this.f66018q, f10, f5);
                }
            }
        }
        this.f66020s.reset();
        Path path = this.f66020s;
        RectF rectF = new RectF(0.0f, 0.0f, e, c);
        float f11 = this.f66006e;
        path.addRoundRect(rectF, f11, f11, Path.Direction.CCW);
        this.f66020s.transform(this.f66019r);
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        if (this.f66007f != null) {
            if (this.f66009h) {
                m44904g(canvas);
            }
            canvas.drawPath(this.f66020s, this.f66016o);
            canvas.save();
            canvas.clipPath(this.f66020s);
            canvas.drawPath(this.f66020s, this.f66014m);
            canvas.concat(this.f66018q);
            View view = this.f66007f;
            view.getClass();
            view.draw(canvas);
            if (this.f66009h) {
                m44904g(canvas);
            }
            canvas.restore();
            canvas.drawPath(this.f66020s, this.f66015n);
        }
    }
}
