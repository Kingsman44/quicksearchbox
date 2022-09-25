package com.airbnb.lottie.p234a.p236b;

import android.view.animation.Interpolator;
import com.airbnb.lottie.C4838b;
import com.airbnb.lottie.p246g.C4956a;
import com.airbnb.lottie.p246g.C4958c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.f */
/* compiled from: PG */
public abstract class C4807f {

    /* renamed from: a */
    final List f15298a = new ArrayList(1);

    /* renamed from: b */
    public boolean f15299b = false;

    /* renamed from: c */
    public float f15300c = 0.0f;

    /* renamed from: d */
    public C4958c f15301d;

    /* renamed from: e */
    private final C4804c f15302e;

    /* renamed from: f */
    private Object f15303f = null;

    /* renamed from: g */
    private float f15304g = -1.0f;

    /* renamed from: h */
    private float f15305h = -1.0f;

    public C4807f(List list) {
        C4804c cVar;
        C4804c cVar2;
        if (list.isEmpty()) {
            cVar = new C4803b();
        } else {
            if (list.size() == 1) {
                cVar2 = new C4806e(list);
            } else {
                cVar2 = new C4805d(list);
            }
            cVar = cVar2;
        }
        this.f15302e = cVar;
    }

    /* renamed from: k */
    private final float mo9744k() {
        float f = this.f15304g;
        if (f != -1.0f) {
            return f;
        }
        float b = this.f15302e.mo9729b();
        this.f15304g = b;
        return b;
    }

    /* renamed from: a */
    public float mo9734a() {
        float f = this.f15305h;
        if (f != -1.0f) {
            return f;
        }
        float a = this.f15302e.mo9728a();
        this.f15305h = a;
        return a;
    }

    /* renamed from: b */
    public final float mo9735b() {
        C4956a d = mo9737d();
        if (d.mo9898e()) {
            return 0.0f;
        }
        return d.f15733d.getInterpolation(mo9736c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final float mo9736c() {
        if (this.f15299b) {
            return 0.0f;
        }
        C4956a d = mo9737d();
        if (d.mo9898e()) {
            return 0.0f;
        }
        return (this.f15300c - d.mo9896c()) / (d.mo9895b() - d.mo9896c());
    }

    /* renamed from: d */
    public final C4956a mo9737d() {
        C4956a c = this.f15302e.mo9730c();
        C4838b.m13493a();
        return c;
    }

    /* renamed from: e */
    public Object mo9738e() {
        Object obj;
        float c = mo9736c();
        if (this.f15301d == null && this.f15302e.mo9731d(c)) {
            return this.f15303f;
        }
        C4956a d = mo9737d();
        Interpolator interpolator = d.f15734e;
        if (interpolator == null || d.f15735f == null) {
            obj = mo9739f(d, mo9735b());
        } else {
            obj = mo9743j(d, interpolator.getInterpolation(c), d.f15735f.getInterpolation(c));
        }
        this.f15303f = obj;
        return obj;
    }

    /* renamed from: f */
    public abstract Object mo9739f(C4956a aVar, float f);

    /* renamed from: g */
    public final void mo9740g(C4802a aVar) {
        this.f15298a.add(aVar);
    }

    /* renamed from: h */
    public void mo9741h() {
        for (int i = 0; i < this.f15298a.size(); i++) {
            ((C4802a) this.f15298a.get(i)).mo9717d();
        }
    }

    /* renamed from: i */
    public void mo9742i(float f) {
        if (!this.f15302e.mo9732e()) {
            if (f < mo9744k()) {
                f = mo9744k();
            } else if (f > mo9734a()) {
                f = mo9734a();
            }
            if (f != this.f15300c) {
                this.f15300c = f;
                if (this.f15302e.mo9733f(f)) {
                    mo9741h();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public Object mo9743j(C4956a aVar, float f, float f2) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }
}
