package com.airbnb.lottie.p238c.p239a;

import com.airbnb.lottie.p246g.C4956a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.c.a.n */
/* compiled from: PG */
public abstract class C4856n implements C4855m {

    /* renamed from: a */
    public final List f15438a;

    public C4856n(Object obj) {
        this.f15438a = Collections.singletonList(new C4956a(obj));
    }

    public C4856n(List list) {
        this.f15438a = list;
    }

    /* renamed from: b */
    public final List mo9798b() {
        return this.f15438a;
    }

    /* renamed from: c */
    public final boolean mo9799c() {
        if (!this.f15438a.isEmpty()) {
            return this.f15438a.size() == 1 && ((C4956a) this.f15438a.get(0)).mo9898e();
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f15438a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.f15438a.toArray()));
        }
        return sb.toString();
    }
}
