package com.airbnb.lottie.p234a.p236b;

import android.graphics.PointF;
import com.airbnb.lottie.p246g.C4956a;
import com.airbnb.lottie.p246g.C4957b;
import com.airbnb.lottie.p246g.C4958c;
import java.util.Collections;

/* renamed from: com.airbnb.lottie.a.b.r */
/* compiled from: PG */
public final class C4819r extends C4807f {

    /* renamed from: e */
    protected C4958c f15320e;

    /* renamed from: f */
    protected C4958c f15321f;

    /* renamed from: g */
    private final PointF f15322g = new PointF();

    /* renamed from: h */
    private final PointF f15323h = new PointF();

    /* renamed from: i */
    private final C4807f f15324i;

    /* renamed from: j */
    private final C4807f f15325j;

    public C4819r(C4807f fVar, C4807f fVar2) {
        super(Collections.emptyList());
        this.f15324i = fVar;
        this.f15325j = fVar2;
        mo9742i(this.f15300c);
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo9739f(C4956a aVar, float f) {
        return mo9738e();
    }

    /* renamed from: i */
    public final void mo9742i(float f) {
        this.f15324i.mo9742i(f);
        this.f15325j.mo9742i(f);
        this.f15322g.set(((Float) this.f15324i.mo9738e()).floatValue(), ((Float) this.f15325j.mo9738e()).floatValue());
        for (int i = 0; i < this.f15298a.size(); i++) {
            ((C4802a) this.f15298a.get(i)).mo9717d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final PointF mo9738e() {
        Float f;
        C4956a d;
        C4956a d2;
        Float f2 = null;
        if (this.f15320e == null || (d2 = this.f15324i.mo9737d()) == null) {
            f = null;
        } else {
            this.f15324i.mo9735b();
            Float f3 = d2.f15737h;
            C4958c cVar = this.f15320e;
            if (f3 != null) {
                f3.floatValue();
            }
            Float f4 = (Float) d2.f15731b;
            Float f5 = (Float) d2.f15732c;
            C4957b bVar = cVar.f15746b;
            f = (Float) cVar.mo9900a();
        }
        if (!(this.f15321f == null || (d = this.f15325j.mo9737d()) == null)) {
            this.f15325j.mo9735b();
            Float f6 = d.f15737h;
            C4958c cVar2 = this.f15321f;
            if (f6 != null) {
                f6.floatValue();
            }
            Float f7 = (Float) d.f15731b;
            Float f8 = (Float) d.f15732c;
            C4957b bVar2 = cVar2.f15746b;
            f2 = (Float) cVar2.mo9900a();
        }
        if (f == null) {
            this.f15323h.set(this.f15322g.x, 0.0f);
        } else {
            this.f15323h.set(f.floatValue(), 0.0f);
        }
        if (f2 == null) {
            PointF pointF = this.f15323h;
            pointF.set(pointF.x, this.f15322g.y);
        } else {
            PointF pointF2 = this.f15323h;
            pointF2.set(pointF2.x, f2.floatValue());
        }
        return this.f15323h;
    }
}
