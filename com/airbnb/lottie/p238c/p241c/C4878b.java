package com.airbnb.lottie.p238c.p241c;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import com.airbnb.lottie.C4825ac;
import com.airbnb.lottie.C4834al;
import com.airbnb.lottie.C4838b;
import com.airbnb.lottie.p234a.C4781a;
import com.airbnb.lottie.p234a.p235a.C4787f;
import com.airbnb.lottie.p234a.p236b.C4802a;
import com.airbnb.lottie.p234a.p236b.C4807f;
import com.airbnb.lottie.p234a.p236b.C4809h;
import com.airbnb.lottie.p234a.p236b.C4813l;
import com.airbnb.lottie.p234a.p236b.C4821t;
import com.airbnb.lottie.p238c.C4890e;
import com.airbnb.lottie.p238c.C4891f;
import com.airbnb.lottie.p246g.C4958c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.c.c.b */
/* compiled from: PG */
public abstract class C4878b implements C4787f, C4802a, C4891f {

    /* renamed from: a */
    final Matrix f15539a;

    /* renamed from: b */
    final C4825ac f15540b;

    /* renamed from: c */
    final C4882f f15541c;

    /* renamed from: d */
    public C4809h f15542d;

    /* renamed from: e */
    public C4878b f15543e;

    /* renamed from: f */
    public C4878b f15544f;

    /* renamed from: g */
    final C4821t f15545g;

    /* renamed from: h */
    private final Path f15546h = new Path();

    /* renamed from: i */
    private final Matrix f15547i = new Matrix();

    /* renamed from: j */
    private final Paint f15548j;

    /* renamed from: k */
    private final Paint f15549k;

    /* renamed from: l */
    private final Paint f15550l;

    /* renamed from: m */
    private final Paint f15551m;

    /* renamed from: n */
    private final Paint f15552n;

    /* renamed from: o */
    private final RectF f15553o;

    /* renamed from: p */
    private final RectF f15554p;

    /* renamed from: q */
    private final RectF f15555q;

    /* renamed from: r */
    private final RectF f15556r;

    /* renamed from: s */
    private C4813l f15557s;

    /* renamed from: t */
    private List f15558t;

    /* renamed from: u */
    private final List f15559u;

    /* renamed from: v */
    private boolean f15560v;

    public C4878b(C4825ac acVar, C4882f fVar) {
        boolean z = true;
        this.f15548j = new C4781a(1);
        this.f15549k = new C4781a(PorterDuff.Mode.DST_IN, (byte[]) null);
        this.f15550l = new C4781a(PorterDuff.Mode.DST_OUT, (byte[]) null);
        C4781a aVar = new C4781a(1);
        this.f15551m = aVar;
        this.f15552n = new C4781a(PorterDuff.Mode.CLEAR);
        this.f15553o = new RectF();
        this.f15554p = new RectF();
        this.f15555q = new RectF();
        this.f15556r = new RectF();
        this.f15539a = new Matrix();
        this.f15559u = new ArrayList();
        this.f15560v = true;
        this.f15540b = acVar;
        this.f15541c = fVar;
        String str = fVar.f15572c;
        if (fVar.f15591v == 3) {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        C4821t tVar = new C4821t(fVar.f15577h);
        this.f15545g = tVar;
        tVar.mo9753d(this);
        List list = fVar.f15576g;
        if (list != null && !list.isEmpty()) {
            C4813l lVar = new C4813l(fVar.f15576g);
            this.f15557s = lVar;
            for (C4807f g : lVar.f15307a) {
                g.mo9740g(this);
            }
            for (C4807f fVar2 : this.f15557s.f15308b) {
                mo9811h(fVar2);
                fVar2.mo9740g(this);
            }
        }
        if (!this.f15541c.f15588s.isEmpty()) {
            C4809h hVar = new C4809h(this.f15541c.f15588s);
            this.f15542d = hVar;
            hVar.f15299b = true;
            hVar.mo9740g(new C4877a(this));
            mo9816m(((Float) this.f15542d.mo9738e()).floatValue() != 1.0f ? false : z);
            mo9811h(this.f15542d);
            return;
        }
        mo9816m(true);
    }

    /* renamed from: p */
    private final void m13535p() {
        if (this.f15558t == null) {
            if (this.f15544f == null) {
                this.f15558t = Collections.emptyList();
                return;
            }
            this.f15558t = new ArrayList();
            for (C4878b bVar = this.f15544f; bVar != null; bVar = bVar.f15544f) {
                this.f15558t.add(bVar);
            }
        }
    }

    /* renamed from: q */
    private final void m13536q(Canvas canvas) {
        canvas.drawRect(this.f15553o.left - 4.0f, this.f15553o.top - 4.0f, this.f15553o.right + 1.0f, this.f15553o.bottom + 1.0f, this.f15552n);
        C4838b.m13493a();
    }

    /* renamed from: r */
    private final void m13537r() {
        C4834al alVar = this.f15540b.f15341a.f15752a;
        String str = this.f15541c.f15572c;
    }

    /* renamed from: a */
    public void mo9714a(Object obj, C4958c cVar) {
        this.f15545g.mo9754e(obj, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x012d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9715b(android.graphics.Canvas r17, android.graphics.Matrix r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            boolean r3 = r0.f15560v
            if (r3 == 0) goto L_0x03e6
            com.airbnb.lottie.c.c.f r3 = r0.f15541c
            boolean r3 = r3.f15589t
            if (r3 == 0) goto L_0x0012
            goto L_0x03e6
        L_0x0012:
            r16.m13535p()
            android.graphics.Matrix r3 = r0.f15547i
            r3.reset()
            android.graphics.Matrix r3 = r0.f15547i
            r3.set(r2)
            java.util.List r3 = r0.f15558t
            int r3 = r3.size()
        L_0x0025:
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x003d
            android.graphics.Matrix r4 = r0.f15547i
            java.util.List r5 = r0.f15558t
            java.lang.Object r5 = r5.get(r3)
            com.airbnb.lottie.c.c.b r5 = (com.airbnb.lottie.p238c.p241c.C4878b) r5
            com.airbnb.lottie.a.b.t r5 = r5.f15545g
            android.graphics.Matrix r5 = r5.mo9750a()
            r4.preConcat(r5)
            goto L_0x0025
        L_0x003d:
            com.airbnb.lottie.C4838b.m13493a()
            com.airbnb.lottie.a.b.t r3 = r0.f15545g
            com.airbnb.lottie.a.b.f r3 = r3.f15330e
            if (r3 != 0) goto L_0x0049
            r3 = 100
            goto L_0x0053
        L_0x0049:
            java.lang.Object r3 = r3.mo9738e()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
        L_0x0053:
            r4 = r19
            float r4 = (float) r4
            r5 = 1132396544(0x437f0000, float:255.0)
            float r4 = r4 / r5
            float r3 = (float) r3
            float r4 = r4 * r3
            r3 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 / r3
            float r4 = r4 * r5
            int r3 = (int) r4
            boolean r4 = r16.mo9818o()
            if (r4 != 0) goto L_0x0089
            boolean r4 = r16.mo9817n()
            if (r4 == 0) goto L_0x006f
            goto L_0x0089
        L_0x006f:
            android.graphics.Matrix r2 = r0.f15547i
            com.airbnb.lottie.a.b.t r4 = r0.f15545g
            android.graphics.Matrix r4 = r4.mo9750a()
            r2.preConcat(r4)
            android.graphics.Matrix r2 = r0.f15547i
            r0.mo9812i(r1, r2, r3)
            com.airbnb.lottie.C4838b.m13493a()
            com.airbnb.lottie.C4838b.m13493a()
            r16.m13537r()
            return
        L_0x0089:
            android.graphics.RectF r4 = r0.f15553o
            android.graphics.Matrix r5 = r0.f15547i
            r6 = 0
            r0.mo9716c(r4, r5, r6)
            android.graphics.RectF r4 = r0.f15553o
            boolean r5 = r16.mo9818o()
            r7 = 3
            r8 = 1
            r9 = 0
            if (r5 != 0) goto L_0x009d
            goto L_0x00ba
        L_0x009d:
            com.airbnb.lottie.c.c.f r5 = r0.f15541c
            int r5 = r5.f15591v
            if (r5 == r7) goto L_0x00ba
            android.graphics.RectF r5 = r0.f15555q
            r5.set(r9, r9, r9, r9)
            com.airbnb.lottie.c.c.b r5 = r0.f15543e
            android.graphics.RectF r10 = r0.f15555q
            r5.mo9716c(r10, r2, r8)
            android.graphics.RectF r5 = r0.f15555q
            boolean r5 = r4.intersect(r5)
            if (r5 != 0) goto L_0x00ba
            r4.set(r9, r9, r9, r9)
        L_0x00ba:
            android.graphics.Matrix r4 = r0.f15547i
            com.airbnb.lottie.a.b.t r5 = r0.f15545g
            android.graphics.Matrix r5 = r5.mo9750a()
            r4.preConcat(r5)
            android.graphics.RectF r4 = r0.f15553o
            android.graphics.Matrix r5 = r0.f15547i
            android.graphics.RectF r10 = r0.f15554p
            r10.set(r9, r9, r9, r9)
            boolean r10 = r16.mo9817n()
            r11 = 2
            r12 = 0
            if (r10 != 0) goto L_0x00d9
        L_0x00d6:
            r5 = 0
            goto L_0x0175
        L_0x00d9:
            com.airbnb.lottie.a.b.l r10 = r0.f15557s
            java.util.List r10 = r10.f15309c
            int r10 = r10.size()
            r13 = 0
        L_0x00e2:
            if (r13 >= r10) goto L_0x0169
            com.airbnb.lottie.a.b.l r14 = r0.f15557s
            java.util.List r14 = r14.f15309c
            java.lang.Object r14 = r14.get(r13)
            com.airbnb.lottie.c.b.f r14 = (com.airbnb.lottie.p238c.p240b.C4863f) r14
            com.airbnb.lottie.a.b.l r15 = r0.f15557s
            java.util.List r15 = r15.f15307a
            java.lang.Object r15 = r15.get(r13)
            com.airbnb.lottie.a.b.f r15 = (com.airbnb.lottie.p234a.p236b.C4807f) r15
            java.lang.Object r15 = r15.mo9738e()
            android.graphics.Path r15 = (android.graphics.Path) r15
            android.graphics.Path r9 = r0.f15546h
            r9.set(r15)
            android.graphics.Path r9 = r0.f15546h
            r9.transform(r5)
            int r9 = r14.f15481d
            int r15 = r9 + -1
            if (r9 == 0) goto L_0x0168
            if (r15 == 0) goto L_0x0117
            if (r15 == r8) goto L_0x00d6
            if (r15 == r11) goto L_0x0117
            if (r15 == r7) goto L_0x00d6
            goto L_0x011c
        L_0x0117:
            boolean r9 = r14.f15480c
            if (r9 == 0) goto L_0x011c
            goto L_0x00d6
        L_0x011c:
            android.graphics.Path r9 = r0.f15546h
            android.graphics.RectF r14 = r0.f15556r
            r9.computeBounds(r14, r6)
            if (r13 != 0) goto L_0x012d
            android.graphics.RectF r9 = r0.f15554p
            android.graphics.RectF r14 = r0.f15556r
            r9.set(r14)
            goto L_0x0160
        L_0x012d:
            android.graphics.RectF r9 = r0.f15554p
            float r14 = r9.left
            android.graphics.RectF r15 = r0.f15556r
            float r15 = r15.left
            float r14 = java.lang.Math.min(r14, r15)
            android.graphics.RectF r15 = r0.f15554p
            float r15 = r15.top
            android.graphics.RectF r6 = r0.f15556r
            float r6 = r6.top
            float r6 = java.lang.Math.min(r15, r6)
            android.graphics.RectF r15 = r0.f15554p
            float r15 = r15.right
            android.graphics.RectF r7 = r0.f15556r
            float r7 = r7.right
            float r7 = java.lang.Math.max(r15, r7)
            android.graphics.RectF r15 = r0.f15554p
            float r15 = r15.bottom
            android.graphics.RectF r11 = r0.f15556r
            float r11 = r11.bottom
            float r11 = java.lang.Math.max(r15, r11)
            r9.set(r14, r6, r7, r11)
        L_0x0160:
            int r13 = r13 + 1
            r6 = 0
            r7 = 3
            r9 = 0
            r11 = 2
            goto L_0x00e2
        L_0x0168:
            throw r12
        L_0x0169:
            android.graphics.RectF r5 = r0.f15554p
            boolean r5 = r4.intersect(r5)
            if (r5 != 0) goto L_0x00d6
            r5 = 0
            r4.set(r5, r5, r5, r5)
        L_0x0175:
            android.graphics.RectF r4 = r0.f15553o
            int r6 = r17.getWidth()
            float r6 = (float) r6
            int r7 = r17.getHeight()
            float r7 = (float) r7
            boolean r4 = r4.intersect(r5, r5, r6, r7)
            if (r4 != 0) goto L_0x018c
            android.graphics.RectF r4 = r0.f15553o
            r4.set(r5, r5, r5, r5)
        L_0x018c:
            com.airbnb.lottie.C4838b.m13493a()
            android.graphics.RectF r4 = r0.f15553o
            float r4 = r4.width()
            r5 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 < 0) goto L_0x03df
            android.graphics.RectF r4 = r0.f15553o
            float r4 = r4.height()
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 < 0) goto L_0x03df
            android.graphics.Paint r4 = r0.f15548j
            r5 = 255(0xff, float:3.57E-43)
            r4.setAlpha(r5)
            android.graphics.RectF r4 = r0.f15553o
            android.graphics.Paint r6 = r0.f15548j
            java.lang.ThreadLocal r7 = com.airbnb.lottie.p245f.C4954k.f15722a
            r1.saveLayer(r4, r6)
            com.airbnb.lottie.C4838b.m13493a()
            com.airbnb.lottie.C4838b.m13493a()
            r16.m13536q(r17)
            android.graphics.Matrix r4 = r0.f15547i
            r0.mo9812i(r1, r4, r3)
            com.airbnb.lottie.C4838b.m13493a()
            boolean r4 = r16.mo9817n()
            if (r4 == 0) goto L_0x03b8
            android.graphics.Matrix r4 = r0.f15547i
            android.graphics.RectF r6 = r0.f15553o
            android.graphics.Paint r7 = r0.f15549k
            com.airbnb.lottie.p245f.C4954k.m13729l(r1, r6, r7)
            com.airbnb.lottie.C4838b.m13493a()
            r6 = 0
        L_0x01d9:
            com.airbnb.lottie.a.b.l r7 = r0.f15557s
            java.util.List r7 = r7.f15309c
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x03b2
            com.airbnb.lottie.a.b.l r7 = r0.f15557s
            java.util.List r7 = r7.f15309c
            java.lang.Object r7 = r7.get(r6)
            com.airbnb.lottie.c.b.f r7 = (com.airbnb.lottie.p238c.p240b.C4863f) r7
            com.airbnb.lottie.a.b.l r9 = r0.f15557s
            java.util.List r9 = r9.f15307a
            java.lang.Object r9 = r9.get(r6)
            com.airbnb.lottie.a.b.f r9 = (com.airbnb.lottie.p234a.p236b.C4807f) r9
            com.airbnb.lottie.a.b.l r10 = r0.f15557s
            java.util.List r10 = r10.f15308b
            java.lang.Object r10 = r10.get(r6)
            com.airbnb.lottie.a.b.f r10 = (com.airbnb.lottie.p234a.p236b.C4807f) r10
            int r11 = r7.f15481d
            int r13 = r11 + -1
            if (r11 == 0) goto L_0x03b1
            r11 = 1076048691(0x40233333, float:2.55)
            if (r13 == 0) goto L_0x033f
            if (r13 == r8) goto L_0x02cb
            r14 = 2
            if (r13 == r14) goto L_0x024d
            r15 = 3
            if (r13 == r15) goto L_0x0216
            goto L_0x03ae
        L_0x0216:
            com.airbnb.lottie.a.b.l r7 = r0.f15557s
            java.util.List r7 = r7.f15307a
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x0222
            goto L_0x03ae
        L_0x0222:
            r7 = 0
        L_0x0223:
            com.airbnb.lottie.a.b.l r9 = r0.f15557s
            java.util.List r9 = r9.f15309c
            int r9 = r9.size()
            if (r7 >= r9) goto L_0x023f
            com.airbnb.lottie.a.b.l r9 = r0.f15557s
            java.util.List r9 = r9.f15309c
            java.lang.Object r9 = r9.get(r7)
            com.airbnb.lottie.c.b.f r9 = (com.airbnb.lottie.p238c.p240b.C4863f) r9
            int r9 = r9.f15481d
            r10 = 4
            if (r9 != r10) goto L_0x03ae
            int r7 = r7 + 1
            goto L_0x0223
        L_0x023f:
            android.graphics.Paint r7 = r0.f15548j
            r7.setAlpha(r5)
            android.graphics.RectF r7 = r0.f15553o
            android.graphics.Paint r9 = r0.f15548j
            r1.drawRect(r7, r9)
            goto L_0x03ae
        L_0x024d:
            r15 = 3
            boolean r7 = r7.f15480c
            if (r7 == 0) goto L_0x0292
            android.graphics.RectF r7 = r0.f15553o
            android.graphics.Paint r13 = r0.f15549k
            r1.saveLayer(r7, r13)
            com.airbnb.lottie.C4838b.m13493a()
            android.graphics.RectF r7 = r0.f15553o
            android.graphics.Paint r13 = r0.f15548j
            r1.drawRect(r7, r13)
            android.graphics.Paint r7 = r0.f15550l
            java.lang.Object r10 = r10.mo9738e()
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            float r10 = (float) r10
            float r10 = r10 * r11
            int r10 = (int) r10
            r7.setAlpha(r10)
            java.lang.Object r7 = r9.mo9738e()
            android.graphics.Path r7 = (android.graphics.Path) r7
            android.graphics.Path r9 = r0.f15546h
            r9.set(r7)
            android.graphics.Path r7 = r0.f15546h
            r7.transform(r4)
            android.graphics.Path r7 = r0.f15546h
            android.graphics.Paint r9 = r0.f15550l
            r1.drawPath(r7, r9)
            r17.restore()
            goto L_0x03ae
        L_0x0292:
            android.graphics.RectF r7 = r0.f15553o
            android.graphics.Paint r13 = r0.f15549k
            r1.saveLayer(r7, r13)
            com.airbnb.lottie.C4838b.m13493a()
            java.lang.Object r7 = r9.mo9738e()
            android.graphics.Path r7 = (android.graphics.Path) r7
            android.graphics.Path r9 = r0.f15546h
            r9.set(r7)
            android.graphics.Path r7 = r0.f15546h
            r7.transform(r4)
            android.graphics.Paint r7 = r0.f15548j
            java.lang.Object r9 = r10.mo9738e()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            float r9 = (float) r9
            float r9 = r9 * r11
            int r9 = (int) r9
            r7.setAlpha(r9)
            android.graphics.Path r7 = r0.f15546h
            android.graphics.Paint r9 = r0.f15548j
            r1.drawPath(r7, r9)
            r17.restore()
            goto L_0x03ae
        L_0x02cb:
            r14 = 2
            r15 = 3
            if (r6 != 0) goto L_0x02e3
            android.graphics.Paint r6 = r0.f15548j
            r13 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r6.setColor(r13)
            android.graphics.Paint r6 = r0.f15548j
            r6.setAlpha(r5)
            android.graphics.RectF r6 = r0.f15553o
            android.graphics.Paint r13 = r0.f15548j
            r1.drawRect(r6, r13)
            r6 = 0
        L_0x02e3:
            boolean r7 = r7.f15480c
            if (r7 == 0) goto L_0x0327
            android.graphics.RectF r7 = r0.f15553o
            android.graphics.Paint r13 = r0.f15550l
            r1.saveLayer(r7, r13)
            com.airbnb.lottie.C4838b.m13493a()
            android.graphics.RectF r7 = r0.f15553o
            android.graphics.Paint r13 = r0.f15548j
            r1.drawRect(r7, r13)
            android.graphics.Paint r7 = r0.f15550l
            java.lang.Object r10 = r10.mo9738e()
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            float r10 = (float) r10
            float r10 = r10 * r11
            int r10 = (int) r10
            r7.setAlpha(r10)
            java.lang.Object r7 = r9.mo9738e()
            android.graphics.Path r7 = (android.graphics.Path) r7
            android.graphics.Path r9 = r0.f15546h
            r9.set(r7)
            android.graphics.Path r7 = r0.f15546h
            r7.transform(r4)
            android.graphics.Path r7 = r0.f15546h
            android.graphics.Paint r9 = r0.f15550l
            r1.drawPath(r7, r9)
            r17.restore()
            goto L_0x03ae
        L_0x0327:
            java.lang.Object r7 = r9.mo9738e()
            android.graphics.Path r7 = (android.graphics.Path) r7
            android.graphics.Path r9 = r0.f15546h
            r9.set(r7)
            android.graphics.Path r7 = r0.f15546h
            r7.transform(r4)
            android.graphics.Path r7 = r0.f15546h
            android.graphics.Paint r9 = r0.f15550l
            r1.drawPath(r7, r9)
            goto L_0x03ae
        L_0x033f:
            r14 = 2
            r15 = 3
            boolean r7 = r7.f15480c
            if (r7 == 0) goto L_0x0384
            android.graphics.RectF r7 = r0.f15553o
            android.graphics.Paint r13 = r0.f15548j
            r1.saveLayer(r7, r13)
            com.airbnb.lottie.C4838b.m13493a()
            android.graphics.RectF r7 = r0.f15553o
            android.graphics.Paint r13 = r0.f15548j
            r1.drawRect(r7, r13)
            java.lang.Object r7 = r9.mo9738e()
            android.graphics.Path r7 = (android.graphics.Path) r7
            android.graphics.Path r9 = r0.f15546h
            r9.set(r7)
            android.graphics.Path r7 = r0.f15546h
            r7.transform(r4)
            android.graphics.Paint r7 = r0.f15548j
            java.lang.Object r9 = r10.mo9738e()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            float r9 = (float) r9
            float r9 = r9 * r11
            int r9 = (int) r9
            r7.setAlpha(r9)
            android.graphics.Path r7 = r0.f15546h
            android.graphics.Paint r9 = r0.f15550l
            r1.drawPath(r7, r9)
            r17.restore()
            goto L_0x03ae
        L_0x0384:
            java.lang.Object r7 = r9.mo9738e()
            android.graphics.Path r7 = (android.graphics.Path) r7
            android.graphics.Path r9 = r0.f15546h
            r9.set(r7)
            android.graphics.Path r7 = r0.f15546h
            r7.transform(r4)
            android.graphics.Paint r7 = r0.f15548j
            java.lang.Object r9 = r10.mo9738e()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            float r9 = (float) r9
            float r9 = r9 * r11
            int r9 = (int) r9
            r7.setAlpha(r9)
            android.graphics.Path r7 = r0.f15546h
            android.graphics.Paint r9 = r0.f15548j
            r1.drawPath(r7, r9)
        L_0x03ae:
            int r6 = r6 + r8
            goto L_0x01d9
        L_0x03b1:
            throw r12
        L_0x03b2:
            r17.restore()
            com.airbnb.lottie.C4838b.m13493a()
        L_0x03b8:
            boolean r4 = r16.mo9818o()
            if (r4 == 0) goto L_0x03d9
            android.graphics.RectF r4 = r0.f15553o
            android.graphics.Paint r5 = r0.f15551m
            com.airbnb.lottie.p245f.C4954k.m13729l(r1, r4, r5)
            com.airbnb.lottie.C4838b.m13493a()
            r16.m13536q(r17)
            com.airbnb.lottie.c.c.b r4 = r0.f15543e
            r4.mo9715b(r1, r2, r3)
            r17.restore()
            com.airbnb.lottie.C4838b.m13493a()
            com.airbnb.lottie.C4838b.m13493a()
        L_0x03d9:
            r17.restore()
            com.airbnb.lottie.C4838b.m13493a()
        L_0x03df:
            com.airbnb.lottie.C4838b.m13493a()
            r16.m13537r()
            return
        L_0x03e6:
            com.airbnb.lottie.C4838b.m13493a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p238c.p241c.C4878b.mo9715b(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    /* renamed from: c */
    public void mo9716c(RectF rectF, Matrix matrix, boolean z) {
        this.f15553o.set(0.0f, 0.0f, 0.0f, 0.0f);
        m13535p();
        this.f15539a.set(matrix);
        if (z) {
            List list = this.f15558t;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    this.f15539a.preConcat(((C4878b) this.f15558t.get(size)).f15545g.mo9750a());
                }
            } else {
                C4878b bVar = this.f15544f;
                if (bVar != null) {
                    this.f15539a.preConcat(bVar.f15545g.mo9750a());
                }
            }
        }
        this.f15539a.preConcat(this.f15545g.mo9750a());
    }

    /* renamed from: d */
    public final void mo9717d() {
        this.f15540b.invalidateSelf();
    }

    /* renamed from: e */
    public final void mo9718e(C4890e eVar, int i, List list, C4890e eVar2) {
        C4878b bVar = this.f15543e;
        if (bVar != null) {
            C4890e b = eVar2.mo9823b(bVar.f15541c.f15572c);
            if (eVar.mo9825d(this.f15543e.f15541c.f15572c, i)) {
                list.add(b.mo9824c(this.f15543e));
            }
            if (eVar.mo9827f(this.f15541c.f15572c, i)) {
                this.f15543e.mo9814k(eVar, eVar.mo9822a(this.f15543e.f15541c.f15572c, i) + i, list, b);
            }
        }
        if (eVar.mo9826e(this.f15541c.f15572c, i)) {
            if (!"__container".equals(this.f15541c.f15572c)) {
                eVar2 = eVar2.mo9823b(this.f15541c.f15572c);
                if (eVar.mo9825d(this.f15541c.f15572c, i)) {
                    list.add(eVar2.mo9824c(this));
                }
            }
            if (eVar.mo9827f(this.f15541c.f15572c, i)) {
                mo9814k(eVar, i + eVar.mo9822a(this.f15541c.f15572c, i), list, eVar2);
            }
        }
    }

    /* renamed from: f */
    public final void mo9719f(List list, List list2) {
    }

    /* renamed from: g */
    public final String mo9722g() {
        throw null;
    }

    /* renamed from: h */
    public final void mo9811h(C4807f fVar) {
        if (fVar != null) {
            this.f15559u.add(fVar);
        }
    }

    /* renamed from: i */
    public abstract void mo9812i(Canvas canvas, Matrix matrix, int i);

    /* renamed from: j */
    public final void mo9813j(C4807f fVar) {
        this.f15559u.remove(fVar);
    }

    /* renamed from: k */
    public void mo9814k(C4890e eVar, int i, List list, C4890e eVar2) {
    }

    /* renamed from: l */
    public void mo9815l(float f) {
        C4821t tVar = this.f15545g;
        C4807f fVar = tVar.f15330e;
        if (fVar != null) {
            fVar.mo9742i(f);
        }
        C4807f fVar2 = tVar.f15333h;
        if (fVar2 != null) {
            fVar2.mo9742i(f);
        }
        C4807f fVar3 = tVar.f15334i;
        if (fVar3 != null) {
            fVar3.mo9742i(f);
        }
        C4807f fVar4 = tVar.f15326a;
        if (fVar4 != null) {
            fVar4.mo9742i(f);
        }
        C4807f fVar5 = tVar.f15327b;
        if (fVar5 != null) {
            fVar5.mo9742i(f);
        }
        C4807f fVar6 = tVar.f15328c;
        if (fVar6 != null) {
            fVar6.mo9742i(f);
        }
        C4807f fVar7 = tVar.f15329d;
        if (fVar7 != null) {
            fVar7.mo9742i(f);
        }
        C4809h hVar = tVar.f15331f;
        if (hVar != null) {
            hVar.mo9742i(f);
        }
        C4809h hVar2 = tVar.f15332g;
        if (hVar2 != null) {
            hVar2.mo9742i(f);
        }
        if (this.f15557s != null) {
            for (int i = 0; i < this.f15557s.f15307a.size(); i++) {
                ((C4807f) this.f15557s.f15307a.get(i)).mo9742i(f);
            }
        }
        C4809h hVar3 = this.f15542d;
        if (hVar3 != null) {
            hVar3.mo9742i(f);
        }
        C4878b bVar = this.f15543e;
        if (bVar != null) {
            bVar.mo9815l(f);
        }
        for (int i2 = 0; i2 < this.f15559u.size(); i2++) {
            ((C4807f) this.f15559u.get(i2)).mo9742i(f);
        }
    }

    /* renamed from: m */
    public final void mo9816m(boolean z) {
        if (z != this.f15560v) {
            this.f15560v = z;
            this.f15540b.invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final boolean mo9817n() {
        C4813l lVar = this.f15557s;
        return lVar != null && !lVar.f15307a.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final boolean mo9818o() {
        return this.f15543e != null;
    }
}
