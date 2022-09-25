package androidx.constraintlayout.motion.widget;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;

/* renamed from: androidx.constraintlayout.motion.widget.w */
/* compiled from: PG */
final class C1738w {

    /* renamed from: a */
    float[] f5169a;

    /* renamed from: b */
    final int[] f5170b;

    /* renamed from: c */
    final float[] f5171c;

    /* renamed from: d */
    Path f5172d;

    /* renamed from: e */
    final Paint f5173e;

    /* renamed from: f */
    final Paint f5174f;

    /* renamed from: g */
    final Paint f5175g;

    /* renamed from: h */
    final Paint f5176h;

    /* renamed from: i */
    final Paint f5177i;

    /* renamed from: j */
    public final float[] f5178j;

    /* renamed from: k */
    final DashPathEffect f5179k;

    /* renamed from: l */
    int f5180l;

    /* renamed from: m */
    final Rect f5181m = new Rect();

    /* renamed from: n */
    final int f5182n = 1;

    /* renamed from: o */
    final /* synthetic */ MotionLayout f5183o;

    public C1738w(MotionLayout motionLayout) {
        this.f5183o = motionLayout;
        Paint paint = new Paint();
        this.f5173e = paint;
        paint.setAntiAlias(true);
        paint.setColor(-21965);
        paint.setStrokeWidth(2.0f);
        paint.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.f5174f = paint2;
        paint2.setAntiAlias(true);
        paint2.setColor(-2067046);
        paint2.setStrokeWidth(2.0f);
        paint2.setStyle(Paint.Style.STROKE);
        Paint paint3 = new Paint();
        this.f5175g = paint3;
        paint3.setAntiAlias(true);
        paint3.setColor(-13391360);
        paint3.setStrokeWidth(2.0f);
        paint3.setStyle(Paint.Style.STROKE);
        Paint paint4 = new Paint();
        this.f5176h = paint4;
        paint4.setAntiAlias(true);
        paint4.setColor(-13391360);
        paint4.setTextSize(motionLayout.getContext().getResources().getDisplayMetrics().density * 12.0f);
        this.f5178j = new float[8];
        Paint paint5 = new Paint();
        this.f5177i = paint5;
        paint5.setAntiAlias(true);
        DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
        this.f5179k = dashPathEffect;
        paint3.setPathEffect(dashPathEffect);
        this.f5171c = new float[100];
        this.f5170b = new int[50];
    }

    /* renamed from: c */
    private final void m4718c(Canvas canvas) {
        float[] fArr = this.f5169a;
        float f = fArr[0];
        float f2 = fArr[1];
        int length = fArr.length;
        float f3 = fArr[length - 2];
        float f4 = fArr[length - 1];
        canvas.drawLine(Math.min(f, f3), Math.max(f2, f4), Math.max(f, f3), Math.max(f2, f4), this.f5175g);
        canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), this.f5175g);
    }

    /* renamed from: d */
    private final void m4719d(Canvas canvas, float f, float f2) {
        Canvas canvas2 = canvas;
        float[] fArr = this.f5169a;
        float f3 = fArr[0];
        float f4 = fArr[1];
        int length = fArr.length;
        float f5 = fArr[length - 2];
        float f6 = fArr[length - 1];
        float min = Math.min(f3, f5);
        float max = Math.max(f4, f6);
        float min2 = f - Math.min(f3, f5);
        float max2 = Math.max(f4, f6) - f2;
        float abs = Math.abs(f5 - f3);
        StringBuilder sb = new StringBuilder(15);
        double d = (double) ((min2 * 100.0f) / abs);
        Double.isNaN(d);
        sb.append(((float) ((int) (d + 0.5d))) / 100.0f);
        String sb2 = sb.toString();
        mo4816b(sb2, this.f5176h);
        canvas2.drawText(sb2, ((min2 / 2.0f) - ((float) (this.f5181m.width() / 2))) + min, f2 - 0.21875f, this.f5176h);
        canvas.drawLine(f, f2, Math.min(f3, f5), f2, this.f5175g);
        float abs2 = Math.abs(f6 - f4);
        StringBuilder sb3 = new StringBuilder(15);
        double d2 = (double) ((max2 * 100.0f) / abs2);
        Double.isNaN(d2);
        sb3.append(((float) ((int) (d2 + 0.5d))) / 100.0f);
        String sb4 = sb3.toString();
        mo4816b(sb4, this.f5176h);
        canvas2.drawText(sb4, f + 5.0f, max - ((max2 / 2.0f) - ((float) (this.f5181m.height() / 2))), this.f5176h);
        canvas.drawLine(f, f2, f, Math.max(f4, f6), this.f5175g);
    }

    /* renamed from: e */
    private final void m4720e(Canvas canvas) {
        float[] fArr = this.f5169a;
        float f = fArr[0];
        float f2 = fArr[1];
        int length = fArr.length;
        canvas.drawLine(f, f2, fArr[length - 2], fArr[length - 1], this.f5175g);
    }

    /* renamed from: f */
    private final void m4721f(Canvas canvas, float f, float f2) {
        float f3 = f;
        float f4 = f2;
        float[] fArr = this.f5169a;
        float f5 = fArr[0];
        float f6 = fArr[1];
        int length = fArr.length;
        float f7 = fArr[length - 2];
        float f8 = fArr[length - 1];
        float hypot = (float) Math.hypot((double) (f5 - f7), (double) (f6 - f8));
        float f9 = f7 - f5;
        float f10 = f8 - f6;
        float f11 = (((f3 - f5) * f9) + ((f4 - f6) * f10)) / (hypot * hypot);
        float f12 = f5 + (f9 * f11);
        float f13 = f6 + (f11 * f10);
        Path path = new Path();
        path.moveTo(f, f4);
        path.lineTo(f12, f13);
        float hypot2 = (float) Math.hypot((double) (f12 - f3), (double) (f13 - f4));
        StringBuilder sb = new StringBuilder(15);
        sb.append(((float) ((int) ((hypot2 * 100.0f) / hypot))) / 100.0f);
        String sb2 = sb.toString();
        mo4816b(sb2, this.f5176h);
        canvas.drawTextOnPath(sb2, path, (hypot2 / 2.0f) - ((float) (this.f5181m.width() / 2)), -20.0f, this.f5176h);
        canvas.drawLine(f3, f4, f12, f13, this.f5175g);
    }

    /* renamed from: g */
    private final void m4722g(Canvas canvas, float f, float f2, int i, int i2) {
        Canvas canvas2 = canvas;
        int width = this.f5183o.getWidth();
        StringBuilder sb = new StringBuilder(15);
        double d = (double) (((f - ((float) (i / 2))) * 100.0f) / ((float) (width - i)));
        Double.isNaN(d);
        sb.append(((float) ((int) (d + 0.5d))) / 100.0f);
        String sb2 = sb.toString();
        mo4816b(sb2, this.f5176h);
        canvas2.drawText(sb2, ((f / 2.0f) - ((float) (this.f5181m.width() / 2))) + 0.0f, f2 - 0.21875f, this.f5176h);
        canvas.drawLine(f, f2, Math.min(0.0f, 1.0f), f2, this.f5175g);
        int height = this.f5183o.getHeight();
        StringBuilder sb3 = new StringBuilder(15);
        double d2 = (double) (((f2 - ((float) (i2 / 2))) * 100.0f) / ((float) (height - i2)));
        Double.isNaN(d2);
        sb3.append(((float) ((int) (d2 + 0.5d))) / 100.0f);
        String sb4 = sb3.toString();
        mo4816b(sb4, this.f5176h);
        canvas2.drawText(sb4, f + 5.0f, -((f2 / 2.0f) - ((float) (this.f5181m.height() / 2))), this.f5176h);
        canvas.drawLine(f, f2, f, Math.max(0.0f, 1.0f), this.f5175g);
    }

    /* renamed from: a */
    public final void mo4815a(Canvas canvas, int i, int i2, C1733r rVar) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        float f;
        float f2;
        Canvas canvas2 = canvas;
        C1733r rVar2 = rVar;
        int i8 = i;
        if (i8 == 4) {
            boolean z = false;
            boolean z2 = false;
            for (int i9 = 0; i9 < this.f5180l; i9++) {
                int i10 = this.f5170b[i9];
                z |= !(i10 != 1);
                z2 |= !(i10 != 0);
            }
            if (z) {
                m4720e(canvas);
            }
            if (z2) {
                m4718c(canvas);
            }
            i8 = 4;
        }
        if (i8 == 2) {
            m4720e(canvas);
            i3 = 2;
        } else {
            i3 = i8;
        }
        if (i3 == 3) {
            m4718c(canvas);
        }
        canvas2.drawLines(this.f5169a, this.f5173e);
        View view = rVar2.f5139b;
        if (view != null) {
            i5 = view.getWidth();
            i4 = rVar2.f5139b.getHeight();
        } else {
            i5 = 0;
            i4 = 0;
        }
        int i11 = 1;
        while (i11 < i2 - 1) {
            if (i3 != 4) {
                i7 = i3;
            } else if (this.f5170b[i11 - 1] == 0) {
                i6 = i11;
                i11 = i6 + 1;
            } else {
                i7 = 4;
            }
            float[] fArr = this.f5171c;
            int i12 = i11 + i11;
            float f3 = fArr[i12];
            float f4 = fArr[i12 + 1];
            this.f5172d.reset();
            this.f5172d.moveTo(f3, f4 + 10.0f);
            this.f5172d.lineTo(10.0f + f3, f4);
            this.f5172d.lineTo(f3, f4 - 0.4375f);
            this.f5172d.lineTo(-10.0f + f3, f4);
            this.f5172d.close();
            int i13 = i11 - 1;
            C1703ab abVar = (C1703ab) rVar2.f5154q.get(i13);
            if (i7 == 4) {
                int i14 = this.f5170b[i13];
                if (i14 == 1) {
                    m4721f(canvas2, f3 + 0.0f, f4 + 0.0f);
                } else if (i14 == 0) {
                    m4719d(canvas2, f3 + 0.0f, f4 + 0.0f);
                } else if (i14 == 2) {
                    f = f4;
                    f2 = f3;
                    i6 = i11;
                    m4722g(canvas, f3 + 0.0f, f4 + 0.0f, i5, i4);
                    canvas2.drawPath(this.f5172d, this.f5177i);
                    i7 = 4;
                }
                f = f4;
                f2 = f3;
                i6 = i11;
                canvas2.drawPath(this.f5172d, this.f5177i);
                i7 = 4;
            } else {
                f = f4;
                f2 = f3;
                i6 = i11;
            }
            if (i7 == 2) {
                m4721f(canvas2, f2 + 0.0f, f + 0.0f);
            }
            if (i7 == 3) {
                m4719d(canvas2, f2 + 0.0f, f + 0.0f);
            }
            if (i7 == 6) {
                m4722g(canvas, f2 + 0.0f, f + 0.0f, i5, i4);
            }
            canvas2.drawPath(this.f5172d, this.f5177i);
            i11 = i6 + 1;
        }
        float[] fArr2 = this.f5169a;
        if (fArr2.length > 1) {
            canvas2.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f5174f);
            float[] fArr3 = this.f5169a;
            int length = fArr3.length;
            canvas2.drawCircle(fArr3[length - 2], fArr3[length - 1], 8.0f, this.f5174f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo4816b(String str, Paint paint) {
        paint.getTextBounds(str, 0, str.length(), this.f5181m);
    }
}
