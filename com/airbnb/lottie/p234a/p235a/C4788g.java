package com.airbnb.lottie.p234a.p235a;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C4825ac;
import com.airbnb.lottie.C4829ag;
import com.airbnb.lottie.p234a.p236b.C4802a;
import com.airbnb.lottie.p234a.p236b.C4807f;
import com.airbnb.lottie.p238c.C4890e;
import com.airbnb.lottie.p238c.p240b.C4858a;
import com.airbnb.lottie.p238c.p241c.C4878b;
import com.airbnb.lottie.p245f.C4949f;
import com.airbnb.lottie.p246g.C4958c;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.g */
/* compiled from: PG */
public final class C4788g implements C4795n, C4802a, C4793l {

    /* renamed from: a */
    private final Path f15189a = new Path();

    /* renamed from: b */
    private final String f15190b;

    /* renamed from: c */
    private final C4825ac f15191c;

    /* renamed from: d */
    private final C4807f f15192d;

    /* renamed from: e */
    private final C4807f f15193e;

    /* renamed from: f */
    private final C4858a f15194f;

    /* renamed from: g */
    private final C4784c f15195g = new C4784c();

    /* renamed from: h */
    private boolean f15196h;

    public C4788g(C4825ac acVar, C4878b bVar, C4858a aVar) {
        this.f15190b = aVar.f15450a;
        this.f15191c = acVar;
        C4807f a = aVar.f15452c.mo9797a();
        this.f15192d = a;
        C4807f a2 = aVar.f15451b.mo9797a();
        this.f15193e = a2;
        this.f15194f = aVar;
        bVar.mo9811h(a);
        bVar.mo9811h(a2);
        a.mo9740g(this);
        a2.mo9740g(this);
    }

    /* renamed from: a */
    public final void mo9714a(Object obj, C4958c cVar) {
        C4807f fVar;
        if (obj == C4829ag.f15378i) {
            fVar = this.f15192d;
        } else if (obj == C4829ag.f15381l) {
            fVar = this.f15193e;
        } else {
            return;
        }
        fVar.f15301d = cVar;
    }

    /* renamed from: d */
    public final void mo9717d() {
        this.f15196h = false;
        this.f15191c.invalidateSelf();
    }

    /* renamed from: e */
    public final void mo9718e(C4890e eVar, int i, List list, C4890e eVar2) {
        C4949f.m13714h(eVar, i, list, eVar2, this);
    }

    /* renamed from: f */
    public final void mo9719f(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            C4785d dVar = (C4785d) list.get(i);
            if (dVar instanceof C4801t) {
                C4801t tVar = (C4801t) dVar;
                if (tVar.f15290e == 1) {
                    this.f15195g.mo9720a(tVar);
                    tVar.mo9727a(this);
                }
            }
        }
    }

    /* renamed from: g */
    public final String mo9722g() {
        return this.f15190b;
    }

    /* renamed from: i */
    public final Path mo9724i() {
        if (this.f15196h) {
            return this.f15189a;
        }
        this.f15189a.reset();
        if (this.f15194f.f15454e) {
            this.f15196h = true;
            return this.f15189a;
        }
        PointF pointF = (PointF) this.f15192d.mo9738e();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.f15189a.reset();
        if (this.f15194f.f15453d) {
            float f5 = -f2;
            this.f15189a.moveTo(0.0f, f5);
            float f6 = -f3;
            float f7 = -f;
            float f8 = -f4;
            this.f15189a.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            float f10 = f5;
            this.f15189a.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f11 = f3 + 0.0f;
            this.f15189a.cubicTo(f11, f2, f, f9, f, 0.0f);
            this.f15189a.cubicTo(f, f8, f11, f10, 0.0f, f10);
        } else {
            float f12 = -f2;
            this.f15189a.moveTo(0.0f, f12);
            float f13 = f3 + 0.0f;
            float f14 = -f4;
            this.f15189a.cubicTo(f13, f12, f, f14, f, 0.0f);
            float f15 = f4 + 0.0f;
            this.f15189a.cubicTo(f, f15, f13, f2, 0.0f, f2);
            float f16 = -f3;
            float f17 = -f;
            this.f15189a.cubicTo(f16, f2, f17, f15, f17, 0.0f);
            this.f15189a.cubicTo(f17, f14, f16, f12, 0.0f, f12);
        }
        PointF pointF2 = (PointF) this.f15193e.mo9738e();
        this.f15189a.offset(pointF2.x, pointF2.y);
        this.f15189a.close();
        this.f15195g.mo9721b(this.f15189a);
        this.f15196h = true;
        return this.f15189a;
    }
}
