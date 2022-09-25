package org.p5633c.p5634a.p5638d;

import org.p5633c.p5634a.C72132a;
import org.p5633c.p5634a.C72233e;
import org.p5633c.p5634a.C72283g;
import org.p5633c.p5634a.C72294r;

/* renamed from: org.c.a.d.r */
/* compiled from: PG */
public final class C72228r extends C72216f {
    private static final long serialVersionUID = -8869148464118507846L;

    /* renamed from: c */
    private final C72132a f192201c;

    /* renamed from: d */
    private final transient int f192202d;

    public C72228r(C72132a aVar, C72233e eVar) {
        super(eVar, (C72283g) null);
        int i;
        this.f192201c = aVar;
        int h = this.f192181a.mo63447h();
        if (h < 0) {
            i = h - 1;
        } else if (h == 0) {
            i = 1;
        } else {
            this.f192202d = h;
            return;
        }
        this.f192202d = i;
    }

    private Object readResolve() {
        return this.f192182b.mo63646a(this.f192201c);
    }

    /* renamed from: a */
    public final int mo63444a(long j) {
        int a = this.f192181a.mo63444a(j);
        return a <= 0 ? a - 1 : a;
    }

    /* renamed from: h */
    public final int mo63447h() {
        return this.f192202d;
    }

    /* renamed from: q */
    public final long mo63454q(long j, int i) {
        C72218h.m106360f(this, i, this.f192202d, this.f192181a.mo63446d());
        if (i <= 0) {
            if (i != 0) {
                i++;
            } else {
                throw new C72294r(C72283g.f192391g, 0, (Number) null, (Number) null);
            }
        }
        return this.f192181a.mo63454q(j, i);
    }
}
