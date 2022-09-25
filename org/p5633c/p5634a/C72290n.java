package org.p5633c.p5634a;

import java.io.Serializable;
import org.p5633c.p5634a.p5635a.C72139g;
import org.p5633c.p5634a.p5638d.C72218h;

/* renamed from: org.c.a.n */
/* compiled from: PG */
public final class C72290n extends C72139g implements Serializable, C72148af {

    /* renamed from: a */
    public static final C72290n f192434a = new C72290n(0);
    private static final long serialVersionUID = 2471658376918L;

    public C72290n(long j) {
        super(j);
    }

    /* renamed from: a */
    public static C72290n m106811a(long j) {
        return j == 0 ? f192434a : new C72290n(j);
    }

    /* renamed from: c */
    public static C72290n m106812c(long j) {
        return new C72290n(C72218h.m106357c(j, 86400000));
    }

    /* renamed from: d */
    public static C72290n m106813d(long j) {
        return new C72290n(C72218h.m106357c(j, 3600000));
    }

    /* renamed from: e */
    public static C72290n m106814e(long j) {
        return new C72290n(C72218h.m106357c(j, 60000));
    }

    /* renamed from: f */
    public static C72290n m106815f(long j) {
        return j == 0 ? f192434a : new C72290n(C72218h.m106357c(j, 1000));
    }

    /* renamed from: b */
    public final C72290n mo63672b(C72148af afVar) {
        if (afVar == null) {
            return this;
        }
        long j = ((C72139g) afVar).f191964b;
        if (j == 0) {
            return this;
        }
        return new C72290n(C72218h.m106356b(this.f191964b, C72218h.m106357c(j, -1)));
    }

    public C72290n(C72149ag agVar, C72149ag agVar2) {
        super(agVar, agVar2);
    }
}
