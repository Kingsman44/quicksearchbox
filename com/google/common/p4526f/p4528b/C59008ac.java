package com.google.common.p4526f.p4528b;

import com.google.common.p4526f.C58976aa;
import java.util.Set;

/* renamed from: com.google.common.f.b.ac */
/* compiled from: PG */
public abstract class C59008ac {

    /* renamed from: a */
    private static final C59008ac f156900a = new C59048w();

    /* renamed from: g */
    public static C59008ac m91215g(C59037l lVar, C59037l lVar2) {
        int b = lVar.mo56310b() + lVar2.mo56310b();
        if (b == 0) {
            return f156900a;
        }
        if (b <= 28) {
            return new C59006aa(lVar, lVar2);
        }
        return new C59007ab(lVar, lVar2);
    }

    /* renamed from: a */
    public abstract int mo56271a();

    /* renamed from: b */
    public abstract Object mo56272b(C58976aa aaVar);

    /* renamed from: c */
    public abstract Set mo56273c();

    /* renamed from: d */
    public abstract void mo56274d(C59044s sVar, Object obj);
}
