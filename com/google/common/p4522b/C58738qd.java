package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import java.util.Collection;
import java.util.Set;

/* renamed from: com.google.common.b.qd */
/* compiled from: PG */
abstract class C58738qd extends C58546ja {
    /* renamed from: y */
    static C58738qd m90600y(C58485gu guVar, C58528ij ijVar, C58528ij ijVar2) {
        if (((long) guVar.size()) > (((long) ijVar.size()) * ((long) ijVar2.size())) / 2) {
            return new C58414ed(guVar, ijVar, ijVar2);
        }
        return new C58769rh(guVar, ijVar, ijVar2);
    }

    /* renamed from: z */
    static final void m90601z(Object obj, Object obj2, Object obj3, Object obj4) {
        C58838bb.m90881p(obj3 == null, "Duplicate key: (row=%s, column=%s), values: [%s, %s].", obj, obj2, obj4, obj3);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Collection mo55011c() {
        if (mo55023m()) {
            return C58485gu.m89845m();
        }
        return new C58737qc(this);
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ Set mo55017h() {
        if (mo55023m()) {
            return C58733pz.f156496a;
        }
        return new C58736qb(this);
    }

    /* renamed from: r */
    public abstract C58784rw mo55200r(int i);

    /* renamed from: s */
    public abstract Object mo55201s(int i);
}
