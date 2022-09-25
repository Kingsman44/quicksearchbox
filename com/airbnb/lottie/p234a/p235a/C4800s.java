package com.airbnb.lottie.p234a.p235a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.airbnb.lottie.C4825ac;
import com.airbnb.lottie.C4829ag;
import com.airbnb.lottie.p234a.p236b.C4807f;
import com.airbnb.lottie.p234a.p236b.C4808g;
import com.airbnb.lottie.p234a.p236b.C4822u;
import com.airbnb.lottie.p238c.p240b.C4872o;
import com.airbnb.lottie.p238c.p240b.C4873p;
import com.airbnb.lottie.p238c.p240b.C4874q;
import com.airbnb.lottie.p238c.p241c.C4878b;
import com.airbnb.lottie.p246g.C4957b;
import com.airbnb.lottie.p246g.C4958c;

/* renamed from: com.airbnb.lottie.a.a.s */
/* compiled from: PG */
public final class C4800s extends C4783b {

    /* renamed from: c */
    private final C4878b f15281c;

    /* renamed from: d */
    private final String f15282d;

    /* renamed from: e */
    private final boolean f15283e;

    /* renamed from: f */
    private final C4807f f15284f;

    /* renamed from: g */
    private C4807f f15285g;

    public C4800s(C4825ac acVar, C4878b bVar, C4874q qVar) {
        super(acVar, bVar, C4872o.m13528a(qVar.f15528i), C4873p.m13530a(qVar.f15529j), qVar.f15526g, qVar.f15524e, qVar.f15525f, qVar.f15522c, qVar.f15521b);
        this.f15281c = bVar;
        this.f15282d = qVar.f15520a;
        this.f15283e = qVar.f15527h;
        C4807f a = qVar.f15523d.mo9797a();
        this.f15284f = a;
        a.mo9740g(this);
        bVar.mo9811h(a);
    }

    /* renamed from: a */
    public final void mo9714a(Object obj, C4958c cVar) {
        super.mo9714a(obj, cVar);
        if (obj == C4829ag.f15371b) {
            this.f15284f.f15301d = cVar;
        } else if (obj == C4829ag.f15366E) {
            C4807f fVar = this.f15285g;
            if (fVar != null) {
                this.f15281c.mo9813j(fVar);
            }
            C4822u uVar = new C4822u(cVar);
            this.f15285g = uVar;
            uVar.mo9740g(this);
            this.f15281c.mo9811h(this.f15284f);
        }
    }

    /* renamed from: b */
    public final void mo9715b(Canvas canvas, Matrix matrix, int i) {
        if (!this.f15283e) {
            this.f15166b.setColor(((C4808g) this.f15284f).mo9744k());
            C4807f fVar = this.f15285g;
            if (fVar != null) {
                Paint paint = this.f15166b;
                C4958c cVar = ((C4822u) fVar).f15301d;
                C4957b bVar = cVar.f15746b;
                paint.setColorFilter((ColorFilter) cVar.mo9900a());
            }
            super.mo9715b(canvas, matrix, i);
        }
    }

    /* renamed from: g */
    public final String mo9722g() {
        return this.f15282d;
    }
}
