package com.google.android.libraries.gsa.logoview;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.gsa.searchplate.C88945h;
import com.google.android.libraries.gsa.logoview.p1881a.C22886a;
import com.google.android.libraries.gsa.logoview.p1881a.C22887b;
import com.google.android.libraries.gsa.logoview.p1881a.C22888c;
import com.google.android.libraries.gsa.logoview.p1882b.C22903a;
import com.google.android.libraries.gsa.logoview.p1882b.C22904b;
import com.google.android.libraries.gsa.logoview.p1882b.C22905c;
import com.google.android.libraries.gsa.logoview.p1883c.C22907a;
import com.google.android.libraries.gsa.logoview.p1883c.C22908b;
import com.google.android.libraries.gsa.logoview.p1883c.C22909c;
import com.google.android.libraries.gsa.logoview.p1883c.C22910d;
import java.util.Iterator;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
public class LogoView extends View implements TimeAnimator.TimeListener, C22898aj {

    /* renamed from: j */
    public static final /* synthetic */ int f62993j = 0;

    /* renamed from: a */
    private final C22907a f62994a;

    /* renamed from: b */
    public final C22904b f62995b;

    /* renamed from: c */
    public final TimeAnimator f62996c;

    /* renamed from: d */
    public Bitmap f62997d;

    /* renamed from: e */
    public int f62998e;

    /* renamed from: f */
    public int f62999f;

    /* renamed from: g */
    public C22899ak f63000g;

    /* renamed from: h */
    public int f63001h;

    /* renamed from: i */
    public C88945h f63002i;

    /* renamed from: k */
    private final C22909c f63003k;

    /* renamed from: l */
    private final AnimatorSet f63004l;

    /* renamed from: m */
    private final Paint f63005m;

    /* renamed from: n */
    private final Paint f63006n;

    /* renamed from: o */
    private float f63007o;

    /* renamed from: p */
    private float f63008p;

    /* renamed from: q */
    private C22901am f63009q;

    /* renamed from: r */
    private boolean f63010r;

    static {
        new C22902b();
        new C22906c();
    }

    public LogoView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: g */
    private final float m42748g() {
        return (float) ((getHeight() - getPaddingTop()) - getPaddingBottom());
    }

    /* renamed from: h */
    private final float m42749h(float f, float f2) {
        return Math.min(m42750i() / f, m42748g() / f2);
    }

    /* renamed from: i */
    private final float m42750i() {
        return (float) ((getWidth() - getPaddingLeft()) - getPaddingRight());
    }

    /* renamed from: j */
    private static C22903a m42751j() {
        C22888c cVar = new C22888c(80.0f, 1000.0f);
        C22888c cVar2 = new C22888c(320.0f, 40.0f);
        return new C22903a(cVar, new C22886a(360.0f), new C22888c(80.0f, 160.0f), cVar2, new C22888c(160.0f, 1000.0f), new C22887b(1000.0f), new C22887b(160.0f), new C22887b(160.0f), new C22887b(320.0f));
    }

    /* renamed from: k */
    private final void m42752k(Canvas canvas, C22910d dVar) {
        this.f63005m.setStyle(Paint.Style.STROKE);
        this.f63005m.setStrokeCap(dVar.f63104g);
        this.f63005m.setStrokeWidth(dVar.f63102e);
        canvas.drawPath(dVar.f63100c, this.f63005m);
        this.f63005m.setStrokeWidth(dVar.f63103f);
        canvas.drawPath(dVar.f63101d, this.f63005m);
    }

    /* renamed from: l */
    private final void m42753l() {
        AnimatorSet animatorSet = this.f63004l;
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, PrivateKeyType.INVALID});
        ofInt.setDuration(100);
        ofInt.addUpdateListener(new C22911d(this, ofInt));
        ValueAnimator ofInt2 = ValueAnimator.ofInt(new int[]{PrivateKeyType.INVALID, 0});
        ofInt2.setDuration(100);
        ofInt2.addUpdateListener(new C22912e(this, ofInt2));
        animatorSet.playSequentially(new Animator[]{ofInt, ofInt2});
        animatorSet.addListener(new C22913f(this));
        this.f63005m.setAntiAlias(true);
        this.f63006n.setFilterBitmap(true);
        this.f62996c.setTimeListener(this);
    }

    /* renamed from: m */
    private final void m42754m(boolean z) {
        if (this.f62996c != null && this.f63010r != z) {
            this.f63010r = z;
            if (z) {
                if (!(this.f62998e == 255 && this.f62999f == 0)) {
                    this.f63000g.mo28246b();
                }
                this.f62996c.setTimeListener(this);
                return;
            }
            this.f63004l.cancel();
            this.f62996c.setTimeListener((TimeAnimator.TimeListener) null);
            this.f62996c.end();
            C88945h hVar = this.f63002i;
            if (hVar != null) {
                hVar.mo82832a(false);
            }
            this.f63000g.f63051a.pause();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public TimeAnimator mo23051a() {
        return new TimeAnimator();
    }

    /* renamed from: b */
    public final void mo28222b() {
        if (!this.f62996c.isStarted() && this.f63010r) {
            C88945h hVar = this.f63002i;
            if (hVar != null) {
                hVar.mo82832a(true);
            }
            this.f62996c.start();
        }
    }

    /* renamed from: c */
    public final void mo28223c(float f, float f2) {
        C22904b bVar = this.f62995b;
        if (f <= 0.0f || f2 <= 0.0f) {
            throw new IllegalArgumentException("Width and height cannot be 0 or below");
        }
        bVar.f63086k = f;
        bVar.f63087l = f2;
        mo28226f();
        invalidate();
    }

    /* renamed from: d */
    public final void mo28224d(C22901am amVar) {
        this.f63009q = amVar;
        this.f63000g.f63056f = amVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x011f, code lost:
        if (r0 != com.google.android.libraries.gsa.logoview.C22900al.m42822b(r13)) goto L_0x0121;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0130  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28225e(int r13, boolean r14) {
        /*
            r12 = this;
            r12.f63001h = r13
            boolean r0 = r12.f63010r
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x000d
            if (r14 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            r0 = 0
            goto L_0x000e
        L_0x000d:
            r0 = 1
        L_0x000e:
            com.google.android.libraries.gsa.logoview.ak r3 = r12.f63000g
            int r4 = r3.f63060j
            if (r13 != r4) goto L_0x0029
            int r4 = r3.f63061k
            if (r4 != 0) goto L_0x0029
            com.google.android.libraries.gsa.logoview.ai r4 = r3.f63059i
            com.google.android.libraries.gsa.logoview.al r5 = r3.f63053c
            com.google.android.libraries.gsa.logoview.ai r5 = com.google.android.libraries.gsa.logoview.C22900al.m42823c(r13)
            if (r4 != r5) goto L_0x0029
            java.util.ArrayDeque r13 = r3.f63054d
            r13.clear()
            goto L_0x0124
        L_0x0029:
            int r4 = r3.f63061k
            if (r13 == r4) goto L_0x0124
            r3.f63061k = r13
            java.util.ArrayDeque r13 = r3.f63054d
            r13.clear()
            com.google.android.libraries.gsa.logoview.al r13 = r3.f63053c
            int r13 = r3.f63060j
            int r13 = com.google.android.libraries.gsa.logoview.C22900al.m42824d(r13)
            com.google.android.libraries.gsa.logoview.al r4 = r3.f63053c
            int r4 = r3.f63061k
            int r4 = com.google.android.libraries.gsa.logoview.C22900al.m42824d(r4)
            if (r13 == r4) goto L_0x0047
            goto L_0x0048
        L_0x0047:
            r2 = 0
        L_0x0048:
            if (r2 == 0) goto L_0x00c4
            java.util.Deque r5 = r3.mo28245a(r13)
            java.util.Deque r4 = r3.mo28245a(r4)
        L_0x0052:
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L_0x0075
            boolean r6 = r4.isEmpty()
            if (r6 != 0) goto L_0x0075
            java.lang.Object r6 = r5.getFirst()
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.lang.Object r7 = r4.getFirst()
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0075
            r5.removeFirst()
            r4.removeFirst()
            goto L_0x0052
        L_0x0075:
            java.util.Iterator r5 = r5.descendingIterator()
        L_0x0079:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0095
            java.lang.Object r6 = r5.next()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.util.ArrayDeque r7 = r3.f63054d
            com.google.android.libraries.gsa.logoview.al r8 = r3.f63053c
            com.google.android.libraries.gsa.logoview.ai r6 = com.google.android.libraries.gsa.logoview.C22900al.m42822b(r6)
            r7.addLast(r6)
            goto L_0x0079
        L_0x0095:
            java.util.Iterator r4 = r4.iterator()
        L_0x0099:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00b5
            java.lang.Object r5 = r4.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.util.ArrayDeque r6 = r3.f63054d
            com.google.android.libraries.gsa.logoview.al r7 = r3.f63053c
            com.google.android.libraries.gsa.logoview.ai r5 = com.google.android.libraries.gsa.logoview.C22900al.m42821a(r5)
            r6.addLast(r5)
            goto L_0x0099
        L_0x00b5:
            com.google.android.libraries.gsa.logoview.ai r4 = r3.f63059i
            java.util.ArrayDeque r5 = r3.f63054d
            java.lang.Object r5 = r5.getFirst()
            if (r4 != r5) goto L_0x00c4
            java.util.ArrayDeque r4 = r3.f63054d
            r4.pollFirst()
        L_0x00c4:
            java.util.ArrayDeque r4 = r3.f63054d
            com.google.android.libraries.gsa.logoview.al r5 = r3.f63053c
            int r5 = r3.f63061k
            com.google.android.libraries.gsa.logoview.ai r5 = com.google.android.libraries.gsa.logoview.C22900al.m42823c(r5)
            r4.addLast(r5)
            if (r0 == 0) goto L_0x0103
        L_0x00d3:
            java.util.ArrayDeque r13 = r3.f63054d
            boolean r13 = r13.isEmpty()
            if (r13 != 0) goto L_0x0100
            java.util.ArrayDeque r13 = r3.f63054d
            java.lang.Object r13 = r13.removeFirst()
            com.google.android.libraries.gsa.logoview.ai r13 = (com.google.android.libraries.gsa.logoview.C22897ai) r13
            r3.mo28248d(r13)
            r4 = 0
            r3.f63058h = r4
            r3.f63057g = r4
            com.google.android.libraries.gsa.logoview.ai r6 = r3.f63059i
            r7 = 0
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            com.google.android.libraries.gsa.logoview.b.b r11 = r3.f63052b
            r6.mo28243c(r7, r9, r11)
            com.google.android.libraries.gsa.logoview.b.b r13 = r3.f63052b
            r13.mo28266d()
            goto L_0x00d3
        L_0x0100:
            r3.f63062l = r1
            goto L_0x0124
        L_0x0103:
            android.animation.TimeAnimator r0 = r3.f63051a
            boolean r0 = r0.isStarted()
            if (r0 == 0) goto L_0x0121
            if (r2 == 0) goto L_0x0121
            com.google.android.libraries.gsa.logoview.ai r0 = r3.f63059i
            com.google.android.libraries.gsa.logoview.al r1 = r3.f63053c
            com.google.android.libraries.gsa.logoview.ai r1 = com.google.android.libraries.gsa.logoview.C22900al.m42821a(r13)
            if (r0 == r1) goto L_0x0124
            com.google.android.libraries.gsa.logoview.ai r0 = r3.f63059i
            com.google.android.libraries.gsa.logoview.al r1 = r3.f63053c
            com.google.android.libraries.gsa.logoview.ai r13 = com.google.android.libraries.gsa.logoview.C22900al.m42822b(r13)
            if (r0 == r13) goto L_0x0124
        L_0x0121:
            r3.mo28249e()
        L_0x0124:
            boolean r13 = r12.f63010r
            if (r13 == 0) goto L_0x0130
            if (r14 == 0) goto L_0x012f
            com.google.android.libraries.gsa.logoview.ak r13 = r12.f63000g
            r13.mo28246b()
        L_0x012f:
            return
        L_0x0130:
            com.google.android.libraries.gsa.logoview.ak r13 = r12.f63000g
            android.animation.TimeAnimator r13 = r13.f63051a
            r13.pause()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.gsa.logoview.LogoView.mo28225e(int, boolean):void");
    }

    /* renamed from: f */
    public final void mo28226f() {
        C22904b bVar = this.f62995b;
        this.f63008p = m42749h(bVar.f63086k, bVar.f63087l);
        Bitmap bitmap = this.f62997d;
        if (bitmap != null) {
            this.f63007o = m42749h(((float) bitmap.getWidth()) * (this.f62995b.f63086k / 75.0f), ((float) this.f62997d.getHeight()) * (this.f62995b.f63087l / 25.0f));
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m42754m(isShown());
        C22899ak akVar = this.f63000g;
        akVar.f63055e = this;
        akVar.f63056f = this.f63009q;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m42754m(false);
        C22899ak akVar = this.f63000g;
        akVar.f63055e = null;
        akVar.f63056f = null;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int i;
        Canvas canvas2 = canvas;
        canvas.save();
        float f = 2.0f;
        canvas2.translate(((float) getPaddingLeft()) + (m42750i() / 2.0f), ((float) getPaddingTop()) + (m42748g() / 2.0f));
        if (this.f62997d != null && this.f62998e > 0) {
            canvas.save();
            float f2 = this.f63007o;
            canvas2.scale(f2, f2);
            int width = this.f62997d.getWidth();
            int height = this.f62997d.getHeight();
            this.f63006n.setAlpha(this.f62998e);
            canvas2.drawBitmap(this.f62997d, ((float) (-width)) / 2.0f, ((float) (-height)) / 2.0f, this.f63006n);
            canvas.restore();
        }
        Bitmap bitmap = this.f62997d;
        if (bitmap == null || this.f62999f > 0) {
            int i2 = bitmap == null ? PrivateKeyType.INVALID : this.f62999f;
            Iterator it = this.f62995b.iterator();
            while (it.hasNext()) {
                C22903a aVar = (C22903a) it.next();
                this.f63005m.setColor(aVar.f63074j);
                this.f63005m.setAlpha(i2);
                float f3 = aVar.f63065a.f63013c;
                float f4 = this.f62995b.f63083h.f63088a.f63013c;
                float f5 = aVar.f63066b.f63013c;
                float f6 = aVar.f63068d.f63013c;
                float f7 = aVar.f63069e.f63013c;
                double d = (double) (f4 + f5);
                float cos = (((float) Math.cos(d)) * f3) + f6;
                float sin = (f3 * ((float) Math.sin(d))) + f7;
                if (aVar.mo28261g()) {
                    float f8 = aVar.f63073i.f63013c;
                    this.f63003k.mo28276f();
                    C22904b bVar = this.f62995b;
                    if (aVar == bVar.f63077b) {
                        C22909c cVar = this.f63003k;
                        cVar.mo28275a(cVar.f63100c, C22908b.f63091a, 7.0f, -1.0f, f8);
                        cVar.f63102e = f8 + f8 + 4.0f;
                        cVar.f63104g = Paint.Cap.ROUND;
                    } else if (aVar == bVar.f63078c) {
                        C22909c cVar2 = this.f63003k;
                        cVar2.mo28275a(cVar2.f63100c, C22908b.f63092b, 14.0f, -1.0f, f8);
                        cVar2.f63102e = (-2.0f * f8) + 4.0f;
                        cVar2.f63104g = f8 > 0.5f ? Paint.Cap.BUTT : Paint.Cap.ROUND;
                    } else if (aVar == bVar.f63079d) {
                        C22909c cVar3 = this.f63003k;
                        cVar3.mo28275a(cVar3.f63100c, C22908b.f63093c, 5.0f, -1.0f, f8);
                        cVar3.f63102e = (-2.0f * f8) + 4.0f;
                        cVar3.f63104g = f8 > 0.5f ? Paint.Cap.BUTT : Paint.Cap.ROUND;
                    } else if (aVar == bVar.f63080e) {
                        C22909c cVar4 = this.f63003k;
                        cVar4.mo28275a(cVar4.f63100c, C22908b.f63094d, 4.0f, 10.0f, f8);
                        cVar4.f63102e = (-2.0f * f8) + 4.0f;
                        cVar4.f63104g = f8 > 0.5f ? Paint.Cap.BUTT : Paint.Cap.ROUND;
                    }
                    this.f63003k.mo28277g(cos, sin, this.f63008p);
                    m42752k(canvas2, this.f63003k);
                } else {
                    float f9 = aVar.f63072h.f63013c;
                    if (f9 > 0.001f) {
                        float f10 = aVar.f63071g.f63013c;
                        this.f62994a.mo28276f();
                        C22904b bVar2 = this.f62995b;
                        if (aVar == bVar2.f63077b) {
                            C22907a aVar2 = this.f62994a;
                            float c = C22907a.m42846c(f9);
                            float b = C22907a.m42845b(f10, f9);
                            float f11 = ((0.66999996f * f9) + 1.0f) * b;
                            float d2 = C22907a.m42847d(f11, f9);
                            float f12 = d2 + (((d2 * 1.08f) - d2) * f9);
                            float f13 = (b - f11) + (((d2 - f12) / f) * f9);
                            aVar2.f63102e = f12;
                            aVar2.f63104g = Paint.Cap.BUTT;
                            if (c > 0.0f) {
                                C22907a.m42848e(aVar2.f63098a, f11, 0.97f);
                                aVar2.f63098a.offset(0.0f, f13);
                                aVar2.f63100c.addArc(aVar2.f63098a, 88.0f, 184.0f);
                                C22907a.m42848e(aVar2.f63098a, f11, 1.0f);
                                aVar2.f63098a.offset(0.0f, f13);
                                aVar2.f63100c.addArc(aVar2.f63098a, 88.0f, 184.0f);
                                float f14 = f11 + f13;
                                aVar2.f63100c.moveTo(0.0f, f14);
                                aVar2.f63100c.cubicTo(f11 * 0.83f, f14, f11 * 0.99f, (0.3f * f11) + f13, f11 * 0.93f, (-0.05f * f11) + f13);
                                C22907a.m42848e(aVar2.f63098a, f11, 1.0f);
                                aVar2.f63098a.offset(0.0f, f13);
                                aVar2.f63100c.addArc(aVar2.f63098a, 270.0f, 90.0f - (46.0f * c));
                                float f15 = f11 * 1.08f;
                                float f16 = f13 + 0.42f;
                                aVar2.f63100c.moveTo(f15 - ((f11 * 1.06f) * c), f16);
                                aVar2.f63100c.lineTo(f15, f16);
                            } else {
                                aVar2.f63100c.addCircle(0.0f, f13, f11, Path.Direction.CW);
                            }
                        } else if (aVar == bVar2.f63078c) {
                            this.f62994a.mo28274a(f9, f10);
                        } else if (aVar == bVar2.f63079d) {
                            this.f62994a.mo28274a(f9, f10);
                        } else if (aVar == bVar2.f63081f) {
                            C22907a aVar3 = this.f62994a;
                            float c2 = C22907a.m42846c(f9);
                            float b2 = C22907a.m42845b(f10, f9);
                            float d3 = C22907a.m42847d(b2, f9);
                            aVar3.f63104g = Paint.Cap.BUTT;
                            aVar3.f63102e = d3;
                            if (c2 > 0.0f) {
                                aVar3.f63102e = d3 / 2.0f;
                                C22907a.m42848e(aVar3.f63098a, b2, 0.92f);
                                float f17 = d3 / 4.0f;
                                aVar3.f63098a.inset(f17, f17);
                                aVar3.f63100c.addOval(aVar3.f63098a, Path.Direction.CW);
                                float f18 = (d3 * -2.0f) / 4.0f;
                                aVar3.f63098a.inset(f18 * 0.9f, f18);
                                aVar3.f63098a.offset(-0.4f, 0.0f);
                                aVar3.f63100c.addOval(aVar3.f63098a, Path.Direction.CW);
                                aVar3.f63098a.offset(0.5f, 0.0f);
                                aVar3.f63100c.addArc(aVar3.f63098a, 88.0f, 184.0f);
                                float min = Math.min(c2 / 0.1f, 1.0f);
                                float f19 = (c2 - 44.8f) / 0.9f;
                                aVar3.f63103f = d3 * 1.05f;
                                if (min > 0.0f) {
                                    float f20 = 0.9f * b2;
                                    aVar3.f63101d.moveTo(f20, -1.17f * b2 * min);
                                    aVar3.f63101d.lineTo(f20, 1.21f * b2 * min);
                                }
                                if (f19 > 0.0f) {
                                    C22907a.m42848e(aVar3.f63098a, b2, 0.925f);
                                    aVar3.f63098a.offset(-0.14f, b2 * 1.15f);
                                    aVar3.f63101d.addArc(aVar3.f63098a, -2.0f, f19 * 158.0f);
                                }
                            } else {
                                aVar3.f63100c.addCircle(0.0f, 0.0f, b2, Path.Direction.CW);
                            }
                        } else if (aVar == bVar2.f63080e) {
                            C22907a aVar4 = this.f62994a;
                            aVar4.f63102e = f10 * 4.0f * ((-0.35000002f * f9) + 1.0f);
                            if (f9 > 0.66f) {
                                aVar4.f63104g = Paint.Cap.SQUARE;
                            } else {
                                aVar4.f63104g = Paint.Cap.ROUND;
                            }
                            aVar4.f63100c.moveTo(0.0f, -10.46f * f9);
                            aVar4.f63100c.lineTo(0.0f, 4.19f * f9);
                        } else if (aVar == bVar2.f63082g) {
                            C22907a aVar5 = this.f62994a;
                            float c3 = C22907a.m42846c(f9);
                            float b3 = C22907a.m42845b(f10, f9);
                            aVar5.f63102e = C22907a.m42847d(b3, f9);
                            aVar5.f63104g = Paint.Cap.BUTT;
                            if (c3 > 0.0f) {
                                C22907a.m42848e(aVar5.f63098a, b3, 0.9f);
                                aVar5.f63100c.addArc(aVar5.f63098a, 88.0f, 184.0f);
                                C22907a.m42848e(aVar5.f63098a, b3, 0.94f);
                                aVar5.f63100c.addArc(aVar5.f63098a, 88.0f, 184.0f);
                                C22907a.m42848e(aVar5.f63098a, b3, 1.05f);
                                aVar5.f63100c.addArc(aVar5.f63098a, 33.0f, 57.0f);
                                float f21 = 393.0f - (c3 * 48.0f);
                                C22907a.m42848e(aVar5.f63098a, b3, 0.89f);
                                aVar5.f63100c.addArc(aVar5.f63098a, 270.0f, -270.0f + f21);
                                double radians = Math.toRadians((double) ((-173.0f + f21) - 0.40625f));
                                double radians2 = Math.toRadians((double) (f21 - 0.40625f));
                                double d4 = (double) (b3 * 1.15f);
                                double d5 = (double) ((float) radians);
                                double cos2 = Math.cos(d5);
                                double sin2 = Math.sin(d5);
                                double d6 = (double) ((float) radians2);
                                double cos3 = Math.cos(d6);
                                double sin3 = Math.sin(d6);
                                Path path = aVar5.f63101d;
                                Double.isNaN(d4);
                                i = i2;
                                Double.isNaN(d4);
                                path.moveTo((float) (d4 * cos2), (float) (sin2 * d4));
                                Path path2 = aVar5.f63101d;
                                Double.isNaN(d4);
                                Double.isNaN(d4);
                                path2.lineTo((float) (d4 * cos3), (float) (d4 * sin3));
                                aVar5.f63103f = aVar5.f63102e * 0.85f;
                            } else {
                                i = i2;
                                aVar5.f63100c.addCircle(0.0f, 0.0f, b3, Path.Direction.CW);
                            }
                            this.f62994a.mo28277g(cos, sin + (f9 * 0.6f), this.f63008p);
                            m42752k(canvas2, this.f62994a);
                            i2 = i;
                            f = 2.0f;
                        }
                        i = i2;
                        this.f62994a.mo28277g(cos, sin + (f9 * 0.6f), this.f63008p);
                        m42752k(canvas2, this.f62994a);
                        i2 = i;
                        f = 2.0f;
                    } else {
                        int i3 = i2;
                        float f22 = aVar.f63070f.f63013c;
                        if (f22 < -0.001f || f22 > 0.001f) {
                            f = 2.0f;
                            this.f63005m.setStrokeWidth(aVar.f63067c.f63013c * this.f63008p);
                            this.f63005m.setStyle(Paint.Style.STROKE);
                            this.f63005m.setStrokeCap(Paint.Cap.ROUND);
                            float f23 = aVar.f63070f.f63013c;
                            float f24 = this.f63008p;
                            float f25 = cos * f24;
                            canvas.drawLine(f25, (sin - f23) * f24, f25, (sin + f23) * f24, this.f63005m);
                        } else {
                            float f26 = aVar.f63067c.f63013c;
                            float f27 = aVar.f63071g.f63013c;
                            this.f63005m.setStyle(Paint.Style.FILL);
                            float f28 = this.f63008p;
                            f = 2.0f;
                            canvas2.drawCircle(cos * f28, sin * f28, ((f26 * f27) / 2.0f) * f28, this.f63005m);
                        }
                        i2 = i3;
                    }
                }
            }
            setAlpha(this.f62995b.f63084i.f63013c);
        }
        canvas.restore();
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mo28226f();
    }

    public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
        for (long min = Math.min(100, j2); min > 0; min -= 10) {
            C22904b bVar = this.f62995b;
            long min2 = Math.min(min, 10);
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                C22903a aVar = (C22903a) it.next();
                aVar.f63065a.mo28238f(min2);
                aVar.f63066b.mo28238f(min2);
                aVar.f63067c.mo28238f(min2);
                aVar.f63068d.mo28238f(min2);
                aVar.f63069e.mo28238f(min2);
                aVar.f63070f.mo28238f(min2);
                aVar.f63072h.mo28238f(min2);
                aVar.f63073i.mo28238f(min2);
                aVar.f63071g.mo28238f(min2);
            }
            C22905c cVar = bVar.f63083h;
            if (cVar.f63090c) {
                cVar.f63089b.mo28238f(min2);
                cVar.f63088a.mo28237e(cVar.f63088a.f63013c + (cVar.f63089b.f63013c * (Math.min((float) min2, 50.0f) / 1000.0f)));
            } else {
                cVar.f63088a.mo28238f(min2);
            }
            bVar.f63084i.mo28238f(min2);
        }
        C22904b bVar2 = this.f62995b;
        Iterator it2 = bVar2.iterator();
        while (true) {
            if (it2.hasNext()) {
                C22903a aVar2 = (C22903a) it2.next();
                if (aVar2.f63065a.f63015e) {
                    if (aVar2.f63066b.f63015e) {
                        if (aVar2.f63067c.f63015e) {
                            if (aVar2.f63068d.f63015e) {
                                if (aVar2.f63069e.f63015e) {
                                    if (aVar2.f63070f.f63015e) {
                                        if (aVar2.f63072h.f63015e) {
                                            if (aVar2.f63073i.f63015e) {
                                                if (!aVar2.f63071g.f63015e) {
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                C22905c cVar2 = bVar2.f63083h;
                if (!cVar2.f63090c && cVar2.f63088a.f63015e && bVar2.f63084i.f63015e) {
                    this.f62996c.end();
                    if (this.f63000g.f63060j != 6 || this.f62998e == 255) {
                        C88945h hVar = this.f63002i;
                        if (hVar != null) {
                            hVar.mo82832a(false);
                        }
                    } else {
                        this.f63004l.start();
                    }
                }
            }
        }
        this.f63004l.cancel();
        this.f62999f = PrivateKeyType.INVALID;
        this.f62998e = 0;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i) {
        m42754m(isShown());
    }

    public LogoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f62998e = 0;
        this.f62999f = PrivateKeyType.INVALID;
        this.f63010r = true;
        this.f63001h = 0;
        this.f63004l = new AnimatorSet();
        this.f62994a = new C22907a();
        this.f63003k = new C22909c();
        this.f63005m = new Paint();
        this.f63006n = new Paint();
        C22904b bVar = new C22904b(m42751j(), m42751j(), m42751j(), m42751j(), m42751j(), m42751j(), new C22905c(new C22886a(80.0f), new C22887b(80.0f)), new C22887b(1000.0f));
        this.f62995b = bVar;
        this.f62996c = mo23051a();
        this.f63000g = new C22899ak(bVar, mo23051a(), this, new C22900al());
        m42753l();
    }

    LogoView(Context context, AttributeSet attributeSet, AnimatorSet animatorSet, C22907a aVar, C22909c cVar, Paint paint, Paint paint2, C22904b bVar, TimeAnimator timeAnimator, C22899ak akVar) {
        super(context, attributeSet);
        this.f62998e = 0;
        this.f62999f = PrivateKeyType.INVALID;
        this.f63010r = true;
        this.f63001h = 0;
        this.f63004l = animatorSet;
        this.f62994a = aVar;
        this.f63003k = cVar;
        this.f63005m = paint;
        this.f63006n = paint2;
        this.f62995b = bVar;
        this.f62996c = timeAnimator;
        this.f63000g = akVar;
        m42753l();
    }
}
