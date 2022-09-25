package com.facebook.litho.p328f;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.litho.C6404n;

/* renamed from: com.facebook.litho.f.b */
/* compiled from: PG */
public final class C6255b extends Drawable implements C6256c {

    /* renamed from: a */
    private static final RectF f18488a = new RectF();

    /* renamed from: b */
    private static final RectF f18489b = new RectF();

    /* renamed from: c */
    private static final RectF f18490c = new RectF();

    /* renamed from: d */
    private final C6254a f18491d;

    /* renamed from: e */
    private Paint f18492e;

    /* renamed from: f */
    private Path f18493f;

    /* renamed from: g */
    private Path f18494g;

    /* renamed from: h */
    private boolean f18495h;

    public C6255b(C6254a aVar) {
        this.f18491d = aVar;
    }

    /* renamed from: b */
    private final Path m16800b() {
        if (this.f18495h) {
            return this.f18493f;
        }
        return null;
    }

    /* renamed from: c */
    private static void m16801c(Canvas canvas, RectF rectF, Path path, float[] fArr, Paint paint) {
        float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
        if (path == null) {
            float min2 = Math.min(min, fArr[0]);
            canvas.drawRoundRect(rectF, min2, min2, paint);
            return;
        }
        if (path.isEmpty()) {
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
        canvas.drawPath(path, paint);
    }

    /* renamed from: d */
    private final void m16802d(Canvas canvas, int i, float f, float f2, float f3, float f4, float f5, boolean z) {
        this.f18492e.setStrokeWidth(f);
        this.f18492e.setColor(i);
        RectF rectF = f18488a;
        rectF.set(f2, f3, f4, f5);
        RectF rectF2 = f18489b;
        rectF2.set(getBounds());
        if (z) {
            rectF2.inset(rectF.centerX() - rectF.left, 0.0f);
        } else {
            rectF2.inset(0.0f, rectF.centerY() - rectF.top);
        }
        int save = canvas.save();
        canvas.clipRect(rectF);
        m16801c(canvas, rectF2, m16800b(), this.f18491d.f18487j, this.f18492e);
        canvas.restoreToCount(save);
    }

    /* renamed from: a */
    public final boolean mo13241a(C6256c cVar) {
        return equals(cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ad, code lost:
        if (r8 == r0.f18481d) goto L_0x00b1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r13) {
        /*
            r12 = this;
            android.graphics.Paint r0 = r12.f18492e
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x000b
            android.graphics.Path r0 = r12.f18493f
            if (r0 != 0) goto L_0x0088
        L_0x000b:
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r12.f18492e = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r12.f18493f = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r12.f18494g = r0
            r0 = 0
            r4 = 0
            r5 = 0
        L_0x0023:
            com.facebook.litho.f.a r6 = r12.f18491d
            float[] r6 = r6.f18487j
            int r7 = r6.length
            if (r0 >= r7) goto L_0x0043
            r6 = r6[r0]
            int r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r8 <= 0) goto L_0x0032
            r8 = 0
            goto L_0x0033
        L_0x0032:
            r8 = 1
        L_0x0033:
            r8 = r8 ^ r2
            r4 = r4 | r8
            if (r0 != 0) goto L_0x0039
            r5 = r6
            goto L_0x0040
        L_0x0039:
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0040
            r12.f18495h = r2
            goto L_0x0043
        L_0x0040:
            int r0 = r0 + 1
            goto L_0x0023
        L_0x0043:
            boolean r0 = r12.f18495h
            if (r0 == 0) goto L_0x0067
            r0 = 8
            if (r7 == r0) goto L_0x0067
            float[] r0 = new float[r0]
            r5 = 0
        L_0x004e:
            r6 = 4
            if (r5 >= r6) goto L_0x0063
            int r6 = r5 + r5
            com.facebook.litho.f.a r7 = r12.f18491d
            float[] r7 = r7.f18487j
            r8 = r7[r5]
            r0[r6] = r8
            int r6 = r6 + r2
            r7 = r7[r5]
            r0[r6] = r7
            int r5 = r5 + 1
            goto L_0x004e
        L_0x0063:
            com.facebook.litho.f.a r5 = r12.f18491d
            r5.f18487j = r0
        L_0x0067:
            android.graphics.Paint r0 = r12.f18492e
            com.facebook.litho.f.a r5 = r12.f18491d
            android.graphics.PathEffect r5 = r5.f18486i
            r0.setPathEffect(r5)
            android.graphics.Paint r0 = r12.f18492e
            com.facebook.litho.f.a r5 = r12.f18491d
            android.graphics.PathEffect r5 = r5.f18486i
            if (r5 != 0) goto L_0x007d
            if (r4 == 0) goto L_0x007b
            goto L_0x007d
        L_0x007b:
            r4 = 0
            goto L_0x007e
        L_0x007d:
            r4 = 1
        L_0x007e:
            r0.setAntiAlias(r4)
            android.graphics.Paint r0 = r12.f18492e
            android.graphics.Paint$Style r4 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r4)
        L_0x0088:
            com.facebook.litho.f.a r0 = r12.f18491d
            int r4 = r0.f18482e
            int r5 = r0.f18483f
            if (r4 != r5) goto L_0x009a
            int r6 = r0.f18484g
            if (r5 != r6) goto L_0x009a
            int r5 = r0.f18485h
            if (r6 != r5) goto L_0x009a
            r5 = 1
            goto L_0x009b
        L_0x009a:
            r5 = 0
        L_0x009b:
            float r6 = r0.f18478a
            float r7 = r0.f18479b
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 != 0) goto L_0x00b0
            float r8 = r0.f18480c
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x00b0
            float r0 = r0.f18481d
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x00b0
            goto L_0x00b1
        L_0x00b0:
            r2 = 0
        L_0x00b1:
            if (r2 == 0) goto L_0x00b9
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00b8
            goto L_0x00b9
        L_0x00b8:
            return
        L_0x00b9:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r2 == 0) goto L_0x00e6
            if (r5 != 0) goto L_0x00c0
            goto L_0x00e6
        L_0x00c0:
            float r0 = r6 / r0
            android.graphics.RectF r1 = f18489b
            android.graphics.Rect r2 = r12.getBounds()
            r1.set(r2)
            r1.inset(r0, r0)
            android.graphics.Paint r0 = r12.f18492e
            r0.setStrokeWidth(r6)
            android.graphics.Paint r0 = r12.f18492e
            r0.setColor(r4)
            android.graphics.Path r0 = r12.m16800b()
            com.facebook.litho.f.a r2 = r12.f18491d
            float[] r2 = r2.f18487j
            android.graphics.Paint r3 = r12.f18492e
            m16801c(r13, r1, r0, r2, r3)
            return
        L_0x00e6:
            if (r2 == 0) goto L_0x027f
            android.graphics.Paint r2 = r12.f18492e
            r2.setStrokeWidth(r6)
            com.facebook.litho.f.a r2 = r12.f18491d
            float r2 = r2.f18478a
            float r2 = r2 / r0
            android.graphics.RectF r0 = f18489b
            android.graphics.Rect r3 = r12.getBounds()
            r0.set(r3)
            int r3 = r13.save()
            float r4 = r0.left
            float r5 = r0.top
            r13.translate(r4, r5)
            r0.offsetTo(r1, r1)
            r0.inset(r2, r2)
            android.graphics.RectF r1 = f18490c
            r1.set(r0)
            float r4 = r0.width()
            float r5 = r0.height()
            float r4 = java.lang.Math.min(r4, r5)
            r5 = 1077936128(0x40400000, float:3.0)
            float r4 = r4 / r5
            r1.inset(r4, r4)
            com.facebook.litho.f.a r4 = r12.f18491d
            int r4 = r4.f18482e
            if (r4 == 0) goto L_0x0179
            int r5 = r13.save()
            android.graphics.Paint r6 = r12.f18492e
            r6.setColor(r4)
            android.graphics.Path r4 = r12.f18494g
            r4.reset()
            android.graphics.Path r4 = r12.f18494g
            float r6 = r0.left
            float r6 = r6 - r2
            float r7 = r0.top
            float r7 = r7 - r2
            r4.moveTo(r6, r7)
            android.graphics.Path r4 = r12.f18494g
            float r6 = r1.left
            float r7 = r1.top
            r4.lineTo(r6, r7)
            android.graphics.Path r4 = r12.f18494g
            float r6 = r1.left
            float r7 = r1.bottom
            r4.lineTo(r6, r7)
            android.graphics.Path r4 = r12.f18494g
            float r6 = r0.left
            float r6 = r6 - r2
            float r7 = r0.bottom
            float r7 = r7 + r2
            r4.lineTo(r6, r7)
            android.graphics.Path r4 = r12.f18494g
            r4.close()
            android.graphics.Path r4 = r12.f18494g
            r13.clipPath(r4)
            android.graphics.Path r4 = r12.m16800b()
            com.facebook.litho.f.a r6 = r12.f18491d
            float[] r6 = r6.f18487j
            android.graphics.Paint r7 = r12.f18492e
            m16801c(r13, r0, r4, r6, r7)
            r13.restoreToCount(r5)
        L_0x0179:
            com.facebook.litho.f.a r4 = r12.f18491d
            int r4 = r4.f18483f
            if (r4 == 0) goto L_0x01cf
            int r5 = r13.save()
            android.graphics.Paint r6 = r12.f18492e
            r6.setColor(r4)
            android.graphics.Path r4 = r12.f18494g
            r4.reset()
            android.graphics.Path r4 = r12.f18494g
            float r6 = r0.left
            float r6 = r6 - r2
            float r7 = r0.top
            float r7 = r7 - r2
            r4.moveTo(r6, r7)
            android.graphics.Path r4 = r12.f18494g
            float r6 = r1.left
            float r7 = r1.top
            r4.lineTo(r6, r7)
            android.graphics.Path r4 = r12.f18494g
            float r6 = r1.right
            float r7 = r1.top
            r4.lineTo(r6, r7)
            android.graphics.Path r4 = r12.f18494g
            float r6 = r0.right
            float r6 = r6 + r2
            float r7 = r0.top
            float r7 = r7 - r2
            r4.lineTo(r6, r7)
            android.graphics.Path r4 = r12.f18494g
            r4.close()
            android.graphics.Path r4 = r12.f18494g
            r13.clipPath(r4)
            android.graphics.Path r4 = r12.m16800b()
            com.facebook.litho.f.a r6 = r12.f18491d
            float[] r6 = r6.f18487j
            android.graphics.Paint r7 = r12.f18492e
            m16801c(r13, r0, r4, r6, r7)
            r13.restoreToCount(r5)
        L_0x01cf:
            com.facebook.litho.f.a r4 = r12.f18491d
            int r4 = r4.f18484g
            if (r4 == 0) goto L_0x0225
            int r5 = r13.save()
            android.graphics.Paint r6 = r12.f18492e
            r6.setColor(r4)
            android.graphics.Path r4 = r12.f18494g
            r4.reset()
            android.graphics.Path r4 = r12.f18494g
            float r6 = r0.right
            float r6 = r6 + r2
            float r7 = r0.top
            float r7 = r7 - r2
            r4.moveTo(r6, r7)
            android.graphics.Path r4 = r12.f18494g
            float r6 = r1.right
            float r7 = r1.top
            r4.lineTo(r6, r7)
            android.graphics.Path r4 = r12.f18494g
            float r6 = r1.right
            float r7 = r1.bottom
            r4.lineTo(r6, r7)
            android.graphics.Path r4 = r12.f18494g
            float r6 = r0.right
            float r6 = r6 + r2
            float r7 = r0.bottom
            float r7 = r7 + r2
            r4.lineTo(r6, r7)
            android.graphics.Path r4 = r12.f18494g
            r4.close()
            android.graphics.Path r4 = r12.f18494g
            r13.clipPath(r4)
            android.graphics.Path r4 = r12.m16800b()
            com.facebook.litho.f.a r6 = r12.f18491d
            float[] r6 = r6.f18487j
            android.graphics.Paint r7 = r12.f18492e
            m16801c(r13, r0, r4, r6, r7)
            r13.restoreToCount(r5)
        L_0x0225:
            com.facebook.litho.f.a r4 = r12.f18491d
            int r4 = r4.f18485h
            if (r4 == 0) goto L_0x027b
            int r5 = r13.save()
            android.graphics.Paint r6 = r12.f18492e
            r6.setColor(r4)
            android.graphics.Path r4 = r12.f18494g
            r4.reset()
            android.graphics.Path r4 = r12.f18494g
            float r6 = r0.left
            float r6 = r6 - r2
            float r7 = r0.bottom
            float r7 = r7 + r2
            r4.moveTo(r6, r7)
            android.graphics.Path r4 = r12.f18494g
            float r6 = r1.left
            float r7 = r1.bottom
            r4.lineTo(r6, r7)
            android.graphics.Path r4 = r12.f18494g
            float r6 = r1.right
            float r1 = r1.bottom
            r4.lineTo(r6, r1)
            android.graphics.Path r1 = r12.f18494g
            float r4 = r0.right
            float r4 = r4 + r2
            float r6 = r0.bottom
            float r6 = r6 + r2
            r1.lineTo(r4, r6)
            android.graphics.Path r1 = r12.f18494g
            r1.close()
            android.graphics.Path r1 = r12.f18494g
            r13.clipPath(r1)
            android.graphics.Path r1 = r12.m16800b()
            com.facebook.litho.f.a r2 = r12.f18491d
            float[] r2 = r2.f18487j
            android.graphics.Paint r4 = r12.f18492e
            m16801c(r13, r0, r1, r2, r4)
            r13.restoreToCount(r5)
        L_0x027b:
            r13.restoreToCount(r3)
            return
        L_0x027f:
            android.graphics.Rect r0 = r12.getBounds()
            com.facebook.litho.f.a r2 = r12.f18491d
            float r6 = r2.f18478a
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x02ad
            int r5 = r2.f18482e
            if (r5 == 0) goto L_0x02ad
            int r2 = r0.left
            float r7 = (float) r2
            int r2 = r0.top
            float r8 = (float) r2
            int r2 = r0.left
            float r2 = (float) r2
            com.facebook.litho.f.a r3 = r12.f18491d
            float r3 = r3.f18478a
            float r2 = r2 + r3
            int r3 = r0.right
            float r3 = (float) r3
            float r9 = java.lang.Math.min(r2, r3)
            int r2 = r0.bottom
            float r10 = (float) r2
            r11 = 1
            r3 = r12
            r4 = r13
            r3.m16802d(r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x02ad:
            com.facebook.litho.f.a r2 = r12.f18491d
            float r6 = r2.f18480c
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x02d7
            int r5 = r2.f18484g
            if (r5 == 0) goto L_0x02d7
            int r2 = r0.right
            float r2 = (float) r2
            com.facebook.litho.f.a r3 = r12.f18491d
            float r3 = r3.f18480c
            float r2 = r2 - r3
            int r3 = r0.left
            float r3 = (float) r3
            float r7 = java.lang.Math.max(r2, r3)
            int r2 = r0.top
            float r8 = (float) r2
            int r2 = r0.right
            float r9 = (float) r2
            int r2 = r0.bottom
            float r10 = (float) r2
            r11 = 1
            r3 = r12
            r4 = r13
            r3.m16802d(r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x02d7:
            com.facebook.litho.f.a r2 = r12.f18491d
            float r6 = r2.f18479b
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0301
            int r5 = r2.f18483f
            if (r5 == 0) goto L_0x0301
            int r2 = r0.left
            float r7 = (float) r2
            int r2 = r0.top
            float r8 = (float) r2
            int r2 = r0.right
            float r9 = (float) r2
            int r2 = r0.top
            float r2 = (float) r2
            com.facebook.litho.f.a r3 = r12.f18491d
            float r3 = r3.f18479b
            float r2 = r2 + r3
            int r3 = r0.bottom
            float r3 = (float) r3
            float r10 = java.lang.Math.min(r2, r3)
            r11 = 0
            r3 = r12
            r4 = r13
            r3.m16802d(r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x0301:
            com.facebook.litho.f.a r2 = r12.f18491d
            float r6 = r2.f18481d
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x032b
            int r5 = r2.f18485h
            if (r5 == 0) goto L_0x032b
            int r1 = r0.left
            float r7 = (float) r1
            int r1 = r0.bottom
            float r1 = (float) r1
            com.facebook.litho.f.a r2 = r12.f18491d
            float r2 = r2.f18481d
            float r1 = r1 - r2
            int r2 = r0.top
            float r2 = (float) r2
            float r8 = java.lang.Math.max(r1, r2)
            int r1 = r0.right
            float r9 = (float) r1
            int r0 = r0.bottom
            float r10 = (float) r0
            r11 = 0
            r3 = r12
            r4 = r13
            r3.m16802d(r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x032b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.p328f.C6255b.draw(android.graphics.Canvas):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6255b)) {
            return false;
        }
        return C6404n.m17223b(this.f18491d, ((C6255b) obj).f18491d);
    }

    public final ColorFilter getColorFilter() {
        Paint paint = this.f18492e;
        if (paint != null) {
            return paint.getColorFilter();
        }
        return null;
    }

    public final int getOpacity() {
        return -1;
    }

    public final int hashCode() {
        return this.f18491d.hashCode();
    }

    public final void setAlpha(int i) {
        Paint paint = this.f18492e;
        if (paint != null) {
            paint.setAlpha(i);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Paint paint = this.f18492e;
        if (paint != null) {
            paint.setColorFilter(colorFilter);
        }
    }
}
