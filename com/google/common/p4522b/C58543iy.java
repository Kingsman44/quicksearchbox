package com.google.common.p4522b;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: com.google.common.b.iy */
/* compiled from: PG */
public final class C58543iy {

    /* renamed from: a */
    private final List f156197a = new ArrayList();

    /* renamed from: a */
    public final C58546ja mo55539a() {
        int size = this.f156197a.size();
        if (size == 0) {
            return C58769rh.f156540a;
        }
        if (size != 1) {
            List<C58784rw> list = this.f156197a;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            C58485gu i = C58485gu.m89841i(list);
            for (C58784rw rwVar : list) {
                linkedHashSet.add(rwVar.mo55972b());
                linkedHashSet2.add(rwVar.mo55971a());
            }
            return C58738qd.m90600y(i, C58528ij.m90006F(linkedHashSet), C58528ij.m90006F(linkedHashSet2));
        }
        C58784rw rwVar2 = (C58784rw) C58557jl.m90133n(this.f156197a);
        return new C58760qz(rwVar2.mo55972b(), rwVar2.mo55971a(), rwVar2.mo55973c());
    }

    /* renamed from: b */
    public final void mo55540b(Object obj, Object obj2, Object obj3) {
        this.f156197a.add(C58546ja.m90096x(obj, obj2, obj3));
    }
}
