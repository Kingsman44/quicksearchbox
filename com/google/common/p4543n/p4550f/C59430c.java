package com.google.common.p4543n.p4550f;

import java.util.Arrays;

/* renamed from: com.google.common.n.f.c */
/* compiled from: PG */
public final class C59430c {

    /* renamed from: a */
    final C59429b f157660a;

    public C59430c(C59436i iVar) {
        this.f157660a = new C59429b(iVar);
    }

    /* renamed from: a */
    public final synchronized double mo56936a() {
        return this.f157660a.f157657g;
    }

    /* renamed from: b */
    public final synchronized double mo56937b(double d) {
        return this.f157660a.mo56931a(d);
    }

    /* renamed from: c */
    public final synchronized void mo56938c(double d) {
        C59429b bVar = this.f157660a;
        bVar.f157657g += 1.0d;
        bVar.f157658h += d;
        bVar.f157659i += d * d;
        int a = bVar.f157653c.f157680a.mo56945a(d);
        double d2 = this.f157660a.f157655e;
        if (d < d2) {
            if (d2 >= mo56939d()) {
                this.f157660a.f157655e = d;
            } else {
                throw new IllegalArgumentException("Value " + this.f157660a.f157655e + " is out of histogram domain, should be >= " + mo56939d());
            }
        }
        C59429b bVar2 = this.f157660a;
        if (d > bVar2.f157656f) {
            bVar2.f157656f = d;
            int length = bVar2.f157654d.length;
            if (a >= length) {
                int max = Math.max(a + 1, Math.min(length + length, bVar2.f157653c.f157680a.mo56946b()));
                C59429b bVar3 = this.f157660a;
                bVar3.f157654d = Arrays.copyOf(bVar3.f157654d, max);
            }
        }
        double[] dArr = this.f157660a.f157654d;
        dArr[a] = dArr[a] + 1.0d;
    }

    /* renamed from: d */
    public final double mo56939d() {
        return this.f157660a.f157653c.mo56953b(0);
    }

    public final synchronized String toString() {
        return C59429b.f157652b.mo56957a(this.f157660a);
    }
}
