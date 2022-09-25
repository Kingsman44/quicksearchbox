package com.google.android.p3545q.p3546a;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.google.apps.p3589d.p3590a.C45682aa;
import com.google.apps.p3589d.p3590a.C45684ac;
import com.google.apps.p3589d.p3590a.C45697n;
import com.google.apps.p3589d.p3590a.C45698o;
import com.google.apps.p3589d.p3600k.C45940e;
import com.google.apps.p3589d.p3600k.C45941f;
import com.google.apps.p3589d.p3600k.C45946k;
import com.google.common.p4535g.C59203do;
import org.chromium.net.PrivateKeyType;
import p5462h.C69747m;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.q.a.d */
/* compiled from: PG */
public final class C45206d extends Drawable {

    /* renamed from: a */
    private Typeface f117964a;

    /* renamed from: b */
    private int f117965b = PrivateKeyType.INVALID;

    /* renamed from: c */
    private ColorFilter f117966c;

    /* renamed from: d */
    private float f117967d;

    /* renamed from: e */
    private Paint f117968e;

    /* renamed from: f */
    private C45682aa f117969f;

    public C45206d(float f) {
        this.f117967d = f;
        Paint paint = new Paint();
        paint.setTextSize(this.f117967d);
        this.f117968e = paint;
        C45682aa aaVar = C45682aa.f120168a;
        C69664n.m101060f(aaVar, "empty()");
        this.f117969f = aaVar;
        Paint paint2 = new Paint();
        paint2.setColor(Color.argb(128, PrivateKeyType.INVALID, 0, 0));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(((float) this.f117969f.mo49737a().mo49786a()) / 10.0f);
        new C69747m(C45205c.f117963a);
    }

    /* renamed from: m */
    private static final Integer m80492m(C45941f fVar) {
        if (!(fVar instanceof C45940e)) {
            return null;
        }
        C45940e eVar = (C45940e) fVar;
        return Integer.valueOf(Color.argb(eVar.mo50035a(), eVar.mo50038d(), eVar.mo50037c(), eVar.mo50036b()));
    }

    /* renamed from: a */
    public final double mo49032a(double d) {
        double e = mo49039g().mo49790e(d) - mo49043h().mo50049c();
        double c = (double) mo49034c();
        Double.isNaN(c);
        double d2 = e / c;
        double d3 = (double) getBounds().left;
        Double.isNaN(d3);
        return d2 + d3;
    }

    /* renamed from: b */
    public final double mo49033b(double d) {
        double f = mo49039g().mo49791f(d) - mo49043h().mo50050d();
        double d2 = (double) mo49035d();
        Double.isNaN(d2);
        double d3 = f / d2;
        double d4 = (double) getBounds().top;
        Double.isNaN(d4);
        return d3 + d4;
    }

    /* renamed from: c */
    public final float mo49034c() {
        C45946k h = mo49043h();
        float a = (float) (h.mo50047a() - h.mo50049c());
        int width = getBounds().width() - 2;
        if (width <= 0) {
            width = 1;
        }
        return a / ((float) width);
    }

    /* renamed from: d */
    public final float mo49035d() {
        C45946k h = mo49043h();
        float b = (float) (h.mo50048b() - h.mo50050d());
        int height = getBounds().height() - 2;
        if (height <= 0) {
            height = 1;
        }
        return b / ((float) height);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0160, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0164, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r19) {
        /*
            r18 = this;
            r1 = r18
            r8 = r19
            java.lang.String r0 = "canvas"
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r0)
            android.graphics.Typeface r0 = r1.f117964a
            if (r0 != 0) goto L_0x000e
            return
        L_0x000e:
            android.graphics.Paint r0 = r1.f117968e
            int r2 = r1.f117965b
            r0.setAlpha(r2)
            android.graphics.Paint r0 = r1.f117968e
            android.graphics.ColorFilter r2 = r1.f117966c
            r0.setColorFilter(r2)
            android.graphics.Paint r0 = r1.f117968e
            r2 = 1
            r0.setAntiAlias(r2)
            int r9 = r19.save()
            android.graphics.Rect r0 = r18.getBounds()     // Catch:{ all -> 0x01e9 }
            int r0 = r0.left     // Catch:{ all -> 0x01e9 }
            float r0 = (float) r0     // Catch:{ all -> 0x01e9 }
            r3 = 1065353216(0x3f800000, float:1.0)
            float r0 = r3 - r0
            android.graphics.Rect r4 = r18.getBounds()     // Catch:{ all -> 0x01e9 }
            int r4 = r4.top     // Catch:{ all -> 0x01e9 }
            float r4 = (float) r4     // Catch:{ all -> 0x01e9 }
            float r4 = r3 - r4
            r8.translate(r0, r4)     // Catch:{ all -> 0x01e9 }
            float r0 = r18.mo49034c()     // Catch:{ all -> 0x01e9 }
            float r0 = r3 / r0
            float r4 = r18.mo49035d()     // Catch:{ all -> 0x01e9 }
            float r3 = r3 / r4
            r8.scale(r0, r3)     // Catch:{ all -> 0x01e9 }
            com.google.apps.d.k.k r0 = r18.mo49043h()     // Catch:{ all -> 0x01e9 }
            double r3 = r0.mo50049c()     // Catch:{ all -> 0x01e9 }
            float r0 = (float) r3     // Catch:{ all -> 0x01e9 }
            float r0 = -r0
            com.google.apps.d.k.k r3 = r18.mo49043h()     // Catch:{ all -> 0x01e9 }
            double r3 = r3.mo50050d()     // Catch:{ all -> 0x01e9 }
            float r3 = (float) r3     // Catch:{ all -> 0x01e9 }
            float r3 = -r3
            r8.translate(r0, r3)     // Catch:{ all -> 0x01e9 }
            com.google.apps.d.a.aa r0 = r1.f117969f     // Catch:{ all -> 0x01e9 }
            com.google.apps.d.b.j r0 = r0.mo49738b()     // Catch:{ all -> 0x01e9 }
            com.google.apps.d.b.c r3 = new com.google.apps.d.b.c     // Catch:{ all -> 0x01e9 }
            r3.<init>(r0)     // Catch:{ all -> 0x01e9 }
        L_0x006d:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x01e9 }
            if (r0 == 0) goto L_0x0165
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x01e9 }
            com.google.apps.d.a.y r0 = (com.google.apps.p3589d.p3590a.C45708y) r0     // Catch:{ all -> 0x01e9 }
            java.lang.String r4 = "glyph"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r4)     // Catch:{ all -> 0x01e9 }
            android.graphics.Paint r4 = r1.f117968e     // Catch:{ all -> 0x01e9 }
            float r4 = r4.getTextSize()     // Catch:{ all -> 0x01e9 }
            android.graphics.Paint r5 = r1.f117968e     // Catch:{ all -> 0x01e9 }
            int r5 = r5.getColor()     // Catch:{ all -> 0x01e9 }
            int r6 = r19.save()     // Catch:{ all -> 0x01e9 }
            boolean r7 = r0.mo49775h()     // Catch:{ all -> 0x01e9 }
            if (r7 == 0) goto L_0x009d
            com.google.apps.d.k.k r7 = r0.mo49773f()     // Catch:{ all -> 0x01e9 }
            com.google.apps.d.k.k r7 = r7.mo50065k()     // Catch:{ all -> 0x01e9 }
            goto L_0x00a1
        L_0x009d:
            com.google.apps.d.k.k r7 = r0.mo49773f()     // Catch:{ all -> 0x01e9 }
        L_0x00a1:
            java.lang.String r10 = "glyph.transformedBounds()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r10)     // Catch:{ all -> 0x01e9 }
            com.google.apps.d.k.k r10 = r0.mo49771e()     // Catch:{ all -> 0x01e9 }
            if (r10 == 0) goto L_0x00b6
            boolean r11 = r0.mo49775h()     // Catch:{ all -> 0x01e9 }
            if (r11 == 0) goto L_0x00b6
            com.google.apps.d.k.k r10 = r10.mo50065k()     // Catch:{ all -> 0x01e9 }
        L_0x00b6:
            com.google.apps.d.k.i r11 = r0.mo49770d()     // Catch:{ all -> 0x0160 }
            double r11 = r11.mo50042a()     // Catch:{ all -> 0x0160 }
            float r11 = (float) r11     // Catch:{ all -> 0x0160 }
            com.google.apps.d.k.i r12 = r0.mo49770d()     // Catch:{ all -> 0x0160 }
            double r12 = r12.mo50043b()     // Catch:{ all -> 0x0160 }
            float r12 = (float) r12     // Catch:{ all -> 0x0160 }
            r8.translate(r11, r12)     // Catch:{ all -> 0x0160 }
            if (r10 == 0) goto L_0x0115
            double r11 = r7.mo50047a()     // Catch:{ all -> 0x0160 }
            double r13 = r7.mo50049c()     // Catch:{ all -> 0x0160 }
            double r11 = r11 - r13
            double r13 = r10.mo50047a()     // Catch:{ all -> 0x0160 }
            double r15 = r10.mo50049c()     // Catch:{ all -> 0x0160 }
            double r13 = r13 - r15
            double r11 = r11 / r13
            float r11 = (float) r11     // Catch:{ all -> 0x0160 }
            double r12 = r7.mo50048b()     // Catch:{ all -> 0x0160 }
            double r14 = r7.mo50050d()     // Catch:{ all -> 0x0160 }
            double r12 = r12 - r14
            double r14 = r10.mo50048b()     // Catch:{ all -> 0x0160 }
            double r16 = r10.mo50050d()     // Catch:{ all -> 0x0160 }
            double r14 = r14 - r16
            double r12 = r12 / r14
            float r12 = (float) r12     // Catch:{ all -> 0x0160 }
            double r13 = r7.mo50049c()     // Catch:{ all -> 0x0160 }
            float r13 = (float) r13     // Catch:{ all -> 0x0160 }
            double r14 = r7.mo50050d()     // Catch:{ all -> 0x0160 }
            float r7 = (float) r14     // Catch:{ all -> 0x0160 }
            r8.translate(r13, r7)     // Catch:{ all -> 0x0160 }
            r8.scale(r11, r12)     // Catch:{ all -> 0x0160 }
            double r11 = r10.mo50049c()     // Catch:{ all -> 0x0160 }
            double r11 = -r11
            float r7 = (float) r11     // Catch:{ all -> 0x0160 }
            double r10 = r10.mo50050d()     // Catch:{ all -> 0x0160 }
            float r10 = (float) r10     // Catch:{ all -> 0x0160 }
            float r10 = -r10
            r8.translate(r7, r10)     // Catch:{ all -> 0x0160 }
        L_0x0115:
            android.graphics.Paint r7 = r1.f117968e     // Catch:{ all -> 0x0160 }
            double r10 = r0.mo49767a()     // Catch:{ all -> 0x0160 }
            float r10 = (float) r10     // Catch:{ all -> 0x0160 }
            r7.setTextSize(r10)     // Catch:{ all -> 0x0160 }
            com.google.apps.d.k.f r7 = r0.mo49769c()     // Catch:{ all -> 0x0160 }
            java.lang.String r10 = "glyph.color()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r10)     // Catch:{ all -> 0x0160 }
            java.lang.Integer r7 = m80492m(r7)     // Catch:{ all -> 0x0160 }
            if (r7 == 0) goto L_0x0137
            int r7 = r7.intValue()     // Catch:{ all -> 0x0160 }
            android.graphics.Paint r10 = r1.f117968e     // Catch:{ all -> 0x0160 }
            r10.setColor(r7)     // Catch:{ all -> 0x0160 }
        L_0x0137:
            android.graphics.Paint r7 = r1.f117968e     // Catch:{ all -> 0x0160 }
            r7.setSubpixelText(r2)     // Catch:{ all -> 0x0160 }
            boolean r7 = r0.mo49775h()     // Catch:{ all -> 0x0160 }
            r10 = 0
            if (r7 == 0) goto L_0x0148
            r7 = 1119092736(0x42b40000, float:90.0)
            r8.rotate(r7, r10, r10)     // Catch:{ all -> 0x0160 }
        L_0x0148:
            java.lang.String r0 = r0.mo49774g()     // Catch:{ all -> 0x0160 }
            android.graphics.Paint r7 = r1.f117968e     // Catch:{ all -> 0x0160 }
            r8.drawText(r0, r10, r10, r7)     // Catch:{ all -> 0x0160 }
            r8.restoreToCount(r6)     // Catch:{ all -> 0x01e9 }
            android.graphics.Paint r0 = r1.f117968e     // Catch:{ all -> 0x01e9 }
            r0.setTextSize(r4)     // Catch:{ all -> 0x01e9 }
            android.graphics.Paint r0 = r1.f117968e     // Catch:{ all -> 0x01e9 }
            r0.setColor(r5)     // Catch:{ all -> 0x01e9 }
            goto L_0x006d
        L_0x0160:
            r0 = move-exception
            r8.restoreToCount(r6)     // Catch:{ all -> 0x01e9 }
            throw r0     // Catch:{ all -> 0x01e9 }
        L_0x0165:
            com.google.apps.d.a.aa r0 = r1.f117969f     // Catch:{ all -> 0x01e9 }
            com.google.apps.d.b.j r0 = r0.mo49739c()     // Catch:{ all -> 0x01e9 }
            com.google.apps.d.b.c r10 = new com.google.apps.d.b.c     // Catch:{ all -> 0x01e9 }
            r10.<init>(r0)     // Catch:{ all -> 0x01e9 }
        L_0x0170:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x01e9 }
            if (r0 == 0) goto L_0x01e5
            java.lang.Object r0 = r10.next()     // Catch:{ all -> 0x01e9 }
            com.google.apps.d.a.z r0 = (com.google.apps.p3589d.p3590a.C45709z) r0     // Catch:{ all -> 0x01e9 }
            java.lang.String r2 = "line"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r2)     // Catch:{ all -> 0x01e9 }
            android.graphics.Paint r2 = r1.f117968e     // Catch:{ all -> 0x01e9 }
            float r11 = r2.getStrokeWidth()     // Catch:{ all -> 0x01e9 }
            android.graphics.Paint r2 = r1.f117968e     // Catch:{ all -> 0x01e9 }
            int r12 = r2.getColor()     // Catch:{ all -> 0x01e9 }
            android.graphics.Paint r2 = r1.f117968e     // Catch:{ all -> 0x01e9 }
            double r3 = r0.mo49778a()     // Catch:{ all -> 0x01e9 }
            float r3 = (float) r3     // Catch:{ all -> 0x01e9 }
            r2.setStrokeWidth(r3)     // Catch:{ all -> 0x01e9 }
            com.google.apps.d.k.f r2 = r0.mo49779b()     // Catch:{ all -> 0x01e9 }
            java.lang.String r3 = "line.color()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)     // Catch:{ all -> 0x01e9 }
            java.lang.Integer r2 = m80492m(r2)     // Catch:{ all -> 0x01e9 }
            if (r2 == 0) goto L_0x01af
            int r2 = r2.intValue()     // Catch:{ all -> 0x01e9 }
            android.graphics.Paint r3 = r1.f117968e     // Catch:{ all -> 0x01e9 }
            r3.setColor(r2)     // Catch:{ all -> 0x01e9 }
        L_0x01af:
            com.google.apps.d.k.i r2 = r0.mo49780c()     // Catch:{ all -> 0x01e9 }
            double r2 = r2.mo50042a()     // Catch:{ all -> 0x01e9 }
            float r3 = (float) r2     // Catch:{ all -> 0x01e9 }
            com.google.apps.d.k.i r2 = r0.mo49780c()     // Catch:{ all -> 0x01e9 }
            double r4 = r2.mo50043b()     // Catch:{ all -> 0x01e9 }
            float r4 = (float) r4     // Catch:{ all -> 0x01e9 }
            com.google.apps.d.k.i r2 = r0.mo49781d()     // Catch:{ all -> 0x01e9 }
            double r5 = r2.mo50042a()     // Catch:{ all -> 0x01e9 }
            float r5 = (float) r5     // Catch:{ all -> 0x01e9 }
            com.google.apps.d.k.i r0 = r0.mo49781d()     // Catch:{ all -> 0x01e9 }
            double r6 = r0.mo50043b()     // Catch:{ all -> 0x01e9 }
            float r6 = (float) r6     // Catch:{ all -> 0x01e9 }
            android.graphics.Paint r7 = r1.f117968e     // Catch:{ all -> 0x01e9 }
            r2 = r19
            r2.drawLine(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x01e9 }
            android.graphics.Paint r0 = r1.f117968e     // Catch:{ all -> 0x01e9 }
            r0.setStrokeWidth(r11)     // Catch:{ all -> 0x01e9 }
            android.graphics.Paint r0 = r1.f117968e     // Catch:{ all -> 0x01e9 }
            r0.setColor(r12)     // Catch:{ all -> 0x01e9 }
            goto L_0x0170
        L_0x01e5:
            r8.restoreToCount(r9)
            return
        L_0x01e9:
            r0 = move-exception
            r8.restoreToCount(r9)
            goto L_0x01ef
        L_0x01ee:
            throw r0
        L_0x01ef:
            goto L_0x01ee
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.p3545q.p3546a.C45206d.draw(android.graphics.Canvas):void");
    }

    /* renamed from: e */
    public final int mo49037e() {
        C45682aa aaVar = this.f117969f;
        double max = Math.max(C59203do.f157270a, aaVar.mo49737a().mo49792g() == C45697n.UP ? aaVar.mo49740d().mo50048b() : -aaVar.mo49740d().mo50050d());
        double d = (double) this.f117967d;
        Double.isNaN(d);
        return (int) Math.ceil((max * d) / this.f117969f.mo49737a().mo49786a());
    }

    /* renamed from: f */
    public final int mo49038f() {
        C45682aa aaVar = this.f117969f;
        double max = Math.max(C59203do.f157270a, aaVar.mo49737a().mo49792g() == C45697n.UP ? -aaVar.mo49740d().mo50050d() : aaVar.mo49740d().mo50048b());
        double d = (double) this.f117967d;
        Double.isNaN(d);
        return (int) Math.ceil((max * d) / this.f117969f.mo49737a().mo49786a());
    }

    /* renamed from: g */
    public final C45698o mo49039g() {
        C45698o a = this.f117969f.mo49737a();
        C69664n.m101060f(a, "geometry.canvasTransform()");
        return a;
    }

    public final int getIntrinsicHeight() {
        C45946k h = mo49043h();
        double b = h.mo50048b() - h.mo50050d();
        double d = (double) this.f117967d;
        Double.isNaN(d);
        return (int) Math.ceil((b * d) / this.f117969f.mo49737a().mo49786a());
    }

    public final int getIntrinsicWidth() {
        C45946k h = mo49043h();
        double a = h.mo50047a() - h.mo50049c();
        double d = (double) this.f117967d;
        Double.isNaN(d);
        return (int) Math.ceil((a * d) / this.f117969f.mo49737a().mo49786a());
    }

    public final int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public final C45946k mo49043h() {
        C45946k d = this.f117969f.mo49740d();
        C69664n.m101060f(d, "geometry.renderBounds()");
        return d;
    }

    /* renamed from: i */
    public final void mo49044i(C45684ac acVar) {
        C69664n.m101061g(acVar, "renderer");
        C45682aa e = acVar.mo49742e(C45698o.m81416h(100.0d, C45697n.DOWN));
        C69664n.m101060f(e, "renderer.createGeometry(…isDirection.DOWN)\n      )");
        this.f117969f = e;
        invalidateSelf();
    }

    /* renamed from: j */
    public final void mo49045j(Paint paint) {
        C69664n.m101061g(paint, "paint");
        Paint paint2 = new Paint(paint);
        paint2.setTypeface(this.f117964a);
        paint2.setTextSize(paint.getTextSize());
        this.f117968e = paint2;
        invalidateSelf();
    }

    /* renamed from: k */
    public final void mo49046k(float f) {
        this.f117967d = f;
        this.f117968e.setTextSize(f);
        invalidateSelf();
    }

    /* renamed from: l */
    public final void mo49047l(Typeface typeface) {
        if (!C69664n.m101066l(this.f117964a, typeface)) {
            this.f117964a = typeface;
            this.f117968e.setTypeface(typeface);
            invalidateSelf();
        }
    }

    public final void setAlpha(int i) {
        if (i != this.f117965b) {
            this.f117965b = i;
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (!C69664n.m101066l(colorFilter, this.f117966c)) {
            this.f117966c = colorFilter;
            invalidateSelf();
        }
    }
}
