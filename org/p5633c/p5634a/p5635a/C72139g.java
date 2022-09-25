package org.p5633c.p5634a.p5635a;

import java.io.Serializable;
import org.p5633c.p5634a.C72148af;
import org.p5633c.p5634a.C72149ag;
import org.p5633c.p5634a.C72285i;
import org.p5633c.p5634a.p5638d.C72218h;

/* renamed from: org.c.a.a.g */
/* compiled from: PG */
public class C72139g extends C72134b implements Serializable, C72148af {
    private static final long serialVersionUID = 2581698638990L;

    /* renamed from: b */
    public volatile long f191964b;

    protected C72139g(long j) {
        this.f191964b = j;
    }

    protected C72139g(C72149ag agVar, C72149ag agVar2) {
        if (agVar == agVar2) {
            this.f191964b = 0;
            return;
        }
        this.f191964b = C72218h.m106356b(C72285i.m106773a(agVar2), -C72285i.m106773a(agVar));
    }

    /* renamed from: g */
    public final long mo63412g() {
        return this.f191964b;
    }
}
