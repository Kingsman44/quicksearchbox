package com.airbnb.lottie.p234a.p236b;

import com.airbnb.lottie.p246g.C4956a;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.d */
/* compiled from: PG */
final class C4805d implements C4804c {

    /* renamed from: a */
    private final List f15292a;

    /* renamed from: b */
    private C4956a f15293b;

    /* renamed from: c */
    private C4956a f15294c = null;

    /* renamed from: d */
    private float f15295d = -1.0f;

    public C4805d(List list) {
        this.f15292a = list;
        this.f15293b = m13410g(0.0f);
    }

    /* renamed from: g */
    private final C4956a m13410g(float f) {
        List list = this.f15292a;
        C4956a aVar = (C4956a) list.get(list.size() - 1);
        if (f >= aVar.mo9896c()) {
            return aVar;
        }
        for (int size = this.f15292a.size() - 2; size > 0; size--) {
            C4956a aVar2 = (C4956a) this.f15292a.get(size);
            if (this.f15293b != aVar2 && aVar2.mo9897d(f)) {
                return aVar2;
            }
        }
        return (C4956a) this.f15292a.get(0);
    }

    /* renamed from: a */
    public final float mo9728a() {
        List list = this.f15292a;
        return ((C4956a) list.get(list.size() - 1)).mo9895b();
    }

    /* renamed from: b */
    public final float mo9729b() {
        return ((C4956a) this.f15292a.get(0)).mo9896c();
    }

    /* renamed from: c */
    public final C4956a mo9730c() {
        return this.f15293b;
    }

    /* renamed from: d */
    public final boolean mo9731d(float f) {
        C4956a aVar = this.f15294c;
        C4956a aVar2 = this.f15293b;
        if (aVar == aVar2 && this.f15295d == f) {
            return true;
        }
        this.f15294c = aVar2;
        this.f15295d = f;
        return false;
    }

    /* renamed from: e */
    public final boolean mo9732e() {
        return false;
    }

    /* renamed from: f */
    public final boolean mo9733f(float f) {
        if (!this.f15293b.mo9897d(f)) {
            this.f15293b = m13410g(f);
            return true;
        } else if (!this.f15293b.mo9898e()) {
            return true;
        } else {
            return false;
        }
    }
}
