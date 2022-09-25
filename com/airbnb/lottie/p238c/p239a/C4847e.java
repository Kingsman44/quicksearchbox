package com.airbnb.lottie.p238c.p239a;

import android.graphics.PointF;
import com.airbnb.lottie.p234a.p236b.C4807f;
import com.airbnb.lottie.p234a.p236b.C4815n;
import com.airbnb.lottie.p234a.p236b.C4816o;
import com.airbnb.lottie.p246g.C4956a;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.c.a.e */
/* compiled from: PG */
public final class C4847e implements C4855m {

    /* renamed from: a */
    public final List f15422a;

    public C4847e() {
        this.f15422a = Collections.singletonList(new C4956a(new PointF(0.0f, 0.0f)));
    }

    public C4847e(List list) {
        this.f15422a = list;
    }

    /* renamed from: a */
    public final C4807f mo9797a() {
        if (((C4956a) this.f15422a.get(0)).mo9898e()) {
            return new C4816o(this.f15422a);
        }
        return new C4815n(this.f15422a);
    }

    /* renamed from: b */
    public final List mo9798b() {
        return this.f15422a;
    }

    /* renamed from: c */
    public final boolean mo9799c() {
        return this.f15422a.size() == 1 && ((C4956a) this.f15422a.get(0)).mo9898e();
    }
}
