package org.p5633c.p5634a.p5638d;

import org.p5633c.p5634a.C72132a;
import org.p5633c.p5634a.C72233e;
import org.p5633c.p5634a.C72283g;

/* renamed from: org.c.a.d.s */
/* compiled from: PG */
public final class C72229s extends C72216f {
    private static final long serialVersionUID = -5875876968979L;

    /* renamed from: c */
    private final C72132a f192203c;

    /* renamed from: d */
    private final transient int f192204d;

    public C72229s(C72132a aVar, C72233e eVar) {
        super(eVar, (C72283g) null);
        int i;
        this.f192203c = aVar;
        int h = this.f192181a.mo63447h();
        if (h < 0) {
            i = h + 1;
        } else if (h == 1) {
            i = 0;
        } else {
            this.f192204d = h;
            return;
        }
        this.f192204d = i;
    }

    private Object readResolve() {
        return this.f192182b.mo63646a(this.f192203c);
    }

    /* renamed from: a */
    public final int mo63444a(long j) {
        int a = this.f192181a.mo63444a(j);
        return a < 0 ? a + 1 : a;
    }

    /* renamed from: h */
    public final int mo63447h() {
        return this.f192204d;
    }

    /* renamed from: q */
    public final long mo63454q(long j, int i) {
        C72218h.m106360f(this, i, this.f192204d, this.f192181a.mo63446d());
        if (i <= 0) {
            i--;
        }
        return this.f192181a.mo63454q(j, i);
    }
}
