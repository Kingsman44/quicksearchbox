package com.google.android.libraries.social.populous.p3296e.p3299c;

import com.google.android.libraries.social.populous.core.C42331dc;
import com.google.android.libraries.social.populous.p3296e.C42550o;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42404aa;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.p4181bi.C55847i;

/* renamed from: com.google.android.libraries.social.populous.e.c.au */
/* compiled from: PG */
public final /* synthetic */ class C42470au implements C58817ah {
    public final Object apply(Object obj) {
        C58485gu guVar = (C58485gu) obj;
        C42550o oVar = new C42550o();
        oVar.f111627f = 5;
        if (guVar == null) {
            oVar.f111626e = 18;
        } else {
            C58480gp f = C58485gu.m89838f(guVar.size());
            int size = guVar.size();
            for (int i = 0; i < size; i++) {
                C42404aa aaVar = new C42404aa();
                aaVar.mo45397d((C55847i) guVar.get(i));
                aaVar.f111220c.add(C42331dc.DIRECTORY);
                f.mo55395g(aaVar.mo45394a());
            }
            oVar.f111626e = 2;
            oVar.f111623b = C58485gu.m89842j(f.mo55394f());
        }
        return oVar.mo45556a();
    }
}
