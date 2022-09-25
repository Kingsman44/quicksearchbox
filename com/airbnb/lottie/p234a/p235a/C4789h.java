package com.airbnb.lottie.p234a.p235a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C4825ac;
import com.airbnb.lottie.C4829ag;
import com.airbnb.lottie.C4838b;
import com.airbnb.lottie.p234a.C4781a;
import com.airbnb.lottie.p234a.p236b.C4802a;
import com.airbnb.lottie.p234a.p236b.C4807f;
import com.airbnb.lottie.p234a.p236b.C4808g;
import com.airbnb.lottie.p234a.p236b.C4822u;
import com.airbnb.lottie.p238c.C4890e;
import com.airbnb.lottie.p238c.p240b.C4869l;
import com.airbnb.lottie.p238c.p241c.C4878b;
import com.airbnb.lottie.p245f.C4949f;
import com.airbnb.lottie.p246g.C4957b;
import com.airbnb.lottie.p246g.C4958c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.h */
/* compiled from: PG */
public final class C4789h implements C4787f, C4802a, C4793l {

    /* renamed from: a */
    private final Path f15197a;

    /* renamed from: b */
    private final Paint f15198b = new C4781a(1);

    /* renamed from: c */
    private final C4878b f15199c;

    /* renamed from: d */
    private final String f15200d;

    /* renamed from: e */
    private final boolean f15201e;

    /* renamed from: f */
    private final List f15202f = new ArrayList();

    /* renamed from: g */
    private final C4807f f15203g;

    /* renamed from: h */
    private final C4807f f15204h;

    /* renamed from: i */
    private C4807f f15205i;

    /* renamed from: j */
    private final C4825ac f15206j;

    public C4789h(C4825ac acVar, C4878b bVar, C4869l lVar) {
        Path path = new Path();
        this.f15197a = path;
        this.f15199c = bVar;
        this.f15200d = lVar.f15508b;
        this.f15201e = lVar.f15511e;
        this.f15206j = acVar;
        if (lVar.f15509c != null) {
            path.setFillType(lVar.f15507a);
            C4807f a = lVar.f15509c.mo9797a();
            this.f15203g = a;
            a.mo9740g(this);
            bVar.mo9811h(a);
            C4807f a2 = lVar.f15510d.mo9797a();
            this.f15204h = a2;
            a2.mo9740g(this);
            bVar.mo9811h(a2);
            return;
        }
        this.f15203g = null;
        this.f15204h = null;
    }

    /* renamed from: a */
    public final void mo9714a(Object obj, C4958c cVar) {
        if (obj == C4829ag.f15370a) {
            this.f15203g.f15301d = cVar;
        } else if (obj == C4829ag.f15373d) {
            this.f15204h.f15301d = cVar;
        } else if (obj == C4829ag.f15366E) {
            C4807f fVar = this.f15205i;
            if (fVar != null) {
                this.f15199c.mo9813j(fVar);
            }
            C4822u uVar = new C4822u(cVar);
            this.f15205i = uVar;
            uVar.mo9740g(this);
            this.f15199c.mo9811h(this.f15205i);
        }
    }

    /* renamed from: b */
    public final void mo9715b(Canvas canvas, Matrix matrix, int i) {
        if (!this.f15201e) {
            this.f15198b.setColor(((C4808g) this.f15203g).mo9744k());
            this.f15198b.setAlpha(C4949f.m13717k((int) ((((((float) i) / 255.0f) * ((float) ((Integer) this.f15204h.mo9738e()).intValue())) / 100.0f) * 255.0f)));
            C4807f fVar = this.f15205i;
            if (fVar != null) {
                Paint paint = this.f15198b;
                C4958c cVar = ((C4822u) fVar).f15301d;
                C4957b bVar = cVar.f15746b;
                paint.setColorFilter((ColorFilter) cVar.mo9900a());
            }
            this.f15197a.reset();
            for (int i2 = 0; i2 < this.f15202f.size(); i2++) {
                this.f15197a.addPath(((C4795n) this.f15202f.get(i2)).mo9724i(), matrix);
            }
            canvas.drawPath(this.f15197a, this.f15198b);
            C4838b.m13493a();
        }
    }

    /* renamed from: c */
    public final void mo9716c(RectF rectF, Matrix matrix, boolean z) {
        this.f15197a.reset();
        for (int i = 0; i < this.f15202f.size(); i++) {
            this.f15197a.addPath(((C4795n) this.f15202f.get(i)).mo9724i(), matrix);
        }
        this.f15197a.computeBounds(rectF, false);
        rectF.set(rectF.left - 4.0f, rectF.top - 4.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    /* renamed from: d */
    public final void mo9717d() {
        this.f15206j.invalidateSelf();
    }

    /* renamed from: e */
    public final void mo9718e(C4890e eVar, int i, List list, C4890e eVar2) {
        C4949f.m13714h(eVar, i, list, eVar2, this);
    }

    /* renamed from: f */
    public final void mo9719f(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            C4785d dVar = (C4785d) list2.get(i);
            if (dVar instanceof C4795n) {
                this.f15202f.add((C4795n) dVar);
            }
        }
    }

    /* renamed from: g */
    public final String mo9722g() {
        return this.f15200d;
    }
}
