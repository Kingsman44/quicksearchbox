package com.airbnb.lottie.p234a.p235a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C4825ac;
import com.airbnb.lottie.C4829ag;
import com.airbnb.lottie.p234a.p236b.C4802a;
import com.airbnb.lottie.p234a.p236b.C4807f;
import com.airbnb.lottie.p234a.p236b.C4821t;
import com.airbnb.lottie.p238c.C4890e;
import com.airbnb.lottie.p238c.p240b.C4867j;
import com.airbnb.lottie.p238c.p241c.C4878b;
import com.airbnb.lottie.p245f.C4949f;
import com.airbnb.lottie.p246g.C4958c;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.q */
/* compiled from: PG */
public final class C4798q implements C4787f, C4795n, C4792k, C4802a, C4793l {

    /* renamed from: a */
    private final Matrix f15265a = new Matrix();

    /* renamed from: b */
    private final Path f15266b = new Path();

    /* renamed from: c */
    private final C4825ac f15267c;

    /* renamed from: d */
    private final C4878b f15268d;

    /* renamed from: e */
    private final String f15269e;

    /* renamed from: f */
    private final boolean f15270f;

    /* renamed from: g */
    private final C4807f f15271g;

    /* renamed from: h */
    private final C4807f f15272h;

    /* renamed from: i */
    private final C4821t f15273i;

    /* renamed from: j */
    private C4786e f15274j;

    public C4798q(C4825ac acVar, C4878b bVar, C4867j jVar) {
        this.f15267c = acVar;
        this.f15268d = bVar;
        this.f15269e = jVar.f15499a;
        this.f15270f = jVar.f15503e;
        C4807f a = jVar.f15500b.mo9797a();
        this.f15271g = a;
        bVar.mo9811h(a);
        a.mo9740g(this);
        C4807f a2 = jVar.f15501c.mo9797a();
        this.f15272h = a2;
        bVar.mo9811h(a2);
        a2.mo9740g(this);
        C4821t tVar = new C4821t(jVar.f15502d);
        this.f15273i = tVar;
        tVar.mo9752c(bVar);
        tVar.mo9753d(this);
    }

    /* renamed from: a */
    public final void mo9714a(Object obj, C4958c cVar) {
        C4807f fVar;
        if (!this.f15273i.mo9754e(obj, cVar)) {
            if (obj == C4829ag.f15388s) {
                fVar = this.f15271g;
            } else if (obj == C4829ag.f15389t) {
                fVar = this.f15272h;
            } else {
                return;
            }
            fVar.f15301d = cVar;
        }
    }

    /* renamed from: b */
    public final void mo9715b(Canvas canvas, Matrix matrix, int i) {
        float floatValue = ((Float) this.f15271g.mo9738e()).floatValue();
        float floatValue2 = ((Float) this.f15272h.mo9738e()).floatValue();
        float floatValue3 = ((Float) this.f15273i.f15333h.mo9738e()).floatValue() / 100.0f;
        float floatValue4 = ((Float) this.f15273i.f15334i.mo9738e()).floatValue() / 100.0f;
        int i2 = (int) floatValue;
        while (true) {
            i2--;
            if (i2 >= 0) {
                this.f15265a.set(matrix);
                float f = (float) i2;
                this.f15265a.preConcat(this.f15273i.mo9751b(f + floatValue2));
                this.f15274j.mo9715b(canvas, this.f15265a, (int) (((float) i) * C4949f.m13709c(floatValue3, floatValue4, f / floatValue)));
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo9716c(RectF rectF, Matrix matrix, boolean z) {
        this.f15274j.mo9716c(rectF, matrix, z);
    }

    /* renamed from: d */
    public final void mo9717d() {
        this.f15267c.invalidateSelf();
    }

    /* renamed from: e */
    public final void mo9718e(C4890e eVar, int i, List list, C4890e eVar2) {
        C4949f.m13714h(eVar, i, list, eVar2, this);
    }

    /* renamed from: f */
    public final void mo9719f(List list, List list2) {
        this.f15274j.mo9719f(list, list2);
    }

    /* renamed from: g */
    public final String mo9722g() {
        return this.f15269e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:2:0x0004 A[LOOP:0: B:2:0x0004->B:5:0x000e, LOOP_START] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9726h(java.util.ListIterator r9) {
        /*
            r8 = this;
            com.airbnb.lottie.a.a.e r0 = r8.f15274j
            if (r0 != 0) goto L_0x003c
        L_0x0004:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L_0x0010
            java.lang.Object r0 = r9.previous()
            if (r0 != r8) goto L_0x0004
        L_0x0010:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x0015:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r9.previous()
            com.airbnb.lottie.a.a.d r0 = (com.airbnb.lottie.p234a.p235a.C4785d) r0
            r6.add(r0)
            r9.remove()
            goto L_0x0015
        L_0x0028:
            java.util.Collections.reverse(r6)
            com.airbnb.lottie.a.a.e r9 = new com.airbnb.lottie.a.a.e
            com.airbnb.lottie.ac r2 = r8.f15267c
            com.airbnb.lottie.c.c.b r3 = r8.f15268d
            java.lang.String r4 = "Repeater"
            boolean r5 = r8.f15270f
            r7 = 0
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.f15274j = r9
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p234a.p235a.C4798q.mo9726h(java.util.ListIterator):void");
    }

    /* renamed from: i */
    public final Path mo9724i() {
        Path i = this.f15274j.mo9724i();
        this.f15266b.reset();
        float floatValue = ((Float) this.f15271g.mo9738e()).floatValue();
        float floatValue2 = ((Float) this.f15272h.mo9738e()).floatValue();
        int i2 = (int) floatValue;
        while (true) {
            i2--;
            if (i2 < 0) {
                return this.f15266b;
            }
            this.f15265a.set(this.f15273i.mo9751b(((float) i2) + floatValue2));
            this.f15266b.addPath(i, this.f15265a);
        }
    }
}
