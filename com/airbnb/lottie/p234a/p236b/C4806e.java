package com.airbnb.lottie.p234a.p236b;

import com.airbnb.lottie.p246g.C4956a;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.e */
/* compiled from: PG */
final class C4806e implements C4804c {

    /* renamed from: a */
    private final C4956a f15296a;

    /* renamed from: b */
    private float f15297b = -1.0f;

    public C4806e(List list) {
        this.f15296a = (C4956a) list.get(0);
    }

    /* renamed from: a */
    public final float mo9728a() {
        return this.f15296a.mo9895b();
    }

    /* renamed from: b */
    public final float mo9729b() {
        return this.f15296a.mo9896c();
    }

    /* renamed from: c */
    public final C4956a mo9730c() {
        return this.f15296a;
    }

    /* renamed from: d */
    public final boolean mo9731d(float f) {
        if (this.f15297b == f) {
            return true;
        }
        this.f15297b = f;
        return false;
    }

    /* renamed from: e */
    public final boolean mo9732e() {
        return false;
    }

    /* renamed from: f */
    public final boolean mo9733f(float f) {
        return !this.f15296a.mo9898e();
    }
}
